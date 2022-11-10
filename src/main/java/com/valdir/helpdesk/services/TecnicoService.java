package com.valdir.helpdesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdir.helpdesk.domain.Tecnico;
import com.valdir.helpdesk.domain.dtos.TecnicoDTO;
import com.valdir.helpdesk.repositories.TecnicoRepository;
import com.valdir.helpdesk.services.exceptions.ObjectnotFoundException;

@Service
public class TecnicoService {

	@Autowired
	private TecnicoRepository repository;
	
	
	public Tecnico findById(Integer id ) {
		Optional<Tecnico> obj = repository.findById(id);
		
		return obj.orElseThrow(()-> new ObjectnotFoundException("Objeto não encontrado:" + id));
	}





	public List<Tecnico> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}





	public Tecnico create(TecnicoDTO objDTO) {
		objDTO.setId(null);
Tecnico newObj = new Tecnico(objDTO);
return repository.save(newObj);
	
	}


	
}
