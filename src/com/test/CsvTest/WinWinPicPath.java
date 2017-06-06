package com.test.CsvTest;

import com.opencsv.CSVWriter;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.IOFileFilter;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Administrator on 2017/6/1.
 */
public class WinWinPicPath {
    public  static  void  main(String[]args)throws Exception{
        f();
    }
    public static void f() throws Exception{
        //我们先读取一个文件夹
        File file=new File("C:\\Users\\Administrator\\Desktop\\1\\2");
       Collection<File> coll= FileUtils.listFiles(file,
               new IOFileFilter(){

                   @Override
                   public boolean accept(File file) {
                       return true;
                   }

                   @Override
                   public boolean accept(File file, String s) {
                       return true;
                   }
               },new IOFileFilter(){
                       @Override
                       public boolean accept(File file) {
                           return true;
                       }

                       @Override
                       public boolean accept(File file, String s) {
                           return true;
                       }
                }
       );
        System.out.println(coll.size());
        List<String[]> alList = new ArrayList<String[]>();
        List<String> list = null;
        int i=1;
       for(File f:coll){
           list = new ArrayList<String>();
           System.out.println(f.getName());
           String path="http://demo.ec.cloudhere.cn/lzpic/2/";
           path=path+f.getName();
           list.add(path);
           list.add(i+"");
           list.add(f.getName().substring(0,f.getName().indexOf(".")));
           alList.add(list.toArray(new String[list.size()]));
           i++;
       }
       CSVWriter writer = new CSVWriter(new FileWriter(new File("C:\\Users\\Administrator\\Desktop\\1\\2.csv")), ',');
        writer.writeAll(alList);
        writer.close();
    }
}