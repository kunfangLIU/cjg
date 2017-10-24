package com.cjg.pay.dao;

import com.cjg.pay.pojo.po.PmsRolePermission;
import com.cjg.pay.pojo.po.PmsRolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsRolePermissionMapper {
    int countByExample(PmsRolePermissionExample example);

    int deleteByExample(PmsRolePermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsRolePermission record);

    int insertSelective(PmsRolePermission record);

    List<PmsRolePermission> selectByExample(PmsRolePermissionExample example);

    PmsRolePermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsRolePermission record, @Param("example") PmsRolePermissionExample example);

    int updateByExample(@Param("record") PmsRolePermission record, @Param("example") PmsRolePermissionExample example);

    int updateByPrimaryKeySelective(PmsRolePermission record);

    int updateByPrimaryKey(PmsRolePermission record);
}