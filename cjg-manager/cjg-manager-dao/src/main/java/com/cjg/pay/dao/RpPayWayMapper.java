package com.cjg.pay.dao;

import com.cjg.pay.pojo.po.RpPayWay;
import com.cjg.pay.pojo.po.RpPayWayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RpPayWayMapper {
    int countByExample(RpPayWayExample example);

    int deleteByExample(RpPayWayExample example);

    int deleteByPrimaryKey(String id);

    int insert(RpPayWay record);

    int insertSelective(RpPayWay record);

    List<RpPayWay> selectByExample(RpPayWayExample example);

    RpPayWay selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RpPayWay record, @Param("example") RpPayWayExample example);

    int updateByExample(@Param("record") RpPayWay record, @Param("example") RpPayWayExample example);

    int updateByPrimaryKeySelective(RpPayWay record);

    int updateByPrimaryKey(RpPayWay record);
}