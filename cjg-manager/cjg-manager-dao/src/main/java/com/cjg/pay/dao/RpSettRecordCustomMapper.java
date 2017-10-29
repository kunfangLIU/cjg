package com.cjg.pay.dao;

import com.cjg.pay.pojo.vo.RpSettRecordCustom;

import java.util.List;
import java.util.Map;

/**
 * 查询结算记录清单dao层接口类
 */
public interface RpSettRecordCustomMapper {
    //查询记录结算记录清单总记录数
    long countSettRecords(Map<String, Object> map);

    /**
     * 分页查询记录清单集合
     * @param map
     * @return
     */
    List<RpSettRecordCustom> listSettRecords(Map<String,Object> map);

}