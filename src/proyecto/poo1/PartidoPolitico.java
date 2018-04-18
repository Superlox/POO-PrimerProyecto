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
public class PartidoPolitico {
    private String Nombre;
    private String Codigo;
    private String FechaFundacion;
    private String Telefono;
    private String Direccion;
    private ArrayList<Votos>Votos=new ArrayList();
    private ArrayList<CandidaturaPresiyVice>PresidenteyVices=new ArrayList();
    private ArrayList<CandidaturaDiputado>Diputados=new ArrayList();
    private ArrayList<MiembroMesa>Miembro=new ArrayList();
    private ArrayList<Fiscal>Fiscal=new ArrayList();

    public PartidoPolitico() {
        this.Nombre="";
        this.Codigo="";
        this.FechaFundacion="";
        this.Telefono="";
        this.Direccion="";
    }

    public PartidoPolitico(String Nombre, String Codigo, String FechaFundacion, String Telefono, String Direccion) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.FechaFundacion = FechaFundacion;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getFechaFundacion() {
        return FechaFundacion;
    }

    public void setFechaFundacion(String FechaFundacion) {
        this.FechaFundacion = FechaFundacion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public ArrayList<CandidaturaPresiyVice> getPresidenteyVices() {
        return PresidenteyVices;
    }

    public void setPresidenteyVices(CandidaturaPresiyVice Cand) {
        this.PresidenteyVices.add(Cand);
    }

    public ArrayList<CandidaturaDiputado> getDiputados() {
        return Diputados;
    }

    public void setDiputados(CandidaturaDiputado Dip) {
        this.Diputados.add(Dip);
    }

    public ArrayList<MiembroMesa> getMiembro() {
        return Miembro;
    }

    public void setMiembro(MiembroMesa Miembro) {
        this.Miembro.add(Miembro);
    }

    public ArrayList<Fiscal> getFiscal() {
        return Fiscal;
    }

    public void setFiscal(Fiscal Fiscal) {
        this.Fiscal.add(Fiscal);
    }

    public ArrayList<Votos> getVotos() {
        return Votos;
    }

    public void setVotos(Votos Votos) {
        this.Votos.add(Votos);
    }

    @Override
    public String toString() {
        return "PartidoPolitico{" + "Nombre=" + Nombre + ", Codigo=" + Codigo + ", FechaFundacion=" + FechaFundacion + ", Telefono=" + Telefono + ", Direccion=" + Direccion + '}';
    }
    
    
}
