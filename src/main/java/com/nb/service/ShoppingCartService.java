package com.nb.service;

import com.nb.entity.Shoppingcart;
import com.nb.vo.ShoppingCartOV;

import java.util.List;

/**
 * @author 谭杭
 * @version 1.0
 * @description TODO()
 * @date 2021/7/19 16:00
 */
public interface ShoppingCartService {

    /**
     * 向购物车中添加商品
     * @param shoppingcart
     * @return
     */
    int insertGoodsToShappingCart(Shoppingcart shoppingcart);

    /**
     * 删除购物车中的商品
     * @param id
     * @return
     */
    int deleteGoodsInShoppingCart(Long id);

    /**
     * 查找某一用户的购物车
     * @param userId
     * @return
     */
    List<ShoppingCartOV> selectAllByUser(Long userId);

}
