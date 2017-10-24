package com.cjg.pay.dao;

import com.cjg.pay.pojo.po.RpSettRecordAnnex;
import com.cjg.pay.pojo.po.RpSettRecordAnnexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RpSettRecordAnnexMapper {
    int countByExample(RpSettRecordAnnexExample example);

    int deleteByExample(RpSettRecordAnnexExample example);

    int deleteByPrimaryKey(String id);

    int insert(RpSettRecordAnnex record);

    int insertSelective(RpSettRecordAnnex record);

    List<RpSettRecordAnnex> selectByExample(RpSettRecordAnnexExample example);

    RpSettRecordAnnex selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RpSettRecordAnnex record, @Param("example") RpSettRecordAnnexExample example);

    int updateByExample(@Param("record") RpSettRecordAnnex record, @Param("example") RpSettRecordAnnexExample example);

    int updateByPrimaryKeySelective(RpSettRecordAnnex record);

    int updateByPrimaryKey(RpSettRecordAnnex record);
}