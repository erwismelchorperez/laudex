package com.emp.laudex.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emp.laudex.entity.Alumno;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Long>{
	
}
