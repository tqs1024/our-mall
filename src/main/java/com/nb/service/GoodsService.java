package com.nb.service;

import com.nb.vo.GoodsVo;

import java.util.List;

/**
 * @Author : 谭庆山
 * @Date : 2021/7/19 11:02
 * @Description TODO
 */
public interface GoodsService {
    /**
     * @Params []
     * @Return {@link List<GoodsVo>}
     * @Author 谭庆山
     * @Date 2021/7/19 22:07
     * @Description 返回联合查询的VO，用作首页展示
     */
    List<GoodsVo> findAll();

    /**
     * @Params [id]
     * @Return {@link GoodsVo}
     * @Author 谭庆山
     * @Date 2021/7/19 22:08
     * @Description 根据ID查找一个VO对象，用作详情页展示
     */
    GoodsVo findOneDetailsById(Long id);

    /**
     * @Params [typeid]
     * @Return {@link List< GoodsVo>}
     * @Author 谭庆山
     * @Date 2021/7/20 9:46
     * @Description 传入类别ID返回同类别列表，用作商品分类展示
     */
    List<GoodsVo> findGoodsByType(Long typeid);

    /**
     * @Params [typeid]
     * @Return {@link String}
     * @Author 谭庆山
     * @Date 2021/7/20 10:10
     * @Description 根据类别id查找类别名称，分类页面展示会用到
     */
    String findTypeNameById(Long typeid);

}
