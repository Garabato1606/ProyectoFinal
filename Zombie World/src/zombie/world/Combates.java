/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombie.world;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import static zombie.world.Juego.getConecction;
import static zombie.world.PartidasGuardadas.PASSWORD;
import static zombie.world.PartidasGuardadas.URL;
import static zombie.world.PartidasGuardadas.USERNAME;
import static zombie.world.PartidasGuardadas.getConecction;

/**
 *
 * @author Garabato
 */
public class Combates extends javax.swing.JFrame {

    /*hacer el cursos diferente*/
    Cursor cursor;
    ImageIcon img = new ImageIcon(getClass().getResource("/imagenes/mano.png"));
    Toolkit TK = Toolkit.getDefaultToolkit();

    //conexion a mysql
    public static final String URL = "jdbc:mysql://localhost:3306/zombieworld?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";
    PreparedStatement PS;
    ResultSet rs = null;

    public Combates() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        //Cambiar icono
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/mano.png")).getImage());
        /*parte del cursor diferente*/
        this.cursor = TK.createCustomCursor(img.getImage(), new Point(1, 1), "Cursor");
        this.setCursor(cursor);

        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/Bosque.jpg"));
        Icon Fondo = new ImageIcon(imagen.getImage().getScaledInstance(this.Fondo.getWidth(), this.Fondo.getHeight(), Image.SCALE_DEFAULT));
        this.Fondo.setIcon(Fondo);
        this.repaint();

        UIManager.put("nimbusOrange", new Color(51, 255, 0));
        
