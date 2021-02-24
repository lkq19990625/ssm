package org.lanqiao.service.Impl;

import org.lanqiao.mapper.AdminMapper;
import org.lanqiao.mapper.PriMapper;
import org.lanqiao.mapper.RoleMapper;
import org.lanqiao.entity.Admin;
import org.lanqiao.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:李克强
 * @description:
 * @date:Created in 10:42 2020/12/31
 * @modified by:
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    @Autowired
    PriMapper priMapper;
    @Autowired
    RoleMapper roleMapper;
    @Override
    public Admin checkUser(Admin admin1) {
        Admin admin = adminMapper.selectAdminByAcnameAndAPwd(admin1);
        if (admin!=null){
            admin.setLp(priMapper.selectPidByAid(admin.getId()));
            admin.setLr(roleMapper.selectRolesByAid(admin.getId()));
        }
        return admin;
    }

    @Override
    public boolean updateApwdByAcname(Admin admin) {
        return adminMapper.updateAdminApwdByAcname(admin) > 0;
    }

    @Override
    public boolean updateAdminInformation(Admin admin) {
        return adminMapper.updateAdminInformation(admin) > 0;
    }
}
