package com.cjg.pay.web;

import com.cjg.pay.dto.Page;
import com.cjg.pay.dto.Result;
import com.cjg.pay.pojo.po.RpPayProduct;
import com.cjg.pay.pojo.vo.RpPayProductCustom;
import com.cjg.pay.pojo.vo.RpPayProductQuery;
import com.cjg.pay.service.RpPayProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: Administrator
 * Date: 2017/10/24
 * Time: 19:53
 * Version:V1.0
 * 支付产品控制层代码
 */
@Controller
@Scope("prototype")
public class RpPayProductAction {
    @Autowired
    private RpPayProductService rpPayProductService;

    @ResponseBody
    @RequestMapping(value = "/payProduct/{payProductId}",method = RequestMethod.GET)
    public RpPayProduct getById(@PathVariable String rpPayProductId){
        return  rpPayProductService.getById(rpPayProductId);
    }

    /**
     * 不按分页查询
     * @return
     */
   /* @ResponseBody
    @RequestMapping("rpPayProducts")
    public List<RpPayProduct> listRpPayProducts(){
        return  rpPayProductService.listRpPayProducts();
    }*/
   @ResponseBody
    @RequestMapping("/rpPayProducts")
    public Result<RpPayProductCustom> listRpPayProducts(Page page, RpPayProductQuery query){
       return  rpPayProductService.listRpPayProducts(page,query);
   }
}
