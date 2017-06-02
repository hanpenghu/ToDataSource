package com.aiBanShi.ErpToShop.controller;
import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/5/30.
 * produces = {"application/x-www-form-urlencoded;charset=UTF-8"}
 */
@RestController
@RequestMapping("up")
public class UploadTest {
    //produces = {"application/msword;charset=UTF-8"}如果有这句话,就不会再跳转
    @RequestMapping(value ="load",method = RequestMethod.POST,produces = {"text/html;charset=UTF-8"})
    public String upload(@RequestParam MultipartFile[] myfiles,HttpServletRequest request) throws IOException {
        System.out.println("你好！！！");
        if(myfiles.length==0){
            return "no Receive!";
        }else{
            for(MultipartFile myfile : myfiles){
                if(myfile.isEmpty()){
                    System.out.println("no upload");
                    return "noReceive!000!";
                }else{
                    System.out.println("我曹");
                    System.out.println("文件长度: " + myfile.getSize());
                    System.out.println("文件类型: " + myfile.getContentType());
                    System.out.println("文件名称: " + myfile.getName());
                    System.out.println("文件原名: " + myfile.getOriginalFilename());
                    System.out.println("========================================");
                    //如果用的是Tomcat服务器，则文件会上传到\\%TOMCAT_HOME%\\webapps\\YourWebProject\\WEB-INF\\upload\\文件夹中
                    String realPath = request.getSession().getServletContext().getRealPath("");
                    System.out.println(realPath);
                    //这里不必处理IO流关闭的问题，因为FileUtils.copyInputStreamToFile()方法内部会自动把用到的IO流关掉，我是看它的源码才知道的
                    FileUtils.copyInputStreamToFile(myfile.getInputStream(), new File(realPath, myfile.getOriginalFilename()));
                    return "has received file!!接收到文件了!";
                }
            }
        }

        return "-1";
    }
}
