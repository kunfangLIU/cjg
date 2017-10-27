package com.cjg.pay.dao;

import com.cjg.pay.pojo.vo.RpAccountHistoryCustom;

import java.util.List;
import java.util.Map;

/**
 * 自定义账户历史信息dao层接口
 */
public interface RpAccountHistoryCustomMapper {
    /**
     * 按主键查询历史账单的总记录数
     * @param map
     * @return
     */
    long countAccountHistorys(Map<String,Object> map);

    /**
     * 分页查询历史账单集合
     * @param map
     * @return
     */
    List<RpAccountHistoryCustom> listAccountHistoryByPage(Map<String,Object> map);
}