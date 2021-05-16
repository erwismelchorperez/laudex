package com.emp.laudex.interfaceService;

import java.util.List;
import java.util.Optional;
import com.emp.laudex.entity.Alumno;


public interface IAlumnoService {
	public List<Alumno> listar();
	public Optional<Alumno> listarid(int id);
	public int save(Alumno a);
	public void delete(int id);
}
