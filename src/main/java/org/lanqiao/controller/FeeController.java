package org.lanqiao.controller;

import org.lanqiao.entity.Fee;
import org.lanqiao.service.FeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author:李克强
 * @description:
 * @date:Created in 11:10 2021/3/5
 * @modified by:
 */
@Controller
public class FeeController {
    @Resource
    FeeService feeService;
    @RequestMapping("/fee/feeAdd.do")
    public String feeList(Model model){
        List<Fee> list = feeService.getAllFee();
        model.addAttribute("fr",list);
        return "/fee/fee_list";
    }
    @RequestMapping("/fee/feeList.do")
    public String addListFee(){
        return "/fee/fee_add";
    }

    @RequestMapping("/fee/feeAddList.do")
    public String feeAdd(HttpServletRequest request){
       String fname = request.getParameter("fname");
       String ftime = request.getParameter("ftime");
       String fcout = request.getParameter("fcout");
       String fcounts = request.getParameter("fcounts");
       String by001 = request.getParameter("by001");
       Fee fee = new Fee(fname,ftime,Double.parseDouble(fcout),Double.parseDouble(fcounts),by001);
        boolean b = feeService.insertFee(fee);
        if(b){
            // 添加成功
            request.setAttribute("state","1");
        }else{
            // 添加失败
            request.setAttribute("state","0");
        }
        return "redirect:/fee/feeAddList.do";

    }
}
