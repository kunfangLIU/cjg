package com.cjg.pay.service.impl;


import com.cjg.pay.dao.RpUserInfoMapper;
import com.cjg.pay.dao.RpUserInfoPageCustomMapper;
import com.cjg.pay.dto.Page;
import com.cjg.pay.dto.Result;
import com.cjg.pay.pojo.po.RpUserInfo;
import com.cjg.pay.pojo.vo.RpUserInfoCustom;
import com.cjg.pay.pojo.vo.RpUserInfoQuery;
import com.cjg.pay.service.RpUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 2017/10/28
 * Time: 11:57
 * Version:V1.0
 * 用户列表业务逻辑层实现类
 */
@Service
public class RpUserInfoServiceImpl implements RpUserInfoService{
    @Autowired
    RpUserInfoMapper rpUserInfoDao;
    @Autowired
    RpUserInfoPageCustomMapper rpUserInfoPageCustomDao;
    @Override
    public RpUserInfo getByUserInfoId(String userInfoId) {
        return rpUserInfoDao.selectByPrimaryKey(userInfoId);
    }

    @Override
    public Result<RpUserInfoCustom> listUserInfos(Page page, RpUserInfoQuery query) {
        Map<String,Object> map = new HashMap<>();
        map.put("page",page);
        map.put("query",query);
        long total = rpUserInfoPageCustomDao.countUserInfos(map);
        List<RpUserInfoCustom> rows = rpUserInfoPageCustomDao.listUserInfoByPage(map);
        Result<RpUserInfoCustom> rs = new Result<>();
        rs.setRows(rows);
        rs.setTotal(total);
        return rs;
    }
}
