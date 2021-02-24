package org.lanqiao.mapper;

import org.lanqiao.entity.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKeyWithBLOBs(Admin record);

    int updateByPrimaryKey(Admin record);
}