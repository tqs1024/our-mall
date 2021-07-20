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
public class Order {
    private Long id;

    private Long uid;

    private Long gid;

    private Long bid;

    private Integer count;

    private String dateUid;
}