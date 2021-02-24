package org.lanqiao.service.Impl;

import org.lanqiao.mapper.PriMapper;
import org.lanqiao.entity.Permissions;
import org.lanqiao.entity.Role;
import org.lanqiao.service.PrivService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:李克强
 * @description:
 * @date:Created in 15:44 2021/1/7
 * @modified by:
 */
@Service("privService")
public class PrivServiceImpl implements PrivService {
    @Autowired
    PriMapper priMapper;
    @Override
    public List<Permissions> getAllPermissions() {
        List<Permissions> list = priMapper.selectAllPriv();
        return list;
    }
}
