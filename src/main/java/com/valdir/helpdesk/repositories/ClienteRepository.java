package com.cadu.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadu.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
