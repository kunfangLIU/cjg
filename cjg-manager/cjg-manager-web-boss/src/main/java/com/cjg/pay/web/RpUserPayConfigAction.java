package com.cjg.pay.web;

import com.cjg.pay.dto.Page;
import com.cjg.pay.dto.Result;
import com.cjg.pay.pojo.po.RpUserPayConfig;
import com.cjg.pay.pojo.vo.RpUserPayConfigCustom;
import com.cjg.pay.pojo.vo.RpUserPayConfigQuery;
import com.cjg.pay.service.RpUserPayConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: Administrator
 * Date: 2017/10/26
 * Time: 0:07
 * Version:V1.0
 * 用户配置控制层
 */
@Controller
@Scope("prototype")
public class RpUserPayConfigAction {
    @Autowired
    RpUserPayConfigService rpUserPayConfigService;
    @ResponseBody
    @RequestMapping(value = "/userPayConfig/{userPayConfigId}",method = RequestMethod.GET)
    public RpUserPayConfig getUserPayConfigId(@PathVariable String userPayConfigId){
        return  rpUserPayConfigService.getUserPayConfigById(userPayConfigId);
    }

    /**
     * 分页查询
     * @param page
     * @param query
     * @return
     */
    @ResponseBody
    @RequestMapping("/userPayConfigs")
    public Result<RpUserPayConfigCustom> userPayConfigs(Page page, RpUserPayConfigQuery query){
        return  rpUserPayConfigService.listUserPayConfigs(page,query);
    }


}
