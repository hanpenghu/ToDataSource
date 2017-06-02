package com.test.CsvTest;

import com.csvreader.CsvWriter;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.csvreader.CsvReader;

import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;


import java.nio.charset.Charset;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Administrator on 2017/5/31.
 */
public class CsvTest001 {
    public static void main(String[] args) throws IOException {
        /*write2CSVTest();
        write2CSVTestOfJavaCV();
        read4CSVTestOfJavaCV();
        read4CSVTestOfopencv();*/
        test();
    }
///////////////////////////////////////////////////////////////////////////////////////////////
    public static void test() throws IOException {//用opencv写
            CSVWriter writer = new CSVWriter
                (
                    new FileWriter(
                            new File("C:\\Users\\Administrator\\Desktop\\1\\2.csv")
                    ), ','
                );
            //bu she zhi bianma de hua,jianglai hui yi chuanru de bianma wei bianma
        //zhe ge lizi shi  yihangyihang de xie ru//
        //注意只有是在close之前的同一个writer写的东西,才会在csv文本中一行一行插入,
        //如果是close之后又写的则会覆盖
          writer.writeNext(new String[]{"1","爱你","第一"});
        writer.flush();
        writer.close();
        writer = new CSVWriter
                (
                        new FileWriter(
                                new File("C:\\Users\\Administrator\\Desktop\\1\\2.csv")
                        ), ','
                );
        writer.writeNext(new String[]{"2","爱你","第2"});
        writer.flush();

    }
    ////////////////////////用opencv写和读/////////////////////////////////////////////////////////////////////
    //写csv文件,用一个list代表一行
    public static void write2CSVTest() throws IOException {
        CSVWriter writer = new CSVWriter
                (new FileWriter
                        (new File("C:\\Users\\Administrator\\Desktop\\1\\1.csv")),
                        ',');
        List<String[]> alList = new ArrayList<String[]>();
        List<String> list = new ArrayList<String>();
        list.add("你");
        list.add("好");
        list.add("啊");
        //一个alist代表 一行
        //list的一个元素代表一个表格
        alList.add(list.toArray(new String[list.size()]));
        //在弄一行
        list = new ArrayList<String>();
        list.add("大");
        list.add("傻");
        list.add("逼");
        alList.add(list.toArray(new String[list.size()]));

        writer.writeAll(alList);
        writer.close();
        System.out.println(writer.toString());
    }
    ////////////////2017年6月2日14:22:48//////////////////
    //下面用opencv的CSVReader
    public static void read4CSVTestOfopencv() throws IOException {
        CSVReader reader = new CSVReader(
                new FileReader(
                        new File("C:\\Users\\Administrator\\Desktop\\1\\1.csv")
                )
                , ',');
        List<String[]> alList=reader.readAll();//读出来一个String[]就是一行
        for(String[]strs:alList){
            for(String str:strs){
                System.out.print(str+",");
            }
            System.out.println();
        }
        reader.close();

    }
    ///////////////上面是 用的opencv的包///////////下面是用的Javacv的包///////////////////////////////////////////////
    //用JavaCV
    public static void write2CSVTestOfJavaCV() throws IOException {
        String filePath="C:\\Users\\Administrator\\Desktop\\1\\1.csv";
        CsvWriter csvWriter = new CsvWriter(filePath, ',', Charset.forName("UTF-8"));
        csvWriter.writeRecord(new String[]{"你","是","狗"});
        csvWriter.close();//注意这里没有close就没有flush,这里的close自己带了flush
    }
/////////////////2017年6月2日14:21:22/////////////////
    //这个么有用opncv 而是用的JavaCV
    public static void read4CSVTestOfJavaCV() throws IOException {
        CsvReader reader = new CsvReader("C:\\Users\\Administrator\\Desktop\\1\\1.csv",',',Charset.forName("UTF-8"));

        while (reader.readRecord()) {
            String str = reader.getRawRecord();
            System.out.println(str);
        }
        reader.close();
    }
/////////////////////////////////////////////////////////////////////////

}
/////////////////////////////////////////////////////////////////////////

