/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.poo1;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

/**
 *
 * @author marco
 */
public class FramePrincipal extends javax.swing.JFrame {
    DefaultListModel<String> listmodel = new DefaultListModel<>();
    ArrayList<Provincia>Provi=new ArrayList();
    Metodos met = new Metodos();

    TSE tse = new TSE();

    Eleccion eleccion = new Eleccion();

    Image imagenExterna5 = new ImageIcon("/Imagenes/presidenciales.png").getImage();
    Papeleta Presi = new Papeleta("2018", "Presidencial", imagenExterna5);
    Image imagenExterna4 = new ImageIcon("/Imagenes/cartago.png").getImage();
    Papeleta Dipu = new Papeleta("2018", "Diputados", imagenExterna4);


    Provincia P1 = new Provincia("1", "San Jose");
    Provincia P2 = new Provincia("2", "Alajuela");
    Provincia P3 = new Provincia("3", "Cartago");

    Canton C1 = new Canton(P1, "116", "Turrubares");
    Canton C2 = new Canton(P2, "202", "San Ramon");
    Canton C3 = new Canton(P3, "302", "Paraiso");

    Distrito D1 = new Distrito(C1,"11601", "San Pablo");
    Distrito D2 = new Distrito(C2,"20206", "San Rafael");
    Distrito D3 = new Distrito(C3,"30203", "Orosi");

    

    Consulado Consul1 = new Consulado(null,"Estados Unidos", "1", "Embajada CR-EEUU");
    Consulado Consul2 = new Consulado(null,"España", "12", "Embajada CR-ES");
    Consulado Consul3 = new Consulado(null,"Francia", "11", "Embajada CR-FR");
    
    Localidad L1 = new Localidad(Consul1,"12", "Chicago");
    Localidad L2 = new Localidad(Consul2,"33", "Madrid");
    Localidad L3 = new Localidad(Consul3,"23", "Paris");
    
    JRV J1 = new JRV(D1,"11601", 1852, "Escuela de Turrubares", "Centro Ciudad");
    JRV J2 = new JRV(D2,"20206", 874, "Escuela Mixta San Rafael", "Costado de la Iglesia catolica de San Rafael");
    JRV J3 = new JRV(D3,"30203", 1456, "Escuela Palomo", "100mts Sur de la soda RAVE");
    JRV J4= new JRV(L1,"02",77,"Embajada CR-EEUU","Central City");
    JRV J5= new JRV(L2,"07",45,"Embajada CR-ES","Madrid");
    JRV J6= new JRV(L3,"11",60,"Embajada CRR-FR","Paris");
    
    Ciudadano c1 = new Ciudadano(150, "Mariana Sibaja Mena", "1184456", 27, "Soltero", "11-12-1990", "San Jose", "Costarricense", 'F', false, J1);
    Ciudadano c2 = new Ciudadano(150, "Jose Alberto Solano Arias", "1568841", 27, "Soltero", "14-12-1990", "San Jose", "Costarricense", 'M', false, J1);
    Ciudadano c3 = new Ciudadano(1236, "Selenia Vargas Fernandez", "2000075", 46, "Soltero", "12-01-1972", "San Ramon", "Costarricense", 'F', false, J2);
    Ciudadano c4 = new Ciudadano(1236, "Victor Julio Granados", "2047850", 102, "Casado", "14-02-1916", "San Ramon", "Costarricense", 'M', false, J2);
    Ciudadano c5 = new Ciudadano(560, "Julio Calderon Montero", "30778521", 46, "Casado", "14-07-1972", "Turrialba", "Costarricense", 'M', false, J3);
    Ciudadano c6 = new Ciudadano(560, "Jorge Carmona Solis", "3044782", 22, "Casado", "13-02-1996", "Orosi", "Costarricense", 'M', false, J3);
    Ciudadano c7 = new Ciudadano(02, "Jorge Luis Perez Rodriguez", "3094782", 22, "Casado", "13-02-1996", "Orosi", "Costarricense", 'M', false, J4);
    Ciudadano c8 = new Ciudadano(07, "Jose Mariano Lopez Arrieta", "3484782", 22, "Soltero", "13-02-1996", "Orosi", "Costarricense", 'M', false, J5);
    Ciudadano c9 = new Ciudadano(11, "Pablo Josue Diaz Mendaz", "3804782", 22, "Soltero", "13-02-1996", "Orosi", "Costarricense", 'M', false, J6);
    
    RegistroVotos R1=new RegistroVotos(J1,15,20);
    RegistroVotos R2=new RegistroVotos(J2,40,77);
    RegistroVotos R3=new RegistroVotos(J3,10,20);
    RegistroVotos R4=new RegistroVotos(J1,40,10);
    RegistroVotos R5=new RegistroVotos(J2,70,60);
    RegistroVotos R6=new RegistroVotos(J3,50,32);
    RegistroVotos R7=new RegistroVotos(J4,6,0);
    RegistroVotos R8=new RegistroVotos(J5,4,2);
    RegistroVotos R9=new RegistroVotos(J6,2,12);
    
    Votos V1 = new Votos(R1,844,877);
    Votos V2 = new Votos(R2,778,120);
    Votos V3 = new Votos(R3,89,56);
    Votos V4 = new Votos(R4,753,800);
    Votos V5 = new Votos(R5,420,420);
    Votos V6 = new Votos(R6,457,510);
    Votos V7=new Votos(R7,50,50);
    Votos V8=new Votos(R7,51,45);
    Votos V9=new Votos(R7,52,30);

    AuxiliarElectoral aux1 = new AuxiliarElectoral(150, "Mariana Rodriguez Quesada", "1184456", 25, "Soltero", "11-12-1992", "San Jose", "Costarricense", 'F', false, J1);
    AuxiliarElectoral aux2 = new AuxiliarElectoral(1236, "Ana Mendez Campos", "1184456", 23, "Casado", "11-05-1994", "San Jose", "Costarricense", 'F', false, J2);
    AuxiliarElectoral aux3 = new AuxiliarElectoral(560, "Manuel Solano Barrantes", "2184456", 29, "Soltero", "11-09-1988", "Alajuela", "Costarricense", 'M', false, J3);

    Image imagenExterna = new ImageIcon("/Imagenes/CarlosAlvarado.png").getImage();
    PartidoPolitico PAC = new PartidoPolitico("Partido Accion Ciudadana", "23", "3 de Diciembre de 2000", "2528-2400", "San José, San Pedro de Montes de Oca, 200m Norte de las instalaciones del IAFA. ");
    CandidaturaPresiyVice Pac1 = new CandidaturaPresiyVice("Carlos Alvarado Quesada", "Presidencial", imagenExterna, "2004777", "https://carlos.cr/wp-content/uploads/2017/05/Creer-y-crear-la-Costa-Rica-del-siglo-XXI-interactivo.pdf", "https://carlos.cr/conozcame");
    CandidaturaPresiyVice Pac2 = new CandidaturaPresiyVice("Epsy Campbell", "VicePresidente", null, "2006778", "https://carlos.cr/wp-content/uploads/2017/05/Creer-y-crear-la-Costa-Rica-del-siglo-XXI-interactivo.pdf", "https://carlos.cr/epsy-campbell-barr");
    CandidaturaPresiyVice Pac3 = new CandidaturaPresiyVice("Marvin Rodríguez", "VicePresidente", null, "2011400", "https://carlos.cr/wp-content/uploads/2017/05/Creer-y-crear-la-Costa-Rica-del-siglo-XXI-interactivo.pdf", "https://carlos.cr/marvin-rodriguez-cordero");
    CandidaturaDiputado PacD2 = new CandidaturaDiputado(PAC,"María Inés Solís Quirós", "2047882", P2, "https://www.nacion.com/gnfactory/investigacion/2018/elecciones_presidenciales/diputados/los57.html?desktop=true");
    CandidaturaDiputado PacD3 = new CandidaturaDiputado(PAC,"Mario Castillo Méndez", "2767882", P3, "https://www.nacion.com/gnfactory/investigacion/2018/elecciones_presidenciales/diputados/los57.html?desktop=true");
    CandidaturaDiputado PacD1 = new CandidaturaDiputado(PAC,"Nielsen Pérez Pérez", "2747882", P1, "https://www.nacion.com/gnfactory/investigacion/2018/elecciones_presidenciales/diputados/los57.html?desktop=true");
    
