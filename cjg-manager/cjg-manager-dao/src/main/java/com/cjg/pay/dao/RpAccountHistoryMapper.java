package com.cjg.pay.dao;

import com.cjg.pay.pojo.RpAccountHistory;
import com.cjg.pay.pojo.RpAccountHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RpAccountHistoryMapper {
    int countByExample(RpAccountHistoryExample example);

    int deleteByExample(RpAccountHistoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(RpAccountHistory record);

    int insertSelective(RpAccountHistory record);

    List<RpAccountHistory> selectByExample(RpAccountHistoryExample example);

    RpAccountHistory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RpAccountHistory record, @Param("example") RpAccountHistoryExample example);

    int updateByExample(@Param("record") RpAccountHistory record, @Param("example") RpAccountHistoryExample example);

    int updateByPrimaryKeySelective(RpAccountHistory record);

    int updateByPrimaryKey(RpAccountHistory record);
}