        jProgressBar7.setVisible(false); jProgressBar8.setVisible(false); jProgressBar9.setVisible(false);
        jProgressBar10.setVisible(false); jProgressBar11.setVisible(false); jProgressBar12.setVisible(false);
        jProgressBar13.setVisible(false); jProgressBar14.setVisible(false); jProgressBar15.setVisible(false);
        jProgressBar16.setVisible(false); jProgressBar17.setVisible(false); jProgressBar18.setVisible(false);
        jProgressBar19.setVisible(false); jProgressBar20.setVisible(false); jProgressBar21.setVisible(false);
        jProgressBar22.setVisible(false); jProgressBar23.setVisible(false); jProgressBar24.setVisible(false);
        jProgressBar25.setVisible(false); jProgressBar26.setVisible(false); CB7.setVisible(false);
        CB8.setVisible(false); CB9.setVisible(false); CB10.setVisible(false); CB11.setVisible(false);
        CB12.setVisible(false); CB13.setVisible(false); CB14.setVisible(false); CB15.setVisible(false);
        CB16.setVisible(false); CB17.setVisible(false); CB18.setVisible(false); CB19.setVisible(false);
        CB20.setVisible(false); CB21.setVisible(false); CB22.setVisible(false); CB23.setVisible(false);
        CB24.setVisible(false); CB25.setVisible(false); CB26.setVisible(false); 
            
           
        String Bloqueo = "";    
        try { 
            Connection con = null;
            con = getConecction();

            PS = con.prepareStatement("SELECT Desbloqueado "
             + "FROM MisterEggs WHERE id_MisterEggs = 2");
            rs = PS.executeQuery();
            if (rs.next()) {
              Bloqueo = rs.getString("Desbloqueado");
              if ("Si".equals(Bloqueo)) {
             JCB.setVisible(true);
             jButton2.setVisible(true);
            } else {
             JCB.setVisible(false);
             jButton2.setVisible(false); 
            }
              }
        } catch (Exception e) {
           System.out.println(e); 
        }
          
         
    }

   public static Connection getConecction() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return con;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jProgressBar4 = new javax.swing.JProgressBar();
        jProgressBar5 = new javax.swing.JProgressBar();
        jProgressBar6 = new javax.swing.JProgressBar();
        jProgressBar7 = new javax.swing.JProgressBar();
        jProgressBar8 = new javax.swing.JProgressBar();
        jProgressBar9 = new javax.swing.JProgressBar();
        jProgressBar10 = new javax.swing.JProgressBar();
        jProgressBar11 = new javax.swing.JProgressBar();
        jProgressBar12 = new javax.swing.JProgressBar();
        jProgressBar13 = new javax.swing.JProgressBar();
        jProgressBar14 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ABP1 = new javax.swing.JComboBox<>();
        ABP2 = new javax.swing.JComboBox<>();
        ABP3 = new javax.swing.JComboBox<>();
        ABP4 = new javax.swing.JComboBox<>();
        AP1 = new javax.swing.JComboBox<>();
        AP2 = new javax.swing.JComboBox<>();
        AP3 = new javax.swing.JComboBox<>();
        AP4 = new javax.swing.JComboBox<>();
        CB = new javax.swing.JCheckBox();
        CB2 = new javax.swing.JCheckBox();
        CB3 = new javax.swing.JCheckBox();
        CB4 = new javax.swing.JCheckBox();
        CB5 = new javax.swing.JCheckBox();
        CB6 = new javax.swing.JCheckBox();
        CB7 = new javax.swing.JCheckBox();
        CB8 = new javax.swing.JCheckBox();
        CB9 = new javax.swing.JCheckBox();
        CB10 = new javax.swing.JCheckBox();
        CB11 = new javax.swing.JCheckBox();
        CB12 = new javax.swing.JCheckBox();
        CB13 = new javax.swing.JCheckBox();
        CB14 = new javax.swing.JCheckBox();
        jProgressBar15 = new javax.swing.JProgressBar();
        CB15 = new javax.swing.JCheckBox();
        jProgressBar16 = new javax.swing.JProgressBar();
        CB16 = new javax.swing.JCheckBox();
        jProgressBar17 = new javax.swing.JProgressBar();
        CB17 = new javax.swing.JCheckBox();
        jProgressBar18 = new javax.swing.JProgressBar();
        CB18 = new javax.swing.JCheckBox();
        jProgressBar19 = new javax.swing.JProgressBar();
        CB19 = new javax.swing.JCheckBox();
        jProgressBar20 = new javax.swing.JProgressBar();
        CB20 = new javax.swing.JCheckBox();
        jProgressBar21 = new javax.swing.JProgressBar();
        CB21 = new javax.swing.JCheckBox();
        jProgressBar22 = new javax.swing.JProgressBar();
        CB22 = new javax.swing.JCheckBox();
        jProgressBar23 = new javax.swing.JProgressBar();
        CB23 = new javax.swing.JCheckBox();
        jProgressBar24 = new javax.swing.JProgressBar();
        CB24 = new javax.swing.JCheckBox();
        jProgressBar25 = new javax.swing.JProgressBar();
        CB25 = new javax.swing.JCheckBox();
        jProgressBar26 = new javax.swing.JProgressBar();
        CB26 = new javax.swing.JCheckBox();
        Atacar1 = new javax.swing.JButton();
        Atacar2 = new javax.swing.JButton();
        Atacar3 = new javax.swing.JButton();
        Atacar4 = new javax.swing.JButton();
        JCB = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1410, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 112, 120, 505));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zombie", "Superviviente", "Militar", "Horda" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Enemigos.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 60));

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 250, 30));
        getContentPane().add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 250, 30));
        getContentPane().add(jProgressBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 250, 30));
        getContentPane().add(jProgressBar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 250, 30));
        getContentPane().add(jProgressBar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 250, 30));
        getContentPane().add(jProgressBar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 250, 30));
        getContentPane().add(jProgressBar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 250, 30));
        getContentPane().add(jProgressBar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 250, 30));
        getContentPane().add(jProgressBar9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 250, 30));
        getContentPane().add(jProgressBar10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, 250, 30));
        getContentPane().add(jProgressBar11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, 250, 30));
        getContentPane().add(jProgressBar12, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 620, 250, 30));
        getContentPane().add(jProgressBar13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 670, 250, 30));
        getContentPane().add(jProgressBar14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 70, 250, 30));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Arma Blanca");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 170, 30));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Armas de Combate");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 170, 30));

        ABP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Bazucas", "Lanzagranadas", "Escopetas", "Francotirador", "Rifles de Asalto por Rafaga", "Rifles de Asalto por Tiro", "Rifles", "Ballestas", "Arcos", "Revolvers", "Pistola", "Granadas", "Molotov", "Explosivos" }));
        getContentPane().add(ABP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 120, -1));

        ABP2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Bazucas", "Lanzagranadas", "Escopetas", "Francotirador", "Rifles de Asalto por Rafaga", "Rifles de Asalto por Tiro", "Rifles", "Ballestas", "Arcos", "Revolvers", "Pistola", "Granadas", "Molotov", "Explosivos" }));
        getContentPane().add(ABP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 120, -1));

        ABP3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Bazucas", "Lanzagranadas", "Escopetas", "Francotirador", "Rifles de Asalto por Rafaga", "Rifles de Asalto por Tiro", "Rifles", "Ballestas", "Arcos", "Revolvers", "Pistola", "Granadas", "Molotov", "Explosivos" }));
        getContentPane().add(ABP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 120, -1));

        ABP4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Bazucas", "Lanzagranadas", "Escopetas", "Francotirador", "Rifles de Asalto por Rafaga", "Rifles de Asalto por Tiro", "Rifles", "Ballestas", "Arcos", "Revolvers", "Pistola", "Granadas", "Molotov", "Explosivos", " " }));
        getContentPane().add(ABP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 120, -1));

        AP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Bates", "Bates con Clavos", "Bates con Alambre de Puas", "Cuchillos", "Espadas", "Lanzas", "Bastones", "Katanas", "Machetes", "Hachas", "Navajas", "Destornillador", "Vidrios Rotos" }));
        getContentPane().add(AP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 140, -1));

        AP2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Bates", "Bates con Clavos", "Bates con Alambre de Puas", "Cuchillos", "Espadas", "Lanzas", "Bastones", "Katanas", "Machetes", "Hachas", "Navajas", "Destornillador", "Vidrios Rotos" }));
        getContentPane().add(AP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 140, -1));

        AP3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Bates", "Bates con Clavos", "Bates con Alambre de Puas", "Cuchillos", "Espadas", "Lanzas", "Bastones", "Katanas", "Machetes", "Hachas", "Navajas", "Destornillador", "Vidrios Rotos" }));
        getContentPane().add(AP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 140, -1));

        AP4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Bates", "Bates con Clavos", "Bates con Alambre de Puas", "Cuchillos", "Espadas", "Lanzas", "Bastones", "Katanas", "Machetes", "Hachas", "Navajas", "Destornillador", "Vidrios Rotos" }));
        getContentPane().add(AP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 140, -1));

        buttonGroup1.add(CB);
        getContentPane().add(CB, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));

        buttonGroup1.add(CB2);
        getContentPane().add(CB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, -1, -1));

        buttonGroup1.add(CB3);
        getContentPane().add(CB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, -1, -1));

        buttonGroup1.add(CB4);
        getContentPane().add(CB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, -1));

        buttonGroup1.add(CB5);
        getContentPane().add(CB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, -1, -1));

        buttonGroup1.add(CB6);
        getContentPane().add(CB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, -1, -1));

        buttonGroup1.add(CB7);
        getContentPane().add(CB7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, -1, -1));

        buttonGroup1.add(CB8);
        getContentPane().add(CB8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, -1, -1));

        buttonGroup1.add(CB9);
        getContentPane().add(CB9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, -1, -1));

        buttonGroup1.add(CB10);
        getContentPane().add(CB10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, -1, -1));

        buttonGroup1.add(CB11);
        getContentPane().add(CB11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 570, -1, -1));

        buttonGroup1.add(CB12);
        getContentPane().add(CB12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 620, -1, -1));

        buttonGroup1.add(CB13);
        getContentPane().add(CB13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 670, -1, -1));

        buttonGroup1.add(CB14);
        getContentPane().add(CB14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 70, -1, -1));
        getContentPane().add(jProgressBar15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 120, 250, 30));

        buttonGroup1.add(CB15);
        getContentPane().add(CB15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 120, -1, -1));
        getContentPane().add(jProgressBar16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 170, 250, 30));

        buttonGroup1.add(CB16);
        getContentPane().add(CB16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 170, -1, -1));
        getContentPane().add(jProgressBar17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 220, 250, 30));

        buttonGroup1.add(CB17);
        getContentPane().add(CB17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 220, -1, -1));
        getContentPane().add(jProgressBar18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 270, 250, 30));

        buttonGroup1.add(CB18);
        getContentPane().add(CB18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 270, -1, -1));
        getContentPane().add(jProgressBar19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 320, 250, 30));

        buttonGroup1.add(CB19);
        getContentPane().add(CB19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 320, -1, -1));
        getContentPane().add(jProgressBar20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 370, 250, 30));

        buttonGroup1.add(CB20);
        getContentPane().add(CB20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 370, -1, -1));
        getContentPane().add(jProgressBar21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 420, 250, 30));

        buttonGroup1.add(CB21);
        getContentPane().add(CB21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 420, -1, -1));
        getContentPane().add(jProgressBar22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 470, 250, 30));

        buttonGroup1.add(CB22);
        getContentPane().add(CB22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 470, -1, -1));
        getContentPane().add(jProgressBar23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 520, 250, 30));

        buttonGroup1.add(CB23);
        getContentPane().add(CB23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 520, -1, -1));
        getContentPane().add(jProgressBar24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 570, 250, 30));

        buttonGroup1.add(CB24);
        getContentPane().add(CB24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 570, -1, -1));
        getContentPane().add(jProgressBar25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 620, 250, 30));

        buttonGroup1.add(CB25);
        getContentPane().add(CB25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 620, -1, -1));
        getContentPane().add(jProgressBar26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 670, 250, 30));

        buttonGroup1.add(CB26);
        getContentPane().add(CB26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 670, -1, -1));

        Atacar1.setText("Atacar");
        Atacar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atacar1ActionPerformed(evt);
            }
        });
        getContentPane().add(Atacar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        Atacar2.setText("Atacar");
        Atacar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atacar2ActionPerformed(evt);
            }
        });
        getContentPane().add(Atacar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        Atacar3.setText("Atacar");
        Atacar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atacar3ActionPerformed(evt);
            }
        });
        getContentPane().add(Atacar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        Atacar4.setText("Atacar");
        Atacar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atacar4ActionPerformed(evt);
            }
        });
        getContentPane().add(Atacar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        JCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Facil", "Normal", "Dificil", "Imposible" }));
        getContentPane().add(JCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 110, -1));

        jButton2.setText("Cambiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Generar = jComboBox1.getSelectedItem().toString();
        int Random;
        String RandomF;
        jProgressBar1.setValue(0);
        jProgressBar2.setValue(0);
        jProgressBar3.setValue(0);
        jProgressBar4.setValue(0);
        jProgressBar5.setValue(0);
        jProgressBar6.setValue(0);
        if ("Zombie".equals(Generar)) {
            Random = 0;
            RandomF = "";
            Random = (int) (Math.random() * 3 + 1); //1 a 3 
            RandomF = Integer.toString(Random);
            if (Random == 1) {
                JOptionPane.showMessageDialog(null, "Aparecio " + Random + " Zombie");
                jProgressBar1.setValue(100);
            } else if (Random == 2) {
                JOptionPane.showMessageDialog(null, "Aparecieron " + Random + " Zombies");
                jProgressBar1.setValue(100);
                jProgressBar2.setValue(100);
            } else {
                JOptionPane.showMessageDialog(null, "Aparecieron " + Random + " Zombies");
                jProgressBar1.setValue(100);
                jProgressBar2.setValue(100);
                jProgressBar3.setValue(100);
            }
        } else if ("Superviviente".equals(Generar)) {
            Random = 0; // 1-2
            RandomF = "";
            Random = (int) (Math.random() * 2 + 1); //1 a 2 
            RandomF = Integer.toString(Random);
            if (Random == 1) {
                JOptionPane.showMessageDialog(null, "Aparecio " + Random + " Superviviente");
                jProgressBar1.setValue(100);
            } else {
                JOptionPane.showMessageDialog(null, "Aparecieron " + Random + " Supervivientes");
                jProgressBar1.setValue(100);
                jProgressBar2.setValue(100);
            }
        } else if ("Militar".equals(Generar)) {
            Random = 0; // 1-2
            RandomF = "";
            Random = (int) (Math.random() * 3 + 1); //1 a 2 
            RandomF = Integer.toString(Random);
            if (Random == 1) {
                JOptionPane.showMessageDialog(null, "Aparecio " + Random + " Militar");
                jProgressBar1.setValue(100);
            } else if (Random == 2) {
                JOptionPane.showMessageDialog(null, "Aparecieron " + Random + " Militares");
                jProgressBar1.setValue(100);
                jProgressBar2.setValue(100);
            } else {
                JOptionPane.showMessageDialog(null, "Aparecieron " + Random + " Militares");
                jProgressBar1.setValue(100);
                jProgressBar2.setValue(100);
                jProgressBar3.setValue(100);
            }
        } else if ("Horda".equals(Generar)) {
            Random = 0; // 1-2
            RandomF = "";
            Random = (int) (Math.random() * 3 + 4); //1 a 2 
            RandomF = Integer.toString(Random);
            if (Random == 4) {
                JOptionPane.showMessageDialog(null, "Aparecieron " + Random + " Zombies");
                jProgressBar1.setValue(100);
                jProgressBar2.setValue(100);
                jProgressBar3.setValue(100);
                jProgressBar4.setValue(100);
            } else if (Random == 5) {
                JOptionPane.showMessageDialog(null, "Aparecieron " + Random + " Zombies");
                jProgressBar1.setValue(100);
                jProgressBar2.setValue(100);
                jProgressBar3.setValue(100);
                jProgressBar4.setValue(100);
                jProgressBar5.setValue(100);
            } else if (Random == 6) {
                JOptionPane.showMessageDialog(null, "Aparecieron " + Random + " Zombies");
                jProgressBar1.setValue(100);
                jProgressBar2.setValue(100);
                jProgressBar3.setValue(100);
                jProgressBar4.setValue(100);
                jProgressBar5.setValue(100);
                jProgressBar6.setValue(100);
            } else {
                JOptionPane.showMessageDialog(null, "Aparecieron " + Random + " Zombies");
                jProgressBar1.setValue(100);
                jProgressBar2.setValue(100);
                jProgressBar3.setValue(100);
                jProgressBar4.setValue(100);
                jProgressBar5.setValue(100);
                jProgressBar6.setValue(100);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Atacar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atacar1ActionPerformed
        Connection con = null;
        ResultSet rs = null;
        int Daño = 0;
        String AB = ABP4.getSelectedItem().toString();
        String AP = AP4.getSelectedItem().toString();
        int Random;
        int Random2;
        int Dato;
        int Num = 0;

        if ((!"Nada".equals(AP)) && (!"Nada".equals(AB))) {
            JOptionPane.showMessageDialog(null, "No puede Selecionar ambas armas para atacar");
        } else if (("Nada".equals(AB)) && ("Nada".equals(AP))) {
            Random = 0; // 1-2
            Random = (int) (Math.random() * 2); //0 a 1 
            if (Random == 1) {
                JOptionPane.showMessageDialog(null, "Le has dado al enemigo");
                if (CB.isSelected()) {
                    Dato = jProgressBar1.getValue();
                    jProgressBar1.setValue(Dato - 10);
                } else if (CB2.isSelected()) {
                    Dato = jProgressBar2.getValue();
                    jProgressBar2.setValue(Dato - 10);
                } else if (CB3.isSelected()) {
                    Dato = jProgressBar3.getValue();
                    jProgressBar3.setValue(Dato - 10);
                } else if (CB4.isSelected()) {
                    Dato = jProgressBar4.getValue();
                    jProgressBar4.setValue(Dato - 10);
                } else if (CB5.isSelected()) {
                    Dato = jProgressBar5.getValue();
                    jProgressBar5.setValue(Dato - 10);
                } else if (CB6.isSelected()) {
                    Dato = jProgressBar6.getValue();
                    jProgressBar6.setValue(Dato - 10);
                } else {
                    Dato = jProgressBar1.getValue();
                    jProgressBar1.setValue(Dato - 10);
                    Dato = jProgressBar2.getValue();
                    jProgressBar2.setValue(Dato - 10);
                    Dato = jProgressBar3.getValue();
                    jProgressBar3.setValue(Dato - 10);
                    Dato = jProgressBar4.getValue();
                    jProgressBar4.setValue(Dato - 10);
                    Dato = jProgressBar5.getValue();
                    jProgressBar5.setValue(Dato - 10);
                    Dato = jProgressBar6.getValue();
                    jProgressBar6.setValue(Dato - 10);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Has fallado");
            }
        } else {
            try {
                con = getConecction();
                PS = con.prepareStatement("SELECT a.Daño_Adic, a.id_Armas"
                        + " from Armas A where a.Nombre = ?");
                PS.setString(1, ABP4.getSelectedItem().toString());
                rs = PS.executeQuery();
                if (rs.next()) {
                    Daño = rs.getInt("Daño_Adic");
                    Num = rs.getInt("id_Armas");
                }
                PS = con.prepareStatement("SELECT a.Daño_Adic, a.id_Armas"
                        + " from Armas A where a.Nombre = ?");
                PS.setString(1, AP4.getSelectedItem().toString());
                rs = PS.executeQuery();
                if (rs.next()) {
                    Daño = rs.getInt("Daño_Adic");
                    Num = rs.getInt("id_Armas");
                } else {
                }
                Random = 0; // 1-2
                Random = (int) (Math.random() * 2); //0 a 1 
                if (Random == 1) {
                    JOptionPane.showMessageDialog(null, "Le has dado al enemigo");
                    if (Num <= 15) {
                        Random2 = 0; // 1-2
                        Random2 = (int) (Math.random() * 50 + 1); //0 a 1 
                        Daño = Daño + Random2;
                        if (CB.isSelected()) {
                            Dato = jProgressBar1.getValue();
                            jProgressBar1.setValue(Dato - Daño);
                        } else if (CB2.isSelected()) {
                            Dato = jProgressBar2.getValue();
                            jProgressBar2.setValue(Dato - Daño);
                        } else if (CB3.isSelected()) {
                            Dato = jProgressBar3.getValue();
                            jProgressBar3.setValue(Dato - Daño);
                        } else if (CB4.isSelected()) {
                            Dato = jProgressBar4.getValue();
                            jProgressBar4.setValue(Dato - Daño);
                        } else if (CB5.isSelected()) {
                            Dato = jProgressBar5.getValue();
                            jProgressBar5.setValue(Dato - Daño);
                        } else if (CB6.isSelected()) {
                            Dato = jProgressBar6.getValue();
                            jProgressBar6.setValue(Dato - Daño);
                        }
                    } else {
                        Random2 = 0; // 1-2
                        Random2 = (int) (Math.random() * 30 + 1); //0 a 1 
                        Daño = Daño + Random2;
                        if (CB.isSelected()) {
                            Dato = jProgressBar1.getValue();
                            System.out.println(Random2);
                        } else if (CB2.isSelected()) {
                            Dato = jProgressBar2.getValue();
                            jProgressBar2.setValue(Dato - Daño);
                        } else if (CB3.isSelected()) {
                            Dato = jProgressBar3.getValue();
                            jProgressBar3.setValue(Dato - Daño);
                        } else if (CB4.isSelected()) {
                            Dato = jProgressBar4.getValue();
                            jProgressBar4.setValue(Dato - Daño);
                        } else if (CB5.isSelected()) {
                            Dato = jProgressBar5.getValue();
                            jProgressBar5.setValue(Dato - Daño);
                        } else if (CB6.isSelected()) {
                            Dato = jProgressBar6.getValue();
                            jProgressBar6.setValue(Dato - Daño);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Has fallado");
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_Atacar1ActionPerformed

    private void Atacar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atacar2ActionPerformed
        Connection con = null;
        ResultSet rs = null;
        int Daño = 0;
        String AB = ABP1.getSelectedItem().toString();
        String AP = AP1.getSelectedItem().toString();
        int Random;
        int Random2;
        int Dato;
        int Num = 0;

        if ((!"Nada".equals(AP)) && (!"Nada".equals(AB))) {
            JOptionPane.showMessageDialog(null, "No puede Selecionar ambas armas para atacar");
        } else if (("Nada".equals(AB)) && ("Nada".equals(AP))) {
            Random = 0; // 1-2
            Random = (int) (Math.random() * 2); //0 a 1 
            if (Random == 1) {
                JOptionPane.showMessageDialog(null, "Le has dado al enemigo");
                if (CB.isSelected()) {
                    Dato = jProgressBar1.getValue();
                    jProgressBar1.setValue(Dato - 10);
                } else if (CB2.isSelected()) {
                    Dato = jProgressBar2.getValue();
                    jProgressBar2.setValue(Dato - 10);
                } else if (CB3.isSelected()) {
                    Dato = jProgressBar3.getValue();
                    jProgressBar3.setValue(Dato - 10);
                } else if (CB4.isSelected()) {
                    Dato = jProgressBar4.getValue();
                    jProgressBar4.setValue(Dato - 10);
                } else if (CB5.isSelected()) {
                    Dato = jProgressBar5.getValue();
                    jProgressBar5.setValue(Dato - 10);
                } else if (CB6.isSelected()) {
                    Dato = jProgressBar6.getValue();
                    jProgressBar6.setValue(Dato - 10);
                } else {
                    Dato = jProgressBar1.getValue();
                    jProgressBar1.setValue(Dato - 10);
                    Dato = jProgressBar2.getValue();
                    jProgressBar2.setValue(Dato - 10);
                    Dato = jProgressBar3.getValue();
                    jProgressBar3.setValue(Dato - 10);
                    Dato = jProgressBar4.getValue();
                    jProgressBar4.setValue(Dato - 10);
                    Dato = jProgressBar5.getValue();
                    jProgressBar5.setValue(Dato - 10);
                    Dato = jProgressBar6.getValue();
                    jProgressBar6.setValue(Dato - 10);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Has fallado");
            }
        } else {
            try {
                con = getConecction();
                PS = con.prepareStatement("SELECT a.Daño_Adic, a.id_Armas"
                        + " from Armas A where a.Nombre = ?");
                PS.setString(1, ABP4.getSelectedItem().toString());
                rs = PS.executeQuery();
                if (rs.next()) {
                    Daño = rs.getInt("Daño_Adic");
                    Num = rs.getInt("id_Armas");
                }
                PS = con.prepareStatement("SELECT a.Daño_Adic, a.id_Armas"
                        + " from Armas A where a.Nombre = ?");
                PS.setString(1, AP4.getSelectedItem().toString());
                rs = PS.executeQuery();
                if (rs.next()) {
                    Daño = rs.getInt("Daño_Adic");
                    Num = rs.getInt("id_Armas");
                } else {
                }
                Random = 0; // 1-2
                Random = (int) (Math.random() * 2); //0 a 1 
                if (Random == 1) {
                    JOptionPane.showMessageDialog(null, "Le has dado al enemigo");
                    if (Num <= 15) {
                        Random2 = 0; // 1-2
                        Random2 = (int) (Math.random() * 50 + 1); //0 a 1 
                        Daño = Daño + Random2;
                        if (CB.isSelected()) {
                            Dato = jProgressBar1.getValue();
                            jProgressBar1.setValue(Dato - Daño);
                        } else if (CB2.isSelected()) {
                            Dato = jProgressBar2.getValue();
                            jProgressBar2.setValue(Dato - Daño);
                        } else if (CB3.isSelected()) {
                            Dato = jProgressBar3.getValue();
                            jProgressBar3.setValue(Dato - Daño);
                        } else if (CB4.isSelected()) {
                            Dato = jProgressBar4.getValue();
                            jProgressBar4.setValue(Dato - Daño);
                        } else if (CB5.isSelected()) {
                            Dato = jProgressBar5.getValue();
                            jProgressBar5.setValue(Dato - Daño);
                        } else if (CB6.isSelected()) {
                            Dato = jProgressBar6.getValue();
                            jProgressBar6.setValue(Dato - Daño);
                        }
                    } else {
                        Random2 = 0; // 1-2
                        Random2 = (int) (Math.random() * 30 + 1); //0 a 1 
                        Daño = Daño + Random2;
                        if (CB.isSelected()) {
                            Dato = jProgressBar1.getValue();
                            jProgressBar1.setValue(Dato - Daño);
                        } else if (CB2.isSelected()) {
                            Dato = jProgressBar2.getValue();
                            jProgressBar2.setValue(Dato - Daño);
                        } else if (CB3.isSelected()) {
                            Dato = jProgressBar3.getValue();
                            jProgressBar3.setValue(Dato - Daño);
                        } else if (CB4.isSelected()) {
                            Dato = jProgressBar4.getValue();
                            jProgressBar4.setValue(Dato - Daño);
                        } else if (CB5.isSelected()) {
                            Dato = jProgressBar5.getValue();
                            jProgressBar5.setValue(Dato - Daño);
                        } else if (CB6.isSelected()) {
                            Dato = jProgressBar6.getValue();
                            jProgressBar6.setValue(Dato - Daño);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Has fallado");
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_Atacar2ActionPerformed

    private void Atacar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atacar3ActionPerformed
          Connection con = null;
        ResultSet rs = null;
        int Daño = 0;
        String AB = ABP2.getSelectedItem().toString();
        String AP = AP2.getSelectedItem().toString();
        int Random;
        int Random2;
        int Dato;
        int Num = 0;

        if ((!"Nada".equals(AP)) && (!"Nada".equals(AB))) {
            JOptionPane.showMessageDialog(null, "No puede Selecionar ambas armas para atacar");
        } else if (("Nada".equals(AB)) && ("Nada".equals(AP))) {
            Random = 0; // 1-2
            Random = (int) (Math.random() * 2); //0 a 1 
            if (Random == 1) {
                JOptionPane.showMessageDialog(null, "Le has dado al enemigo");
                if (CB.isSelected()) {
                    Dato = jProgressBar1.getValue();
                    jProgressBar1.setValue(Dato - 10);
                } else if (CB2.isSelected()) {
                    Dato = jProgressBar2.getValue();
                    jProgressBar2.setValue(Dato - 10);
                } else if (CB3.isSelected()) {
                    Dato = jProgressBar3.getValue();
                    jProgressBar3.setValue(Dato - 10);
                } else if (CB4.isSelected()) {
                    Dato = jProgressBar4.getValue();
                    jProgressBar4.setValue(Dato - 10);
                } else if (CB5.isSelected()) {
                    Dato = jProgressBar5.getValue();
                    jProgressBar5.setValue(Dato - 10);
                } else if (CB6.isSelected()) {
                    Dato = jProgressBar6.getValue();
                    jProgressBar6.setValue(Dato - 10);
                } else {
                    Dato = jProgressBar1.getValue();
                    jProgressBar1.setValue(Dato - 10);
                    Dato = jProgressBar2.getValue();
                    jProgressBar2.setValue(Dato - 10);
                    Dato = jProgressBar3.getValue();
                    jProgressBar3.setValue(Dato - 10);
                    Dato = jProgressBar4.getValue();
                    jProgressBar4.setValue(Dato - 10);
                    Dato = jProgressBar5.getValue();
                    jProgressBar5.setValue(Dato - 10);
                    Dato = jProgressBar6.getValue();
                    jProgressBar6.setValue(Dato - 10);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Has fallado");
            }
        } else {
            try {
                con = getConecction();
                PS = con.prepareStatement("SELECT a.Daño_Adic, a.id_Armas"
                        + " from Armas A where a.Nombre = ?");
                PS.setString(1, ABP4.getSelectedItem().toString());
                rs = PS.executeQuery();
                if (rs.next()) {
                    Daño = rs.getInt("Daño_Adic");
                    Num = rs.getInt("id_Armas");
                }
                PS = con.prepareStatement("SELECT a.Daño_Adic, a.id_Armas"
                        + " from Armas A where a.Nombre = ?");
                PS.setString(1, AP4.getSelectedItem().toString());
                rs = PS.executeQuery();
                if (rs.next()) {
                    Daño = rs.getInt("Daño_Adic");
                    Num = rs.getInt("id_Armas");
                } else {
                }
                Random = 0; // 1-2
                Random = (int) (Math.random() * 2); //0 a 1 
                if (Random == 1) {
                    JOptionPane.showMessageDialog(null, "Le has dado al enemigo");
                    if (Num <= 15) {
                        Random2 = 0; // 1-2
                        Random2 = (int) (Math.random() * 50 + 1); //0 a 1 
                        Daño = Daño + Random2;
                        if (CB.isSelected()) {
                            Dato = jProgressBar1.getValue();
                            jProgressBar1.setValue(Dato - Daño);
                        } else if (CB2.isSelected()) {
                            Dato = jProgressBar2.getValue();
                            jProgressBar2.setValue(Dato - Daño);
                        } else if (CB3.isSelected()) {
                            Dato = jProgressBar3.getValue();
                            jProgressBar3.setValue(Dato - Daño);
                        } else if (CB4.isSelected()) {
                            Dato = jProgressBar4.getValue();
                            jProgressBar4.setValue(Dato - Daño);
                        } else if (CB5.isSelected()) {
                            Dato = jProgressBar5.getValue();
                            jProgressBar5.setValue(Dato - Daño);
                        } else if (CB6.isSelected()) {
                            Dato = jProgressBar6.getValue();
                            jProgressBar6.setValue(Dato - Daño);
                        }
                    } else {
                        Random2 = 0; // 1-2
                        Random2 = (int) (Math.random() * 30 + 1); //0 a 1 
                        Daño = Daño + Random2;
                        if (CB.isSelected()) {
                            Dato = jProgressBar1.getValue();
                            jProgressBar1.setValue(Dato - Daño);
                        } else if (CB2.isSelected()) {
                            Dato = jProgressBar2.getValue();
                            jProgressBar2.setValue(Dato - Daño);
                        } else if (CB3.isSelected()) {
                            Dato = jProgressBar3.getValue();
                            jProgressBar3.setValue(Dato - Daño);
                        } else if (CB4.isSelected()) {
                            Dato = jProgressBar4.getValue();
                            jProgressBar4.setValue(Dato - Daño);
                        } else if (CB5.isSelected()) {
                            Dato = jProgressBar5.getValue();
                            jProgressBar5.setValue(Dato - Daño);
                        } else if (CB6.isSelected()) {
                            Dato = jProgressBar6.getValue();
                            jProgressBar6.setValue(Dato - Daño);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Has fallado");
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_Atacar3ActionPerformed

    private void Atacar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atacar4ActionPerformed
          Connection con = null;
        ResultSet rs = null;
        int Daño = 0;
        String AB = ABP1.getSelectedItem().toString();
        String AP = AP1.getSelectedItem().toString();
        int Random;
        int Random2;
        int Dato;
        int Num = 0;

        if ((!"Nada".equals(AP)) && (!"Nada".equals(AB))) {
            JOptionPane.showMessageDialog(null, "No puede Selecionar ambas armas para atacar");
        } else if (("Nada".equals(AB)) && ("Nada".equals(AP))) {
            Random = 0; // 1-2
            Random = (int) (Math.random() * 2); //0 a 1 
            if (Random == 1) {
                JOptionPane.showMessageDialog(null, "Le has dado al enemigo");
                if (CB.isSelected()) {
                    Dato = jProgressBar1.getValue();
                    jProgressBar1.setValue(Dato - 10);
                } else if (CB2.isSelected()) {
                    Dato = jProgressBar2.getValue();
                    jProgressBar2.setValue(Dato - 10);
                } else if (CB3.isSelected()) {
                    Dato = jProgressBar3.getValue();
                    jProgressBar3.setValue(Dato - 10);
                } else if (CB4.isSelected()) {
                    Dato = jProgressBar4.getValue();
                    jProgressBar4.setValue(Dato - 10);
                } else if (CB5.isSelected()) {
                    Dato = jProgressBar5.getValue();
                    jProgressBar5.setValue(Dato - 10);
                } else if (CB6.isSelected()) {
                    Dato = jProgressBar6.getValue();
                    jProgressBar6.setValue(Dato - 10);
                } else {
                    Dato = jProgressBar1.getValue();
                    jProgressBar1.setValue(Dato - 10);
                    Dato = jProgressBar2.getValue();
                    jProgressBar2.setValue(Dato - 10);
                    Dato = jProgressBar3.getValue();
                    jProgressBar3.setValue(Dato - 10);
                    Dato = jProgressBar4.getValue();
                    jProgressBar4.setValue(Dato - 10);
                    Dato = jProgressBar5.getValue();
                    jProgressBar5.setValue(Dato - 10);
                    Dato = jProgressBar6.getValue();
                    jProgressBar6.setValue(Dato - 10);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Has fallado");
            }
        } else {
            try {
                con = getConecction();
                PS = con.prepareStatement("SELECT a.Daño_Adic, a.id_Armas"
                        + " from Armas A where a.Nombre = ?");
                PS.setString(1, ABP4.getSelectedItem().toString());
                rs = PS.executeQuery();
                if (rs.next()) {
                    Daño = rs.getInt("Daño_Adic");
                    Num = rs.getInt("id_Armas");
                }
                PS = con.prepareStatement("SELECT a.Daño_Adic, a.id_Armas"
                        + " from Armas A where a.Nombre = ?");
                PS.setString(1, AP4.getSelectedItem().toString());
                rs = PS.executeQuery();
                if (rs.next()) {
                    Daño = rs.getInt("Daño_Adic");
                    Num = rs.getInt("id_Armas");
                } else {
                }
                Random = 0; // 1-2
                Random = (int) (Math.random() * 2); //0 a 1 
                if (Random == 1) {
                    JOptionPane.showMessageDialog(null, "Le has dado al enemigo");
                    if (Num <= 15) {
                        Random2 = 0; // 1-2
                        Random2 = (int) (Math.random() * 50 + 1); //0 a 1 
                        Daño = Daño + Random2;
                        if (CB.isSelected()) {
                            Dato = jProgressBar1.getValue();
                            jProgressBar1.setValue(Dato - Daño);
                        } else if (CB2.isSelected()) {
                            Dato = jProgressBar2.getValue();
                            jProgressBar2.setValue(Dato - Daño);
                        } else if (CB3.isSelected()) {
                            Dato = jProgressBar3.getValue();
                            jProgressBar3.setValue(Dato - Daño);
                        } else if (CB4.isSelected()) {
                            Dato = jProgressBar4.getValue();
                            jProgressBar4.setValue(Dato - Daño);
                        } else if (CB5.isSelected()) {
                            Dato = jProgressBar5.getValue();
                            jProgressBar5.setValue(Dato - Daño);
                        } else if (CB6.isSelected()) {
                            Dato = jProgressBar6.getValue();
                            jProgressBar6.setValue(Dato - Daño);
                        }
                    } else {
                        Random2 = 0; // 1-2
                        Random2 = (int) (Math.random() * 30 + 1); //0 a 1 
                        Daño = Daño + Random2;
                        if (CB.isSelected()) {
                            Dato = jProgressBar1.getValue();
                            jProgressBar1.setValue(Dato - Daño);
                        } else if (CB2.isSelected()) {
                            Dato = jProgressBar2.getValue();
                            jProgressBar2.setValue(Dato - Daño);
                        } else if (CB3.isSelected()) {
                            Dato = jProgressBar3.getValue();
                            jProgressBar3.setValue(Dato - Daño);
                        } else if (CB4.isSelected()) {
                            Dato = jProgressBar4.getValue();
                            jProgressBar4.setValue(Dato - Daño);
                        } else if (CB5.isSelected()) {
                            Dato = jProgressBar5.getValue();
                            jProgressBar5.setValue(Dato - Daño);
                        } else if (CB6.isSelected()) {
                            Dato = jProgressBar6.getValue();
                            jProgressBar6.setValue(Dato - Daño);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Has fallado");
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_Atacar4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String D;
        D = JCB.getSelectedItem().toString();
        if("Facil".equals(D)){
            
        jProgressBar7.setVisible(false); jProgressBar8.setVisible(false); jProgressBar9.setVisible(false);
        jProgressBar10.setVisible(false); jProgressBar11.setVisible(false); jProgressBar12.setVisible(false);
        jProgressBar13.setVisible(false); jProgressBar14.setVisible(false); jProgressBar15.setVisible(false);
        jProgressBar16.setVisible(false); jProgressBar17.setVisible(false); jProgressBar18.setVisible(false);
        jProgressBar19.setVisible(false); jProgressBar20.setVisible(false); jProgressBar21.setVisible(false);
        jProgressBar22.setVisible(false); jProgressBar23.setVisible(false); jProgressBar24.setVisible(false);
        jProgressBar25.setVisible(false); jProgressBar26.setVisible(false); CB7.setVisible(false);
        CB8.setVisible(false); CB9.setVisible(false); CB10.setVisible(false); CB11.setVisible(false);
        CB12.setVisible(false); CB13.setVisible(false); CB14.setVisible(false); CB15.setVisible(false);
        CB16.setVisible(false); CB17.setVisible(false); CB18.setVisible(false); CB19.setVisible(false);
        CB20.setVisible(false); CB21.setVisible(false); CB22.setVisible(false); CB23.setVisible(false);
        CB24.setVisible(false); CB25.setVisible(false); CB26.setVisible(false);
        } else if ("Normal".equals(D)){
            
        jProgressBar7.setVisible(true); jProgressBar8.setVisible(true); jProgressBar9.setVisible(true);
        jProgressBar10.setVisible(true); jProgressBar11.setVisible(true); jProgressBar12.setVisible(true);
        jProgressBar13.setVisible(false); jProgressBar14.setVisible(false); jProgressBar15.setVisible(false);
        jProgressBar16.setVisible(false); jProgressBar17.setVisible(false); jProgressBar18.setVisible(false);
        jProgressBar19.setVisible(false); jProgressBar20.setVisible(false); jProgressBar21.setVisible(false);
        jProgressBar22.setVisible(false); jProgressBar23.setVisible(false); jProgressBar24.setVisible(false);
        jProgressBar25.setVisible(false); jProgressBar26.setVisible(false); CB7.setVisible(true);
        CB8.setVisible(true); CB9.setVisible(true); CB10.setVisible(true); CB11.setVisible(true);
        CB12.setVisible(true); CB13.setVisible(false); CB14.setVisible(false); CB15.setVisible(false);
        CB16.setVisible(false); CB17.setVisible(false); CB18.setVisible(false); CB19.setVisible(false);
        CB20.setVisible(false); CB21.setVisible(false); CB22.setVisible(false); CB23.setVisible(false);
        CB24.setVisible(false); CB25.setVisible(false); CB26.setVisible(false);
        
        } else if("Dificil".equals(D)) {
            
        jProgressBar7.setVisible(true); jProgressBar8.setVisible(true); jProgressBar9.setVisible(true);
        jProgressBar10.setVisible(true); jProgressBar11.setVisible(true); jProgressBar12.setVisible(true);
        jProgressBar13.setVisible(true); jProgressBar14.setVisible(true); jProgressBar15.setVisible(true);
        jProgressBar16.setVisible(true); jProgressBar17.setVisible(true); jProgressBar18.setVisible(true);
        jProgressBar19.setVisible(false); jProgressBar20.setVisible(false); jProgressBar21.setVisible(false);
        jProgressBar22.setVisible(false); jProgressBar23.setVisible(false); jProgressBar24.setVisible(false);
        jProgressBar25.setVisible(false); jProgressBar26.setVisible(false); CB7.setVisible(true);
        CB8.setVisible(true); CB9.setVisible(true); CB10.setVisible(true); CB11.setVisible(true);
        CB12.setVisible(true); CB13.setVisible(true); CB14.setVisible(true); CB15.setVisible(true);
        CB16.setVisible(true); CB17.setVisible(true); CB18.setVisible(true); CB19.setVisible(false);
        CB20.setVisible(false); CB21.setVisible(false); CB22.setVisible(false); CB23.setVisible(false);
        CB24.setVisible(false); CB25.setVisible(false); CB26.setVisible(false);
        } else if("Imposible".equals(D)) {
            
        jProgressBar7.setVisible(true); jProgressBar8.setVisible(true); jProgressBar9.setVisible(true);
        jProgressBar10.setVisible(true); jProgressBar11.setVisible(true); jProgressBar12.setVisible(true);
        jProgressBar13.setVisible(true); jProgressBar14.setVisible(true); jProgressBar15.setVisible(true);
        jProgressBar16.setVisible(true); jProgressBar17.setVisible(true); jProgressBar18.setVisible(true);
        jProgressBar19.setVisible(true); jProgressBar20.setVisible(true); jProgressBar21.setVisible(true);
        jProgressBar22.setVisible(true); jProgressBar23.setVisible(true); jProgressBar24.setVisible(true);
        jProgressBar25.setVisible(true); jProgressBar26.setVisible(true); CB7.setVisible(true);
        CB8.setVisible(true); CB9.setVisible(true); CB10.setVisible(true); CB11.setVisible(true);
        CB12.setVisible(true); CB13.setVisible(true); CB14.setVisible(true); CB15.setVisible(true);
        CB16.setVisible(true); CB17.setVisible(true); CB18.setVisible(true); CB19.setVisible(true);
        CB20.setVisible(true); CB21.setVisible(true); CB22.setVisible(true); CB23.setVisible(true);
        CB24.setVisible(true); CB25.setVisible(true); CB26.setVisible(true);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Combates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Combates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Combates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Combates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Combates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ABP1;
    private javax.swing.JComboBox<String> ABP2;
    private javax.swing.JComboBox<String> ABP3;
    private javax.swing.JComboBox<String> ABP4;
    private javax.swing.JComboBox<String> AP1;
    private javax.swing.JComboBox<String> AP2;
    private javax.swing.JComboBox<String> AP3;
    private javax.swing.JComboBox<String> AP4;
    private javax.swing.JButton Atacar1;
    private javax.swing.JButton Atacar2;
    private javax.swing.JButton Atacar3;
    private javax.swing.JButton Atacar4;
    private javax.swing.JCheckBox CB;
    private javax.swing.JCheckBox CB10;
    private javax.swing.JCheckBox CB11;
    private javax.swing.JCheckBox CB12;
    private javax.swing.JCheckBox CB13;
    private javax.swing.JCheckBox CB14;
    private javax.swing.JCheckBox CB15;
    private javax.swing.JCheckBox CB16;
    private javax.swing.JCheckBox CB17;
    private javax.swing.JCheckBox CB18;
    private javax.swing.JCheckBox CB19;
    private javax.swing.JCheckBox CB2;
    private javax.swing.JCheckBox CB20;
    private javax.swing.JCheckBox CB21;
    private javax.swing.JCheckBox CB22;
    private javax.swing.JCheckBox CB23;
    private javax.swing.JCheckBox CB24;
    private javax.swing.JCheckBox CB25;
    private javax.swing.JCheckBox CB26;
    private javax.swing.JCheckBox CB3;
    private javax.swing.JCheckBox CB4;
    private javax.swing.JCheckBox CB5;
    private javax.swing.JCheckBox CB6;
    private javax.swing.JCheckBox CB7;
    private javax.swing.JCheckBox CB8;
    private javax.swing.JCheckBox CB9;
    private javax.swing.JLabel Fondo;
    private javax.swing.JComboBox<String> JCB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar10;
    private javax.swing.JProgressBar jProgressBar11;
    private javax.swing.JProgressBar jProgressBar12;
    private javax.swing.JProgressBar jProgressBar13;
    private javax.swing.JProgressBar jProgressBar14;
    private javax.swing.JProgressBar jProgressBar15;
    private javax.swing.JProgressBar jProgressBar16;
    private javax.swing.JProgressBar jProgressBar17;
    private javax.swing.JProgressBar jProgressBar18;
    private javax.swing.JProgressBar jProgressBar19;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar20;
    private javax.swing.JProgressBar jProgressBar21;
    private javax.swing.JProgressBar jProgressBar22;
    private javax.swing.JProgressBar jProgressBar23;
    private javax.swing.JProgressBar jProgressBar24;
    private javax.swing.JProgressBar jProgressBar25;
    private javax.swing.JProgressBar jProgressBar26;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar5;
    private javax.swing.JProgressBar jProgressBar6;
    private javax.swing.JProgressBar jProgressBar7;
    private javax.swing.JProgressBar jProgressBar8;
    private javax.swing.JProgressBar jProgressBar9;
    // End of variables declaration//GEN-END:variables
}
