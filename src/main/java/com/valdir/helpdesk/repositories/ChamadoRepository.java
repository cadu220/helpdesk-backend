package com.cadu.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadu.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
