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
public class  Canton extends DivisionTerritorial {
    private ArrayList<Distrito>Distritos=new ArrayList();
    private Provincia Pertenece;

    public Canton() {
        super("","");
        this.Pertenece=null;
    }

    public Canton(Provincia Pertenece,String Codigo, String Nombre) {
        super(Codigo, Nombre);
        this.Pertenece=Pertenece;
    }
    
    
    
    public ArrayList<Distrito> getDistritos() {
        return Distritos;
    }

    public void setDistritos(Distrito Distritos) {
        this.Distritos.add(Distritos);
    }

    public Provincia getPertenece() {
        return Pertenece;
    }

    public void setPertenece(Provincia Pertenece) {
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