    PartidoPolitico PLN = new PartidoPolitico("Partido Liberacion Nacional", "2", "12 de octubre de 1951", "2549-5500", "Cantón Central de San José, Mata Redonda, Sabana Oeste, 100 metros oeste del Ministerio de Agricultura");    Image imagenExterna2 = new ImageIcon("/Imagenes/Desanti.png").getImage();
    CandidaturaPresiyVice PLN1 = new CandidaturaPresiyVice("Antonio Alvares Desanti", "Presidencial", imagenExterna2, "2005777", "https://www.elmomentoesahoracr.com/", "http://www.alvarezdesanti.cr/bio-antonio/");
    CandidaturaPresiyVice PLN2 = new CandidaturaPresiyVice("Edgar Ayales Esna", "VicePresidente", null, "2478901", "\"https://www.elmomentoesahoracr.com/\"", "http://live.worldbank.org/experts/edgar-ayales-esna");
    CandidaturaPresiyVice PLN3 = new CandidaturaPresiyVice("Victoria Gamboa Ross", "VicePresidente", null, "20778445", "https://www.elmomentoesahoracr.com/", "http://www.ross.or.cr/index.php?page=nuestro_equipo");
    CandidaturaDiputado PLND1 = new CandidaturaDiputado(PLN,"Carlos Ricardo Benavides Jiménez", "2077896", P1, "https://www.nacion.com/gnfactory/investigacion/2018/elecciones_presidenciales/diputados/los57.html?desktop=true");
    CandidaturaDiputado PLND2 = new CandidaturaDiputado(PLN,"Roberto Thompson Chacón", "1044580", P2, "https://www.nacion.com/gnfactory/investigacion/2018/elecciones_presidenciales/diputados/los57.html?desktop=true");
    CandidaturaDiputado PLND3 = new CandidaturaDiputado(PLN,"Paola Valladares Rosado", "2044569", P3, "https://www.nacion.com/gnfactory/investigacion/2018/elecciones_presidenciales/diputados/los57.html?desktop=true");

    Image imagenExterna3 = new ImageIcon("/Imagenes/Piza.png").getImage();
    PartidoPolitico PUSC = new PartidoPolitico("Partido Unidad Social Cristiana", "1", "17 de Diciembre de 1983", "2248-1411", "Del quiosco del Parque Morazán, 300 metros Norte y 15 Oeste, Calles 5 y 7, Avenida 11 Centro");
    CandidaturaPresiyVice PUSC1 = new CandidaturaPresiyVice("Rodolfo Piza Rocafort", "Presidencial", imagenExterna3, "20006777", "https://www.piza.cr/index.php/propuestas/plan-de-gobiernos", "https://www.piza.cr/index.php/rpiza/biografia");
    CandidaturaPresiyVice PUSC2 = new CandidaturaPresiyVice("Edna Camacho Mejía", "VicePresidente", null, "20077777", "https://www.piza.cr/index.php/propuestas/plan-de-gobiernos", "https://www.piza.cr/index.php/vicepresidentes");
    CandidaturaPresiyVice PUSC3 = new CandidaturaPresiyVice("Max Umaña Hidalgo", "VicePresidente", null, "20000788", "https://www.piza.cr/index.php/propuestas/plan-de-gobiernos", "https://www.piza.cr/index.php/vicepresidentes");
    CandidaturaDiputado PUSCD1 = new CandidaturaDiputado(PUSC,"María Vita Monge Granados", "20045585", P1, "https://www.nacion.com/gnfactory/investigacion/2018/elecciones_presidenciales/diputados/los57.html?desktop=true");
    CandidaturaDiputado PUSCD2 = new CandidaturaDiputado(PUSC,"María Inés Solís Quirós", "20945785", P2, "https://www.nacion.com/gnfactory/investigacion/2018/elecciones_presidenciales/diputados/los57.html?desktop=true");
    CandidaturaDiputado PUSCD3 = new CandidaturaDiputado(PUSC,"Pablo Heriberto Abarca Mora", "27345585", P3, "https://www.nacion.com/gnfactory/investigacion/2018/elecciones_presidenciales/diputados/los57.html?desktop=true");

    Fiscal fiscal1 = new Fiscal(150, PAC, "Mariano Sibaja Mena", "1789456", 28, "Soltero", "04-02-1990", "San Jose", "Costarricense", 'F', false, J1);
    Fiscal fiscal2 = new Fiscal(1236, PLN, "Erwin Montero Hernandez", "2184456", 23, "Soltero", "11-11-1994", "Alajuela", "Costarricense", 'F', false, J2);
    Fiscal fiscal3 = new Fiscal(560, PUSC, "Lucia Mendez Chacon", "3184456", 27, "Soltero", "11-01-1990", "Cartago", "Costarricense", 'F', false, J2);

    MiembroMesa miembro1 = new MiembroMesa(150, PAC, "Mariana Lopez Rosado", "1484456", 32, "Soltero", "12-06-1985", "San Jose", "Costarricense", 'F', false, J1);
    MiembroMesa miembro2 = new MiembroMesa(1236, PLN, "Angel Fernandez Piña", "2284456", 50, "Soltero", "19-07-1967", "San Jose", "Costarricense", 'F', false, J2);
    MiembroMesa miembro3 = new MiembroMesa(560, PUSC, "Orlando Jimenez Perez", "3484456", 20, "Soltero", "17-08-1997", "San Jose", "Costarricense", 'F', false, J3);
       
