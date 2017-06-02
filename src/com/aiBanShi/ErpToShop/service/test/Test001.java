/*
package com.aiBanShi.ErpToShop.service.test;
import com.aiBanShi.ErpToShop.dao.mapperJava1.SpiderCitylistMapper;
import com.aiBanShi.ErpToShop.dao.mapperJava2.UsersMapper;
import com.aiBanShi.ErpToShop.dto.SpiderCitylistExample;
import com.aiBanShi.ErpToShop.dto.Users;
import com.aiBanShi.ErpToShop.dto.UsersExample;
import com.aiBanShi.utils.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
*/
/**
 * Created by Administrator on 2017/4/2 0002.
 *//*

@Component("test001")
public class Test001 {
    @Autowired
    SpiderCitylistMapper spiderCitylistMapper;
    @Autowired
    UsersMapper usersMapper;

    public void f(){
        SpiderCitylistExample example =new SpiderCitylistExample();
        example.createCriteria().andCityidIsNotNull();
        long i = spiderCitylistMapper.countByExample(example);
        System.out.println(i);
        System.out.println("------------------------------");
        UsersExample usersExample=new UsersExample();
        usersExample.createCriteria().andIdIsNotNull();
        long ii = usersMapper.countByExample(usersExample);
        System.out.println(ii);
    }
    @Transactional
    public void g(){//双数据源同时回滚

        spiderCitylistMapper.insertIntoSpiderCityList("xuchang100","许昌100","0");
        int i=0;
        i=5/0;
        Users users=new Users();
        users.setAge(29);
        users.setName("李梦茹999");
        usersMapper.insert(users);
    }
    public static void main(String[]args){
        String[] configs = {"classpath*:com/aiBanShi/ErpToShop/config/applicationContext.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configs);
        Test001 test001 = SpringUtil.getBean(Test001.class);
        //test001.f();
        test001.g();
    }

}
*/
