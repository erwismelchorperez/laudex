package com.emp.laudex.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.laudex.entity.Alumno;
import com.emp.laudex.interfaceService.IAlumnoService;
import com.emp.laudex.repository.AlumnoRepository;

@Service
public class AlumnoService implements IAlumnoService{
	@Autowired
	private AlumnoRepository data;
	@Override
	public List<Alumno> listar() {
		// TODO Auto-generated method stub
		return (List<Alumno>) data.findAll();
	}
	@Override
	public Optional<Alumno> listarid(int id) {
		// TODO Auto-generated method stub
		return data.findById((long) id);
	}
	@Override
	public int save(Alumno a) {
		// TODO Auto-generated method stub
		int rest = 0;
		Alumno alum = data.save(a);
		if(!alum.equals(null)) {
			rest = 1;
		}
		return rest; 
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		data.deleteById((long) id);
	}
	 
}
