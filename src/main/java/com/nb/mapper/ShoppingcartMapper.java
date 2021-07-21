package com.nb.mapper;

import com.nb.entity.Shoppingcart;
import com.nb.vo.ShoppingCartOV;
import com.nb.vo.ShoppingCartOV;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingcartMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Shoppingcart record);

    Shoppingcart selectByPrimaryKey(Long id);

    List<Shoppingcart> selectAll();

    int updateByPrimaryKey(Shoppingcart record);

    /**
     * 向购物车中添加商品
     * @param shoppingcart
     * @return
     */
    public int insertGoodsToShappingCart(Shoppingcart shoppingcart);

    /**
     * 删除购物车中的商品
     * @param id
     * @return
     */
    public int deleteGoodsInShoppingCart(Long id);

    /**
     * 查找某一用户的购物车
     * @param userId
     * @return
     */
    public List<ShoppingCartOV> selectAllByUser(Long userId);

}