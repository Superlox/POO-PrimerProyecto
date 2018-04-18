/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.poo1;

import java.awt.Image;

/**
 *
 * @author marco
 */
public class Papeleta {
    private String Identificador;
    private String Tipo;
    private Image Diseño;

    public Papeleta() {
        this.Identificador="";
        this.Tipo="";
        this.Diseño=null;
    }

    public Papeleta(String Identificador, String Tipo, Image Diseño) {
        this.Identificador = Identificador;
        this.Tipo = Tipo;
        this.Diseño = Diseño;
    }

    public String getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(String Identificador) {
        this.Identificador = Identificador;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Image getDiseño() {
        return Diseño;
    }

    public void setDiseño(Image Diseño) {
        this.Diseño = Diseño;
    }

    @Override
    public String toString() {
        return "Papeleta{" + "Identificador=" + Identificador + ", Tipo=" + Tipo + '}';
    }
    
    
}
