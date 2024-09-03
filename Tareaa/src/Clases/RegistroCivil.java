/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.*;

/**
 *
 * @author Lab409
 */
public class RegistroCivil {
    private ArrayList<Ciudad> Ciudad ;
    private ArrayList<Matrimonio> Matrimonios ;
    private ArrayList<Persona> Personas;
    
    public RegistroCivil(){
        Ciudad = new ArrayList<>();
        Matrimonios = new ArrayList<>();
    }

    /**
     * @return the Ciudad
     */
    public ArrayList<Ciudad> getCiudad() {
        return Ciudad;
    }

    /**
     * @param Ciudad the Ciudad to set
     */
    public void setCiudad(ArrayList<Ciudad> Ciudad) {
        this.Ciudad = Ciudad;
    }

    /**
     * @return the Matrimonios
     */
    public ArrayList<Matrimonio> getMatrimonios() {
        return Matrimonios;
    }

    /**
     * @param Matrimonios the Matrimonios to set
     */
    public void setMatrimonios(ArrayList<Matrimonio> Matrimonios) {
        this.Matrimonios = Matrimonios;
    }

    /**
     * @return the Personas
     */
    public ArrayList<Persona> getPersonas() {
        return Personas;
    }

    /**
     * @param Personas the Personas to set
     */
    public void setPersonas(ArrayList<Persona> Personas) {
        this.Personas = Personas;
    }
}
