package com.nb.service;

import com.nb.vo.OrderVo;

import java.util.List;


public interface OrderService {

    /**
     * 查询用户的所有订单
     */
    List<OrderVo> selectAllById(Long uid);

    /**
     * 插入订单
     */
    Boolean insertOrder(Long uid, Long gid, Integer count);

    /**
     * 取消订单
     */
    Boolean disAbled(Long uid, Long id);

}
