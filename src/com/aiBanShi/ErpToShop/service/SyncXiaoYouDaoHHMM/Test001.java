package com.aiBanShi.ErpToShop.service.SyncXiaoYouDaoHHMM;
import com.aiBanShi.ErpToShop.dao.mapperJava1.CustMapper1;
import com.aiBanShi.ErpToShop.dao.mapperJava2.CustMapper;
import com.aiBanShi.ErpToShop.dto.CustExample;
import com.aiBanShi.ErpToShop.dto.CustWithBLOBs;
import com.aiBanShi.utils.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import java.util.List;




@Component("test001")
public class Test001 {
    @Autowired
    private  CustMapper1 CustMapper1;//我电脑
    @Autowired
    private CustMapper CustMapper;//子满堂电脑
    //@Transactional
    public void g(){
        CustExample CustExample=new CustExample();
        CustExample.createCriteria().andCusNoIsNotNull();
        List<CustWithBLOBs> custsOfXiaoYou = CustMapper.selectByExampleWithBLOBs(CustExample);
        for(CustWithBLOBs cust:custsOfXiaoYou){
            CustMapper1.insertSelective(cust);
        }

    }
    public static void main(String[]args){
        String[] configs = {"classpath*:com/aiBanShi/ErpToShop/config/applicationContext.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configs);
        Test001 test001 = SpringUtil.getBean(Test001.class);
        //test001.f();
        test001.g();
    }

}
