package com.cjg.pay.service.impl;

import com.cjg.pay.dao.RpAccountHistoryCustomMapper;
import com.cjg.pay.dao.RpAccountHistoryMapper;
import com.cjg.pay.dto.Page;
import com.cjg.pay.dto.Result;
import com.cjg.pay.pojo.po.RpAccount;
import com.cjg.pay.pojo.po.RpAccountHistory;
import com.cjg.pay.pojo.vo.RpAccountCustom;
import com.cjg.pay.pojo.vo.RpAccountHistoryCustom;
import com.cjg.pay.pojo.vo.RpAccountHistoryQuery;
import com.cjg.pay.pojo.vo.RpAccountQuery;
import com.cjg.pay.service.RpAccountHistoryService;
import com.cjg.pay.service.RpAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 2017/10/28
 * Time: 3:47
 * Version:V1.0
 * 历史账单业务逻辑层实现类
 */
@Service
public class RpAccountHistoryServiceImpl  implements RpAccountHistoryService{
    @Autowired
    RpAccountHistoryMapper rpAccountHistoryDao;
    @Autowired
    RpAccountHistoryCustomMapper rpAccountHistoryCustomDao;


    @Override
    public RpAccountHistory getByAccountHistoryId(String accountHistoryId) {
        return rpAccountHistoryDao.selectByPrimaryKey(accountHistoryId);
    }

    @Override
    public Result<RpAccountHistoryCustom> listAccountHistorys(Page page, RpAccountHistoryQuery query) {
        Map<String,Object> map = new HashMap<>();
        map.put("page",page);
        map.put("query",query);
        long total = rpAccountHistoryCustomDao.countAccountHistorys(map);
        List<RpAccountHistoryCustom> rows = rpAccountHistoryCustomDao.listAccountHistoryByPage(map);
        Result<RpAccountHistoryCustom> rs = new Result<>();
        rs.setTotal(total);
        rs.setRows(rows);
        return rs;
    }
}
