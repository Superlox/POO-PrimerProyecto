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
public class Eleccion {
    private ArrayList<Papeleta>Papeletas=new ArrayList();
    private ArrayList<PartidoPolitico>Partidos=new ArrayList();
    private Resultados Resulto;

    public Eleccion() {
        this.Resulto=null;
    }

    public Eleccion(Resultados Resulto) {
        this.Resulto = Resulto;
    }
    

    public ArrayList<PartidoPolitico> getPartidos() {
        return Partidos;
    }

    public void setPartidos(PartidoPolitico Partidos) {
        this.Partidos.add(Partidos);
    }

    public ArrayList<Papeleta> getPapeletas() {
        return Papeletas;
    }

    public void setPapeletas(Papeleta Papeletas) {
        this.Papeletas.add(Papeletas);
    }

    public Resultados getResulto() {
        return Resulto;
    }

    public void setResulto(Resultados Resulto) {
        this.Resulto = Resulto;
    }
    
}
