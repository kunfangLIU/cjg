package com.cjg.pay.dao;

import com.cjg.pay.pojo.vo.RpPayProductCustom;

import java.util.List;
import java.util.Map;

/**
 * 自定义RpPayProductMapper的Dao层接口
 */
public interface RpPayProductCustomMapper {
/**
 * 查询所有总记录数
 */
    long countProducts(Map<String, Object> map);
    /**
     * 分页查询出商品集合
     */
    List<RpPayProductCustom> listProductByPage(Map<String, Object> map);
}