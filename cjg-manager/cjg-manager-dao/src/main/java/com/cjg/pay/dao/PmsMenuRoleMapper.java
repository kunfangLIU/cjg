package com.cjg.pay.dao;

import com.cjg.pay.pojo.po.PmsMenuRole;
import com.cjg.pay.pojo.po.PmsMenuRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsMenuRoleMapper {
    int countByExample(PmsMenuRoleExample example);

    int deleteByExample(PmsMenuRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsMenuRole record);

    int insertSelective(PmsMenuRole record);

    List<PmsMenuRole> selectByExample(PmsMenuRoleExample example);

    PmsMenuRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsMenuRole record, @Param("example") PmsMenuRoleExample example);

    int updateByExample(@Param("record") PmsMenuRole record, @Param("example") PmsMenuRoleExample example);

    int updateByPrimaryKeySelective(PmsMenuRole record);

    int updateByPrimaryKey(PmsMenuRole record);
}