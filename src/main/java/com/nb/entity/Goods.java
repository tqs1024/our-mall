package com.nb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author TanQingshan
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
    private Long id;

    private String name;

    private String picture;

    private Long stock;

    private Double price;

    private String describe;

    private Long type;
}