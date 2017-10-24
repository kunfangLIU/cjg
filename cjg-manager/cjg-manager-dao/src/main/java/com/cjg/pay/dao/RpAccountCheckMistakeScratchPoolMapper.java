package com.cjg.pay.dao;

import com.cjg.pay.pojo.po.RpAccountCheckMistakeScratchPool;
import com.cjg.pay.pojo.po.RpAccountCheckMistakeScratchPoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RpAccountCheckMistakeScratchPoolMapper {
    int countByExample(RpAccountCheckMistakeScratchPoolExample example);

    int deleteByExample(RpAccountCheckMistakeScratchPoolExample example);

    int insert(RpAccountCheckMistakeScratchPool record);

    int insertSelective(RpAccountCheckMistakeScratchPool record);

    List<RpAccountCheckMistakeScratchPool> selectByExample(RpAccountCheckMistakeScratchPoolExample example);

    int updateByExampleSelective(@Param("record") RpAccountCheckMistakeScratchPool record, @Param("example") RpAccountCheckMistakeScratchPoolExample example);

    int updateByExample(@Param("record") RpAccountCheckMistakeScratchPool record, @Param("example") RpAccountCheckMistakeScratchPoolExample example);
}