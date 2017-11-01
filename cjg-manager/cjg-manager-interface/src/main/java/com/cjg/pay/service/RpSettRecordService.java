package com.cjg.pay.service;

import com.cjg.pay.dto.Page;
import com.cjg.pay.dto.Result;
import com.cjg.pay.pojo.po.RpSettRecord;
import com.cjg.pay.pojo.vo.RpSettRecordCustom;
import com.cjg.pay.pojo.vo.RpSettRecordQuery;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/10/29
 * Time: 17:46
 * Version:V1.0
 * 记录结算清单业务逻辑层接口
 */
public interface RpSettRecordService {

    /**
     * 按id查询清单记录
     * @param settRecordId
     * @return
     */
    RpSettRecord getBySettRecordId(String settRecordId);

    /**
     * 分页查询清单记录数
     * @param page
     * @param query
     * @return
     */
    Result<RpSettRecordCustom> listSettRecords(Page page, RpSettRecordQuery query);

    List<RpSettRecord> selectSettRecord(String id);
}
