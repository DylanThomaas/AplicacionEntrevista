package com.aplicacion.entrevista.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aplicacion.entrevista.modelo.Alumno;

@Repository
public interface InterfazAlumno extends CrudRepository<Alumno, Integer>{

}
