package com.cjg.pay.service;

import com.cjg.pay.dto.Page;
import com.cjg.pay.dto.Result;
import com.cjg.pay.pojo.po.RpAccount;
import com.cjg.pay.pojo.vo.RpAccountCustom;
import com.cjg.pay.pojo.vo.RpAccountQuery;

/**
 * User: Administrator
 * Date: 2017/10/28
 * Time: 2:25
 * Version:V1.0
 * 账户信息业务逻辑层接口
 */
public interface RpAccountService {

    /**
     * 按主键查询
     * @param accountId
     * @return
     */
    RpAccount getByAccountId(String accountId);

    /**
     * 分页查询所有账户信息
     * @param page
     * @param query
     * @return
     */
    Result<RpAccountCustom> listAccounts(Page page, RpAccountQuery query);
}
