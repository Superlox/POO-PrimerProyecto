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
public class CandidaturaDiputado {
    private PartidoPolitico Pertenece;
    private String Nombre;
    private String Cedula;
    private Provincia Provincia;
    private String CurriculumVitae;

    public CandidaturaDiputado() {
        this.Pertenece=null;
        this.Nombre="";
        this.Cedula="";
        this.Provincia=null;
        this.CurriculumVitae="";
    }

    public CandidaturaDiputado(PartidoPolitico Pertenece,String Nombre,String Cedula, Provincia Provincia, String CurriculumVitae) {
        this.Nombre=Nombre;
        this.Cedula = Cedula;
        this.Provincia = Provincia;
        this.CurriculumVitae = CurriculumVitae;
        this.Pertenece=Pertenece;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public Provincia getProvincia() {
        return Provincia;
    }

    public void setProvincia(Provincia Provincia) {
        this.Provincia = Provincia;
    }

    public String getCurriculumVitae() {
        return CurriculumVitae;
    }

    public void setCurriculumVitae(String CurriculumVitae) {
        this.CurriculumVitae = CurriculumVitae;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public PartidoPolitico getPertenece() {
        return Pertenece;
    }

    public void setPertenece(PartidoPolitico Pertenece) {
        this.Pertenece = Pertenece;
    }

    @Override
    public String toString() {
        return "CandidaturaDiputado{" + "Cedula=" + Cedula + ", Provincia=" + Provincia + ", CurriculumVitae=" + CurriculumVitae + '}';
    }
    
    
}
