package com.aiBanShi.ErpToShop.component;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/4/4 0004.
 */
public class TestInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        System.out.println("===========HandlerInterceptor preHandle");
        String author1 = request.getParameter("author1");
        if(author1==null){System.out.println("验证不过！！拦截器拦截！！");return false;}
        if("hanpenghu".equals(author1)){return true;}
        System.out.println("验证不过！！拦截器拦截！！");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("===========HandlerInterceptor postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("===========HandlerInterceptor afterCompletion");
    }
/*    我们可能注意到拦截器一个有3个回调方法，而一般的过滤器Filter才两个，这是怎么回事呢？马上分析。
    preHandle：预处理回调方法，实现处理器的预处理（如登录检查），
    第三个参数为响应的处理器（如我们上一章的Controller实现）；
    返回值：true表示继续流程（如调用下一个拦截器或处理器）；
    false表示流程中断（如登录检查失败），不会继续调用其他的拦截器或处理器，
    此时我们需要通过response来产生响应；
    postHandle：后处理回调方法，实现处理器的后处理（但在渲染视图之前），
    此时我们可以通过modelAndView（模型和视图对象）对模型数据进行处理或对视图进行处理，
    modelAndView也可能为null。
    afterCompletion：整个请求处理完毕回调方法，即在视图渲染完毕时回调，
    如性能监控中我们可以在此记录结束时间并输出消耗时间，还可以进行一些资源清理，
    类似于try-catch-finally中的finally，
    但仅调用处理器执行链中preHandle返回true的拦截器的afterCompletion。*/
}