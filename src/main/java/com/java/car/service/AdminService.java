package com.java.car.service;

import com.java.car.dto.LoginRequest;
import com.java.car.model.Admin;
import com.java.car.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public boolean login(LoginRequest request) {
        Optional<Admin> admin = adminRepository.findByUsername(request.getUsername());
        if (admin.isPresent()) {
            return passwordEncoder.matches(request.getPassword(), admin.get().getPassword());
        }
        return false;
    }
}

