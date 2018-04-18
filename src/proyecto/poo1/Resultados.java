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
public class Resultados {
    private ArrayList<JRV>Juntas=new ArrayList();

    public Resultados() {
    }

    public ArrayList<JRV> getJuntas() {
        return Juntas;
    }

    public void setJuntas(JRV Juntas) {
        this.Juntas.add(Juntas);
    }
    public void ConsultarPorcentajeEdad(){
    
    }
    public void ConsultarPorcentajeSexo(){
    }
    public void ConsultarVotosPresiProvincia(){
    }
    public void ConsultarVotosPresiCanton(){
    }
    public void ConsultarVotosPresiDistrito(){
    }
    public void ConsultarVotosDipuProvincia(){
    }
    public void ConsultarVotosDipuCanton(){
    }
    public void ConsultarVotosDipuDistrito(){
    }
}
