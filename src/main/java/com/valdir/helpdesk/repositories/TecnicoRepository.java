package com.cadu.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadu.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
