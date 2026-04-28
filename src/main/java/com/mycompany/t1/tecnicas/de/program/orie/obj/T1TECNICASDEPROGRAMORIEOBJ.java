/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t1.tecnicas.de.program.orie.obj;
import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class T1TECNICASDEPROGRAMORIEOBJ {

    public static void main(String[] args) {
        
        ControladorPaciente control = new ControladorPaciente();
        Scanner sc = new Scanner(System.in);
        int op = 0;
        
        do {
            try {
                System.out.println("\n");
                System.out.println("SISTEMA DE GESTION - T1");
                System.out.println("");
                System.out.print("1. Agregar Paciente\n");
                System.out.print("2. Listar Pacientes\n");
                System.out.print("3. Salir\n");
                System.out.print("Opcion: ");
                
                op = Integer.parseInt(sc.nextLine());

                if (op == 1) {
                    System.out.print("Ingrese un ID de tres caracteres: ");
                    String id = sc.nextLine();
                    if (id.length() < 3) throw new Exception("ID invalido por longitud.");

                    System.out.print("Ingrese sus nombres completos: ");
                    String nom = sc.nextLine();
                    if (nom.trim().isEmpty()) throw new Exception("El nombre no puede estar vacio.");

                    System.out.print("Ingrese su email: ");
                    String mail = sc.nextLine();
                    if (!mail.contains("@")) throw new Exception("Email invalido.");

                    System.out.print("Ingrese su tipo de sangre: ");
                    String sangre = sc.nextLine();

                    control.agregar(new Paciente(id, nom, sangre, mail));
                    
                } else if (op == 2) {
                    control.listar();
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero del 1 al 3.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (op != 3);
     
        System.out.println("Gracias");
    }
}
