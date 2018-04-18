/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.poo1;

import java.awt.Image;
import java.awt.image.BufferedImage;


/**
 *
 * @author marco
 */
public class CandidaturaPresiyVice {
    private String Nombre;
    private String Tipo;
    private Image Imagen;
    private String Cedula;
    private String PlanGobierno;
    private String CurriculumVitae;

    public CandidaturaPresiyVice() {
        this.Nombre="";
        this.Tipo="";
        this.Imagen=null;
        this.Cedula="";
        this.PlanGobierno="";
        this.CurriculumVitae="";
    }

    public CandidaturaPresiyVice(String Nombre,String Tipo, Image Imagen, String Cedula, String PlanGobierno, String CurriculumVitae) {
        this.Nombre=Nombre;
        this.Tipo = Tipo;
        this.Imagen = Imagen;
        this.Cedula = Cedula;
        this.PlanGobierno = PlanGobierno;
        this.CurriculumVitae = CurriculumVitae;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Image getImagen() {
        return Imagen;
    }

    public void setImagen(Image Imagen) {
        this.Imagen = Imagen;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getPlanGobierno() {
        return PlanGobierno;
    }

    public void setPlanGobierno(String PlanGobierno) {
        this.PlanGobierno = PlanGobierno;
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
    

    @Override
    public String toString() {
        return "CandidaturaPresiyVice{" + "Tipo=" + Tipo + ", Cedula=" + Cedula + ", PlanGobierno=" + PlanGobierno + ", CurriculumVitae=" + CurriculumVitae + '}';
    }
    
}
