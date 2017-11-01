package com.cjg.pay.service.impl;

import com.cjg.pay.dao.RpSettRecordCustomMapper;
import com.cjg.pay.dao.RpSettRecordMapper;
import com.cjg.pay.dto.Page;
import com.cjg.pay.dto.Result;
import com.cjg.pay.pojo.po.RpPayWay;
import com.cjg.pay.pojo.po.RpPayWayExample;
import com.cjg.pay.pojo.po.RpSettRecord;
import com.cjg.pay.pojo.po.RpSettRecordExample;
import com.cjg.pay.pojo.vo.RpSettRecordCustom;
import com.cjg.pay.pojo.vo.RpSettRecordQuery;
import com.cjg.pay.service.RpSettRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 2017/10/29
 * Time: 17:49
 * Version:V1.0
 * 清单记录结算业务逻辑层实现类
 */
@Service
public class RpSettRecordServiceImpl implements RpSettRecordService{
    @Autowired
    RpSettRecordMapper rpSettRecordDao;
    @Autowired
    RpSettRecordCustomMapper rpSettRecordCustomDao;
    @Override
    public RpSettRecord getBySettRecordId(String settRecordId) {
        return rpSettRecordDao.selectByPrimaryKey(settRecordId);
    }

    @Override
    public Result<RpSettRecordCustom> listSettRecords(Page page, RpSettRecordQuery query) {
        Map<String,Object> map = new HashMap<>();
        map.put("page",page);
        map.put("query",query);
        long total = rpSettRecordCustomDao.countSettRecords(map);
        List<RpSettRecordCustom> rows = rpSettRecordCustomDao.listSettRecords(map);
        Result<RpSettRecordCustom> rs = new Result<>();
        rs.setTotal(total);
        rs.setRows(rows);
        return rs;
    }

    @Override
    public List<RpSettRecord> selectSettRecord(String id) {
        RpSettRecordExample example = new RpSettRecordExample();
        RpSettRecordExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<RpSettRecord> records = rpSettRecordDao.selectByExample(example);
        return records;
    }
}
