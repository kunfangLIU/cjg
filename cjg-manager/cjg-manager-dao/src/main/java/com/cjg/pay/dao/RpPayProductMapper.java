package com.cjg.pay.dao;

import com.cjg.pay.pojo.po.RpPayProduct;
import com.cjg.pay.pojo.po.RpPayProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RpPayProductMapper {
    int countByExample(RpPayProductExample example);

    int deleteByExample(RpPayProductExample example);

    int deleteByPrimaryKey(String id);

    int insert(RpPayProduct record);

    int insertSelective(RpPayProduct record);

    List<RpPayProduct> selectByExample(RpPayProductExample example);

    RpPayProduct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RpPayProduct record, @Param("example") RpPayProductExample example);

    int updateByExample(@Param("record") RpPayProduct record, @Param("example") RpPayProductExample example);

    int updateByPrimaryKeySelective(RpPayProduct record);

    int updateByPrimaryKey(RpPayProduct record);
}