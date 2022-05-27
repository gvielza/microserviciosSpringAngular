package com.microservicios.app.usuarios.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.commons.alumnos.models.entity.Alumno;
//agregar paginación,agregamos al repository en ves del Crud por PagingAndSortingRepository
public interface AlumnoRepository extends PagingAndSortingRepository<Alumno, Long> {

	@Query("select a from Alumno a where a.nombre like %?1% or a.apellido like %?1%")
	public List<Alumno> findByNombreoApellido(String term);
		
	
}