    /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal() {
        initComponents();
        //Relaciones
        //Set Miembros de las Juntas
        J1.setAuxiliares(aux1);
        J1.setFiscales(fiscal1);
        J1.setMiembros(miembro1);

        J2.setAuxiliares(aux2);
        J2.setFiscales(fiscal2);
        J2.setMiembros(miembro2);

        J3.setAuxiliares(aux3);
        J3.setFiscales(fiscal3);
        J3.setMiembros(miembro3);
        //set Ciudadanos a Distrito
        D1.setCiudadanos(c1);
        D1.setCiudadanos(c2);
        D2.setCiudadanos(c3);
        D2.setCiudadanos(c4);
        D3.setCiudadanos(c5);
        D3.setCiudadanos(c6);
        //set Distritos a Canton
        C1.setDistritos(D1);
        C2.setDistritos(D2);
        C3.setDistritos(D3);
        //
        //set Diputados a provincia
        P1.setDiputados(PUSCD1);
        P1.setDiputados(PacD1);
        P1.setDiputados(PLND1);
        P2.setDiputados(PUSCD2);
        P2.setDiputados(PacD2);
        P2.setDiputados(PLND2);
        P3.setDiputados(PUSCD3);
        P3.setDiputados(PacD3);
        P3.setDiputados(PLND3);
        P1.setCantones(C1);
        P2.setCantones(C2);
        P3.setCantones(C3);
        Provi.add(P1);
        Provi.add(P2);
        Provi.add(P3);
        // Bidireccion de junta y consulado
        Consul1.setJunta(J4);
        Consul2.setJunta(J5);
        Consul3.setJunta(J6);
        //agregar ciudadanos a localidad
        L1.setCiud(c7);
        L2.setCiud(c8);
        L3.setCiud(c9);
        //Poner localidad a consulado
        Consul1.setLocal(L1);
        Consul2.setLocal(L2);
        Consul3.setLocal(L3);
        //agregar Informacion de los partidos
        PAC.setVotos(V9);
        PAC.setVotos(V1);
        PAC.setVotos(V2);
        PAC.setPresidenteyVices(Pac1);
        PAC.setPresidenteyVices(Pac2);
        PAC.setPresidenteyVices(Pac3);
        PAC.setDiputados(PacD1);
        PAC.setDiputados(PacD2);
        PAC.setDiputados(PacD3);
        
        PLN.setVotos(V8);
        PLN.setVotos(V3);
        PLN.setVotos(V4);
        PLN.setPresidenteyVices(PLN1);
        PLN.setPresidenteyVices(PLN2);
        PLN.setPresidenteyVices(PLN3);
        PLN.setDiputados(PLND1);
        PLN.setDiputados(PLND2);
        PLN.setDiputados(PLND3);
        
        PUSC.setVotos(V7);
        PUSC.setVotos(V5);
        PUSC.setVotos(V6);
        PUSC.setPresidenteyVices(PUSC1);
        PUSC.setPresidenteyVices(PUSC2);
        PUSC.setPresidenteyVices(PUSC3);
        PUSC.setDiputados(PUSCD1);
        PUSC.setDiputados(PUSCD2);
        PUSC.setDiputados(PUSCD3);
        //elecciones
        eleccion.setPapeletas(Presi);
        eleccion.setPapeletas(Dipu);
        eleccion.setPartidos(PAC);
        eleccion.setPartidos(PLN);
        eleccion.setPartidos(PUSC);
        //Agregar la eleccion a TSE y los ciudadanos
        tse.setCiud(c1);
        tse.setCiud(c2);
        tse.setCiud(c3);
        tse.setCiud(c4);
        tse.setCiud(c5);
        tse.setCiud(c6);
        tse.setCiud(c7);
        tse.setCiud(c8);
        tse.setCiud(c9);
        tse.setElecciones(eleccion);
        //agregarlas juntas al tse
        tse.setJuntas(J1);
        tse.setJuntas(J2);
        tse.setJuntas(J3);
        tse.setJuntas(J4);
        tse.setJuntas(J5);
        tse.setJuntas(J6);
        // agregar consulados a tse
        tse.setConsulados(Consul1);
        tse.setConsulados(Consul2);
        tse.setConsulados(Consul3);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        textarea3 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        textarea4 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        textfieldpresi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel7 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        textfielddipu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jPanel8 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jPanel10 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jPanel11 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jPanel12 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jComboBox7 = new javax.swing.JComboBox<>();
        jButton35 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox<>();
        auxnac = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        auxlugar = new javax.swing.JTextField();
        auxfecha = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        auxciv = new javax.swing.JTextField();
        auxedad = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        auxnom = new javax.swing.JTextField();
        auxced = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jLabel81 = new javax.swing.JLabel();
        auxmesa = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton18 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nombreciu = new javax.swing.JTextField();
        cedciu = new javax.swing.JTextField();
        edadciu = new javax.swing.JTextField();
        civilciu = new javax.swing.JTextField();
        fechanaciu = new javax.swing.JTextField();
        naciociu = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        mesaciu = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        nacciud = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        fises = new javax.swing.JTextField();
        fise = new javax.swing.JTextField();
        fisc = new javax.swing.JTextField();
        fisn = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        fisfn = new javax.swing.JTextField();
        fisln = new javax.swing.JTextField();
        fisna = new javax.swing.JTextField();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        fisnum = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jButton21 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jComboBox16 = new javax.swing.JComboBox<>();
        jButton24 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jComboBox17 = new javax.swing.JComboBox<>();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jComboBox19 = new javax.swing.JComboBox<>();
        jPanel26 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jComboBox18 = new javax.swing.JComboBox<>();
        jLabel86 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jComboBox20 = new javax.swing.JComboBox<>();
        jPanel21 = new javax.swing.JPanel();
        mesamiem = new javax.swing.JTextField();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        nacionalidadmiem = new javax.swing.JTextField();
        lugmiem = new javax.swing.JTextField();
        nacmiem = new javax.swing.JTextField();
        civilmiem = new javax.swing.JTextField();
        edadmiem = new javax.swing.JTextField();
        cedmiem = new javax.swing.JTextField();
        nombmiem = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jButton36 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Numero de Cedula:");

        textarea1.setEditable(false);
        textarea1.setColumns(20);
        textarea1.setRows(5);
        jScrollPane1.setViewportView(textarea1);

        jLabel3.setText("Informacion del Ciudadano");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))))
                .addContainerGap(578, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta Cedula", jPanel1);

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jScrollPane10.setViewportView(jList6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultas 100 años o mas", jPanel2);

        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        textarea3.setEditable(false);
        textarea3.setColumns(20);
        textarea3.setRows(5);
        jScrollPane3.setViewportView(textarea3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(406, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar % Mujer y Hombre", jPanel3);

        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        textarea4.setEditable(false);
        textarea4.setColumns(20);
        textarea4.setRows(5);
        jScrollPane4.setViewportView(textarea4);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 417, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar Cantidad entre 18 y 40", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(textfieldpresi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 310, -1));

        jLabel1.setText("Nombre del Partido:");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jButton7.setText("Buscar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jScrollPane7.setViewportView(jList1);

        jPanel6.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 830, 310));

        jTabbedPane3.addTab("Presidente", jPanel6);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setText("Buscar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));
        jPanel7.add(textfielddipu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 330, -1));

        jLabel4.setText("Nombre del Partido:");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jScrollPane5.setViewportView(jList2);

        jPanel7.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 820, 300));

        jTabbedPane3.addTab("Diputados", jPanel7);

        jPanel5.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 490));

        jTabbedPane1.addTab("Consulta Votos Partido ", jPanel5);

        jButton9.setText("Ver");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jScrollPane6.setViewportView(jList3);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Candidaturas Presidente y Vices", jPanel9);

        jButton10.setText("Ver");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jScrollPane8.setViewportView(jList4);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Candidaturas Diputados", jPanel10);

        jButton11.setText("Ver");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jScrollPane9.setViewportView(jList5);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Lista de Juntas", jPanel11);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane1.addTab("Reportes", jPanel8);

        jLabel15.setText("Nombre: ");

        jLabel16.setText("Codigo: ");

        jLabel17.setText("Fecha Fundacion:");

        jLabel18.setText("Telefono: ");

        jLabel19.setText("Direccion: ");

        jButton14.setText("Insertar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(51, 51, 51)
                        .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                    .addComponent(jButton14)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6)
                            .addComponent(jTextField7)
                            .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Insertar Partido", jPanel14);

        jLabel20.setText("Codigo: ");

        jLabel21.setText("Nombre: ");

        jLabel22.setText("Pertenece Canton");

        jButton17.setText("Insertar");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton32.setText("Actualizar");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox4, 0, 121, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButton17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton32)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17)
                    .addComponent(jButton32))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Insertar Distrito", jPanel15);

        jLabel23.setText("Codigo: ");

        jLabel24.setText("Nombre:");

        jLabel25.setText("Pertenece Provincia: ");

        jButton16.setText("Insertar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton33.setText("Actualizar");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox5, 0, 121, Short.MAX_VALUE)
                            .addComponent(jTextField9)
                            .addComponent(jTextField10)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButton16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton33)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16)
                    .addComponent(jButton33))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Insertar Canton", jPanel16);

        jLabel26.setText("Codigo: ");

        jLabel27.setText("Nombre:");

        jButton15.setText("Insertar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField12))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Insertar Provincia", jPanel17);

        jLabel31.setText("Pais: ");

        jLabel32.setText("Codigo: ");

        jLabel33.setText("Nombre: ");

        jLabel34.setText("Junta: ");

        jButton19.setText("Insertar");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton34.setText("Actualizar");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField16)
                            .addComponent(jTextField15)
                            .addComponent(jTextField17)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jButton19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton34))
                            .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19)
                    .addComponent(jButton34))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Insertar Consulado", jPanel18);

        jLabel35.setText("Codigo: ");

        jLabel36.setText("Cantidad de electores:");

        jLabel37.setText("Nombre Centro Votacion: ");

        jLabel38.setText("Direccion:");

        jLabel39.setText("Pertenece:");

        jButton20.setText("Insertar");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton35.setText("Actualizar");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel39)
                    .addComponent(jLabel38)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField18)
                    .addComponent(jTextField19)
                    .addComponent(jTextField20)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jButton20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton35))
                    .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField21))
                .addGap(708, 708, 708))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20)
                    .addComponent(jButton35))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Insertar Junta", jPanel19);

        jLabel62.setText("Junta:");

        jLabel63.setText("Sexo:");

        jLabel64.setText("Nacionalidad:");

        jLabel65.setText("Lugar Nacimiento:");

        jLabel66.setText("Fecha de Nacimiento:");

        jLabel67.setText("Estado Civil: ");

        jLabel68.setText("Edad: ");

        jLabel69.setText("Cedula:");

        jLabel70.setText("Nombre Completo:");

        jButton23.setText("Insertar");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton37.setText("Actualizar");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jLabel81.setText("Numero Mesa:");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel70)
                                    .addComponent(jLabel69)
                                    .addComponent(jLabel68)
                                    .addComponent(jLabel67))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(auxnom)
                                    .addComponent(auxced)
                                    .addComponent(auxedad)
                                    .addComponent(auxciv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 3, Short.MAX_VALUE))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel66)
                                    .addComponent(jLabel65))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(auxfecha)
                                    .addComponent(auxlugar)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel62)
                                    .addComponent(jLabel63)
                                    .addComponent(jLabel64))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBox15, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(auxnac, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jComboBox14, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addComponent(jButton23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton37))
                                    .addComponent(auxmesa))))
                        .addGap(667, 667, 667))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel70)
                                    .addComponent(auxnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel69))
                            .addComponent(auxced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68)
                            .addComponent(auxedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel67))
                    .addComponent(auxciv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(auxfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(auxlugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(auxnac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(auxmesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23)
                    .addComponent(jButton37))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Insertar Auxiliar", jPanel22);

        jLabel28.setText("Codigo: ");

        jLabel29.setText("Consulado: ");

        jLabel30.setText("Consulado:");

        jButton18.setText("Insertar");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton27.setText("Actualizar Info");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel28))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField13)
                                    .addComponent(jTextField14)))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton27)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18)
                    .addComponent(jButton27))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Insertar Localidad", jPanel23);

        jLabel5.setText("Nombre Completo:");

        jLabel6.setText("Cedula:");

        jLabel7.setText("Edad: ");

        jLabel8.setText("Estado Civil: ");

        jLabel9.setText("Fecha de Nacimiento:");

        jLabel10.setText("Nacionalidad:");

        jLabel11.setText("Sexo:");

        jLabel12.setText("Junta:");

        jLabel14.setText("Numero Mesa:");

        jButton12.setText("Agregar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Actualizar Info");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel13.setText("Lugar Nacimiento:");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreciu)
                            .addComponent(cedciu)
                            .addComponent(edadciu, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(civilciu, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mesaciu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13)))
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(naciociu))))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechanaciu)
                            .addComponent(nacciud))))
                .addGap(667, 667, 667))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(nombreciu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(cedciu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(edadciu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addComponent(civilciu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(fechanaciu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(nacciud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(naciociu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(mesaciu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Insertar Ciudadano", jPanel13);

        jLabel40.setText("Nombre Completo:");

        jLabel41.setText("Cedula:");

        jLabel42.setText("Edad: ");

        jLabel43.setText("Estado Civil: ");

        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });

        jLabel44.setText("Numero Mesa:");

        jLabel45.setText("Junta:");

        jLabel46.setText("Sexo:");

        jLabel47.setText("Nacionalidad:");

        jLabel48.setText("Lugar Nacimiento:");

        jLabel49.setText("Fecha de Nacimiento:");

        jLabel50.setText("Pertenece Partido:");

        jButton21.setText("Insertar");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton28.setText("Actualizar");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fises, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fise, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fisc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fisn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel20Layout.createSequentialGroup()
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel49)
                                        .addComponent(jLabel45))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(jPanel20Layout.createSequentialGroup()
                                    .addComponent(jLabel44)
                                    .addGap(38, 38, 38)))
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fisnum)
                                .addComponent(jComboBox9, 0, 203, Short.MAX_VALUE)
                                .addComponent(fisfn)
                                .addComponent(fisln)))
                        .addGroup(jPanel20Layout.createSequentialGroup()
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel20Layout.createSequentialGroup()
                                    .addComponent(jLabel47)
                                    .addGap(43, 43, 43))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel20Layout.createSequentialGroup()
                                    .addComponent(jLabel46)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fisna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(103, 103, 103)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel20Layout.createSequentialGroup()
                                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel40)
                                            .addComponent(fisn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel41))
                                    .addComponent(fisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel42)
                                    .addComponent(fise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(fises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel43))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(fisfn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton28))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(fisln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton21))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel47)
                        .addComponent(fisna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(fisnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97))
        );

        jTabbedPane4.addTab("Insertar Fiscal", jPanel20);

        jLabel71.setText("Nombre: ");

        jLabel72.setText("Tipo Candidatura:");

        jLabel73.setText("Cedula:");

        jLabel74.setText("Plan de Gobierno(URL):");

        jLabel75.setText("Curriculum Vitae(URL):");

        jLabel76.setText("Partido Politico:");

        jButton24.setText("Insertar");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton29.setText("Actualizar");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel76)
                            .addComponent(jLabel75)
                            .addComponent(jLabel74)
                            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel72)
                                .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField22)
                            .addComponent(jTextField23)
                            .addComponent(jTextField24)
                            .addComponent(jTextField25)
                            .addComponent(jTextField26)
                            .addComponent(jComboBox16, 0, 136, Short.MAX_VALUE)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jButton24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton29)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton24)
                    .addComponent(jButton29))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Insertar Candidatura Presidente Y Vices", jPanel24);

        jLabel77.setText("Partido Politico:");

        jLabel78.setText("Provincia");

        jLabel79.setText("Curriculum Vitae");

        jLabel80.setText("Cedula:");

        jLabel82.setText("Nombre: ");

        jButton25.setText("Insertar");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton30.setText("Actualizar");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel77)
                            .addComponent(jLabel78)
                            .addComponent(jLabel79)
                            .addComponent(jLabel80)
                            .addComponent(jLabel82))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField31)
                            .addComponent(jTextField29)
                            .addComponent(jTextField28)
                            .addComponent(jComboBox17, 0, 136, Short.MAX_VALUE)
                            .addComponent(jComboBox19, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jButton25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton30)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel78))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77))
                .addGap(44, 44, 44)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton25)
                    .addComponent(jButton30))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Insertar Candidatura Diputado", jPanel25);

        jLabel83.setText("Junta:");

        jLabel86.setText("Cantidad Votos Presidencial:");

        jLabel85.setText("Cantidad Votos Diputados:");

        jLabel87.setText("Partido:");

        jButton26.setText("Insertar");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton31.setText("Actualizar");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel84))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel83)
                            .addComponent(jLabel86)
                            .addComponent(jLabel85)
                            .addComponent(jLabel87))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(jButton26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton31))
                            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBox20, javax.swing.GroupLayout.Alignment.LEADING, 0, 140, Short.MAX_VALUE)
                                .addComponent(jComboBox18, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField32, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField33, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel84)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton26)
                    .addComponent(jButton31))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Insertar Votos", jPanel26);

        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel21.add(mesamiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 200, -1));

        jPanel21.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 203, -1));

        jComboBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox12ActionPerformed(evt);
            }
        });
        jPanel21.add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 206, -1));
        jPanel21.add(nacionalidadmiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 203, -1));
        jPanel21.add(lugmiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 203, -1));
        jPanel21.add(nacmiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 203, -1));
        jPanel21.add(civilmiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 200, -1));
        jPanel21.add(edadmiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 200, -1));
        jPanel21.add(cedmiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 200, -1));

        nombmiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombmiemActionPerformed(evt);
            }
        });
        jPanel21.add(nombmiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 200, -1));

        jLabel51.setText("Nombre Completo:");
        jPanel21.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel52.setText("Cedula:");
        jPanel21.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel53.setText("Edad: ");
        jPanel21.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel54.setText("Estado Civil: ");
        jPanel21.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel55.setText("Fecha de Nacimiento:");
        jPanel21.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 10));

        jLabel56.setText("Lugar Nacimiento:");
        jPanel21.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel57.setText("Nacionalidad:");
        jPanel21.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel58.setText("Sexo:");
        jPanel21.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel59.setText("Junta:");
        jPanel21.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel60.setText("Numero Mesa:");
        jPanel21.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jButton22.setText("Insertar");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        jLabel61.setText("Pertenece Partido:");
        jPanel21.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jPanel21.add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 202, -1));

        jButton36.setText("Actualizar");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        jTabbedPane4.addTab("Insertar Miembro", jPanel21);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 531, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Insertar Info", jPanel12);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Llene el toda la informacion solicitada");
        } else {
            String ced = jTextField1.getText();
            ArrayList array = tse.getCiud();
            int i=0;
            Ciudadano aux;
            boolean Band=true;
            for (i = 0; i <array.size(); i++) {
                aux=(Ciudadano) array.get(i);
                if(aux.getCedula().equals(ced)){
                    if(aux.getDomocilioElectoral().getLocal()==null)             
                        textarea1.setText("Nombre: "+aux.getNombreCompleto()+"\nCedula: "+aux.getCedula()+"\nDomicilio Electoral: "+aux.getDomocilioElectoral().getCentroVotacion()+"\nDireccion: "+aux.getDomocilioElectoral().getDireccion()+"\n Distrito: "+aux.getDomocilioElectoral().getDistrito().getNombre()+"\nCanton: "+aux.getDomocilioElectoral().getDistrito().getPertenece().getNombre()+"\nProvincia: "+aux.getDomocilioElectoral().getDistrito().getPertenece().getPertenece().getNombre());
                        Band=true;
                    if(aux.getDomocilioElectoral().getDistrito()==null){
                        textarea1.setText("Nombre: "+aux.getNombreCompleto()+"\nCedula: "+aux.getCedula()+"\nDomicilio Electoral: "+aux.getDomocilioElectoral().getCentroVotacion()+"\nDireccion: "+aux.getDomocilioElectoral().getDireccion()+"\nLocalidad: "+aux.getDomocilioElectoral().getLocal().getNombre()+"\nConsulado: "+aux.getDomocilioElectoral().getLocal().getConsul().getNombre());
                         Band=true;
                    }
                }  
                Band=false;
               
            }
            if(Band==true)
              JOptionPane.showMessageDialog(rootPane, "No encontrado");  
        }
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         ArrayList array = tse.getCiud();
         listmodel.clear();
            for (int i = 0; i <array.size(); i++) {
                Ciudadano aux=(Ciudadano) array.get(i);
                if(aux.getEdad()>=100){
                     listmodel.addElement("-------------------------------");
                      listmodel.addElement("Nombre: "+aux.getNombreCompleto());
                      listmodel.addElement("Cedula: "+aux.getCedula());
                      listmodel.addElement("Domicilio Electoral: "+aux.getDomocilioElectoral().getCentroVotacion());
                      listmodel.addElement("Direccion: "+aux.getDomocilioElectoral().getDireccion());
                      listmodel.addElement("Distrito: "+aux.getDomocilioElectoral().getDistrito().getNombre());
                      listmodel.addElement("Canton: "+aux.getDomocilioElectoral().getDistrito().getPertenece().getNombre());
                      listmodel.addElement("Provincia: "+aux.getDomocilioElectoral().getDistrito().getPertenece().getPertenece().getNombre());
                      listmodel.addElement("-------------------------------");
                    
                }
            }
            jList6.setModel(listmodel);  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         ArrayList array = tse.getCiud();
         int contM=0;
         int contF=0;
         int cont=0;
            for (int i = 0; i <array.size(); i++) {
                Ciudadano aux=(Ciudadano) array.get(i);
                if(aux.getSexo()=='M'){
                    System.out.println(contM+"hom");
                    contM++;
                }
                if(aux.getSexo()=='F'){
                    System.out.println(contF+"muj");
                    contF++;
                }
                cont++;
            }
            System.out.println(contM+"hom");
            System.out.println(contF+"muj");
       double totalM=(contM*100)/cont;
       double totalF=(contF*100)/cont;
       textarea3.setText("Mujeres: "+totalF+"\nHombres: "+totalM);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        ArrayList array = tse.getCiud();
        int cont=0;
        int contP=0;
            for (int i = 0; i <array.size(); i++) {
                Ciudadano aux=(Ciudadano) array.get(i);
                if((aux.getEdad()>=18)&&(aux.getEdad()<=40) ){
                    contP++;
                }
                cont++;
            }
           double total=(contP*100)/cont;
           textarea4.setText("El porcentaje de personas entre 40 y 18 años de edad es: "+total);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        boolean band=false;
        int cont=0;
        PartidoPolitico party = null;
        String pp = textfieldpresi.getText();
        ArrayList array=eleccion.getPartidos();
        if(band==false){
        for(int i=0;i<array.size();i++){
            PartidoPolitico aux=(PartidoPolitico)array.get(i);
            if(aux.getNombre().equals(pp)){
                band=true;
                break;
            }
            band=false;
         }
        
        }
        if (textfieldpresi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Llene el toda la informacion solicitada");
        } 

        if(band==true){

        for(int i=0;i<array.size();i++){
            PartidoPolitico aux=(PartidoPolitico)array.get(i);
            if(aux.getNombre().equals(pp)){
                party=aux;
            }
            
        }   
            ArrayList<Integer> LVotos=new ArrayList();
            ArrayList<String> LProvincia=new ArrayList();
            ArrayList<String>LCanton=new ArrayList();
            ArrayList<String>LDistrito=new ArrayList();
            ArrayList<Votos> arrayV=party.getVotos();
            ArrayList<String> LLocalidad=new ArrayList();
            ArrayList<String>LConsulado=new ArrayList();
            for(int a=0;a<arrayV.size();a++){
                Votos aux=(Votos)arrayV.get(a);
                cont+=aux.getPresidencial();
                if(aux.getReg().getJunta().getDistrito()!=null){
                LVotos.add(aux.getPresidencial());
                LDistrito.add(aux.getReg().getJunta().getDistrito().getNombre());
                LCanton.add(aux.getReg().getJunta().getDistrito().getPertenece().getNombre());
                LProvincia.add(aux.getReg().getJunta().getDistrito().getPertenece().getPertenece().getNombre());
                }
                else{
                cont+=aux.getPresidencial();
                LVotos.add(aux.getPresidencial());
                LLocalidad.add(aux.getReg().getJunta().getLocal().getNombre());
                LConsulado.add(aux.getReg().getJunta().getLocal().getConsul().getNombre());
                }
            }
        LVotos=met.reverse(LVotos);
        int cont1=0;
        listmodel.clear();
    for(int f=0;f<LVotos.size();f++){
        if(LProvincia.size()>f){
        listmodel.addElement("-------------------------------");
        listmodel.addElement("Votos= "+LVotos.get(f));
        listmodel.addElement("Distrito: "+LDistrito.get(f));
        listmodel.addElement("Canton: "+LCanton.get(f));
        listmodel.addElement("Provincia: "+ LProvincia.get(f));
        listmodel.addElement("-------------------------------");
        }
        else{
        listmodel.addElement("-------------------------------");
        listmodel.addElement("Votos= "+LVotos.get(f));
        listmodel.addElement("Localidad: "+LLocalidad.get(cont1));
        listmodel.addElement("Consulado: "+LConsulado.get(cont1));
        listmodel.addElement("-------------------------------");
        cont1++;
        }
    
    }
    listmodel.addElement("Para un total de: "+cont);
     jList1.setModel(listmodel);       
        }
        if(band==false){
        JOptionPane.showMessageDialog(rootPane, "Partido no encontrado");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        boolean band=false;
        int cont=0;
        PartidoPolitico party = null;
        String pp = textfielddipu.getText();
        ArrayList array=eleccion.getPartidos();
        if(band==false){
        for(int i=0;i<array.size();i++){
            PartidoPolitico aux=(PartidoPolitico)array.get(i);
            if(aux.getNombre().equals(pp)){
                band=true;
                break;
            }
            band=false;
         }
        
        }
        if (textfielddipu.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Llene el toda la informacion solicitada");
        } 

        if(band==true){

        for(int i=0;i<array.size();i++){
            PartidoPolitico aux=(PartidoPolitico)array.get(i);
            if(aux.getNombre().equals(pp)){
                party=aux;
            }
            
        }   
            ArrayList<Integer> LVotos=new ArrayList();
            ArrayList<String> LProvincia=new ArrayList();
            ArrayList<String>LCanton=new ArrayList();
            ArrayList<String>LDistrito=new ArrayList();
            ArrayList<Votos> arrayV=party.getVotos();
            ArrayList<String> LLocalidad=new ArrayList();
            ArrayList<String>LConsulado=new ArrayList();
            for(int a=0;a<arrayV.size();a++){
                Votos aux=(Votos)arrayV.get(a);
                cont+=aux.getDiputados();
                if(aux.getReg().getJunta().getDistrito()!=null){
                LVotos.add(aux.getDiputados());
                LDistrito.add(aux.getReg().getJunta().getDistrito().getNombre());
                LCanton.add(aux.getReg().getJunta().getDistrito().getPertenece().getNombre());
                LProvincia.add(aux.getReg().getJunta().getDistrito().getPertenece().getPertenece().getNombre());
                }
                else{
                cont+=aux.getDiputados();
                LVotos.add(aux.getDiputados());
                LLocalidad.add(aux.getReg().getJunta().getLocal().getNombre());
                LConsulado.add(aux.getReg().getJunta().getLocal().getConsul().getNombre());
                }
            }
        LVotos=met.reverse(LVotos);
        int cont1=0;
        listmodel.clear();
    for(int f=0;f<LVotos.size();f++){
         if(LProvincia.size()>f){
        listmodel.addElement("-------------------------------");
        listmodel.addElement("Votos= "+LVotos.get(f));
        listmodel.addElement("Distrito: "+LDistrito.get(f));
        listmodel.addElement("Canton: "+LCanton.get(f));
        listmodel.addElement("Provincia: "+ LProvincia.get(f));
        listmodel.addElement("-------------------------------");
         }
          else{
        listmodel.addElement("-------------------------------");
        listmodel.addElement("Votos= "+LVotos.get(f));
        listmodel.addElement("Localidad: "+LLocalidad.get(cont1));
        listmodel.addElement("Consulado: "+LConsulado.get(cont1));
        listmodel.addElement("-------------------------------");
        cont1++;
        }
    
    }
    listmodel.addElement("Para un total de: "+cont);
     jList2.setModel(listmodel);       
        }
        if(band==false){
        JOptionPane.showMessageDialog(rootPane, "Partido no encontrado");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        listmodel.clear();
        ArrayList<PartidoPolitico>aux=tse.getElecciones().getPartidos();
        for(int a =0;a<aux.size();a++){
            
            listmodel.addElement("-----Partido: "+aux.get(a).getNombre());
            ArrayList<CandidaturaPresiyVice> aux2= aux.get(a).getPresidenteyVices();
            for(int k=0;k<aux2.size();k++){
               String aux3=aux2.get(k).getNombre();
               listmodel.addElement("-------------------------------");
               listmodel.addElement("Nombre: "+aux3);
               aux3=aux2.get(k).getCedula();
               listmodel.addElement("Cedula: "+aux3);
               aux3=aux2.get(k).getTipo();
               listmodel.addElement("Tipo de candidatura: "+aux3);
               aux3=aux2.get(k).getCurriculumVitae();
               listmodel.addElement("Curriculum: "+aux3);
               aux3=aux2.get(k).getPlanGobierno();
               listmodel.addElement("Plan de Gobierno "+aux3);
               listmodel.addElement("-------------------------------");
            }
        }
        jList3.setModel(listmodel); 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        listmodel.clear();
        for(int a =0;a<Provi.size();a++){
             Provincia aux=Provi.get(a);
            listmodel.addElement("-----Provincia: "+aux.getNombre());
            ArrayList<CandidaturaDiputado> aux2= aux.getDiputados();
            for(int k=0;k<aux2.size();k++){
               String aux3=aux2.get(k).getPertenece().getNombre();
               listmodel.addElement("-------------------------------");
               listmodel.addElement("Partido: "+aux3);
               aux3=aux2.get(k).getNombre();
               listmodel.addElement("Nombre: "+aux3);
               aux3=aux2.get(k).getCedula();
               listmodel.addElement("Cedula: "+aux3);
               aux3=aux2.get(k).getCurriculumVitae();
               listmodel.addElement("Curriculum: "+aux3);
               aux3=aux2.get(k).getProvincia().getNombre();
               listmodel.addElement("Provincia: "+aux3);
               listmodel.addElement("-------------------------------");
            }
        }
        jList4.setModel(listmodel); 
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        listmodel.clear();
        ArrayList<JRV> aux=tse.getJuntas();
        for(int a=0;a<aux.size();a++){
            if(aux.get(a).getDistrito()!=null){
            String aux2=aux.get(a).getDistrito().getNombre();
            listmodel.addElement("-------------------------------");
            listmodel.addElement("Distrito: "+aux2);
            aux2=aux.get(a).getCentroVotacion();
            listmodel.addElement("Centro de votacion: "+aux2);
            aux2=aux.get(a).getDireccion();
            listmodel.addElement("Direccion: "+aux2);
            aux2=aux.get(a).getDistrito().getPertenece().getNombre();
            listmodel.addElement("Pertenece al canton de: "+aux2);
            aux2=aux.get(a).getDistrito().getPertenece().getPertenece().getNombre();
            listmodel.addElement("Pertenece a la provincia de: "+aux2);
            }
            else{
            String aux2=aux.get(a).getLocal().getNombre();
            listmodel.addElement("-------------------------------");
            listmodel.addElement("Localidad: "+aux2);
            aux2=aux.get(a).getCentroVotacion();
            listmodel.addElement("Centro de votacion: "+aux2);
            aux2=aux.get(a).getDireccion();
            listmodel.addElement("Direccion: "+aux2);
            aux2=aux.get(a).getLocal().getConsul().getNombre();
            listmodel.addElement("Consulado: "+aux2);
            aux2=aux.get(a).getLocal().getConsul().getPais();
            listmodel.addElement("Pais: "+aux2);
            }
        }
        jList5.setModel(listmodel); 
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        if(nombreciu.getText().isEmpty()&cedciu.getText().isEmpty()&civilciu.getText().isEmpty()&edadciu.getText().isEmpty()&fechanaciu.getText().isEmpty()&naciociu.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Llene informacion necesaria");
        }
        else{
        String nom=nombreciu.getText();
        String ced=cedciu.getText();
        String civil=civilciu.getText();
        int edad=Integer.parseInt(edadciu.getText());
        String fechanac=fechanaciu.getText();
        String nacionalidad=naciociu.getText();
        String nacio=nacciud.getText();
        int mesa=Integer.parseInt(mesaciu.getText());
        String junta=""+jComboBox2.getSelectedItem();
        JRV aux=buscarjunta(junta);
        String sexo1=""+jComboBox1.getSelectedItem();
        char sexo;
        if(sexo1=="Masculino")
            sexo='M';
        else
            sexo='F';
        Ciudadano c = new Ciudadano(mesa,nom,ced,edad,civil,fechanac,nacio,nacionalidad,sexo,false,aux);
        tse.setCiud(c);
        JOptionPane.showMessageDialog(rootPane,"Agregado");
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        for(int i=0;i<tse.getJuntas().size();i++){
             JRV aux=tse.getJuntas().get(i);
             jComboBox2.addItem(aux.getCentroVotacion());
        }
        jComboBox1.addItem("Masculino");
        jComboBox1.addItem("Femenino");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jComboBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox12ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        jComboBox3.removeAllItems();
             for(int i=0;i<tse.getConsulados().size();i++){
             Consulado aux=tse.getConsulados().get(i);
             jComboBox3.addItem(aux.getNombre());
        }
          
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        if(jTextField4.getText().isEmpty()&jTextField6.getText().isEmpty()&jTextField5.getText().isEmpty()&jTextField7.getText().isEmpty()&jTextField8.getText().isEmpty())
            JOptionPane.showMessageDialog(rootPane,"Llene informacion necesaria");
        else{
            String nom=jTextField4.getText();
           String cod= jTextField6.getText();
           String Fecha= jTextField5.getText();
           String Telefono= jTextField7.getText();
            String Direccion=jTextField8.getText();
            PartidoPolitico aux=new PartidoPolitico(nom,cod,Fecha,Telefono,Direccion);
            eleccion.setPartidos(aux);
            JOptionPane.showMessageDialog(rootPane,"Agregado");
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        if(jTextField14.getText().isEmpty()&jTextField13.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Llene informacion necesaria");
        }
        else{
        String codigo=jTextField14.getText();
        String nombre=jTextField13.getText();
        String junta=""+jComboBox3.getSelectedItem();
        Consulado aux=buscarconsul(junta);
        Localidad l=new Localidad(aux,codigo,nombre);
        aux.setLocal(l);
        
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
         jComboBox10.removeAllItems();
         jComboBox9.removeAllItems();
         jComboBox8.removeAllItems();
        for(int i=0;i<tse.getJuntas().size();i++){
             JRV aux=tse.getJuntas().get(i);
             jComboBox9.addItem(aux.getCentroVotacion());
        }
        for(int i=0;i<tse.getElecciones().getPartidos().size();i++){
             PartidoPolitico aux=tse.getElecciones().getPartidos().get(i);
             jComboBox10.addItem(aux.getNombre());
        }
        jComboBox8.addItem("Masculino");
        jComboBox8.addItem("Femenino");
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        if(fisn.getText().isEmpty()&fisc.getText().isEmpty()&fises.getText().isEmpty()&fise.getText().isEmpty()&fisna.getText().isEmpty()&fisnum.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Llene informacion necesaria");
        }
        else{
        String nom=fisn.getText();
        String ced=fisc.getText();
        String civil=fises.getText();
        int edad=Integer.parseInt(fise.getText());
        String fechanac=fisfn.getText();
        String nacionalidad=fisna.getText();
        String nacio=fisln.getText();
        int mesa=Integer.parseInt(fisnum.getText());
        String partido=""+jComboBox10.getSelectedItem();
        PartidoPolitico aux=buscarpartido(partido);
        String sexo1=""+jComboBox8.getSelectedItem();
        String junta=""+jComboBox9.getSelectedItem();
        JRV aux2=buscarjunta(junta);
        char sexo;
        if(sexo1=="Masculino")
            sexo='M';
        else
            sexo='F';
        Fiscal c = new Fiscal(mesa,aux,nom,ced,edad,civil,fechanac,nacio,nacionalidad,sexo,false,aux2);
        aux.setFiscal(c);
        aux2.setFiscales(c);
        JOptionPane.showMessageDialog(rootPane,"Agregado");
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        
        jComboBox16.removeAllItems();
         for(int i=0;i<tse.getElecciones().getPartidos().size();i++){
             PartidoPolitico aux=tse.getElecciones().getPartidos().get(i);
             jComboBox16.addItem(aux.getNombre());
        }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
                if(jTextField22.getText().isEmpty()&jTextField23.getText().isEmpty()&jTextField24.getText().isEmpty()&jTextField25.getText().isEmpty()&jTextField26.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Llene informacion necesaria");
        }
                else{
        String nom=jTextField22.getText();
        String candi=jTextField23.getText();
        String ced=jTextField24.getText();
        String plan=jTextField25.getText();
        String curr=jTextField26.getText();
        String partido=""+jComboBox16.getSelectedItem();
        PartidoPolitico aux=buscarpartido(partido);
        CandidaturaPresiyVice aux2=new CandidaturaPresiyVice(nom,candi,null,ced,plan,curr);
        aux.setPresidenteyVices(aux2);
         JOptionPane.showMessageDialog(rootPane,"Agregado");
                }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
                jComboBox19.removeAllItems();
                jComboBox17.removeAllItems();
         for(int i=0;i<tse.getElecciones().getPartidos().size();i++){
             PartidoPolitico aux=tse.getElecciones().getPartidos().get(i);
             jComboBox17.addItem(aux.getNombre());
        }
         for(int i=0;i<Provi.size();i++){
             Provincia aux=Provi.get(i);
             jComboBox19.addItem(aux.getNombre());
        }
         
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        if(jTextField31.getText().isEmpty()&jTextField29.getText().isEmpty()&jTextField28.getText().isEmpty()){
         JOptionPane.showMessageDialog(rootPane,"Llene informacion necesaria");
        }
        else{
         String nom=jTextField31.getText();
         String ced=jTextField29.getText();
         String curr=jTextField28.getText();
         String partido=""+jComboBox17.getSelectedItem();
         String provincia=""+jComboBox19.getSelectedItem();
         PartidoPolitico aux=buscarpartido(partido);
         Provincia aux2=buscarprovincia(provincia);
         CandidaturaDiputado d=new CandidaturaDiputado(aux,nom,ced,aux2,curr);
        JOptionPane.showMessageDialog(rootPane,"Agregado");
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        jComboBox18.removeAllItems();
        jComboBox20.removeAllItems();
       for(int i=0;i<tse.getJuntas().size();i++){
             JRV aux=tse.getJuntas().get(i);
             jComboBox18.addItem(aux.getCentroVotacion());
        }
      for(int i=0;i<tse.getElecciones().getPartidos().size();i++){
             PartidoPolitico aux=tse.getElecciones().getPartidos().get(i);
             jComboBox20.addItem(aux.getNombre());
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        if(jTextField32.getText().isEmpty()&jTextField33.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Llene informacion necesaria");
        }
        else{
        int  cantP=Integer.parseInt(jTextField32.getText());
        int cantD=Integer.parseInt(jTextField33.getText());
        String partido=""+jComboBox20.getSelectedItem();
        PartidoPolitico aux=buscarpartido(partido);
         String junta=""+jComboBox18.getSelectedItem();
        JRV aux2=buscarjunta(junta);
        RegistroVotos r=new RegistroVotos(aux2,0,0);
        Votos v=new Votos(r,cantP,cantD);
        aux.setVotos(v);
        JOptionPane.showMessageDialog(rootPane,"Agregado");
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        jComboBox4.removeAllItems();
       for(int i=0;i<Provi.size();i++){
             Provincia aux=Provi.get(i);
             for(int a=0;a<aux.getCantones().size();a++){
                 Canton aux2=aux.getCantones().get(a);
                jComboBox4.addItem(aux2.getNombre());
        }   
       }
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        if(jTextField2.getText().isEmpty()&jTextField3.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Llene informacion necesaria");
        }
        else{
        String canton=""+jComboBox4.getSelectedItem();
        String codigo=jTextField2.getText();
        String nombre=jTextField3.getText();
        Canton aux=buscarcanton(canton);
        Distrito d=new Distrito(aux,codigo,nombre);
        aux.setDistritos(d);
        JOptionPane.showMessageDialog(rootPane,"Agregado");
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
         jComboBox5.removeAllItems();
       for(int i=0;i<Provi.size();i++){
             Provincia aux=Provi.get(i);
             jComboBox5.addItem(aux.getNombre());
        }
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        if(jTextField10.getText().isEmpty()&jTextField9.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Llene informacion necesaria");
        }
        else{
        String provincia=""+jComboBox5.getSelectedItem();
        String codigo=jTextField10.getText();
        String nombre=jTextField9.getText();
        Provincia aux=buscarprovincia(provincia);
        Canton d=new Canton(aux,codigo,nombre);
        aux.setCantones(d);
        JOptionPane.showMessageDialog(rootPane,"Agregado");
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        if(jTextField11.getText().isEmpty()&jTextField12.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Llene informacion necesaria");
        }
        else{
         String codigo=jTextField11.getText();
        String nombre=jTextField12.getText();
        Provincia provi=new Provincia(codigo,nombre);
        Provi.add(provi);
        JOptionPane.showMessageDialog(rootPane,"Agregado");
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
       jComboBox6.removeAllItems();
       for(int i=0;i<tse.getJuntas().size();i++){
             JRV aux=tse.getJuntas().get(i);
             if(aux.getLocal()!=null)
             jComboBox6.addItem(aux.getCentroVotacion());
        }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        if(jTextField17.getText().isEmpty()&jTextField16.getText().isEmpty()&jTextField15.getText().isEmpty())
            JOptionPane.showMessageDialog(rootPane,"Llene informacion necesaria");
        else{
        String pais=jTextField17.getText();
        String codigo=jTextField16.getText();
        String nombre=jTextField15.getText();
        String junta=""+jComboBox6.getSelectedItem();
        JRV aux=buscarjunta(junta);
        Consulado c=new Consulado(aux,pais,codigo,nombre);
        tse.setConsulados(c);
        JOptionPane.showMessageDialog(rootPane,"Agregado");
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
               jComboBox7.removeAllItems();
       for(int i=0;i<tse.getConsulados().size();i++){
              Consulado aux=tse.getConsulados().get(i);
              for(int a=0;a<aux.getLocal().size();a++){
                Localidad aux2=aux.getLocal().get(a);
             
             jComboBox7.addItem(aux2.getNombre());
              }
        }
              for(int i=0;i<Provi.size();i++){
             Provincia aux=Provi.get(i);
             for(int a=0;a<aux.getCantones().size();a++){
                 Distrito aux2=aux.getCantones().get(a).getDistritos().get(a);
                jComboBox7.addItem(aux2.getNombre());
        }   
       }
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        if(jTextField18.getText().isEmpty()&jTextField19.getText().isEmpty()&jTextField20.getText().isEmpty()&jTextField21.getText().isEmpty())
            JOptionPane.showMessageDialog(rootPane,"Llene informacion necesaria");
        else{
        String codigo=jTextField18.getText();
        int cant=Integer.parseInt(jTextField19.getText());
        String centro=jTextField20.getText();
        String direc=jTextField21.getText();
        String junta=""+jComboBox7.getSelectedItem();
        Distrito aux=buscardistrito(junta);
        Localidad aux2;
        if(aux==null){
           aux2=buscarlocal(junta);
           JRV j=new JRV(aux2,codigo,cant,centro,direc);
           tse.setJuntas(j);
        }
        else{
            JRV j=new JRV(aux,codigo,cant,centro,direc);
            tse.setJuntas(j);
        }
        
        JOptionPane.showMessageDialog(rootPane,"Agregado");
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
         jComboBox12.removeAllItems();
         jComboBox11.removeAllItems();
         jComboBox13.removeAllItems();
        for(int i=0;i<tse.getJuntas().size();i++){
             JRV aux=tse.getJuntas().get(i);
             jComboBox11.addItem(aux.getCentroVotacion());
        }
        for(int i=0;i<tse.getElecciones().getPartidos().size();i++){
             PartidoPolitico aux=tse.getElecciones().getPartidos().get(i);
             jComboBox13.addItem(aux.getNombre());
        }
        jComboBox12.addItem("Masculino");
        jComboBox12.addItem("Femenino");
    }//GEN-LAST:event_jButton36ActionPerformed

    private void nombmiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombmiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombmiemActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        if(nombmiem.getText().isEmpty()&cedmiem.getText().isEmpty()&edadmiem.getText().isEmpty()&civilmiem.getText().isEmpty()&nacmiem.getText().isEmpty()&lugmiem.getText().isEmpty()&nacionalidadmiem.getText().isEmpty()&mesamiem.getText().isEmpty())
            JOptionPane.showMessageDialog(rootPane,"Llene informacion necesaria");
        else{
        String nom=nombmiem.getText();
        String ced=cedmiem.getText();
        int edad=Integer.parseInt(edadmiem.getText());
        String civil=civilmiem.getText();
        String nacim=nacmiem.getText();
        String lugar=lugmiem.getText();
        String naciona=nacionalidadmiem.getText();
        int mesa=Integer.parseInt(mesamiem.getText());
        String partido=""+jComboBox13.getSelectedItem();
        PartidoPolitico aux=buscarpartido(partido);
        String sexo1=""+jComboBox12.getSelectedItem();
        String junta=""+jComboBox11.getSelectedItem();
        JRV aux2=buscarjunta(junta);
        char sexo;
        if(sexo1=="Masculino")
            sexo='M';
        else
            sexo='F';
        MiembroMesa c = new MiembroMesa(mesa,aux,nom,ced,edad,civil,nacim,lugar,naciona,sexo,false,aux2);
        aux2.setMiembros(c);
        aux.setMiembro(c);
        JOptionPane.showMessageDialog(rootPane,"Agregado");
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
        jComboBox14.removeAllItems();
        jComboBox15.removeAllItems();
        for(int i=0;i<tse.getJuntas().size();i++){
             JRV aux=tse.getJuntas().get(i);
             jComboBox14.addItem(aux.getCentroVotacion());
        }
        jComboBox15.addItem("Masculino");
        jComboBox15.addItem("Femenino");
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        if(auxnom.getText().isEmpty()&auxced.getText().isEmpty()&auxedad.getText().isEmpty()&auxciv.getText().isEmpty()&auxfecha.getText().isEmpty()&auxlugar.getText().isEmpty()&auxnac.getText().isEmpty()&auxmesa.getText().isEmpty())
            JOptionPane.showMessageDialog(rootPane,"Llene informacion necesaria");
        
        else{
        String nom=auxnom.getText();
        String ced=auxced.getText();
        int edad=Integer.parseInt(auxedad.getText());
        String civil=auxciv.getText();
        String nacim=auxfecha.getText();
        String lugar=auxlugar.getText();
        String naciona=auxnac.getText();
        int mesa=Integer.parseInt(auxmesa.getText());
        String junta=""+jComboBox14.getSelectedItem();
        JRV aux=buscarjunta(junta);
        String sexo1=""+jComboBox15.getSelectedItem();
        char sexo;
        if(sexo1=="Masculino")
            sexo='M';
        else
            sexo='F';
        AuxiliarElectoral a=new AuxiliarElectoral(mesa,nom,ced,edad,civil,nacim,lugar,naciona,sexo,false,aux);
        tse.setAux(a);
        aux.setAuxiliares(a);
        JOptionPane.showMessageDialog(rootPane,"Agregado");
                }
    }//GEN-LAST:event_jButton23ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField auxced;
    private javax.swing.JTextField auxciv;
    private javax.swing.JTextField auxedad;
    private javax.swing.JTextField auxfecha;
    private javax.swing.JTextField auxlugar;
    private javax.swing.JTextField auxmesa;
    private javax.swing.JTextField auxnac;
    private javax.swing.JTextField auxnom;
    private javax.swing.JTextField cedciu;
    private javax.swing.JTextField cedmiem;
    private javax.swing.JTextField civilciu;
    private javax.swing.JTextField civilmiem;
    private javax.swing.JTextField edadciu;
    private javax.swing.JTextField edadmiem;
    private javax.swing.JTextField fechanaciu;
    private javax.swing.JTextField fisc;
    private javax.swing.JTextField fise;
    private javax.swing.JTextField fises;
    private javax.swing.JTextField fisfn;
    private javax.swing.JTextField fisln;
    private javax.swing.JTextField fisn;
    private javax.swing.JTextField fisna;
    private javax.swing.JTextField fisnum;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox20;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JList<String> jList6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField lugmiem;
    private javax.swing.JTextField mesaciu;
    private javax.swing.JTextField mesamiem;
    private javax.swing.JTextField nacciud;
    private javax.swing.JTextField naciociu;
    private javax.swing.JTextField nacionalidadmiem;
    private javax.swing.JTextField nacmiem;
    private javax.swing.JTextField nombmiem;
    private javax.swing.JTextField nombreciu;
    private javax.swing.JTextArea textarea1;
    private javax.swing.JTextArea textarea3;
    private javax.swing.JTextArea textarea4;
    private javax.swing.JTextField textfielddipu;
    private javax.swing.JTextField textfieldpresi;
    // End of variables declaration//GEN-END:variables
    public JRV buscarjunta(String x){
        int i = 0;
        String aux ="";
        for(i=0;tse.getJuntas().size()>i;i++){
            aux= tse.getJuntas().get(i).getCentroVotacion();
        
            if(aux.equals(x))
                return tse.getJuntas().get(i);
        }
       return null;
    }
    public Consulado buscarconsul(String x){
        int i = 0;
        String aux ="";
         for(i=0;tse.getConsulados().size()>i;i++){
            aux= tse.getConsulados().get(i).getNombre();
            
             if(aux.equals(x))
                return tse.getConsulados().get(i);
         }
         return null;
    }
        public PartidoPolitico buscarpartido(String x){
        int i = 0;
        String aux ="";
         for(i=0;tse.getElecciones().getPartidos().size()>i;i++){
            aux= tse.getElecciones().getPartidos().get(i).getNombre();
            
             if(aux.equals(x))
                return tse.getElecciones().getPartidos().get(i);
         }
         return null;
    }

    public Provincia buscarprovincia(String x){
        int i = 0;
        String aux ="";
        for(i=0;Provi.size()>i;i++){
            aux= Provi.get(i).getNombre();
        
            if(aux.equals(x))
                return Provi.get(i);
        }
       return null;
    }
        public Canton buscarcanton(String x){
        int i = 0;
        String aux ="";
        for(i=0;Provi.get(i).getCantones().size()>i;i++){
            aux= Provi.get(i).getCantones().get(i).getNombre();
        
            if(aux.equals(x))
                return Provi.get(i).getCantones().get(i);
        }
       return null;
    }
        public Localidad buscarlocal(String x){
        int i = 0;
        String aux ="";
        for(i=0;tse.getConsulados().get(i).getLocal().size()>i;i++){
            aux= tse.getConsulados().get(i).getLocal().get(i).getNombre();
        
            if(aux.equals(x))
                return tse.getConsulados().get(i).getLocal().get(i);
        }
       return null;
    }  
            
        public Distrito buscardistrito(String x){
        int i = 0;
        String aux ="";
        ArrayList<Distrito> aux2;
        for(i=0;Provi.get(i).getCantones().size()>i;i++){
           
            aux2 = Provi.get(i).getCantones().get(i).getDistritos();
            for(int a=0;a<aux2.size();a++){
                aux=aux2.get(a).getNombre();
                if(aux.equals(x))
                    return aux2.get(a);
            }
        }
       return null;
    }  
}
