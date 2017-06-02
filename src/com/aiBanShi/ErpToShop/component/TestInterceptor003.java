package com.aiBanShi.ErpToShop.component;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Set;

/**
 * Created by Administrator on 2017/4/4 0004.
 */
public class TestInterceptor003 implements HandlerInterceptor {
    private Set<String> name1;
    private String name2;
    private String name3;
    private String name4;
    //注意:下面几个set方法是为了把mvcInterceptor.xml中的值注入来
    public void setName1(Set<String> name1) {
        this.name1 = name1;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String name01 = request.getParameter("name01");
        String name02 = request.getParameter("name02");
        String name03 = request.getParameter("name03");
        String name04 = request.getParameter("name04");
        if(name01!=null){
            if(name1.contains(name01)){
                if(name2.equals(name02)){
                    if(name3.equals(name03)){
                        if(name4.equals(name04)){
                            return true;
                        }
                    }
                }
            }
        }
        System.out.println("4个name验证不通过");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
