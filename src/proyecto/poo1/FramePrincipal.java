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

    Resultados resultados = new Resultados();

    Eleccion eleccion = new Eleccion(resultados);

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
        eleccion.setResulto(resultados);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        textarea2 = new javax.swing.JTextArea();
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
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();

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
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta Cedula", jPanel1);

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        textarea2.setColumns(20);
        textarea2.setRows(5);
        jScrollPane2.setViewportView(textarea2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(542, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultas 100 años o mas", jPanel2);

        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

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
                .addContainerGap(356, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar % Mujer y Hombre", jPanel3);

        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

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
                .addGap(0, 367, Short.MAX_VALUE))
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
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
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
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
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
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 987, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Insertar Ciudadano", jPanel13);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 987, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Insertar Partido", jPanel14);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 987, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Insertar Distrito", jPanel15);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 987, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Insertar Canton", jPanel16);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 987, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Insertar Provincia", jPanel17);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 987, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Insertar Consulado", jPanel18);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 987, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Insertar Junta", jPanel19);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 987, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Insertar Fiscal", jPanel20);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 987, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Insertar Miembro", jPanel21);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 987, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Insertar Auxiliar", jPanel22);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 987, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Insertar Localidad", jPanel23);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Insertar Info", jPanel12);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 520));

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

            for (int i = 0; i <array.size(); i++) {
                Ciudadano aux=(Ciudadano) array.get(i);
                if(aux.getEdad()>=100){
                    textarea2.setText("Nombre: "+aux.getNombreCompleto()+"\nCedula: "+aux.getCedula()+"\nDomicilio Electoral: "+aux.getDomocilioElectoral().getCentroVotacion()+"\nDireccion: "+aux.getDomocilioElectoral().getDireccion()+"\n Distrito: "+aux.getDomocilioElectoral().getDistrito().getNombre()+"\nCanton: "+aux.getDomocilioElectoral().getDistrito().getPertenece().getNombre()+"\nProvincia: "+aux.getDomocilioElectoral().getDistrito().getPertenece().getPertenece().getNombre());
                }}
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
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
    private javax.swing.JTextArea textarea1;
    private javax.swing.JTextArea textarea2;
    private javax.swing.JTextArea textarea3;
    private javax.swing.JTextArea textarea4;
    private javax.swing.JTextField textfielddipu;
    private javax.swing.JTextField textfieldpresi;
    // End of variables declaration//GEN-END:variables
}
