package com.cjg.pay.dao;

import com.cjg.pay.pojo.po.SeqTable;
import com.cjg.pay.pojo.po.SeqTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeqTableMapper {
    int countByExample(SeqTableExample example);

    int deleteByExample(SeqTableExample example);

    int deleteByPrimaryKey(String seqName);

    int insert(SeqTable record);

    int insertSelective(SeqTable record);

    List<SeqTable> selectByExample(SeqTableExample example);

    SeqTable selectByPrimaryKey(String seqName);

    int updateByExampleSelective(@Param("record") SeqTable record, @Param("example") SeqTableExample example);

    int updateByExample(@Param("record") SeqTable record, @Param("example") SeqTableExample example);

    int updateByPrimaryKeySelective(SeqTable record);

    int updateByPrimaryKey(SeqTable record);
}