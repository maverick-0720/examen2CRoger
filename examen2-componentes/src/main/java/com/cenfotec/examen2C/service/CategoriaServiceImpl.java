package com.cenfotec.examen2C.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cenfotec.examen2C.domain.Categoria;
import com.cenfotec.examen2C.domain.Clave;
import com.cenfotec.examen2C.repo.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	CategoriaRepository categoriaRepo;
	
	
	public void save(Categoria categoria) {
		categoriaRepo.save(categoria);
	}


	@Override
	public List<Categoria> getAll() {
		// TODO Auto-generated method stub
		return categoriaRepo.findAll();
	}


	@Override
	public Optional<Categoria> get(Long id) {
		// TODO Auto-generated method stub
		return categoriaRepo.findById(id);
	}


	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		categoriaRepo.deleteById(id);
	}
}
