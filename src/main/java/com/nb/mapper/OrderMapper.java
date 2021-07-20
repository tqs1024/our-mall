package com.nb.mapper;

import com.nb.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author TanQingshan
 */
@Repository
public interface OrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    Order selectByPrimaryKey(Long id);

    List<Order> selectAll();

    int updateByPrimaryKey(Order record);
}