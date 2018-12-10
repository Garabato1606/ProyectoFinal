/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombie.world;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Garabato
 */
public class CrearPersonaje2 extends javax.swing.JFrame {
    
      //conexion a mysql
    
    public static final String URL = "jdbc:mysql://localhost:3306/zombieworld?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";
       PreparedStatement PS;

    /*hacer el cursos diferente*/
    Cursor cursor;
    ImageIcon img = new ImageIcon(getClass().getResource("/imagenes/EspadaImperial.png"));
    Toolkit TK = Toolkit.getDefaultToolkit();

    public CrearPersonaje2() {
          //Cambiar icono
         this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/mano.png")).getImage());
        initComponents();
        /*parte del cursor diferente*/
        this.cursor = TK.createCustomCursor(img.getImage(), new Point(1, 1), "Cursor");
        this.setCursor(cursor);
        this.setLocationRelativeTo(null);//centrar ventanas 

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo = new javax.swing.ButtonGroup();
        Grupo2 = new javax.swing.ButtonGroup();
        Grupo3 = new javax.swing.ButtonGroup();
        Grupo4 = new javax.swing.ButtonGroup();
        Grupo5 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CBx = new javax.swing.JComboBox<>();
        CB2 = new javax.swing.JCheckBox();
        CB3 = new javax.swing.JCheckBox();
        CB = new javax.swing.JCheckBox();
        CB4 = new javax.swing.JCheckBox();
        CB8 = new javax.swing.JCheckBox();
        CB7 = new javax.swing.JCheckBox();
        CB10 = new javax.swing.JCheckBox();
        CB13 = new javax.swing.JCheckBox();
        CB11 = new javax.swing.JCheckBox();
        CB14 = new javax.swing.JCheckBox();
        CB6 = new javax.swing.JCheckBox();
        CB9 = new javax.swing.JCheckBox();
        CB12 = new javax.swing.JCheckBox();
        CB15 = new javax.swing.JCheckBox();
        CB5 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        RB2 = new javax.swing.JRadioButton();
        RB3 = new javax.swing.JRadioButton();
        RB4 = new javax.swing.JRadioButton();
        RB5 = new javax.swing.JRadioButton();
        RB6 = new javax.swing.JRadioButton();
        RB7 = new javax.swing.JRadioButton();
        RB8 = new javax.swing.JRadioButton();
        RB11 = new javax.swing.JRadioButton();
        RB9 = new javax.swing.JRadioButton();
        RB10 = new javax.swing.JRadioButton();
        RB = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Txtf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Caracteristicas del Personaje");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 350, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Profesion:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 70, 20));

        CBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abogado", "Actor/Actriz", "Administrador", "Agricultor", "Albañil", "Ama de casa", "Animador", "Arqueologo/a", "Arquitecto", "Bailarin", "Bibliotecario", "Bombero", "Cantante", "Carpintero", "Cocinero(Chef)", "Criminologia(Detective)", "Delincuente", "Deportista", "Electricista", "Enfermera/o", "Entrenador de animales", "Escritor", "Estilista", "Fontanero", "Fotografo", "Guardia Foresta", "Ingeniero", "Jardinero", "Locutor", "Maestro", "Mecanico", "Medico(Doctor)", "Mesero", "Militar", "Modelo", "Periodista", "Pintor", "Policia", "Quimico", "Secretaria/o", "Tecnico", "Traductor e Interpretacion", "Veterinario" }));
        CBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBxActionPerformed(evt);
            }
        });
        getContentPane().add(CBx, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 180, -1));

        Grupo.add(CB2);
        CB2.setForeground(new java.awt.Color(255, 255, 255));
        CB2.setText("Fuerte");
        getContentPane().add(CB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        Grupo.add(CB3);
        CB3.setForeground(new java.awt.Color(255, 255, 255));
        CB3.setText("Agil/Veloz");
        getContentPane().add(CB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        Grupo.add(CB);
        CB.setForeground(new java.awt.Color(255, 255, 255));
        CB.setText("Inteligente");
        getContentPane().add(CB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        Grupo2.add(CB4);
        CB4.setForeground(new java.awt.Color(255, 255, 255));
        CB4.setText("Reflejos");
        getContentPane().add(CB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        Grupo3.add(CB8);
        CB8.setForeground(new java.awt.Color(255, 255, 255));
        CB8.setText("Empatico");
        getContentPane().add(CB8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        Grupo3.add(CB7);
        CB7.setForeground(new java.awt.Color(255, 255, 255));
        CB7.setText("Valiente");
        getContentPane().add(CB7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        Grupo4.add(CB10);
        CB10.setForeground(new java.awt.Color(255, 255, 255));
        CB10.setText("Artes Marciales");
        getContentPane().add(CB10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        Grupo5.add(CB13);
        CB13.setForeground(new java.awt.Color(255, 255, 255));
        CB13.setText("Paciente");
        getContentPane().add(CB13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        Grupo4.add(CB11);
        CB11.setForeground(new java.awt.Color(255, 255, 255));
        CB11.setText("Corpulento");
        getContentPane().add(CB11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        Grupo5.add(CB14);
        CB14.setForeground(new java.awt.Color(255, 255, 255));
        CB14.setText("Bromista");
        getContentPane().add(CB14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        Grupo2.add(CB6);
        CB6.setForeground(new java.awt.Color(255, 255, 255));
        CB6.setText("Lider");
        getContentPane().add(CB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        Grupo3.add(CB9);
        CB9.setForeground(new java.awt.Color(255, 255, 255));
        CB9.setText("Confiado");
        getContentPane().add(CB9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        Grupo4.add(CB12);
        CB12.setForeground(new java.awt.Color(255, 255, 255));
        CB12.setText("Instinto de Supervivencia");
        getContentPane().add(CB12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        Grupo5.add(CB15);
        CB15.setForeground(new java.awt.Color(255, 255, 255));
        CB15.setText("Tirador Experto");
        getContentPane().add(CB15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        Grupo2.add(CB5);
        CB5.setForeground(new java.awt.Color(255, 255, 255));
        CB5.setText("Suerte");
        getContentPane().add(CB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Nota .- La profesion te beneficiara o perjudicara ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 440, -1));

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Idiomas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 70, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rasgos :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Nota.- Una por renglon");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 180, -1));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        RB2.setForeground(new java.awt.Color(255, 255, 255));
        RB2.setText("Español");
        getContentPane().add(RB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        RB3.setForeground(new java.awt.Color(255, 255, 255));
        RB3.setText("Francés");
        getContentPane().add(RB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, -1, -1));

        RB4.setText("Mandarín");
        getContentPane().add(RB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        RB5.setForeground(new java.awt.Color(255, 255, 255));
        RB5.setText("Árabe");
        getContentPane().add(RB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, -1));

        RB6.setForeground(new java.awt.Color(255, 255, 255));
        RB6.setText("Portugués");
        getContentPane().add(RB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, -1));

        RB7.setForeground(new java.awt.Color(255, 255, 255));
        RB7.setText("Ruso");
        getContentPane().add(RB7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        RB8.setForeground(new java.awt.Color(255, 255, 255));
        RB8.setText("Aléman");
        getContentPane().add(RB8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        RB11.setForeground(new java.awt.Color(255, 255, 255));
        RB11.setText("Hindustaní");
        getContentPane().add(RB11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        RB9.setForeground(new java.awt.Color(255, 255, 255));
        RB9.setText("Indonesio");
        RB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB9ActionPerformed(evt);
            }
        });
        getContentPane().add(RB9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, -1));

        RB10.setForeground(new java.awt.Color(255, 255, 255));
        RB10.setText("Italiano");
        RB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB10ActionPerformed(evt);
            }
        });
        getContentPane().add(RB10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, 20));

        RB.setText("Inglés");
        RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBActionPerformed(evt);
            }
        });
        getContentPane().add(RB, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        jButton2.setText("Listo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 60, 20));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Clave");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 40, -1));

        Txtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtfKeyPressed(evt);
            }
        });
        getContentPane().add(Txtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 100, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String hola[] = new String[5];
        if (CB.isSelected()) {
            hola[0] = CB.getText();
        } else if (CB2.isSelected()) {
            hola[0] = CB2.getText();
        } else {
            hola[0] = CB3.getText();
        }
        if (CB4.isSelected()) {
            hola[1] = CB4.getText();
        } else if (CB5.isSelected()) {
            hola[1] = CB5.getText();
        } else {
            hola[1] = CB6.getText();
        }
        if (CB7.isSelected()) {
            hola[2] = CB7.getText();
        } else if (CB8.isSelected()) {
            hola[2] = CB8.getText();
        } else {
            hola[2] = CB9.getText();
        }
        if (CB10.isSelected()) {
            hola[3] = CB10.getText();
        } else if (CB11.isSelected()) {
            hola[3] = CB11.getText();
        } else {
            hola[3] = CB12.getText();
        }
        if (CB13.isSelected()) {
            hola[4] = CB13.getText();
        } else if (CB14.isSelected()) {
            hola[4] = CB14.getText();
        } else {
            hola[4] = CB15.getText();
        }
        String Idiomas[] = new String[12];
        if (RB.isSelected()) {
            Idiomas[0] = RB.getText();
        } else {
            Idiomas[0] = "";
        }
        if (RB2.isSelected()) {
            Idiomas[1] = RB2.getText();
        } else {
            Idiomas[1] = "";
        }
        if (RB3.isSelected()) {
            Idiomas[2] = RB3.getText();
        } else {
            Idiomas[2] = "";
        }
        if (RB4.isSelected()) {
            Idiomas[3] = RB4.getText();
        } else {
            Idiomas[3] = "";
        }
        if (RB5.isSelected()) {
            Idiomas[4] = RB5.getText();
        } else {
            Idiomas[4] = "";
        }
        if (RB6.isSelected()) {
            Idiomas[5] = RB6.getText();
        } else {
            Idiomas[5] = "";
        }
        if (RB7.isSelected()) {
            Idiomas[6] = RB7.getText();
        } else {
            Idiomas[6] = "";
        }
        if (RB8.isSelected()) {
            Idiomas[7] = RB8.getText();
        } else {
            Idiomas[7] = "";
        }
        if (RB9.isSelected()) {
            Idiomas[8] = RB9.getText();
        } else {
            Idiomas[8] = "";
        }
        if (RB10.isSelected()) {
            Idiomas[9] = RB10.getText();
        } else {
            Idiomas[9] = "";
        }
        if (RB11.isSelected()) {
            Idiomas[10] = RB11.getText();
        } else {
            Idiomas[10] = "";
        }
         Connection con = null;
        try{
            
            con = getConecction();
   
         
            
PS = con.prepareStatement("Insert into Personaje_2(id_personaje,Profesion,Rasgo1,Rasgo2,"
        + "Rasgo3,Rasgo4,Rasgo5,Idioma) Values(?,?,?,?,?,?,?,?) ");
        PS.setInt(1, Integer.parseInt(Txtf.getText()));
        PS.setString(2, CBx.getSelectedItem().toString());
        PS.setString(3, hola[0]);
        PS.setString(4, hola[1]);
        PS.setString(5, hola[2]);
        PS.setString(6, hola[3]);
        PS.setString(7, hola[4]);
        PS.setString(8, Idiomas[0]+Idiomas[1]+Idiomas[2]+Idiomas[3]+Idiomas[4]+Idiomas[5]+Idiomas[6]+
                Idiomas[7]+Idiomas[8]+Idiomas[9]+Idiomas[10]); //error
            
        int Res = PS.executeUpdate();
        
        if (Res>0){
        JOptionPane.showMessageDialog(null, "Personaje Guardado");
        LimpiarCajas();
        }else {
        JOptionPane.showMessageDialog(null, "Error al Guardadar Personaje");
        LimpiarCajas();
        }
            
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
         JOptionPane.showMessageDialog(null, "Error al Guardadar Personaje");
         JOptionPane.showMessageDialog(null, "Debe existir ya el Personaje");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static Connection getConecction() {
        Connection con = null;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = (Connection) DriverManager.getConnection(URL,USERNAME,PASSWORD);
        
        }
        
        catch(Exception ex){
            System.out.println(ex);
        }
        return con;
    }
     private void LimpiarCajas(){
    Txtf.setText("");
    CBx.setSelectedIndex(0);
    RB.setSelected(false);  RB2.setSelected(false); RB3.setSelected(false);
    RB4.setSelected(false); RB5.setSelected(false); RB6.setSelected(false);
    RB7.setSelected(false); RB8.setSelected(false); RB9.setSelected(false);
    RB10.setSelected(false); RB11.setSelected(false);
    }
    
    private void RB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RB9ActionPerformed

    private void RB10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RB10ActionPerformed

    private void RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Menu M = new Menu();
        M.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBxActionPerformed

    private void TxtfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtfKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtfKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CrearPersonaje CR = new CrearPersonaje();
        CR.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CrearPersonaje2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearPersonaje2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearPersonaje2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearPersonaje2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearPersonaje2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CB;
    private javax.swing.JCheckBox CB10;
    private javax.swing.JCheckBox CB11;
    private javax.swing.JCheckBox CB12;
    private javax.swing.JCheckBox CB13;
    private javax.swing.JCheckBox CB14;
    private javax.swing.JCheckBox CB15;
    private javax.swing.JCheckBox CB2;
    private javax.swing.JCheckBox CB3;
    private javax.swing.JCheckBox CB4;
    private javax.swing.JCheckBox CB5;
    private javax.swing.JCheckBox CB6;
    private javax.swing.JCheckBox CB7;
    private javax.swing.JCheckBox CB8;
    private javax.swing.JCheckBox CB9;
    private javax.swing.JComboBox<String> CBx;
    private javax.swing.ButtonGroup Grupo;
    private javax.swing.ButtonGroup Grupo2;
    private javax.swing.ButtonGroup Grupo3;
    private javax.swing.ButtonGroup Grupo4;
    private javax.swing.ButtonGroup Grupo5;
    private javax.swing.JRadioButton RB;
    private javax.swing.JRadioButton RB10;
    private javax.swing.JRadioButton RB11;
    private javax.swing.JRadioButton RB2;
    private javax.swing.JRadioButton RB3;
    private javax.swing.JRadioButton RB4;
    private javax.swing.JRadioButton RB5;
    private javax.swing.JRadioButton RB6;
    private javax.swing.JRadioButton RB7;
    private javax.swing.JRadioButton RB8;
    private javax.swing.JRadioButton RB9;
    private javax.swing.JTextField Txtf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
