package org.lanqiao.service;

import org.lanqiao.entity.Admin;

/**
 * @author:李克强
 * @description:
 * @date:Created in 10:42 2020/12/31
 * @modified by:
 */
public interface AdminService {
    Admin checkUser(Admin admin);

    boolean updateApwdByAcname(Admin admin);

    boolean updateAdminInformation(Admin admin);
}
