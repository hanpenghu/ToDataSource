package com.test.shiLiuJinZhiAndBase64;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.util.UUID;
import java.io.*;

/**
 * Created by Administrator on 2017/5/27.
 */

public class ShiLiuJinZhiAndBase64 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("E:\\1\\work_space\\ToDataSource\\src\\com\\test\\a.text");
        BufferedReader br = new BufferedReader(fr);
        StringBuffer sb = new StringBuffer();
        String str;
        while ((str = br.readLine()) != null) {
            sb.append(str);
        }
        String base64Str=ShiLiuJinZhi2Base64(sb.toString());
        System.out.println(base64Str);
//        System.out.println(UUID.randomUUID().toString().replace("-","_"));
        System.out.println("----------------------");
        System.out.println(Base64ToShiLiuJinZhi(base64Str));

    }

//16进制字符串转换成base64字符串
    //shuru yige 16 jinzhi de tupian  ,shu chu yige base64 de String
    public static String ShiLiuJinZhi2Base64(String strOf16) {
        //shouXian ZaoYiGe LinShi LuJing
        String outputPath = "";
        //dedao dangqian lei de lujing
        outputPath = ShiLiuJinZhiAndBase64.class.getResource("").getPath();
        //pingKong gouzao yige tupian lujing,keyi buyao houzhui mingzi
        //uuid  shiweile  baozheng tong yishijian  wei yi xing
        outputPath = outputPath + "linshiguodutupian_" + UUID.randomUUID().toString().replace("-", "_") + "";
        //jing dedao de tupian fang ru linshi lujing
        saveToImgFile(strOf16, outputPath);
//        System.out.println(new File(outputPath).exists());
//        System.out.println(outputPath);
        //xia mian shi ba tupian zhuancheng base64 de guo cheng
        File file = new File(outputPath);
        if (file.exists()) {
            String base64Str = GetImageStr(outputPath);
            //shandiao linshi wen jian
            file.delete();
            return base64Str;
        }

        return null;
    }
//base64字符串转换成十六进制
    /////////////////////////////////////////////////////////////////////////
    public static String Base64ToShiLiuJinZhi(String base64Str) {
        String pathToGenerateImg = ShiLiuJinZhiAndBase64.class.getResource("").getPath();
        pathToGenerateImg = pathToGenerateImg + "linshiguodutupian_" + UUID.randomUUID().toString().replace("-", "_") + "";
        if (GenerateImage(base64Str, pathToGenerateImg)) {
            //xia mian shi ba tupian zhuanhuancheng shiliujinzhi de guocheng
            String Str16=imgTo16Str(pathToGenerateImg);
            new File(pathToGenerateImg).delete();
            return Str16;
        }
        return null;
    }

    /////////////////////////////////////////////////////////////////////////
    public static void saveToImgFile(String src, String outputPath) {
        if (src == null || src.length() == 0) {
            return;
        }
        try {
            FileOutputStream out = new FileOutputStream(new File(outputPath));
            byte[] bytes = src.getBytes();

            for (int i = 0; i < bytes.length; i += 2) {
                out.write(charToInt(bytes[i]) * 16 + charToInt(bytes[i + 1]));
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int charToInt(byte ch) {
        int val = 0;
        if (ch >= 0x30 && ch <= 0x39) {
            val = ch - 0x30;
        } else if (ch >= 0x41 && ch <= 0x46) {
            val = ch - 0x41 + 10;
        }
        return val;
    }

    /////////////////////////////////////////////////////////////////////////
    public static String GetImageStr(String imagePath) {//将图片文件转化为字节数组字符串，并对其进行Base64编码处理
        String imgFile = imagePath;//待处理的图片
        InputStream in = null;
        byte[] data = null;
        //读取图片字节数组
        try {
            in = new FileInputStream(imgFile);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(data);//返回Base64编码过的字节数组字符串
    }

    /////////////////////////////////////////////////////////////////////////
    public static boolean GenerateImage(String imgStr, String pathToGenerateImg) {
        if (imgStr == null) {
            return false;
        } else {
            BASE64Decoder decoder = new BASE64Decoder();

            try {
                byte[] b = decoder.decodeBuffer(imgStr);

                for (int i = 0; i < b.length; ++i) {
                    if (b[i] < 0) {
                        b[i] = (byte) (b[i] + 256);
                    }
                }

                OutputStream out = new FileOutputStream(pathToGenerateImg);
                out.write(b);
                out.flush();
                out.close();
                return true;
            } catch (Exception var5) {
                return false;
            }
        }
    }

    /////////////////////////////////////////////////////////////////////////
    public static String imgTo16Str(String imgPath) {
        FileInputStream fis = null;
//        BufferedInputStream bis =null;
        ByteArrayOutputStream bos = null;
        try {
            StringBuffer sb = new StringBuffer();
            fis = new FileInputStream(imgPath);
//            bis = new BufferedInputStream(fis);
            bos = new ByteArrayOutputStream();
            byte[] buff = new byte[fis.available()];
            int len = 0;
            while ((len = fis.read(buff)) != -1) {
                bos.write(buff, 0, len);
            }
            // 得到图片的字节数组
            byte[] result = bos.toByteArray();
//            System.out.println("++++" + byte2HexStr(result));
            // 字节数组转成十六进制
            String str = byte2HexStr(result);
            return str;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
//                bis.close();
                bos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    /*
     * 实现字节数组向十六进制的转换方法一
     */
    public static String byte2HexStr(byte[] b) {
        String hs = "";
        String stmp = "";
        for (int n = 0; n < b.length; n++) {
            stmp = (Integer.toHexString(b[n] & 0XFF));
            if (stmp.length() == 1)
                hs = hs + "0" + stmp;
            else
                hs = hs + stmp;
        }
        return hs.toUpperCase();
    }

    private static byte uniteBytes(String src0, String src1) {
        byte b0 = Byte.decode("0x" + src0).byteValue();
        b0 = (byte) (b0 << 4);
        byte b1 = Byte.decode("0x" + src1).byteValue();
        byte ret = (byte) (b0 | b1);
        return ret;
    }

    /*
     * 实现字节数组向十六进制的转换的方法二
     */
    public static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }
    /////////////////////////////////////////////////////////////////////////
}
