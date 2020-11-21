package com.cenfotec.examen2C.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cenfotec.examen2C.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long>  {

}
