package edu.pe.cibertec.springcrud.service;

import edu.pe.cibertec.springcrud.model.Persona;
import edu.pe.cibertec.springcrud.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {
    @Autowired
    IPersonaRepository personaRepository;

    public List<Persona> listar(){
        return  personaRepository.findAll();
    }
    public Persona obtener(int id){
        return  personaRepository.findById(id).orElse(null);
    }

    public Persona registar(Persona persona){
        return  personaRepository.save(persona);
    }

    public Persona actualizar(Persona persona){
        return  personaRepository.save(persona);
    }
    public void eliminar(int id){
        personaRepository.deleteById(id);
    }

}
