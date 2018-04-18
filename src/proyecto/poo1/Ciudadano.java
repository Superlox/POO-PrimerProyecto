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
public class Ciudadano {
    private String NombreCompleto;
    private String Cedula;
    private int Edad;
    private String EstadoCivil;
    private String FechaNacimiento;
    private String LugarNacimiento;
    private String Nacionalidad;
    private char Sexo;
    private boolean Fallecido;
    private boolean Empadronado;
    private JRV DomocilioElectoral;
    private int NumeroMesa;

    public Ciudadano() {
        this.NombreCompleto="";
        this.Cedula="";
        this.Edad=0;
        this.EstadoCivil="";
        this.FechaNacimiento="";
        this.LugarNacimiento="";
        this.Nacionalidad="";
        this.Fallecido=false;
        this.Empadronado=false;
        this.DomocilioElectoral=null;
        this.Sexo='M';
        this.NumeroMesa=0;
    }

    public Ciudadano(int NumeroMesa,String NombreCompleto, String Cedula,int Edad, String EstadoCivil, String FechaNacimiento, String LugarNacimiento, String Nacionalidad,char Sexo, boolean Fallecido, JRV DomocilioElectoral) {
        this.NombreCompleto = NombreCompleto;
        this.Cedula = Cedula;
        this.Edad=Edad;
        this.EstadoCivil = EstadoCivil;
        this.FechaNacimiento = FechaNacimiento;
        this.LugarNacimiento = LugarNacimiento;
        this.Nacionalidad = Nacionalidad;
        this.Fallecido = Fallecido;
        this.DomocilioElectoral = DomocilioElectoral;
        this.Sexo=Sexo;
        this.NumeroMesa=NumeroMesa;
        if(Edad>=18){
        this.Empadronado=true;
        }
        else{
            this.Empadronado=false;
        }
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getLugarNacimiento() {
        return LugarNacimiento;
    }

    public void setLugarNacimiento(String LugarNacimiento) {
        this.LugarNacimiento = LugarNacimiento;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public boolean isFallecido() {
        return Fallecido;
    }

    public void setFallecido(boolean Fallecido) {
        this.Fallecido = Fallecido;
    }

    public boolean isEmpadronado() {
        return Empadronado;
    }

    public void setEmpadronado(boolean Empadronado) {
        this.Empadronado = Empadronado;
    }

    public JRV getDomocilioElectoral() {
        return DomocilioElectoral;
    }

    public void setDomocilioElectoral(JRV DomocilioElectoral) {
        this.DomocilioElectoral = DomocilioElectoral;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getNumeroMesa() {
        return NumeroMesa;
    }

    public void setNumeroMesa(int NumeroMesa) {
        this.NumeroMesa = NumeroMesa;
    }
    
    
    @Override
    public String toString() {
        return "Ciudadano{" + "NombreCompleto=" + NombreCompleto + ", Cedula=" + Cedula + ", EstadoCivil=" + EstadoCivil + ", FechaNacimiento=" + FechaNacimiento + ", LugarNacimiento=" + LugarNacimiento + ", Nacionalidad=" + Nacionalidad + ", Fallecido=" + Fallecido + ", Empadronado=" + Empadronado + ", DomocilioElectoral=" + DomocilioElectoral + '}';
    }
    
}   