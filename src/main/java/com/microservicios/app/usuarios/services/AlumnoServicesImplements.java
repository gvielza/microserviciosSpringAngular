package com.microservicios.app.usuarios.services;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.commons.alumnos.models.entity.Alumno;
import com.formacionbdi.microservicios.commons.service.CommonServicesImplements;
import com.microservicios.app.usuarios.models.repository.AlumnoRepository;
@Service
public class AlumnoServicesImplements extends CommonServicesImplements<Alumno, AlumnoRepository>implements AlumnoService {

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findByNombreoApellido(String term) {
	
		return repository.findByNombreoApellido(term);
	}

	//

	}


