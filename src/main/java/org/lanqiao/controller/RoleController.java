package org.lanqiao.controller;



import com.github.pagehelper.PageInfo;
import org.lanqiao.entity.Permissions;
import org.lanqiao.entity.Role;
import org.lanqiao.service.PrivService;
import org.lanqiao.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:李克强
 * @description:
 * @date:Created in 12:27 2021/2/19
 * @modified by:
 */
@Controller
public class RoleController {
    @Resource
    RoleService roleService;
    @Resource
    PrivService privService;
    @RequestMapping("/priv/getAllPrivs.do")
    public String getAllPrivs(Model model){
        List<Permissions> lp = privService.getAllPermissions();
        model.addAttribute("lp",lp);
        return "role/role_add";
    }
    @RequestMapping("/role/roleList.do")
    public String getAllRoles(@RequestParam(name = "pageNum",required = false,defaultValue = "1") int pageNum, Model model){
        PageInfo<Role> lr = roleService.getPrivByRid2(pageNum);
        model.addAttribute("pageInfo",lr);
        return "role/role_list";
    }
    @RequestMapping("/role/insertRole.do")
    public String insertRole(HttpServletRequest request){
        String rname = request.getParameter("rname");
        String[] privs = request.getParameterValues("privs");
        Role role = new Role();
        role.setRname(rname);
        List<Permissions> lp = new ArrayList<>();
       for (String pid : privs){
           lp.add(new Permissions(Integer.parseInt(pid)));
       }
       role.setLp(lp);
        boolean b = roleService.insertRole(role);
        if (b){
            request.setAttribute("state","1");
        }else {
            request.setAttribute("state","2");
        }
        return "redirect:/priv/getAllPrivs.do";
    }
    @RequestMapping("/role/getRole.do")
    public String getRole(HttpServletRequest request,Model model){
        String rid = request.getParameter("rid");
        String rname = request.getParameter("rname");
        String pid = request.getParameter("pid");
        List<Permissions> lp = privService.getAllPermissions();
        model.addAttribute("lp",lp);
        model.addAttribute("rname",rname);
        model.addAttribute("rid",rid);
        model.addAttribute("pid",pid);
        return "role/role_modi";
    }
    @RequestMapping("/role/updateRole.do")
    public String updateRole(HttpServletRequest request){
        String rid = request.getParameter("rid");
        String rname = request.getParameter("rname");
        String[] priv = request.getParameterValues("privs");
        Role role = new Role();
        role.setId(Integer.parseInt(rid));
        role.setRname(rname);
        List<Permissions> lp = new ArrayList<>();
        for (String pid : priv){
            lp.add(new Permissions(Integer.parseInt(pid)));
        }
        role.setLp(lp);
        boolean b = roleService.updateRolePriv(role);
        if (b){
            request.setAttribute("state","1");
        }else{
            request.setAttribute("state","2");
        }
        return "role/update";
    }
    @RequestMapping("/role/deleteRole.do")
    public String deleteRole(HttpServletRequest request){
        String rid = request.getParameter("rid");
        Role role = new Role();
        role.setId(Integer.parseInt(rid));
        boolean b = roleService.deletRole(role);
        if (b){
            request.setAttribute("state","1");
        }else{
            request.setAttribute("state","2");
        }
        return "redirect:/role/roleList.do";
    }
}
