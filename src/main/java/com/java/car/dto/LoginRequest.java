package com.java.car.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {  // Phải trả về String thay vì CharSequence
        return password;
    }
}

