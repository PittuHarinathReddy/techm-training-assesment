package com.example.manager.managerdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {
    
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ConsultantRepository consultantRepository;

    // CRUD Operations for Clients
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    public Client updateClient(Long id, Client client) {
        client.setId(id);
        return clientRepository.save(client);
    }

    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    // CRUD Operations for Consultants
    public List<Consultant> getAllConsultants() {
        return consultantRepository.findAll();
    }

    public Consultant addConsultant(Consultant consultant) {
        return consultantRepository.save(consultant);
    }

    public Consultant updateConsultant(Long id, Consultant consultant) {
        consultant.setId(id);
        return consultantRepository.save(consultant);
    }

    public void deleteConsultant(Long id) {
        consultantRepository.deleteById(id);
    }
}

