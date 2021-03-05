package org.lanqiao.service.Impl;

import org.lanqiao.entity.Fee;
import org.lanqiao.mapper.FeeMapper;
import org.lanqiao.service.FeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:李克强
 * @description:
 * @date:Created in 11:11 2021/3/5
 * @modified by:
 */
@Service("feeService")
public class FeeServiceImpl implements FeeService {
    @Autowired
    FeeMapper feeMapper;
    public List<Fee> getAllFee() {
        return feeMapper.selectAllFees();
    }

    public boolean insertFee(Fee fee) {
        int j = feeMapper.insertFee(fee);
        return j>0;
    }
}
