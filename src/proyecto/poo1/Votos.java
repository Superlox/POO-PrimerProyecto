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
public class Votos {
    private int Presidencial;
    private int Diputados;
    private RegistroVotos reg;

    public Votos() {
        this.reg=null;
        this.Presidencial=0;
        this.Diputados=0;

    }

    public Votos(RegistroVotos reg,int Presidencial, int Diputados) {
        this.reg=reg;
        this.Presidencial = Presidencial;
        this.Diputados = Diputados;
    }
    

    public int getPresidencial() {
        return Presidencial;
    }

    public void setPresidencial(int Presidencial) {
        this.Presidencial = Presidencial;
    }

    public int getDiputados() {
        return Diputados;
    }

    public void setDiputados(int Diputados) {
        this.Diputados = Diputados;
    }

    public RegistroVotos getReg() {
        return reg;
    }

    public void setReg(RegistroVotos reg) {
        this.reg = reg;
    }

    @Override
    public String toString() {
        return "Votos{" + "Presidencial=" + Presidencial + ", Diputados=" + Diputados + '}';
    }


   
}
