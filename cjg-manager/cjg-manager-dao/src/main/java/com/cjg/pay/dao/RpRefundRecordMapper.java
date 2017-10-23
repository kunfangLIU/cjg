package com.cjg.pay.dao;

import com.cjg.pay.pojo.RpRefundRecord;
import com.cjg.pay.pojo.RpRefundRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RpRefundRecordMapper {
    int countByExample(RpRefundRecordExample example);

    int deleteByExample(RpRefundRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(RpRefundRecord record);

    int insertSelective(RpRefundRecord record);

    List<RpRefundRecord> selectByExample(RpRefundRecordExample example);

    RpRefundRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RpRefundRecord record, @Param("example") RpRefundRecordExample example);

    int updateByExample(@Param("record") RpRefundRecord record, @Param("example") RpRefundRecordExample example);

    int updateByPrimaryKeySelective(RpRefundRecord record);

    int updateByPrimaryKey(RpRefundRecord record);
}