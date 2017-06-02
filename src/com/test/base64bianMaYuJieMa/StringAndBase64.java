package com.test.base64bianMaYuJieMa;
import org.apache.commons.io.FileUtils;
import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;

import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.metadata.IIOMetadata;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Iterator;

/**E:\1\work_space\ToDataSource\out\production\ToDataSource\com\test\635591186618850081.jpg
 * Created by Administrator on 2017/5/26.E:\1\work_space\ToDataSource\src\com\test\635591186618850081.jpg
 */
public class StringAndBase64 {
    public static void main(String[]args)throws Exception{
        String path= (StringAndBase64.class.getClassLoader().getResource("")).toString().replace("file:/","");
        System.out.println(path);


    }

    // 将 s 进行 BASE64 编码
    public static String getBASE64(String s) {
        if (s == null) return null;
        return (new sun.misc.BASE64Encoder()).encode( s.getBytes() );
    }

    // 将 BASE64 编码的字符串 s 进行解码
    public static String getFromBASE64(String s) {
        if (s == null) return null;
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            byte[] b = decoder.decodeBuffer(s);
            return new String(b);
        } catch (Exception e) {
            return null;
        }
    }
}
