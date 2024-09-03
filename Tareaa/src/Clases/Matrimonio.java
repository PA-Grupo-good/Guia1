/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Lab409
 */
public class Matrimonio {
    private int numReg;
    private Persona persona1;
    private Persona persona2;
    private Ciudad ciudadMat;
    private int fecha;
    private String pactoPatrim;
    
    public Matrimonio(int nR, Persona p1, Persona p2, Ciudad cM, int fecha, String pP) {
        this.numReg = nR;
        this.persona1 = p1;
        this.persona2 = p2;
        this.ciudadMat = cM;
        this.fecha = fecha;
        this.pactoPatrim = pP;
    }

    /**
     * @return the numReg
     */
    public int getNumReg() {
        return numReg;
    }

    /**
     * @param numReg the numReg to set
     */
    public void setNumReg(int numReg) {
        this.numReg = numReg;
    }

    /**
     * @return the persona1
     */
    public Persona getPersona1() {
        return persona1;
    }

    /**
     * @param persona1 the persona1 to set
     */
    public void setPersona1(Persona persona1) {
        this.persona1 = persona1;
    }

    /**
     * @return the persona2
     */
    public Persona getPersona2() {
        return persona2;
    }

    /**
     * @param persona2 the persona2 to set
     */
    public void setPersona2(Persona persona2) {
        this.persona2 = persona2;
    }

    /**
     * @return the ciudadMat
     */
    public Ciudad getCiudadMat() {
        return ciudadMat;
    }

    /**
     * @param ciudadMat the ciudadMat to set
     */
    public void setCiudadMat(Ciudad ciudadMat) {
        this.ciudadMat = ciudadMat;
    }

    /**
     * @return the fecha
     */
    public int getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the pactoPatrim
     */
    public String getPactoPatrim() {
        return pactoPatrim;
    }

    /**
     * @param pactoPatrim the pactoPatrim to set
     */
    public void setPactoPatrim(String pactoPatrim) {
        this.pactoPatrim = pactoPatrim;
    }
    
}
