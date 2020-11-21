package com.cenfotec.examen2C.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cenfotec.examen2C.domain.Workshop;
import com.cenfotec.examen2C.repo.WorkshopRepository;

@Service
public class WorkshopServiceImpl implements WorkshopService {
	@Autowired
	WorkshopRepository workshopRepo;

	@Override
	public void save(Workshop workshop) {
		workshopRepo.save(workshop);
		
	}

	@Override
	public Optional<Workshop> get(Long id) {
		// TODO Auto-generated method stub
		return workshopRepo.findById(id);
	}

	@Override
	public List<Workshop> getAll() {
		// TODO Auto-generated method stub
		return workshopRepo.findAll();
	}

	@Override
	public List<Workshop> find(String name) {
		// TODO Auto-generated method stub
		return workshopRepo.findByNameContaining(name);
	}

	@Override
	public List<Workshop> findCategoria(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Workshop> findAutor(String name) {
		// TODO Auto-generated method stub
		return null;
	}


}
