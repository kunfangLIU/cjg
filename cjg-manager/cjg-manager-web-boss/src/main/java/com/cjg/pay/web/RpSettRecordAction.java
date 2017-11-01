package com.cjg.pay.web;

import com.cjg.pay.dto.Page;
import com.cjg.pay.dto.Result;
import com.cjg.pay.pojo.po.RpSettRecord;
import com.cjg.pay.pojo.vo.RpSettRecordCustom;
import com.cjg.pay.pojo.vo.RpSettRecordQuery;
import com.cjg.pay.service.RpSettRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * User: Administrator
 * Date: 2017/10/29
 * Time: 17:55
 * Version:V1.0
 * 结算清单查询控制层
 */
@Controller
@Scope("prototype")
public class RpSettRecordAction {
    @Autowired
    RpSettRecordService rpSettRecordService;
    @ResponseBody
    @RequestMapping("/showSettRecordId")
    public String getBySettRecordId(@PathVariable String settRecordId, Model model){
        RpSettRecord recordId = rpSettRecordService.getBySettRecordId(settRecordId);
        model.addAttribute("settRecordId",recordId);
        return "settRecordInfo";
    }
    @ResponseBody
    @RequestMapping("/settRecords")
    public Result<RpSettRecordCustom> listSettRecords(Page page, RpSettRecordQuery query){
        return  rpSettRecordService.listSettRecords(page,query);
    }
    @RequestMapping("/showSettRecord")
    public String selectSettRecord(@RequestParam("id") String id , Model model, HttpSession session){
        List<RpSettRecord> list =  rpSettRecordService.selectSettRecord(id);
        model.addAttribute("list",list);
        return  "rpShowSettRecord";
    }
}
