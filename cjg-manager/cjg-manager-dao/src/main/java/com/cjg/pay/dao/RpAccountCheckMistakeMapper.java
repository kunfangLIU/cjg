package com.cjg.pay.dao;

import com.cjg.pay.pojo.po.RpAccountCheckMistake;
import com.cjg.pay.pojo.po.RpAccountCheckMistakeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RpAccountCheckMistakeMapper {
    int countByExample(RpAccountCheckMistakeExample example);

    int deleteByExample(RpAccountCheckMistakeExample example);

    int deleteByPrimaryKey(String id);

    int insert(RpAccountCheckMistake record);

    int insertSelective(RpAccountCheckMistake record);

    List<RpAccountCheckMistake> selectByExample(RpAccountCheckMistakeExample example);

    RpAccountCheckMistake selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RpAccountCheckMistake record, @Param("example") RpAccountCheckMistakeExample example);

    int updateByExample(@Param("record") RpAccountCheckMistake record, @Param("example") RpAccountCheckMistakeExample example);

    int updateByPrimaryKeySelective(RpAccountCheckMistake record);

    int updateByPrimaryKey(RpAccountCheckMistake record);
}