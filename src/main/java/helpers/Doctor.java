/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author Oscar Mauricio
 */
public class Doctor extends Persona {
    
    public Doctor()
       { 
           establecerProfesion("Doctor");
           establecerNombre("Julio");
           establecerApellido("Carranza");
           establecerDomicilio("Tegucigalpa, Col.bendeck");
           establecerDni(1801199345);
           
       }    

    @Override
    String obtenerInformacionPersona() {
        return "Informacion para Doctor";
    }
}
