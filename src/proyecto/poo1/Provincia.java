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
public class Provincia extends DivisionTerritorial {
    private ArrayList<CandidaturaDiputado>Diputados=new ArrayList();
    private ArrayList<Canton> Cantones=new ArrayList();

    public Provincia() {
        super("","");
    }

    public Provincia(String Codigo, String Nombre) {
        super(Codigo, Nombre);
    }

    public ArrayList<CandidaturaDiputado> getDiputados() {
        return Diputados;
    }

    public void setDiputados(CandidaturaDiputado Diputados) {
        this.Diputados.add(Diputados);
    }

    public ArrayList<Canton> getCantones() {
        return Cantones;
    }

    public void setCantones(Canton Cantones) {
        this.Cantones.add(Cantones);
    } 

    @Override
    public String getCodigo() {
        return Codigo;
    }

    @Override
    public String getNombre() {
       return Nombre;
    }
    
}
