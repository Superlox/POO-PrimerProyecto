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
public class Consulado {
    private String Pais;
    private String Codigo;
    private String Nombre;
    private ArrayList<Localidad>Local=new ArrayList();
    private JRV junta;

    public Consulado() {
        this.junta=null;
        this.Pais="";
        this.Nombre="";
        this.Codigo="";
    }

    public Consulado(JRV junta,String Pais, String Codigo, String Nombre) {
        this.junta=junta;
        this.Pais = Pais;
        this.Codigo = Codigo;
        this.Nombre = Nombre;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Localidad> getLocal() {
        return Local;
    }

    public void setLocal(Localidad Local) {
        this.Local.add(Local);
    }

    public JRV getJunta() {
        return junta;
    }

    public void setJunta(JRV junta) {
        this.junta = junta;
    }
    

    @Override
    public String toString() {
        return "Consulado{" + "Pais=" + Pais + ", Codigo=" + Codigo + ", Nombre=" + Nombre + '}';
    }
    
    
    
}
