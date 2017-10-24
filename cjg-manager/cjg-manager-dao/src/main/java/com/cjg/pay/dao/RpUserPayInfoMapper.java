package com.cjg.pay.dao;

import com.cjg.pay.pojo.po.RpUserPayInfo;
import com.cjg.pay.pojo.po.RpUserPayInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RpUserPayInfoMapper {
    int countByExample(RpUserPayInfoExample example);

    int deleteByExample(RpUserPayInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(RpUserPayInfo record);

    int insertSelective(RpUserPayInfo record);

    List<RpUserPayInfo> selectByExample(RpUserPayInfoExample example);

    RpUserPayInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RpUserPayInfo record, @Param("example") RpUserPayInfoExample example);

    int updateByExample(@Param("record") RpUserPayInfo record, @Param("example") RpUserPayInfoExample example);

    int updateByPrimaryKeySelective(RpUserPayInfo record);

    int updateByPrimaryKey(RpUserPayInfo record);
}