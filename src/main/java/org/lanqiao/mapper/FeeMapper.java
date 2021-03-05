package org.lanqiao.mapper;

import org.lanqiao.entity.Fee;

import java.util.List;

/**
 * @author:李克强
 * @description:
 * @date:Created in 11:14 2021/3/5
 * @modified by:
 */
public interface FeeMapper {
    // 查询所有的资费信息
    List<Fee> selectAllFees();
    // 添加资费
    int insertFee(Fee fee);
}
