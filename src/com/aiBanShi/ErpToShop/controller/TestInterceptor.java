package com.aiBanShi.ErpToShop.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/4/4 0004.
 */
@RestController
@RequestMapping("t")
public class TestInterceptor {
    //查看mvcInterceptor.xml中的配置知道拦截谁了
    @RequestMapping(value = "test", method = RequestMethod.POST)
    public void test() {//注意拦截器里面的参数可以不写在这里了,直接在传参的时候写就会被拦截器拦下了,这里只写需要的参数就行了
        System.out.println("如果拦截器拦截到hanpenghu,这句话就会打印！！！");
    }

    @RequestMapping(value = "test1", method = RequestMethod.POST)
    public void test1() {
        System.out.println("如果拦截器拦截到hanpenghu2,这句话就会打印！！！");
    }

    @RequestMapping(value = "t003", method = RequestMethod.POST)
    public void test003() {
        System.out.println("如果拦截器拦截到name1,name2,name3,name4,并通过！这句话就会打印！！！");
    }
}
