package com.nb.mapper;

import com.nb.entity.Shoppingcart;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author TanQingshan
 */
@Repository
public interface ShoppingcartMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Shoppingcart record);

    Shoppingcart selectByPrimaryKey(Long id);

    List<Shoppingcart> selectAll();

    int updateByPrimaryKey(Shoppingcart record);
}