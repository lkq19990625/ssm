package org.lanqiao.mapper;

import org.lanqiao.entity.Permissions;

import java.util.List;

/**
 * @author:李克强
 * @description:
 * @date:Created in 15:36 2021/1/4
 * @modified by:
 */
public interface PriMapper {
    /**
     * 查询用户权限
     * @param aid 用户id
     * @return
     */
    List<Permissions> selectPidByAid(Integer aid);

    /**
     * 查询所有权限
     * @param rid 角色id
     * @return
     */
    List<Permissions> selectNameByRid(Integer rid);

    /**
     * 查询所有权限
     * @return
     */

    List<Permissions> selectAllPriv();
}
