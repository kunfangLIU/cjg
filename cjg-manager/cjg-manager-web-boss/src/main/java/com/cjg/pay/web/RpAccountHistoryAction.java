package com.cjg.pay.web;

import com.cjg.pay.dto.Page;
import com.cjg.pay.dto.Result;
import com.cjg.pay.pojo.po.RpAccountHistory;
import com.cjg.pay.pojo.vo.RpAccountHistoryCustom;
import com.cjg.pay.pojo.vo.RpAccountHistoryQuery;
import com.cjg.pay.service.RpAccountHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: Administrator
 * Date: 2017/10/28
 * Time: 3:53
 * Version:V1.0
 * 账户历史信息控制层
 */
@Controller
@Scope("prototype")
public class RpAccountHistoryAction {
    @Autowired
    RpAccountHistoryService rpAccountHistoryService;

    @ResponseBody
    @RequestMapping(value = "/accountHistory/{accountHistory}",method = RequestMethod.GET)
    public RpAccountHistory getByAccountHistoryId(String accountHistoryId){
        return  rpAccountHistoryService.getByAccountHistoryId(accountHistoryId);
    }
    @ResponseBody
    @RequestMapping("/accountHistorys")
    public Result<RpAccountHistoryCustom> listAccountHistorys(Page page, RpAccountHistoryQuery query){
        return  rpAccountHistoryService.listAccountHistorys(page,query);
    }
}
