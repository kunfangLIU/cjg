package com.cjg.pay.service;

import com.cjg.pay.dto.Page;
import com.cjg.pay.dto.Result;
import com.cjg.pay.pojo.po.RpUserInfo;
import com.cjg.pay.pojo.vo.RpUserInfoCustom;
import com.cjg.pay.pojo.vo.RpUserInfoQuery;

/**
 * User: Administrator
 * Date: 2017/10/28
 * Time: 11:55
 * Version:V1.0
 * 用户列表业务逻辑层
 */
public interface RpUserInfoService {
    /**
     * 按主键查询用户列表
     * @param userInfoId
     * @return
     */
    RpUserInfo getByUserInfoId(String userInfoId);

    /**
     * 分页查询用户列表
     * @param page
     * @param query
     * @return
     */
    Result<RpUserInfoCustom> listUserInfos(Page page, RpUserInfoQuery query);
}
