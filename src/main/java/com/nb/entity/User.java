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
public class User {
    private Long id;

    private String account;

    private String username;

    private String password;

    private String address;

    private String phone;
}