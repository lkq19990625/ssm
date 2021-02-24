package org.lanqiao.mapper;

import org.lanqiao.entity.Admin;

/**
 * @author:李克强
 * @description:
 * @date:Created in 10:40 2020/12/31
 * @modified by:
 */
public interface AdminMapper {
    /**
     * 登录
     * @param admin 管理员封装对象
     * @return
     */
    Admin selectAdminByAcnameAndAPwd(Admin admin);

    /**
     * 修改密码
     * @param admin 管理员封装对象
     * @return
     */
    int updateAdminApwdByAcname(Admin admin);

    /**
     * 修改用户信息
     * @param admin 存放用户信息的对象
     * @return
     */
    int updateAdminInformation(Admin admin);
}
