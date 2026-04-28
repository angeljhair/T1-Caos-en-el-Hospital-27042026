/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t1.tecnicas.de.program.orie.obj;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Angel
 */
public class ControladorPaciente {
    private List<Paciente> lista;

    public ControladorPaciente() {
        this.lista = new ArrayList<>();
    }
    
    public void agregar(Paciente p) {
        lista.add(p);
        System.out.println(">>> Paciente agregado exitosamente.");
    }
    
    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("La lista de pacientes esta vacia.");
        } else {
            System.out.println("\nLISTA DE PACIENTES REGISTRADOS:");
            for (Paciente p : lista) {
                System.out.println("ID: " + p.getId() + 
                                   " | Nombre: " + p.getNombre() + 
                                   " | Sangre: " + p.getTipoSangre() + 
                                   " | Email: " + p.getEmail());
            }



    
}
