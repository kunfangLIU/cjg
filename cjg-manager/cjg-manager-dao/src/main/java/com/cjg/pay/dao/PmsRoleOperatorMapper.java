package com.cjg.pay.dao;

import com.cjg.pay.pojo.po.PmsRoleOperator;
import com.cjg.pay.pojo.po.PmsRoleOperatorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsRoleOperatorMapper {
    int countByExample(PmsRoleOperatorExample example);

    int deleteByExample(PmsRoleOperatorExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsRoleOperator record);

    int insertSelective(PmsRoleOperator record);

    List<PmsRoleOperator> selectByExample(PmsRoleOperatorExample example);

    PmsRoleOperator selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsRoleOperator record, @Param("example") PmsRoleOperatorExample example);

    int updateByExample(@Param("record") PmsRoleOperator record, @Param("example") PmsRoleOperatorExample example);

    int updateByPrimaryKeySelective(PmsRoleOperator record);

    int updateByPrimaryKey(PmsRoleOperator record);
}