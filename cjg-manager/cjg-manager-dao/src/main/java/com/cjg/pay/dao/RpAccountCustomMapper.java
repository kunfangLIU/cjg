package com.cjg.pay.dao;

import com.cjg.pay.pojo.vo.RpAccountCustom;

import java.util.List;
import java.util.Map;

/**
 * 自定义RpAccountMapper的dao层接口
 */
public interface RpAccountCustomMapper {
    /**
     * 查询所有账户信息的总记录数
     * @param map
     * @return
     */
   long countAccounts(Map<String,Object> map);

    /**
     * 分页查询账户信息集合
     * @param map
     * @return
     */
   List<RpAccountCustom> listAccountByPage(Map<String,Object> map);

}