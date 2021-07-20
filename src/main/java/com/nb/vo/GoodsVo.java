package com.nb.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : 谭庆山
 * @Date : 2021/7/19 12:47
 * @Description TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsVo {
    private Long id;

    private String name;

    private String picture;

    private Long stock;

    private Double price;

    private String describe;

    private String typename;
}
