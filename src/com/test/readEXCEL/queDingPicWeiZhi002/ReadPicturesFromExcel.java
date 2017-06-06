package com.test.readEXCEL.queDingPicWeiZhi002;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFPicture;
import org.apache.poi.hssf.usermodel.HSSFPictureData;
import org.apache.poi.hssf.usermodel.HSSFShape;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.*;

public class ReadPicturesFromExcel {

    public static void main(String[] args) throws InvalidFormatException, Exception {
        /**
         *测试excel2003,将sheet索引为0的工作薄的图片全部输出
         * 图片名字用图片右边那一列的内容
         * */
       /* String path="C:\\Users\\Administrator\\Desktop\\1\\linzhan.xls";
        int sheeIndex=0;
        List<PicAndRowAndColum> pics = getPic03OneSheet(path, sheeIndex);
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
        }*/
//////////////////////////2017_6_6   weekday(2)   13:19:07///////////////////////////////////////////////

        /**
         *测试excel2007-2013,将sheet索引为0的工作薄的图片全部输出
         * 图片名字用图片右边那一列的内容
         * */
      /* String path1="C:\\Users\\Administrator\\Desktop\\1\\linzhan.xlsx";
        int sheeIndex1=0;
        List<PicAndRowAndColum> pics1 = getPic07OneSheet(path1, sheeIndex1);
        for(PicAndRowAndColum pic:pics1){
            Integer colum = pic.getColum();
            Integer row = pic.getRow();
            XSSFSheet sheet = pic.getXSsheet();
            byte[] picData = pic.getPicData();
            String content = sheet.getRow(row).getCell(colum + 1).getStringCellValue().trim();
            File file = new File("C:\\Users\\Administrator\\Desktop\\1\\4\\"+content+".jpeg");
            FileOutputStream fs=new FileOutputStream(file);
            fs.write(picData);
            fs.flush();
            fs.close();
        }*/

        f();







//////////////////////////////////
    }
    /////////////以上是main函数///////////////////////2017_6_6   weekday(2)   11:36:23/////////////////////////////////////
    /**
     *测试把一个excel中的所有图片都干出来,为了不撑爆内存,
     * 我是一个sheet一个sheet放入内存处理的
     * 读取C:\Users\Administrator\Desktop\1\linzhan.xlsx中的图片放入
     * C:\Users\Administrator\Desktop\1\4中
     * */
    public static void f()throws Exception{
        String xlsPath="C:\\Users\\Administrator\\Desktop\\1\\linzhan.xlsx";
        // 创建文件
        File file = new File(xlsPath);
        // 创建流
        InputStream input = new FileInputStream(file);
        //得到Excel对象
        XSSFWorkbook wb =  new XSSFWorkbook(input);
        List<PicAndRowAndColum> list=null;
        int i=0;
        //循环一个wb中所有的sheet工作薄
        //这样使用迭代,第一个参数必须是得到迭代的"式子",第二个参数必须是判断迭代是否有下一个
        //第三个参数为 没有
        for(Iterator<Sheet> sheetIterator = wb.sheetIterator(); sheetIterator.hasNext();){
            //得到该次迭代的元素sheet
            XSSFSheet sheet = (XSSFSheet)sheetIterator.next();


            //每得到一次新的sheet就造一个新的list,避免上次的图片再存入以前的list
            list=new ArrayList<PicAndRowAndColum>();
            try {
                XSSFDrawing drawing = sheet.getDrawingPatriarch();
                List<XSSFShape> xShapeList = drawing.getShapes();
                //隐性的给list添加数据
                loopSheetToGetPic07(list, sheet, xShapeList);
                System.out.println(list.size()+"---------------------");
                for(PicAndRowAndColum pic:list){
                    try {
                        Integer colum = pic.getColum();
                        Integer row = pic.getRow();
                        byte[] picData = pic.getPicData();
                        XSSFSheet sheet1 = pic.getXSsheet();
                        String content = sheet1.getRow(row).getCell(colum + 1).getStringCellValue();
                        File file001=new File("C:\\Users\\Administrator\\Desktop\\1\\4\\"+content+".jpeg");
                        FileOutputStream fos=new FileOutputStream(file001);
                        fos.write(picData);
                        fos.flush();
                        fos.close();
                        i++;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("一共得到"+i+"副图片！！");

    }

/////////////////////////////////////////////////////////////////////////
    /**
     *提取一个excel文件中所有的sheet中的所有图片
     * 用于excel200-2013
     * 2013实验可用
     * try catch是为了在某个sheet报错的时候继续循环下一个
     * 注意这个方法在一个excel文件中图片过多的时候会撑爆内存的
     * */
    public static List<PicAndRowAndColum> getPic07allSheet(String xlsPath)throws Exception{
        // 创建文件
        File file = new File(xlsPath);
        // 创建流
        InputStream input = new FileInputStream(file);
        //得到Excel对象
        XSSFWorkbook wb =  new XSSFWorkbook(input);
        List<PicAndRowAndColum> list=new ArrayList<PicAndRowAndColum>();
        Iterator<Sheet> sheetIterator = wb.sheetIterator();
        //循环一个wb中所有的sheet工作薄
        for(XSSFSheet sheet = (XSSFSheet)sheetIterator.next(); sheetIterator.hasNext();){
            try {
                XSSFDrawing drawing = sheet.getDrawingPatriarch();
                List<XSSFShape> xShapeList = drawing.getShapes();
                //隐性的给list添加数据
                loopSheetToGetPic07(list, sheet, xShapeList);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    /////////////////////////////////////2017_6_6   weekday(2)   13:19:32////////////////////////////////////
    /**
     * 注意这个方法只能用excel2007-2013
     *传入一个xlsx的路径和一个工作簿sheet的索引(从0开始)
     * 将会返回该工作薄内所有图片的(字节数组+当前sheet+图片位置)对象
     * for内部使用trycatch是为了某张图片有问题的时候,程序不中断,继续下一张
     * */
    public static List<PicAndRowAndColum> getPic07OneSheet(String xlsPath,int sheetIndex)throws Exception{
        // 创建文件
        File file = new File(xlsPath);
        // 创建流
        InputStream input = new FileInputStream(file);
        //得到Excel对象
        XSSFWorkbook wb =  new XSSFWorkbook(input);
        //得到Excel的sheet对象//从0开始索引
        XSSFSheet sheet = wb.getSheetAt(sheetIndex);
        XSSFDrawing drawing = sheet.getDrawingPatriarch();
        List<XSSFShape> xShapeList = drawing.getShapes();
        PicAndRowAndColum picAndRowAndColum=null;
        List<PicAndRowAndColum> list=new ArrayList<PicAndRowAndColum>();
        loopSheetToGetPic07(list, sheet, xShapeList);
        return list;
    }
    ///////////////////////////2017_6_6   weekday(2)   14:03:44//////////////////////////////////////////////
    /**
     *为了读取2007以后的sheet抽取出来的专门读取某个sheet中的所有图片的代码
     * 注意这个方法在一个sheet中图片过多的时候回撑爆内存的
     * */
    private static void loopSheetToGetPic07(List<PicAndRowAndColum> list, XSSFSheet sheet, List<XSSFShape> xShapeList) {
        XSSFClientAnchor anchor;
        XSSFPicture pic;
        byte[] data;
        int row;
        int col;
        PicAndRowAndColum picAndRowAndColum;
        for(XSSFShape shape:xShapeList){
            try {
                anchor = (XSSFClientAnchor) shape.getAnchor();
                if (shape instanceof XSSFPicture) {
                    pic = (XSSFPicture) shape;
                    data = pic.getPictureData().getData();
                    row =anchor.getRow1();
                    col= anchor.getCol1();
                    picAndRowAndColum=new PicAndRowAndColum();
                    picAndRowAndColum.setRow(row);
                    picAndRowAndColum.setColum(col);
                    picAndRowAndColum.setPicData(data);
                    picAndRowAndColum.setXSsheet(sheet);
                    list.add(picAndRowAndColum);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    //////////////////////////////2017_6_5   weekday(1)   17:03:48///////////////////////////////////////////
    /**
     * 注意这个方法只能用excel2003
     *传入一个xlx的路径和一个工作簿sheet的索引(从0开始)
     * 将会返回该工作薄内所有图片的(字节数组+当前sheet+图片位置)对象
     * for内部使用trycatch是为了某张图片有问题的时候,程序不中断,继续下一张
     * */
    public static List<PicAndRowAndColum> getPic03OneSheet(String xlsPath,int sheetIndex)throws Exception{
        InputStream inp = new FileInputStream(xlsPath);
        HSSFWorkbook workbook = (HSSFWorkbook) WorkbookFactory.create(inp);
        List<HSSFPictureData> pictures = workbook.getAllPictures();
        HSSFSheet sheet = (HSSFSheet) workbook.getSheetAt(sheetIndex);
        PicAndRowAndColum picAndRowAndColum=null;
        HSSFClientAnchor anchor =null;
        int row ;
        int col;
        byte[] data=null;
        List<PicAndRowAndColum> list=new ArrayList<PicAndRowAndColum>();
        for (HSSFShape shape : sheet.getDrawingPatriarch().getChildren()) {
            try {
                anchor = (HSSFClientAnchor) shape.getAnchor();
                if (shape instanceof HSSFPicture) {
                    HSSFPicture pic = (HSSFPicture) shape;
                    row = anchor.getRow1();
                    col=anchor.getCol1();
                    data = pic.getPictureData().getData();
                    picAndRowAndColum=new PicAndRowAndColum();
                    picAndRowAndColum.setRow(row);
                    picAndRowAndColum.setColum(col);
                    picAndRowAndColum.setPicData(data);
                    picAndRowAndColum.setSheet(sheet);
                    list.add(picAndRowAndColum);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }
   //////////////////////////////2017_6_6   weekday(2)   11:29:35///////////////////////////////////////////

}
///////////////////////////2017-6-6 13:18:47//////////////////////////////////////////////

