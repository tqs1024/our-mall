package com.nb.mapper;

import com.nb.vo.OrderVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author TanQingshan
 */
@Repository
public interface OrderMapper {

    //通过ID查找所有订单
    public List<OrderVo> selectAllById(@Param("uid") Long Uid);

    //加入订单
    public int insertOrder(@Param("uid") Long uid, @Param("gid") Long gid, @Param("count") Integer count);

    //取消订单
    public int disAbled(@Param("uid") Long uid, @Param("id") Long id);

}