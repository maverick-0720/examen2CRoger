package com.cenfotec.examen2C.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cenfotec.examen2C.domain.Clave;
import com.cenfotec.examen2C.repo.CategoriaRepository;
import com.cenfotec.examen2C.repo.ClaveRepository;

@Service
public class ClaveServiceImpl implements ClaveService {
	
	@Autowired
	ClaveRepository claveRepo;

	@Override
	public void save(Clave clave) {
		claveRepo.save(clave);
		
	}

}
