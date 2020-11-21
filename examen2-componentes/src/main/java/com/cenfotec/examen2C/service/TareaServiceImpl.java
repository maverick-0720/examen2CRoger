package com.cenfotec.examen2C.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cenfotec.examen2C.domain.Tarea;
import com.cenfotec.examen2C.repo.TareaRepository;
@Service
public class TareaServiceImpl implements TareaService {
	
	@Autowired
	TareaRepository tareaRepo;
	
	@Override
	public void save(Tarea tarea) {
		tareaRepo.save(tarea);
		
	}

}
