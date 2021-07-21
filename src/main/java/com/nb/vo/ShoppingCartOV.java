package com.nb.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 谭杭
 * @version 1.0
 * @description TODO()
 * @date 2021/7/19 14:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCartOV {

    private long id;

    private long uid;

    private long gid;

    private String name;

    private String describe;

    private double price;

    private boolean deleted;

    public String getClickEvent() {
        return "showOrder(" + gid + ", '"+ name +  "', '"+ describe + "', "+ price + ")";
    }
}
