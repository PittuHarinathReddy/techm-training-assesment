package com.example.docvaliddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class DoctorsService {

    @Autowired
    private DoctorsRepository doctorRepository;

    public Optional<Doctors> authenticate(String username, String password) {
        System.out.println("Username from UI: " + username);
        System.out.println("Password from UI: " + password);

        Optional<Doctors> doctor = doctorRepository.findByUsername(username);

        if (doctor.isPresent()) {
            System.out.println("Admin found in DB: " + doctor.get().getUsername());
            System.out.println("Password from DB: " + doctor.get().getPassword());

            if (doctor.get().getPassword().equals(password)) {
                System.out.println("Password match: Login successful!");
                return doctor;
            } else {
                System.out.println("Password mismatch: Login failed.");
            }
        } else {
            System.out.println("No admin found with username: " + username);
        }

        return Optional.empty();
    }
}
