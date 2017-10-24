package com.cjg.pay.dao;

import com.cjg.pay.pojo.po.RpSettDailyCollect;
import com.cjg.pay.pojo.po.RpSettDailyCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RpSettDailyCollectMapper {
    int countByExample(RpSettDailyCollectExample example);

    int deleteByExample(RpSettDailyCollectExample example);

    int deleteByPrimaryKey(String id);

    int insert(RpSettDailyCollect record);

    int insertSelective(RpSettDailyCollect record);

    List<RpSettDailyCollect> selectByExample(RpSettDailyCollectExample example);

    RpSettDailyCollect selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RpSettDailyCollect record, @Param("example") RpSettDailyCollectExample example);

    int updateByExample(@Param("record") RpSettDailyCollect record, @Param("example") RpSettDailyCollectExample example);

    int updateByPrimaryKeySelective(RpSettDailyCollect record);

    int updateByPrimaryKey(RpSettDailyCollect record);
}