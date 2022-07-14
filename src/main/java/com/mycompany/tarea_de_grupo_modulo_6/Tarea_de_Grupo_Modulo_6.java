/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea_de_grupo_modulo_6;

import helpers.Deportista;
import helpers.Doctor;

/**
 *
 * @author Oscar Mauricio
 */
public class Tarea_de_Grupo_Modulo_6 {

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Deportista deportista = new Deportista();
        
        System.out.println(doctor.obtenerInformacionPersona());
        doctor.imprimirInformacion();
        
        
        System.out.println(deportista.obtenerInformacionPersona());
        deportista.imprimirInformacion();
        System.out.println("-----------");
    }
}
