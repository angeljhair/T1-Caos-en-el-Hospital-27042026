/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t1.tecnicas.de.program.orie.obj;

/**
 *
 * @author Angel
 */
public class Paciente {
    
    private final String id;
    private final String nombre;
    private final String tipoSangre; 
    private String email;
    
    public Paciente(String id, String nombre, String tipoSangre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.tipoSangre = tipoSangre;
        this.email = email;
    }
    
    public String getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}
