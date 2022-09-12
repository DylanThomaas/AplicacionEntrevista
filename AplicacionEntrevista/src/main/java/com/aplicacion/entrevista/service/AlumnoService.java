package com.aplicacion.entrevista.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplicacion.entrevista.interfaces.InterfazAlumno;
import com.aplicacion.entrevista.interfacesService.InterfazAlumnoService;
import com.aplicacion.entrevista.modelo.Alumno;

@Service
public class AlumnoService implements InterfazAlumnoService {
	
	@Autowired
	private InterfazAlumno data;
	@Override
	public List<Alumno> listar() {
		return (List<Alumno>)data.findAll();
	}

	@Override
	public Optional<Alumno> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Alumno p) {
		int res=0;
		Alumno alumno=data.save(p);
		if(alumno.equals(null)) {
			res=1;
		}
		return 0;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

}
