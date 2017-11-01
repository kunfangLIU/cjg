package com.cjg.pay.service;

import com.cjg.pay.dto.Page;
import com.cjg.pay.dto.Result;
import com.cjg.pay.pojo.po.RpPayProduct;
import com.cjg.pay.pojo.po.RpPayWay;
import com.cjg.pay.pojo.vo.RpPayProductCustom;
import com.cjg.pay.pojo.vo.RpPayProductQuery;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/10/24
 * Time: 19:19
 * Version:V1.0
 * 支付产品实体类的业务逻辑层接口
 */
public interface RpPayProductService {

    /**
     * 按主键查询产品
     */
    RpPayProduct getById(String rpPayProductId);
    /**
     * 不带分页查询所有产品
     */
    List<RpPayProduct> listRpPayProducts();
    /**
     * 带分页查询所有产品
     */
    Result<RpPayProductCustom> listRpPayProducts(Page page, RpPayProductQuery query);
    /**
     * 通过id批量修改产品状态
     * @param b
     * @param ids
     * @return
     */
    int updateProductsByIds(String b, List<String> ids);

    List<RpPayWay> selectRpPayWay(String productCode);

}
