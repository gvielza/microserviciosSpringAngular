package com.microservicios.app.usuarios.services;

import java.util.List;

import com.commons.alumnos.models.entity.Alumno;
import com.formacionbdi.microservicios.commons.service.CommonService;

public interface AlumnoService extends CommonService<Alumno>{

	public List<Alumno> findByNombreoApellido(String term);
}
