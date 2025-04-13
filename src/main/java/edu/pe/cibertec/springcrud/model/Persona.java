package edu.pe.cibertec.springcrud.model;

import jakarta.persistence.Entity;

@Entity
public class Persona {

    private int id;
    private String nombre;
    private String appelido;
    private String documento;
    private String email;
    private String direccion;

}
