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
public class Fiscal extends Ciudadano {
    private PartidoPolitico Pertenece;
    public Fiscal() {
        super(0,"","",0,"","","","",'M',false,null);
        this.Pertenece=null;
    }

    public Fiscal(int NumeroMesa,PartidoPolitico Pertenece, String NombreCompleto, String Cedula, int Edad, String EstadoCivil, String FechaNacimiento, String LugarNacimiento, String Nacionalidad, char Sexo, boolean Fallecido, JRV DomocilioElectoral) {
        super(NumeroMesa,NombreCompleto, Cedula, Edad, EstadoCivil, FechaNacimiento, LugarNacimiento, Nacionalidad, Sexo, Fallecido, DomocilioElectoral);
        this.Pertenece = Pertenece;
    }

    public PartidoPolitico getPertenece() {
        return Pertenece;
    }

    public void setPertenece(PartidoPolitico Pertenece) {
        this.Pertenece = Pertenece;
    }
    
}
