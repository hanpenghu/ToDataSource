package com.aiBanShi.ErpToShop.controller;
import com.aiBanShi.ErpToShop.service.IfCustNoExsit;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by hanhan on 2017/4/17 0017.
 */
@RestController
@RequestMapping("tt")
public class IfExsit {
    @Autowired
    IfCustNoExsit ifCustNoExsit;

    @RequestMapping(value ="ex",method = RequestMethod.POST,produces = {"application/x-www-form-urlencoded;charset=UTF-8"})
    public String IfExsit(@Param("str") String str){//注意拦截器里面的参数可以不写在这里了,直接在传参的时候写就会被拦截器拦下了,这里只写需要的参数就行了
        boolean b = ifCustNoExsit.ifEx(str);
        System.out.println(b);
        if(b){return "Yes";}else{return "No";}
    }
}
