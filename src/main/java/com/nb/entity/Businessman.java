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
public class Businessman {
    private Long id;

    private String name;

    private String password;

    private String phone;
}