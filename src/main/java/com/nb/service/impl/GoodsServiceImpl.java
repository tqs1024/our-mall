package com.nb.service.impl;

import com.nb.mapper.GoodsMapper;
import com.nb.service.GoodsService;
import com.nb.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : 谭庆山
 * @Date : 2021/7/19 11:03
 * @Description TODO
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    public GoodsMapper mapper;

    @Override
    public List<GoodsVo> findAll() {
        return mapper.selectAll();
    }

    @Override
    public GoodsVo findOneDetailsById(Long id) {
        return mapper.selectOneDetailsById(id);
    }

    @Override
    public List<GoodsVo> findGoodsByType(Long typeid) {
        return mapper.selectGoodsByType(typeid);
    }

    @Override
    public String findTypeNameById(Long typeid) {
        return mapper.selectTypeNameById(typeid);
    }
}
