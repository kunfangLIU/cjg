package com.cjg.pay.dao;

import com.cjg.pay.pojo.po.RpUserPayConfig;
import com.cjg.pay.pojo.po.RpUserPayConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RpUserPayConfigMapper {
    int countByExample(RpUserPayConfigExample example);

    int deleteByExample(RpUserPayConfigExample example);

    int deleteByPrimaryKey(String id);

    int insert(RpUserPayConfig record);

    int insertSelective(RpUserPayConfig record);

    List<RpUserPayConfig> selectByExample(RpUserPayConfigExample example);

    RpUserPayConfig selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RpUserPayConfig record, @Param("example") RpUserPayConfigExample example);

    int updateByExample(@Param("record") RpUserPayConfig record, @Param("example") RpUserPayConfigExample example);

    int updateByPrimaryKeySelective(RpUserPayConfig record);

    int updateByPrimaryKey(RpUserPayConfig record);
}