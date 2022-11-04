package com.wanderson.devspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wanderson.devspring.model.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {
    
}
