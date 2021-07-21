package com.nb.service.impl;

import com.nb.mapper.OrderMapper;
import com.nb.service.OrderService;
import com.nb.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderSerivceImpl implements OrderService {


    @Autowired
    private OrderMapper mapper;

    @Override
    public List<OrderVo> selectAllById(Long uid) {
        return mapper.selectAllById(uid);
    }

    @Override
    public Boolean insertOrder(Long uid, Long gid, Integer count) {
        return mapper.insertOrder(uid, gid, count) != 0 ;
    }

    @Override
    public Boolean disAbled(Long uid, Long id) {
        return mapper.disAbled(uid, id) != 0;
    }

}
