package com.devAnder.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devAnder.cursomc.domain.Categoria;
import com.devAnder.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repo;
	public Categoria find(Integer id) { 
		 Optional<Categoria> obj = repo.findById(id); 
		return obj.orElse(null); 
		} 

}
