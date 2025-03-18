package com.example.AdminValid.adminvaliddemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Admin admin) {
        System.out.println("Received login request for: " + admin.getUsername());

        Optional<Admin> authenticatedAdmin = adminService.authenticate(admin.getUsername(), admin.getPassword());

        if (authenticatedAdmin.isPresent()) {
            Map<String, String> response = new HashMap<>();
            response.put("token", "dummy-token"); // Ideally, you generate JWT token here
            return ResponseEntity.ok(response); // Returning JSON response
        } else {
            return ResponseEntity.status(401).body("Invalid Credentials");
        }
    }
}
