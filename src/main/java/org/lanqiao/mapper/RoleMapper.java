package org.lanqiao.mapper;

import org.lanqiao.entity.Admin;
import org.lanqiao.entity.Role;

import java.util.List;

/**
 * @author:李克强
 * @description:
 * @date:Created in 21:07 2021/1/4
 * @modified by:
 */
public interface RoleMapper {
    /**
     * 查询用户的所有角色信息
     * @param aid 用户id
     * @return
     */
    List<Role> selectRolesByAid(Integer aid);

    /**
     * 查询所有角色
     * @return
     */
    List<Role> selectAllRoles();

    /**
     * 添加角色
     * @param role 封装好的角色对象
     * @return
     */
    int insertRole(Role role);

    /**
     * 添加角色权限
     * @param role 封装的角色对象
     * @return
     */
    int insertRolePriv(Role role);

    /**
     * 查询刚添加的角色
     * @param rname 刚添加的角色名
     * @return
     */
    Role selectRoleByRname(String rname);

    /**
     * 查询要删除的角色是否有用户在占用
     * @param role
     * @return
     */
    Admin selectAidByRid(Role role);

    /**
     * 删除角色——权限关联表
     * @param role
     * @return
     */
    int deleteRolePriv(Role role);

    /**
     * 删除角色表
     * @param role
     * @return
     */
    int deleteRole(Role role);

    /**
     * 修改角色名称
     * @param role
     * @return
     */
    int updateRnameByRid(Role role);
}
