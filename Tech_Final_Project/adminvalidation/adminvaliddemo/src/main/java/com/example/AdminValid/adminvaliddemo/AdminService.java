package com.example.AdminValid.adminvaliddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Optional<Admin> authenticate(String username, String password) {
        System.out.println("Username from UI: " + username);
        System.out.println("Password from UI: " + password);

        Optional<Admin> admin = adminRepository.findByUsername(username);

        if (admin.isPresent()) {
            System.out.println("Admin found in DB: " + admin.get().getUsername());
            System.out.println("Password from DB: " + admin.get().getPassword());

            if (admin.get().getPassword().equals(password)) {
                System.out.println("Password match: Login successful!");
                return admin;
            } else {
                System.out.println("Password mismatch: Login failed.");
            }
        } else {
            System.out.println("No admin found with username: " + username);
        }

        return Optional.empty();
    }
}
