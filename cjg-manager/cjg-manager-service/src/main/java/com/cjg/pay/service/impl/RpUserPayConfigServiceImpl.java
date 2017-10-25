package com.cjg.pay.service.impl;

import com.cjg.pay.dao.RpUserPayConfigCustomMapper;
import com.cjg.pay.dao.RpUserPayConfigMapper;
import com.cjg.pay.dto.Page;
import com.cjg.pay.dto.Result;
import com.cjg.pay.pojo.po.RpUserPayConfig;
import com.cjg.pay.pojo.vo.RpUserPayConfigCustom;
import com.cjg.pay.pojo.vo.RpUserPayConfigQuery;
import com.cjg.pay.service.RpUserPayConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 2017/10/25
 * Time: 23:51
 * Version:V1.0
 * 用户配置层业务逻辑层接口实现类
 */
@Service
public class RpUserPayConfigServiceImpl implements RpUserPayConfigService{
    @Autowired
    RpUserPayConfigMapper rpUserPayConfigDao;
    @Autowired
    RpUserPayConfigCustomMapper rpUserPayConfigCustomDao;

    @Override
    public RpUserPayConfig getUserPayConfigById(String userPayConfigId) {
        return rpUserPayConfigDao.selectByPrimaryKey(userPayConfigId);
    }

    @Override
    public List<RpUserPayConfig> listUserPayConfigs() {
        return rpUserPayConfigDao.selectByExample(null);
    }

    /**
     * 带分页查询的业务逻辑
     * @param page
     * @param query
     * @return
     */
    @Override
    public Result<RpUserPayConfigCustom> listUserPayConfigs(Page page, RpUserPayConfigQuery query) {
        Map<String,Object> map = new HashMap<>();
        map.put("page",page);
        map.put("query",query);
        //通过rpUserPayConfigCustomDao查询出total，查询所有商品数量，没有附加条件
        long total = rpUserPayConfigCustomDao.countUserPayConfigs(map);
        List<RpUserPayConfigCustom> rows = rpUserPayConfigCustomDao.listUserPayConfigByPage(map);
        //通过rpUserPayConfigCustomDao查询出rows
        Result<RpUserPayConfigCustom> rs = new Result<>();
        rs.setRows(rows);
        rs.setTotal(total);
        return rs;
    }

}
