package com.cjg.pay.service;

import com.cjg.pay.dto.Page;
import com.cjg.pay.dto.Result;
import com.cjg.pay.pojo.po.RpAccountHistory;
import com.cjg.pay.pojo.vo.RpAccountHistoryCustom;
import com.cjg.pay.pojo.vo.RpAccountHistoryQuery;

/**
 * User: Administrator
 * Date: 2017/10/28
 * Time: 3:43
 * Version:V1.0
 * 账户历史账单业务逻辑层接口
 */
public interface RpAccountHistoryService {

    /**
     * 按主键查询历史账单
     * @param accountHistoryId
     * @return
     */
    RpAccountHistory getByAccountHistoryId(String accountHistoryId);

    /**
     * 分页查询历史账单的集合
     * @param page
     * @param query
     * @return
     */
    Result<RpAccountHistoryCustom> listAccountHistorys(Page page, RpAccountHistoryQuery query);

}
