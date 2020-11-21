package com.cenfotec.examen2C.service;

import java.util.List;
import java.util.Optional;

import com.cenfotec.examen2C.domain.Categoria;

public interface CategoriaService {
	public void save(Categoria categoria);
	public void delete(Long id);
	public List<Categoria> getAll();
	public Optional<Categoria> get(Long id);
}
