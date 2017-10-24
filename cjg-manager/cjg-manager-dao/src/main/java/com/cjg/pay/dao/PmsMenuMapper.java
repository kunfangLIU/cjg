package com.cjg.pay.dao;

import com.cjg.pay.pojo.po.PmsMenu;
import com.cjg.pay.pojo.po.PmsMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsMenuMapper {
    int countByExample(PmsMenuExample example);

    int deleteByExample(PmsMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsMenu record);

    int insertSelective(PmsMenu record);

    List<PmsMenu> selectByExample(PmsMenuExample example);

    PmsMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsMenu record, @Param("example") PmsMenuExample example);

    int updateByExample(@Param("record") PmsMenu record, @Param("example") PmsMenuExample example);

    int updateByPrimaryKeySelective(PmsMenu record);

    int updateByPrimaryKey(PmsMenu record);
}