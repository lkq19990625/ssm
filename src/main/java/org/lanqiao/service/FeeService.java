package org.lanqiao.service;

import org.lanqiao.entity.Fee;

import java.util.List;

/**
 * @author:李克强
 * @description:
 * @date:Created in 11:11 2021/3/5
 * @modified by:
 */
public interface FeeService {
    List<Fee> getAllFee();
    // 添加资费类型
    boolean insertFee(Fee fee);

    boolean deleteFee(Fee fee);
}
