package com.cjg.pay.service.impl;

import com.cjg.pay.dao.RpAccountCustomMapper;
import com.cjg.pay.dao.RpAccountMapper;
import com.cjg.pay.dto.Page;
import com.cjg.pay.dto.Result;
import com.cjg.pay.pojo.po.RpAccount;
import com.cjg.pay.pojo.vo.RpAccountCustom;
import com.cjg.pay.pojo.vo.RpAccountQuery;
import com.cjg.pay.service.RpAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 2017/10/28
 * Time: 2:28
 * Version:V1.0
 * 账户信息业务逻辑层实现类
 */
@Service
public class RpAccountServiceImpl implements RpAccountService{
    @Autowired
    RpAccountMapper rpAccountDao;
    @Autowired
    RpAccountCustomMapper rpAccountCustomDao;


    @Override
    public RpAccount getByAccountId(String accountId) {
        return rpAccountDao.selectByPrimaryKey(accountId);
    }

    @Override
    public Result<RpAccountCustom> listAccounts(Page page, RpAccountQuery query) {
        Map<String,Object> map = new HashMap<>();
        map.put("page",page);
        map.put("query",query);
        long total = rpAccountCustomDao.countAccounts(map);
        List<RpAccountCustom> rows = rpAccountCustomDao.listAccountByPage(map);
        Result<RpAccountCustom> rs = new Result<>();
        rs.setRows(rows);
        rs.setTotal(total);
        return rs;
    }
}
