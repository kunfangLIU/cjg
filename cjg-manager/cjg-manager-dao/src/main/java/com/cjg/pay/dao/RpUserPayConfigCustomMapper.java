package com.cjg.pay.dao;

import com.cjg.pay.pojo.vo.RpUserPayConfigCustom;

import java.util.List;
import java.util.Map;

/**
 * 自定义用户配置RpUserPayConfigMapper接口
 */
public interface RpUserPayConfigCustomMapper {
    /**
     * 查询所有用户配置的总记录数
     */
    long countUserPayConfigs(Map<String,Object> map);
    /**
     * 分页查询出用户配置的集合
     */
    List<RpUserPayConfigCustom> listUserPayConfigByPage(Map<String,Object> map);
}