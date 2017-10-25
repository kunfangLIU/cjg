package com.cjg.pay.service;

import com.cjg.pay.dto.Page;
import com.cjg.pay.dto.Result;
import com.cjg.pay.pojo.po.RpUserPayConfig;
import com.cjg.pay.pojo.vo.RpUserPayConfigCustom;
import com.cjg.pay.pojo.vo.RpUserPayConfigQuery;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/10/25
 * Time: 23:45
 * Version:V1.0
 * 用户配置层实体类业务逻辑层接口
 */
public interface RpUserPayConfigService {
    /**
     * 按主键查询指定配置信息
     */
    RpUserPayConfig getUserPayConfigById(String userPayConfigId);
    /**
     * 不带分特查询所有配置信息
     */
    List<RpUserPayConfig> listUserPayConfigs();

    /**
     * 带分页查询用户配置信息
     * @param page
     * @param query
     * @return
     */
    Result<RpUserPayConfigCustom> listUserPayConfigs(Page page, RpUserPayConfigQuery query);
}
