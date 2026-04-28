/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t1.tecnicas.de.program.orie.obj;

/**
 *
 * @author Angel
 */
import java.util.ArrayList;
import java.util.List;

public class ControladorPaciente {
    private List<Paciente> listaPacientes = new ArrayList<>();

    public void agregarPaciente(Paciente p) {
        listaPacientes.add(p);
        System.out.println("Paciente registrado con éxito.");
    }

    public void listarPacientes() {
        if (listaPacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
        } else {
            for (Paciente p : listaPacientes) {
                System.out.println("ID: " + p.getId() + " | Nombre: " + p.getNombre());
            }
        }
    }
    
}
