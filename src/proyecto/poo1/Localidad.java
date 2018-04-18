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
public class Localidad extends DivisionTerritorial{
    private ArrayList<Ciudadano>ciud=new ArrayList();
    private Consulado consul;
    public Localidad() {
        super("","");
        this.consul=null;
    }

    public Localidad(Consulado consul,String Codigo, String Nombre) {
        super(Codigo, Nombre);
        this.consul=consul;
    }

    @Override
    public String getCodigo() {
        return Codigo;
    }

    @Override
    public String getNombre() {
        return Nombre;
    }

    public ArrayList<Ciudadano> getCiud() {
        return ciud;
    }

    public void setCiud(Ciudadano ciud) {
        this.ciud.add(ciud);
    }

    public Consulado getConsul() {
        return consul;
    }

    public void setConsul(Consulado consul) {
        this.consul = consul;
    }
    
    
    
}
