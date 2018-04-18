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
public class JRV {
    private Localidad local;
    private Distrito distrito;
    private String Codigo;
    private int CantidadElectores;
    private String CentroVotacion;
    private String Direccion;
    private ArrayList<AuxiliarElectoral>Auxiliares=new ArrayList();
    private ArrayList<Fiscal>Fiscales=new ArrayList();
    private ArrayList<MiembroMesa>Miembros=new ArrayList();
    private ArrayList<Ciudadano> Ciudadanos=new ArrayList();

    public JRV() {
        this.local=null;
        this.distrito=null;
        this.Codigo="";
        this.CantidadElectores=0;
        this.CentroVotacion="";
        this.Direccion="";
        
    }

    public JRV(Distrito distrito,String Codigo, int CantidadElectores, String CentroVotacion, String Direccion) {
        this.distrito=distrito;
        this.Codigo = Codigo;
        this.CantidadElectores = CantidadElectores;
        this.CentroVotacion = CentroVotacion;
        this.Direccion = Direccion;    
    }

    public JRV(Localidad local, String Codigo, int CantidadElectores, String CentroVotacion, String Direccion) {
        this.local = local;
        this.Codigo = Codigo;
        this.CantidadElectores = CantidadElectores;
        this.CentroVotacion = CentroVotacion;
        this.Direccion = Direccion;
    }

    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getCantidadElectores() {
        return CantidadElectores;
    }

    public void setCantidadElectores(int CantidadElectores) {
        this.CantidadElectores = CantidadElectores;
    }

    public String getCentroVotacion() {
        return CentroVotacion;
    }

    public void setCentroVotacion(String CentroVotacion) {
        this.CentroVotacion = CentroVotacion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public ArrayList<AuxiliarElectoral> getAuxiliares() {
        return Auxiliares;
    }

    public void setAuxiliares(AuxiliarElectoral Auxiliares) {
        this.Auxiliares.add(Auxiliares);
    }

    public ArrayList<Fiscal> getFiscales() {
        return Fiscales;
    }

    public void setFiscales(Fiscal Fiscales) {
        this.Fiscales.add(Fiscales);
    }

    public ArrayList<MiembroMesa> getMiembros() {
        return Miembros;
    }

    public void setMiembros(MiembroMesa Miembros) {
        this.Miembros.add(Miembros);
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public ArrayList<Ciudadano> getCiudadanos() {
        return Ciudadanos;
    }

    public void setCiudadanos(Ciudadano Ciudadanos) {
        this.Ciudadanos.add(Ciudadanos);
    }

    public Localidad getLocal() {
        return local;
    }

    public void setLocal(Localidad local) {
        this.local = local;
    }


    @Override
    public String toString() {
        return "JRV{" + "Codigo=" + Codigo + ", CantidadElectores=" + CantidadElectores + ", CentroVotacion=" + CentroVotacion + ", Direccion=" + Direccion + '}';
    }
    
    
}
