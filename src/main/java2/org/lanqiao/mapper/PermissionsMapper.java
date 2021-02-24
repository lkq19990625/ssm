package org.lanqiao.mapper;

import org.lanqiao.entity.Permissions;

public interface PermissionsMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Permissions record);

    int insertSelective(Permissions record);

    Permissions selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Permissions record);

    int updateByPrimaryKey(Permissions record);
}