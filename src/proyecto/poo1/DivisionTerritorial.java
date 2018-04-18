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
public abstract class  DivisionTerritorial {
    protected String Codigo;
    protected String Nombre;

    public DivisionTerritorial() {
         this.Codigo="";
        this.Nombre="";
    }

    public DivisionTerritorial(String Codigo, String Nombre) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
    }

    public abstract String getCodigo();

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public abstract String getNombre();

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "DivisionTerritorial{" + "Codigo=" + Codigo + ", Nombre=" + Nombre + '}';
    }
    
    
    
}
