package com.aplicacion.entrevista.interfacesService;

import java.util.List;
import java.util.Optional;

import com.aplicacion.entrevista.modelo.Alumno;

public interface InterfazAlumnoService {
	public List<Alumno>listar();
	public Optional<Alumno>listarId(int id);
	public int save(Alumno p);
	public void delete(int id);

}
