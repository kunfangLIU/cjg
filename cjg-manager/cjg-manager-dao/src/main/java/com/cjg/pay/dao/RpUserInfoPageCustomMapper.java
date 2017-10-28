package com.cjg.pay.dao;

import com.cjg.pay.pojo.vo.RpUserInfoCustom;

import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 2017/10/22
 * Time: 17:07
 * Version:V1.0
 * 自定义用户dao层实体类接口
 */
public interface RpUserInfoPageCustomMapper {
     /**
      * 查询所用用户总记录数
      * @param map
      * @return
      */
     long countUserInfos(Map<String, Object> map);

     /**
      * 分页查询用户列表集合
      * @param map
      * @return
      */
     List<RpUserInfoCustom> listUserInfoByPage(Map<String, Object> map);

}
