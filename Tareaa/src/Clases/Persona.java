/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Lab409
 */
public class Persona 
{
    private String rut="";
    private String nombre="";
    private int edad=0;
    
    //constuctor 
    public Persona(String rut,String nom,int edad)
    {
        this.rut=rut;
        this.nombre=nom;
        this.edad=edad;
    }

    /**
     * @return the rut
     */
    public String getRut() {
        return rut;
    }

    /**
     * @param rut the rut to set
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void MostrarDatosPersona(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Rut: " + this.rut);
        System.out.println("Edad: " + this.edad);
    }
    
}
