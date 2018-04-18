/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.poo1;

import java.util.ArrayList;

/**
 *
 * @author marco
 */
public class TSE {
    private ArrayList<JRV>Juntas=new ArrayList();
    private ArrayList<Consulado>Consulados=new ArrayList();
    private Eleccion Elecciones;
    private ArrayList<AuxiliarElectoral>Aux=new ArrayList();
    private ArrayList<Ciudadano>ciud=new ArrayList();

    public TSE() {
        this.Elecciones=null;
    }

    public ArrayList<JRV> getJuntas() {
        return Juntas;
    }

    public void setJuntas(JRV Juntas) {
        this.Juntas.add(Juntas);
    }

    public ArrayList<Consulado> getConsulados() {
        return Consulados;
    }

    public void setConsulados(Consulado Consulados) {
        this.Consulados.add(Consulados);
    }

    public Eleccion getElecciones() {
        return Elecciones;
    }

    public void setElecciones(Eleccion Elecciones) {
        this.Elecciones = Elecciones;
    }



    public ArrayList<AuxiliarElectoral> getAux() {
        return Aux;
    }

    public void setAux(AuxiliarElectoral Aux) {
        this.Aux.add(Aux);
    }

    public ArrayList<Ciudadano> getCiud() {
        return ciud;
    }

    public void setCiud(Ciudadano ciud) {
        this.ciud.add(ciud);
    }
    
    
}
