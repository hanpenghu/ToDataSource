/*

package com.aiBanShi.ErpToShop.service.test;
import com.aiBanShi.ErpToShop.dto.Users;
import com.aiBanShi.utils.SpringUtil;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


*/
/**
 * Created by Administrator on 2017/4/3 0003.
 *//*


@Component("testBatch")
public class testBatch {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate2;
    public void saveBatch() {
        SqlSession session =sqlSessionTemplate2.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);
        try{
            Users user1=new Users(null,"涵涵3",33);
            Users user2=new Users(null,"涵涵4",44);
            List<Users> list=new ArrayList();
            list.add(user1);
            list.add(user2);
            //com.aiBanShi.ErpToShop.dao.mapperJava2.UsersMapper.insert
            //中的com.aiBanShi.ErpToShop.dao.mapperJava2.UsersMapper是mapper.xml中的nameSpace
            //insert是mapper.xml中insert那个sql
            for(Users user:list){
                session.insert("com.aiBanShi.ErpToShop.dao.mapperJava2.UsersMapper.insert",user);
            }

            session.commit();
            //清理缓存，防止溢出
            session.clearCache();
        }catch(Exception e){
            e.printStackTrace();
            session.rollback();
        }finally {
            session.close();
        }
    }
    public static void main(String[]args){
        String[] configs = {"classpath*:com/aiBanShi/ErpToShop/config/applicationContext.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configs);
        testBatch testBatch = SpringUtil.getBean(testBatch.class);
        testBatch.saveBatch();
    }
}

*/
