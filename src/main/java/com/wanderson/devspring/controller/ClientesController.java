package com.wanderson.devspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wanderson.devspring.model.Clientes;
import com.wanderson.devspring.repository.ClientesRepository;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClientesController {

    
    private final ClientesRepository clientesRepository;

    public ClientesController(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    @GetMapping
    public List<Clientes> list() {
        return clientesRepository.findAll();
    }
    

}
