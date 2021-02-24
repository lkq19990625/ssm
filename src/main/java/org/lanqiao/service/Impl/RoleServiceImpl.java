package org.lanqiao.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.lanqiao.entity.Admin;
import org.lanqiao.mapper.PriMapper;
import org.lanqiao.mapper.RoleMapper;
import org.lanqiao.entity.Role;
import org.lanqiao.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:李克强
 * @description:
 * @date:Created in 17:13 2021/1/6
 * @modified by:
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;
    @Autowired
    PriMapper priMapper;
    @Override
    public List<Role> getPrivByRid() {
        List<Role> list = roleMapper.selectAllRoles();
        for(Role role:list){
            role.setLp(priMapper.selectNameByRid(role.getId()));
        }
        return list;
    }

    @Override
    public PageInfo<Role> getPrivByRid2(int pageNum) {
        PageHelper.startPage(pageNum,3);
        List<Role> list = roleMapper.selectAllRoles();
        for(Role role:list){
            role.setLp(priMapper.selectNameByRid(role.getId()));
        }
        PageInfo<Role> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public boolean insertRole(Role role) {
        int i = roleMapper.insertRole(role);
        Role r = roleMapper.selectRoleByRname(role.getRname());
        role.setId(r.getId());
        int j = roleMapper.insertRolePriv(role);
        return i>0&&j>0;
    }

    @Override
    public boolean deletRole(Role role) {
        Admin admin = new Admin();
        Admin admin1 = roleMapper.selectAidByRid(role);
        if(!admin.equals(admin1)){
            int i = roleMapper.deleteRolePriv(role);
            int j = roleMapper.deleteRole(role);
            return i>0&&j>0;
        }
        return false;
    }

    @Override
    public boolean updateRolePriv(Role role) {
        int i = roleMapper.updateRnameByRid(role);
        int j = roleMapper.deleteRolePriv(role);
        int k = roleMapper.insertRolePriv(role);
        return i>0&&j>0&&k>0;
    }
}
