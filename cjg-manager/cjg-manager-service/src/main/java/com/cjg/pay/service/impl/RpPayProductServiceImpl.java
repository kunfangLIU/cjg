package com.cjg.pay.service.impl;

import com.cjg.pay.dao.RpPayProductCustomMapper;
import com.cjg.pay.dao.RpPayProductMapper;
import com.cjg.pay.dto.Page;
import com.cjg.pay.dto.Result;
import com.cjg.pay.pojo.po.RpPayProduct;
import com.cjg.pay.pojo.po.RpPayProductExample;
import com.cjg.pay.pojo.vo.RpPayProductCustom;
import com.cjg.pay.pojo.vo.RpPayProductQuery;
import com.cjg.pay.service.RpPayProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 2017/10/24
 * Time: 19:35
 * Version:V1.0
 * 产品实体业务逻辑层实现类
 */
@Service
public class RpPayProductServiceImpl implements RpPayProductService {

    @Autowired
    private RpPayProductMapper rpPayProductDao;
    @Autowired
    private RpPayProductCustomMapper rpPayProductCustomDao;
    @Override
    public RpPayProduct getById(String rpPayProductId) {
        return rpPayProductDao.selectByPrimaryKey(rpPayProductId);
    }
    @Override
    public List<RpPayProduct> listRpPayProducts() {
        return rpPayProductDao.selectByExample(null);
    }

    @Override
    public Result<RpPayProductCustom> listRpPayProducts(Page page, RpPayProductQuery query) {
        //通过rpPayProductCustomDao查询出所有total，查询所有商品数量，没有附加条件
        Map<String,Object> map = new HashMap<>();
        map.put("page",page);
        map.put("query",query);
        long total = rpPayProductCustomDao.countProducts(map);
        List<RpPayProductCustom> rows = rpPayProductCustomDao.listProductByPage(map);
        Result<RpPayProductCustom> rs = new Result<>();
        rs.setTotal(total);
        rs.setRows(rows);
        return rs;
    }

    /**
     * 通过更改产品状态来删除产品
     * @param ids
     * @return
     */
    @Override
    public int updateProductsByIds(String b,List<String> ids) {
        //创建空的对象
        RpPayProduct rpPayProduct = new RpPayProduct();
        rpPayProduct.setStatus(b);
        //下面三行只是准备查询条件
        RpPayProductExample example = new RpPayProductExample();
        RpPayProductExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);
        //真正执行查询语句
        return  rpPayProductDao.updateByExampleSelective(rpPayProduct,example);

    }
}
