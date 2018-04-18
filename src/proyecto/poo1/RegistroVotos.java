/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.poo1;

/**
 *
 * @author marco
 */
public class RegistroVotos {
    private int nulos;
    private int blancos;
    private JRV junta;

    public RegistroVotos() {
        this.blancos=0;
        this.nulos=0;
        this.junta=null;
    }

    public RegistroVotos(JRV junta,int nulos, int blancos) {
        this.nulos = nulos;
        this.blancos = blancos;
        this.junta=junta;
    }

    public int getNulos() {
        return nulos;
    }

    public void setNulos(int nulos) {
        this.nulos = nulos;
    }

    public int getBlancos() {
        return blancos;
    }

    public void setBlancos(int blancos) {
        this.blancos = blancos;
    }

    public JRV getJunta() {
        return junta;
    }

    public void setJunta(JRV junta) {
        this.junta = junta;
    }
    

    @Override
    public String toString() {
        return "RegistroVotos{" + "nulos=" + nulos + ", blancos=" + blancos + '}';
    }
    
    
}
