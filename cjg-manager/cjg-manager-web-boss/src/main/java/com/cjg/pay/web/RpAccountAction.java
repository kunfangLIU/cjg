package com.cjg.pay.web;

import com.cjg.pay.dto.Page;
import com.cjg.pay.dto.Result;
import com.cjg.pay.pojo.po.RpAccount;
import com.cjg.pay.pojo.vo.RpAccountCustom;
import com.cjg.pay.pojo.vo.RpAccountQuery;
import com.cjg.pay.service.RpAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: Administrator
 * Date: 2017/10/28
 * Time: 2:33
 * Version:V1.0
 * 账户信息展示控制层
 */
@Controller
@Scope("prototype")
public class RpAccountAction {
    @Autowired
    RpAccountService rpAccountService;

    @ResponseBody
    @RequestMapping(value = "/account/{account}",method = RequestMethod.GET)
    public RpAccount getByAccountId(String accountId){
        return  rpAccountService.getByAccountId(accountId);
    }

    @ResponseBody
    @RequestMapping("/accounts")
    public Result<RpAccountCustom> listAccounts(Page page, RpAccountQuery query){
        return  rpAccountService.listAccounts(page,query);
    }
}
