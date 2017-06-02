package com.test.readEXCEL;
import java.io.*;
import java.util.*;
import jxl.*;
import jxl.read.biff.BiffException;
/**
 * Created by Administrator on 2017/6/1.
 */
public class ReadExcel001 {
    public static void main (String[]args){
        System.out.println("你好！！！");
        List<List<String>> list=getRows("C:\\Users\\Administrator\\Desktop\\1\\linzhan1.xls",
                0,3,0);
        for(List ll:list){
            System.out.println(ll.get(2));
        }
    }
    public static  List<List<String>> getRows(String excelPath,Integer sheetIndex,Integer startRowsIndex,Integer startColumnsIndex){
        try {
            Workbook readwb = null;InputStream instream=null;
            List<List<String>>List=new LinkedList<List<String>>( );
            try {instream = new FileInputStream(excelPath);} catch (FileNotFoundException e) {e.printStackTrace();}
            if(instream!=null){
                try {readwb = Workbook.getWorkbook(instream);} catch (Exception e) {e.printStackTrace();}
                if(readwb!=null){
                    // Sheet的下标是从0开始
                    // 获取第sheetIndex+1张Sheet表
                    Sheet sheet = readwb.getSheet(sheetIndex);
                    if(sheet!=null){
                        // 获取Sheet表中所包含的总行数
                        int totalRows = sheet.getRows();
                        // 获取Sheet表中所包含的总列数//其实对应于实体的总共的字段数目
                        int totalColumns = sheet.getColumns();
                        if(totalRows!=0&&totalColumns!=0){
                            //startRowsIndex是开始行的索引,因为第一行(索引0)有可能是个表头信息
                            for (int i=startRowsIndex;i<totalRows;i++){//行循环
                                List<String>list=new LinkedList<String>( );//每行作为一个list,每一行的东西放入一个新的list
                                //startColumnsIndex指的是开始的那一列,一般默认为第0列
                                for (int j = startColumnsIndex; j < totalColumns; j++){//列循环(循环字段)
                                    //得到第j列第i行的那个单元格
                                    Cell cell = sheet.getCell(j, i);
                                    //得到该单元格的内容
                                    String contents = cell.getContents();

                                    list.add(contents);
                                }
                                List.add(list);
                            }
                        }
                    }
                }
            }
            if(instream!=null){try {instream.close( );} catch (IOException e) {e.printStackTrace();}}
            return List;
        } catch (Exception e) {e.printStackTrace();}
        return null;
    }
}
