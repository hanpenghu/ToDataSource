package com.aiBanShi.ErpToShop.service;
import com.aiBanShi.ErpToShop.dao.mapperJava1.CustMapper1;
import com.aiBanShi.ErpToShop.dto.CustWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/4/17 0017.
 */
@Service("ifCustNoExsit")
public class IfCustNoExsit {
    @Autowired
    CustMapper1 custMapper1;
    public boolean ifEx(String str){
        CustWithBLOBs custWithBLOBs = custMapper1.selectByPrimaryKey(str);
        if(custWithBLOBs!=null){
            if(custWithBLOBs.getCusNo()!=null){
                if(!"".equals(custWithBLOBs.getCusNo())){
                    return true;
                }
            }
        }
        return false;
    }
}
