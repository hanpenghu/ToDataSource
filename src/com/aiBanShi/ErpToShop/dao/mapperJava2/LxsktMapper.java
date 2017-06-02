package com.aiBanShi.ErpToShop.dao.mapperJava2;

import com.aiBanShi.ErpToShop.dto.Lxskt;
import com.aiBanShi.ErpToShop.dto.LxsktExample;
import com.aiBanShi.ErpToShop.dto.LxsktKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LxsktMapper {
    long countByExample(LxsktExample example);

    int deleteByExample(LxsktExample example);

    int deleteByPrimaryKey(LxsktKey key);

    int insert(Lxskt record);

    int insertSelective(Lxskt record);

    List<Lxskt> selectByExample(LxsktExample example);

    Lxskt selectByPrimaryKey(LxsktKey key);

    int updateByExampleSelective(@Param("record") Lxskt record, @Param("example") LxsktExample example);

    int updateByExample(@Param("record") Lxskt record, @Param("example") LxsktExample example);

    int updateByPrimaryKeySelective(Lxskt record);

    int updateByPrimaryKey(Lxskt record);
}