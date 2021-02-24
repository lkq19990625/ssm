package org.lanqiao.service;

import com.github.pagehelper.PageInfo;
import org.lanqiao.entity.Role;

import java.util.List;

/**
 * @author:李克强
 * @description:
 * @date:Created in 16:55 2021/1/6
 * @modified by:
 */
public interface RoleService {
    List<Role> getPrivByRid();

    PageInfo<Role> getPrivByRid2(int pageNum);

    boolean insertRole(Role role);

    boolean deletRole(Role role);

    boolean updateRolePriv(Role role);
}
