package com.java.car.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Tắt CSRF để dễ test API với Postman
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/admin/login", "/api/car-models/**", "/api/car-news/**").permitAll() // Mở quyền truy cập API danh sách xe
                        .anyRequest().authenticated() // Các API khác cần xác thực
                );
        return http.build();
    }

    // Thêm Bean PasswordEncoder để inject vào AdminService
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
