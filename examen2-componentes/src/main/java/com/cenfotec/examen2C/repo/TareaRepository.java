package com.cenfotec.examen2C.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cenfotec.examen2C.domain.Tarea;

public interface TareaRepository extends JpaRepository<Tarea,Long> {

}
