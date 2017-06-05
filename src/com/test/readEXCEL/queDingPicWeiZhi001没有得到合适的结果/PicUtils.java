package com.test.readEXCEL.queDingPicWeiZhi001没有得到合适的结果;

import org.apache.poi.ddf.EscherClientAnchorRecord;
import org.apache.poi.ddf.EscherRecord;
import org.apache.poi.hssf.record.EscherAggregate;
import org.apache.poi.hssf.usermodel.HSSFPictureData;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/6/5.
 */
public class PicUtils {
    /**
     *注意这个只支持excel2003
     * sheeetIndex是工作簿的索引,从0开始索引
     * 注意得到的对象中的row和column也是从0开始索引的
     * */
    public static List<PicAndRowAndColum> getPic(String xlsPath)throws Exception{

        FileInputStream fis = new FileInputStream(xlsPath);
        POIFSFileSystem fs = new POIFSFileSystem(fis);
        //得到Excel对象
        HSSFWorkbook wb = new HSSFWorkbook(fs);
        //得到Excel的sheet对象//从0开始索引
        HSSFSheet sheet=null;
        List<HSSFPictureData> pictureList = wb.getAllPictures();
        List<ClientAnchorInfo> clientAnchorRecords = getClientAnchorRecords(wb);
        List<PicAndRowAndColum>list =new ArrayList<PicAndRowAndColum>();
        System.out.println(pictureList.size());
        System.out.println(clientAnchorRecords.size());
        if (pictureList.size() != clientAnchorRecords.size()) {
            throw new RuntimeException("解析文件中的图片信息出错，找到的图片数量和图片位置信息数量不匹配");
        }else{
            System.out.println("找到的图片数量和图片位置信息数量一致,继续");
        }

        PicAndRowAndColum prc=null;
        System.out.println("所有sheet中共有"+pictureList.size()+"张图片");
        for(int i=0;i<pictureList.size();i++){
            HSSFPictureData pictureData = pictureList.get(i);
            ClientAnchorInfo anchor = clientAnchorRecords.get(i);
            sheet=anchor.sheet;
            EscherClientAnchorRecord clientAnchorRecord = anchor.clientAnchorRecord;
            MyPictureData myPictureData = new MyPictureData(wb, sheet, pictureData, clientAnchorRecord);
            prc=new PicAndRowAndColum();
            prc.setColum(myPictureData.getCol0());
            prc.setRow(myPictureData.getRow0());
            prc.setPicData(pictureList.get(i).getData());
            prc.setSheet(sheet);
            list.add(prc);
        }
        return list;
    }
    /////////////////////////////////////////////////////////////////////////
    private static class ClientAnchorInfo {
        public HSSFSheet sheet;
        public EscherClientAnchorRecord clientAnchorRecord;

        public ClientAnchorInfo(HSSFSheet sheet, EscherClientAnchorRecord clientAnchorRecord) {
            super();
            this.sheet = sheet;
            this.clientAnchorRecord = clientAnchorRecord;
        }
    }

    private static List<ClientAnchorInfo> getClientAnchorRecords(HSSFWorkbook workbook) {
        List<ClientAnchorInfo> list = new ArrayList<ClientAnchorInfo>();

        EscherAggregate drawingAggregate = null;
        HSSFSheet sheet = null;
        List<EscherRecord> recordList = null;
        Iterator<EscherRecord> recordIter = null;
        int numSheets = workbook.getNumberOfSheets();
        for (int i = 0; i < numSheets; i++) {
            sheet = workbook.getSheetAt(i);
            drawingAggregate = sheet.getDrawingEscherAggregate();
            if (drawingAggregate != null) {
                recordList = drawingAggregate.getEscherRecords();
                recordIter = recordList.iterator();
                while (recordIter.hasNext()) {
                    getClientAnchorRecords(sheet, recordIter.next(), 1, list);
                }
            }
        }

        return list;
    }


    private static void getClientAnchorRecords(HSSFSheet sheet, EscherRecord escherRecord, int level, List<ClientAnchorInfo> list) {
        List<EscherRecord> recordList = null;
        Iterator<EscherRecord> recordIter = null;
        EscherRecord childRecord = null;
        recordList = escherRecord.getChildRecords();
        recordIter = recordList.iterator();
        while(recordIter.hasNext()) {
            childRecord = recordIter.next();
            if(childRecord instanceof EscherClientAnchorRecord) {
                ClientAnchorInfo e = new ClientAnchorInfo(sheet, (EscherClientAnchorRecord) childRecord);
                list.add(e);
            }
            if(childRecord.getChildRecords().size() > 0) {
                getClientAnchorRecords(sheet, childRecord, level+1, list);
            }
        }
    }
}
