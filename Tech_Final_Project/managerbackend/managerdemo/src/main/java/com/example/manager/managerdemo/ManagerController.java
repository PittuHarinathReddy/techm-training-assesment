package com.example.manager.managerdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    // Endpoints for Clients
    @GetMapping("/users")
    public List<Client> getClients() {
        return managerService.getAllClients();
    }

    @PostMapping("/users")
    public Client addClient(@RequestBody Client client) {
        return managerService.addClient(client);
    }

    @PutMapping("/users/{id}")
    public Client updateClient(@PathVariable Long id, @RequestBody Client client) {
        return managerService.updateClient(id, client);
    }

    @DeleteMapping("/users/{id}")
    public void deleteClient(@PathVariable Long id) {
        managerService.deleteClient(id);
    }

    // Endpoints for Consultants
    @GetMapping("/doctors")
    public List<Consultant> getConsultants() {
        return managerService.getAllConsultants();
    }

    @PostMapping("/doctors")
    public Consultant addConsultant(@RequestBody Consultant consultant) {
        return managerService.addConsultant(consultant);
    }

    @PutMapping("/doctors/{id}")
    public Consultant updateConsultant(@PathVariable Long id, @RequestBody Consultant consultant) {
        return managerService.updateConsultant(id, consultant);
    }

    @DeleteMapping("/doctors/{id}")
    public void deleteConsultant(@PathVariable Long id) {
        managerService.deleteConsultant(id);
    }
}
