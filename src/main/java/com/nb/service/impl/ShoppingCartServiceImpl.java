package com.nb.service.impl;

import com.nb.entity.Shoppingcart;
import com.nb.mapper.ShoppingcartMapper;
import com.nb.service.ShoppingCartService;
import com.nb.vo.ShoppingCartOV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 谭杭
 * @version 1.0
 * @description TODO()
 * @date 2021/7/19 16:02
 */
@Service("shoppingCartService")
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    private ShoppingcartMapper shoppingcartMapper;

    @Override
    public int insertGoodsToShappingCart(Shoppingcart shoppingcart) {
        System.out.println(shoppingcart);
        int row = shoppingcartMapper.insertGoodsToShappingCart(shoppingcart);
        return row;
    }

    @Override
    public int deleteGoodsInShoppingCart(Long id) {
        int row = shoppingcartMapper.deleteGoodsInShoppingCart(id);
        return row;
    }

    @Override
    public List<ShoppingCartOV> selectAllByUser(Long userId) {
        List<ShoppingCartOV> goods = shoppingcartMapper.selectAllByUser(userId);
        return goods;
    }
}
