package com.nb.mapper;

import com.nb.entity.Goods;
import com.nb.vo.GoodsVo;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author TanQingshan
 */
@Repository
public interface GoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Goods record);

    Goods selectByPrimaryKey(Long id);

    /**
     * @Params []
     * @Return {@link List< GoodsVo>}
     * @Author 谭庆山
     * @Date 2021/7/19 22:03
     * @Description 返回联合查询的VO，用作首页展示
     */
    List<GoodsVo> selectAll();

    /**
     * @Params [id]
     * @Return {@link GoodsVo}
     * @Author 谭庆山
     * @Date 2021/7/19 22:08
     * @Description 根据ID查找一个VO对象，用作详情页展示
     */
    GoodsVo selectOneDetailsById(Long id);

    /**
     * @Params [typeid]
     * @Return {@link List< GoodsVo>}
     * @Author 谭庆山
     * @Date 2021/7/20 9:43
     * @Description 传入类别ID返回同类别列表，用作商品分类展示
     */
    List<GoodsVo> selectGoodsByType(Long typeid);

    /**
     * @Params [typeid]
     * @Return {@link String}
     * @Author 谭庆山
     * @Date 2021/7/20 10:04
     * @Description 根据类别id查找类别名称
     */
    String selectTypeNameById(Long typeid);

    int updateByPrimaryKey(Goods record);
}