package edu.pe.cibertec.springcrud.repository;

import edu.pe.cibertec.springcrud.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepository extends JpaRepository<Persona, Integer> {

}
