package com.example.docvaliddemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class DoctorsController {

    @Autowired
    private DoctorsService doctorService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Doctors doctor) {
        System.out.println("Received login request for: " + doctor.getUsername());

        Optional<Doctors> authenticatedAdmin = doctorService.authenticate(doctor.getUsername(), doctor.getPassword());

        if (authenticatedAdmin.isPresent()) {
            Map<String, String> response = new HashMap<>();
            response.put("token", "dummy-token"); // Ideally, you generate JWT token here
            return ResponseEntity.ok(response); // Returning JSON response
        } else {
            return ResponseEntity.status(401).body("Invalid Credentials");
        }
    }
}