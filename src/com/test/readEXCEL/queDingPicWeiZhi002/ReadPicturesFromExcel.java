package com.test.readEXCEL.queDingPicWeiZhi002;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFPicture;
import org.apache.poi.hssf.usermodel.HSSFPictureData;
import org.apache.poi.hssf.usermodel.HSSFShape;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadPicturesFromExcel {

    public static void main(String[] args) throws InvalidFormatException, Exception {
        /**
         *测试,将sheet索引为0的工作薄的图片全部输出
         * 图片名字用图片右边那一列的内容
         * */
        String path="C:\\Users\\Administrator\\Desktop\\1\\linzhan.xls";
        int sheeIndex=0;
        List<PicAndRowAndColum> pics = getPic(path, sheeIndex);
        for(PicAndRowAndColum pic:pics){
            Integer colum = pic.getColum();
            Integer row = pic.getRow();
            HSSFSheet sheet = pic.getSheet();
            byte[] picData = pic.getPicData();
            String content = sheet.getRow(row).getCell(colum + 1).getStringCellValue().trim();
            File file = new File("C:\\Users\\Administrator\\Desktop\\1\\3\\"+content+".jpeg");
            FileOutputStream fs=new FileOutputStream(file);
            fs.write(picData);
            fs.flush();
            fs.close();
        }
    }
    //////////////////////////////2017_6_5   weekday(1)   17:03:48///////////////////////////////////////////
    /**
     * 注意这个方法只能用excel2003
     *传入一个xlx的路径和一个工作簿sheet的索引(从0开始)
     * 将会返回该工作薄内所有图片的(字节数组+当前sheet+图片位置)对象
     * */
    public static List<PicAndRowAndColum> getPic(String xlsPath,int sheetIndex)throws Exception{
        InputStream inp = new FileInputStream(xlsPath);
        HSSFWorkbook workbook = (HSSFWorkbook) WorkbookFactory.create(inp);
        List<HSSFPictureData> pictures = workbook.getAllPictures();
        HSSFSheet sheet = (HSSFSheet) workbook.getSheetAt(sheetIndex);
        PicAndRowAndColum picAndRowAndColum=null;
        List<PicAndRowAndColum> list=new ArrayList<PicAndRowAndColum>();
        for (HSSFShape shape : sheet.getDrawingPatriarch().getChildren()) {
            HSSFClientAnchor anchor = (HSSFClientAnchor) shape.getAnchor();
            if (shape instanceof HSSFPicture) {
                HSSFPicture pic = (HSSFPicture) shape;
                int row = anchor.getRow1();
                int col=anchor.getCol1();
                byte[] data = pic.getPictureData().getData();
                picAndRowAndColum=new PicAndRowAndColum();
                picAndRowAndColum.setRow(row);
                picAndRowAndColum.setColum(col);
                picAndRowAndColum.setPicData(data);
                picAndRowAndColum.setSheet(sheet);
                list.add(picAndRowAndColum);
            }

        }
        return list;
    }
   //////////////////////////////2017_6_6   weekday(2)   11:29:35///////////////////////////////////////////

}


