package org.lanqiao.controller;

import org.lanqiao.entity.Admin;
import org.lanqiao.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class AdminController {
    @Resource
    AdminService adminService;
    @RequestMapping("/admin/login.do")
    public String login(Admin admin , HttpSession session , Model model){
        Admin admin1 = adminService.checkUser(admin);
        if (admin1==null){
            model.addAttribute("errorMsg", "对不起,用户名或密码错误!");
            return "login";
        }else {
            session.setAttribute("admin",admin1);
            return "index";
        }
    }
    @RequestMapping("/admin/updateInformation.do")
    public String updateInformation(Admin admin, HttpSession session, Model model){
        boolean b = adminService.updateAdminInformation(admin);
        if (b){
            session.setAttribute("admin",admin);
            model.addAttribute("updateInformation", "恭喜您，修改成功!");
            return "user/user_info";
        }else{
            model.addAttribute("updateInformation", "对不起,修改失败!");
            return "user/user_info";
        }
    }
    @RequestMapping("/admin/exitLogin.do")
    public String exit(HttpSession session){
        session.invalidate();
        return "login";
    }
    @RequestMapping("/admin/updatePwd.do")
    public String updatePwd(String old_pwd, String new_pwd1, String new_pwd2,HttpSession session ,Model model){
        Admin admin = (Admin) session.getAttribute("admin");
        if(admin.getApwd().equals(old_pwd)&&new_pwd1.equals(new_pwd2)){
            admin.setApwd(new_pwd1);
            adminService.updateApwdByAcname(admin);
            session.invalidate();
            return "login";
        }else {
            model.addAttribute("updateInformation", "对不起,修改失败,请检查您输入的密码!");
            return "user/user_modi_pwd";
        }
    }
}
