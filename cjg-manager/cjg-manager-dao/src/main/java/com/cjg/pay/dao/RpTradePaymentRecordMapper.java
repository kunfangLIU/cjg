package com.cjg.pay.dao;

import com.cjg.pay.pojo.po.RpTradePaymentRecord;
import com.cjg.pay.pojo.po.RpTradePaymentRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RpTradePaymentRecordMapper {
    int countByExample(RpTradePaymentRecordExample example);

    int deleteByExample(RpTradePaymentRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(RpTradePaymentRecord record);

    int insertSelective(RpTradePaymentRecord record);

    List<RpTradePaymentRecord> selectByExample(RpTradePaymentRecordExample example);

    RpTradePaymentRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RpTradePaymentRecord record, @Param("example") RpTradePaymentRecordExample example);

    int updateByExample(@Param("record") RpTradePaymentRecord record, @Param("example") RpTradePaymentRecordExample example);

    int updateByPrimaryKeySelective(RpTradePaymentRecord record);

    int updateByPrimaryKey(RpTradePaymentRecord record);
}