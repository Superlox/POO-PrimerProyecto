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
public class Distrito extends DivisionTerritorial {
    private ArrayList<Ciudadano>Ciudadanos=new ArrayList();
    private Canton Pertenece;

    public Distrito() {
        super("","");
        this.Pertenece=null;
    }

    public Distrito(Canton Pertenece, String Codigo, String Nombre) {
        super(Codigo, Nombre);
        this.Pertenece=Pertenece;
    }

    public ArrayList<Ciudadano> getCiudadanos() {
        return Ciudadanos;
    }

    public void setCiudadanos(Ciudadano Ciudadanos) {
        this.Ciudadanos.add(Ciudadanos);
    }

    public Canton getPertenece() {
        return Pertenece;
    }

    public void setPertenece(Canton Pertenece) {
        this.Pertenece = Pertenece;
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
