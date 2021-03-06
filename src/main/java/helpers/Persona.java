/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author Oscar Mauricio
 */
public class Persona {
    //Atributos
   private String nombre;
   private String apellido;
   private String domicilio;
   private int dni;
    public Persona ()
    {
        //Constructor sin parametros
    }
    
    //Establecer y obtener
    public void establecerNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String obtenerNombre()
    {
        return this.nombre;
    }
    
     public void establecerProfesion(String profesion)
    {
        this.profesion = profesion;
    }
    
    public String obtenerProfesion()
    {
        return this.profesion;
    }
    
     public void establecerApellido(String apellido)
    {
        this.apellido = apellido;
    }
    
    public String obtenerApellido()
    {
        return this.apellido;
    }
    
     public void establecerDomicilio(String domicilio)
    {
        this.domicilio = domicilio;
    }
    
    public String obtenerDomicilio()
    {
        return this.domicilio;
    }
    
     public void establecerDni(int dni)
    {
        this.dni = dni;
    }
    
    public int obtenerDni()
    {
        return this.dni;
    }
    
    public void imprimirInformacion()
    {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Profesion: " + profesion);
        System.out.println("DNI: " + dni);
        System.out.println("-------------------------------");
    }
     abstract String obtenerInformacionPersona();
}
