/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombie.world;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static zombie.world.Informacion.getConecction;
import static zombie.world.Juego.PASSWORD;
import static zombie.world.Juego.URL;
import static zombie.world.Juego.USERNAME;
import static zombie.world.Juego.getConecction;

/**
 *
 * @author Garabato
 */
public class Level extends javax.swing.JFrame {

    //conexion a mysql
    public static final String URL = "jdbc:mysql://localhost:3306/zombieworld?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Level() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        //Cambiar icono
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/mano.png")).getImage());
        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/Bosque.jpg"));
        Icon Fondo = new ImageIcon(imagen.getImage().getScaledInstance(this.Fondo.getWidth(), this.Fondo.getHeight(), Image.SCALE_DEFAULT));
        this.Fondo.setIcon(Fondo);
        this.repaint();
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

        PBP1 = new javax.swing.JProgressBar();
        PBP2 = new javax.swing.JProgressBar();
        PBP3 = new javax.swing.JProgressBar();
        PBP4 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JBE1 = new javax.swing.JButton();
        JBE5 = new javax.swing.JButton();
        JBE10 = new javax.swing.JButton();
        JBE20 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        JBE2 = new javax.swing.JButton();
        JBE6 = new javax.swing.JButton();
        JBE11 = new javax.swing.JButton();
        JBE21 = new javax.swing.JButton();
        JBE3 = new javax.swing.JButton();
        JBE7 = new javax.swing.JButton();
        JBE12 = new javax.swing.JButton();
        JBE22 = new javax.swing.JButton();
        JBE4 = new javax.swing.JButton();
        JBE8 = new javax.swing.JButton();
        JBE13 = new javax.swing.JButton();
        JBE23 = new javax.swing.JButton();
        lblP1 = new javax.swing.JLabel();
        lblP2 = new javax.swing.JLabel();
        lblP3 = new javax.swing.JLabel();
        lblP4 = new javax.swing.JLabel();
        JCBP1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        JCBP2 = new javax.swing.JComboBox<>();
        JCBP3 = new javax.swing.JComboBox<>();
        JCBP4 = new javax.swing.JComboBox<>();
        TFP1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(PBP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 238, 22));
        getContentPane().add(PBP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 238, 22));
        getContentPane().add(PBP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 238, 22));
        getContentPane().add(PBP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 238, 22));

        jLabel1.setFont(new java.awt.Font("Juice ITC", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("Personaje 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Juice ITC", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Personaje 2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Juice ITC", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Personaje 3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        jLabel4.setFont(new java.awt.Font("Juice ITC", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Personaje 4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, -1));

        JBE1.setText("+1");
        JBE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE1ActionPerformed(evt);
            }
        });
        getContentPane().add(JBE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, -1, -1));

        JBE5.setText("+5");
        JBE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE5ActionPerformed(evt);
            }
        });
        getContentPane().add(JBE5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, -1, -1));

        JBE10.setText("+10");
        JBE10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE10ActionPerformed(evt);
            }
        });
        getContentPane().add(JBE10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, -1, -1));

        JBE20.setText("+20");
        JBE20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE20ActionPerformed(evt);
            }
        });
        getContentPane().add(JBE20, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Experiencia :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

        JBE2.setText("+1");
        JBE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE2ActionPerformed(evt);
            }
        });
        getContentPane().add(JBE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, -1, -1));

        JBE6.setText("+5");
        JBE6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE6ActionPerformed(evt);
            }
        });
        getContentPane().add(JBE6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, -1, -1));

        JBE11.setText("+10");
        JBE11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE11ActionPerformed(evt);
            }
        });
        getContentPane().add(JBE11, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, -1, -1));

        JBE21.setText("+20");
        JBE21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE21ActionPerformed(evt);
            }
        });
        getContentPane().add(JBE21, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 270, -1, -1));

        JBE3.setText("+1");
        JBE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE3ActionPerformed(evt);
            }
        });
        getContentPane().add(JBE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, -1, -1));

        JBE7.setText("+5");
        JBE7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE7ActionPerformed(evt);
            }
        });
        getContentPane().add(JBE7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, -1, -1));

        JBE12.setText("+10");
        JBE12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE12ActionPerformed(evt);
            }
        });
        getContentPane().add(JBE12, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, -1, -1));

        JBE22.setText("+20");
        JBE22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE22ActionPerformed(evt);
            }
        });
        getContentPane().add(JBE22, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 410, -1, -1));

        JBE4.setText("+1");
        JBE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE4ActionPerformed(evt);
            }
        });
        getContentPane().add(JBE4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, -1, -1));

        JBE8.setText("+5");
        JBE8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE8ActionPerformed(evt);
            }
        });
        getContentPane().add(JBE8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, -1, -1));

        JBE13.setText("+10");
        JBE13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE13ActionPerformed(evt);
            }
        });
        getContentPane().add(JBE13, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, -1, -1));

        JBE23.setText("+20");
        JBE23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE23ActionPerformed(evt);
            }
        });
        getContentPane().add(JBE23, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, -1, -1));

        lblP1.setFont(new java.awt.Font("Lato Black", 0, 18)); // NOI18N
        lblP1.setForeground(new java.awt.Color(0, 255, 0));
        lblP1.setText("Nivel 1");
        getContentPane().add(lblP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        lblP2.setFont(new java.awt.Font("Lato Black", 0, 18)); // NOI18N
        lblP2.setForeground(new java.awt.Color(204, 0, 0));
        lblP2.setText("Nivel 1");
        getContentPane().add(lblP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        lblP3.setFont(new java.awt.Font("Lato Black", 0, 18)); // NOI18N
        lblP3.setForeground(new java.awt.Color(255, 204, 0));
        lblP3.setText("Nivel 1");
        getContentPane().add(lblP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, -1, -1));

        lblP4.setFont(new java.awt.Font("Lato Black", 0, 18)); // NOI18N
        lblP4.setForeground(new java.awt.Color(0, 0, 255));
        lblP4.setText("Nivel 1");
        getContentPane().add(lblP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, -1, -1));

        JCBP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Combate", "Medica", "Quimica", "Saqueador", "Tecnica (Ingeniosa)", "Tirador" }));
        JCBP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBP1ActionPerformed(evt);
            }
        });
        getContentPane().add(JCBP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 255));
        jLabel6.setText("Habilidad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 110, -1, -1));

        JCBP2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Combate", "Medica", "Quimica", "Saqueador", "Tecnica (Ingeniosa)", "Tirador" }));
        JCBP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBP2ActionPerformed(evt);
            }
        });
        getContentPane().add(JCBP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 270, -1, -1));

        JCBP3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Combate", "Medica", "Quimica", "Saqueador", "Tecnica (Ingeniosa)", "Tirador" }));
        JCBP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBP3ActionPerformed(evt);
            }
        });
        getContentPane().add(JCBP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 410, -1, -1));

        JCBP4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Combate", "Medica", "Quimica", "Saqueador", "Tecnica (Ingeniosa)", "Tirador" }));
        JCBP4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBP4ActionPerformed(evt);
            }
        });
        getContentPane().add(JCBP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 560, -1, -1));
        getContentPane().add(TFP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 50, -1));

        jButton1.setText("Cargar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, -1, -1));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBE1ActionPerformed
        int aux;
        aux = PBP1.getValue();
        PBP1.setValue(aux + 1);

        int valor;
        valor = PBP1.getValue();
        if (valor == 100) {
            PBP1.setValue(100);
            PBP1.setMaximum(300);
            lblP1.setText("Nivel 2");
        } else if (valor == 300) {
            PBP1.setValue(300);
            PBP1.setMaximum(600);
            lblP1.setText("Nivel 3");
        } else if (valor == 600) {
            PBP1.setValue(600);
            PBP1.setMaximum(1000);
            lblP1.setText("Nivel 4");
        } else if (valor == 1000) {
            PBP1.setValue(1000);
            PBP1.setMaximum(1500);
            lblP1.setText("Nivel 5");
        } else if (valor == 1500) {
            PBP1.setValue(1500);
            PBP1.setMaximum(1500);
            lblP1.setText("Nivel 6");
            JOptionPane.showMessageDialog(null, "Nivel maximo alcanzado");
        }
    }//GEN-LAST:event_JBE1ActionPerformed

    private void JBE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBE5ActionPerformed
        int aux;
        aux = PBP1.getValue();
        PBP1.setValue(aux + 5);
        int valor;
        valor = PBP1.getValue();
        if (valor == 100) {
            PBP1.setValue(100);
            PBP1.setMaximum(300);
            lblP1.setText("Nivel 2");
        } else if (valor == 300) {
            PBP1.setValue(300);
            PBP1.setMaximum(600);
            lblP1.setText("Nivel 3");
        } else if (valor == 600) {
            PBP1.setValue(600);
            PBP1.setMaximum(1000);
            lblP1.setText("Nivel 4");
        } else if (valor == 1000) {
            PBP1.setValue(1000);
            PBP1.setMaximum(1500);
            lblP1.setText("Nivel 5");
        } else if (valor == 1500) {
            PBP1.setValue(1500);
            PBP1.setMaximum(1500);
            lblP1.setText("Nivel 6");
            JOptionPane.showMessageDialog(null, "Nivel maximo alcanzado");
        }
    }//GEN-LAST:event_JBE5ActionPerformed

    private void JBE10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBE10ActionPerformed
        int aux;
        aux = PBP1.getValue();
        PBP1.setValue(aux + 10);
        int valor;
        valor = PBP1.getValue();
        if (valor == 100) {
            PBP1.setValue(100);
            PBP1.setMaximum(300);
            lblP1.setText("Nivel 2");
        } else if (valor == 300) {
            PBP1.setValue(300);
            PBP1.setMaximum(600);
            lblP1.setText("Nivel 3");
        } else if (valor == 600) {
            PBP1.setValue(600);
            PBP1.setMaximum(1000);
            lblP1.setText("Nivel 4");
        } else if (valor == 1000) {
            PBP1.setValue(1000);
            PBP1.setMaximum(1500);
            lblP1.setText("Nivel 5");
        } else if (valor == 1500) {
            PBP1.setValue(1500);
            PBP1.setMaximum(1500);
            lblP1.setText("Nivel 6");
            JOptionPane.showMessageDialog(null, "Nivel maximo alcanzado");
        }
    }//GEN-LAST:event_JBE10ActionPerformed

    private void JBE20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBE20ActionPerformed
        int aux;
        aux = PBP1.getValue();
        PBP1.setValue(aux + 20);
        int valor;
        valor = PBP1.getValue();
        if (valor == 100) {
            PBP1.setValue(100);
            PBP1.setMaximum(300);
            lblP1.setText("Nivel 2");
        } else if (valor == 300) {
            PBP1.setValue(300);
            PBP1.setMaximum(600);
            lblP1.setText("Nivel 3");
        } else if (valor == 600) {
            PBP1.setValue(600);
            PBP1.setMaximum(1000);
            lblP1.setText("Nivel 4");
        } else if (valor == 1000) {
            PBP1.setValue(1000);
            PBP1.setMaximum(1500);
            lblP1.setText("Nivel 5");
        } else if (valor == 1500) {
            PBP1.setValue(1500);
            PBP1.setMaximum(1500);
            lblP1.setText("Nivel 6");
            JOptionPane.showMessageDialog(null, "Nivel maximo alcanzado");
        }
    }//GEN-LAST:event_JBE20ActionPerformed

    private void JBE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBE2ActionPerformed
        int aux;
        aux = PBP2.getValue();
        PBP2.setValue(aux + 1);
        int valor;
        valor = PBP2.getValue();
        if (valor == 100) {
            PBP2.setValue(100);
            PBP2.setMaximum(300);
            lblP2.setText("Nivel 2");
        } else if (valor == 300) {
            PBP2.setValue(300);
            PBP2.setMaximum(600);
            lblP2.setText("Nivel 3");
        } else if (valor == 600) {
            PBP2.setValue(600);
            PBP2.setMaximum(1000);
            lblP2.setText("Nivel 4");
        } else if (valor == 1000) {
            PBP2.setValue(1000);
            PBP2.setMaximum(1500);
            lblP2.setText("Nivel 5");
        } else if (valor == 1500) {
            PBP2.setValue(1500);
            PBP2.setMaximum(1500);
            lblP2.setText("Nivel 6");
            JOptionPane.showMessageDialog(null, "Nivel maximo alcanzado");
        }
    }//GEN-LAST:event_JBE2ActionPerformed

    private void JBE6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBE6ActionPerformed
        int aux;
        aux = PBP2.getValue();
        PBP2.setValue(aux + 5);
        int valor;
        valor = PBP2.getValue();
        if (valor == 100) {
            PBP2.setValue(100);
            PBP2.setMaximum(300);
            lblP2.setText("Nivel 2");
        } else if (valor == 300) {
            PBP2.setValue(300);
            PBP2.setMaximum(600);
            lblP2.setText("Nivel 3");
        } else if (valor == 600) {
            PBP2.setValue(600);
            PBP2.setMaximum(1000);
            lblP2.setText("Nivel 4");
        } else if (valor == 1000) {
            PBP2.setValue(1000);
            PBP2.setMaximum(1500);
            lblP2.setText("Nivel 5");
        } else if (valor == 1500) {
            PBP2.setValue(1500);
            PBP2.setMaximum(1500);
            lblP2.setText("Nivel 6");
            JOptionPane.showMessageDialog(null, "Nivel maximo alcanzado");
        }
    }//GEN-LAST:event_JBE6ActionPerformed

    private void JBE11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBE11ActionPerformed
        int aux;
        aux = PBP2.getValue();
        PBP2.setValue(aux + 10);
        int valor;
        valor = PBP2.getValue();
        if (valor == 100) {
            PBP2.setValue(100);
            PBP2.setMaximum(300);
            lblP2.setText("Nivel 2");
        } else if (valor == 300) {
            PBP2.setValue(300);
            PBP2.setMaximum(600);
            lblP2.setText("Nivel 3");
        } else if (valor == 600) {
            PBP2.setValue(600);
            PBP2.setMaximum(1000);
            lblP2.setText("Nivel 4");
        } else if (valor == 1000) {
            PBP2.setValue(1000);
            PBP2.setMaximum(1500);
            lblP2.setText("Nivel 5");
        } else if (valor == 1500) {
            PBP2.setValue(1500);
            PBP2.setMaximum(1500);
            lblP2.setText("Nivel 6");
            JOptionPane.showMessageDialog(null, "Nivel maximo alcanzado");
        }
    }//GEN-LAST:event_JBE11ActionPerformed

    private void JBE21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBE21ActionPerformed
        int aux;
        aux = PBP2.getValue();
        PBP2.setValue(aux + 20);
        int valor;
        valor = PBP2.getValue();
        if (valor == 100) {
            PBP2.setValue(100);
            PBP2.setMaximum(300);
            lblP2.setText("Nivel 2");
        } else if (valor == 300) {
            PBP2.setValue(300);
            PBP2.setMaximum(600);
            lblP2.setText("Nivel 3");
        } else if (valor == 600) {
            PBP2.setValue(600);
            PBP2.setMaximum(1000);
            lblP2.setText("Nivel 4");
        } else if (valor == 1000) {
            PBP2.setValue(1000);
            PBP2.setMaximum(1500);
            lblP2.setText("Nivel 5");
        } else if (valor == 1500) {
            PBP2.setValue(1500);
            PBP2.setMaximum(1500);
            lblP2.setText("Nivel 6");
            JOptionPane.showMessageDialog(null, "Nivel maximo alcanzado");
        }
    }//GEN-LAST:event_JBE21ActionPerformed

    private void JBE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBE3ActionPerformed
        int aux;
        aux = PBP3.getValue();
        PBP3.setValue(aux + 1);
        int valor;
        valor = PBP3.getValue();
        if (valor == 100) {
            PBP3.setValue(100);
            PBP3.setMaximum(300);
            lblP3.setText("Nivel 2");
        } else if (valor == 300) {
            PBP3.setValue(300);
            PBP3.setMaximum(600);
            lblP3.setText("Nivel 3");
        } else if (valor == 600) {
            PBP3.setValue(600);
            PBP3.setMaximum(1000);
            lblP3.setText("Nivel 4");
        } else if (valor == 1000) {
            PBP3.setValue(1000);
            PBP3.setMaximum(1500);
            lblP3.setText("Nivel 5");
        } else if (valor == 1500) {
            PBP3.setValue(1500);
            PBP3.setMaximum(1500);
            lblP3.setText("Nivel 6");
            JOptionPane.showMessageDialog(null, "Nivel maximo alcanzado");
        }
    }//GEN-LAST:event_JBE3ActionPerformed

    private void JBE7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBE7ActionPerformed
        int aux;
        aux = PBP3.getValue();
        PBP3.setValue(aux + 5);
        int valor;
        valor = PBP3.getValue();
        if (valor == 100) {
            PBP3.setValue(100);
            PBP3.setMaximum(300);
            lblP3.setText("Nivel 2");
        } else if (valor == 300) {
            PBP3.setValue(300);
            PBP3.setMaximum(600);
            lblP3.setText("Nivel 3");
        } else if (valor == 600) {
            PBP3.setValue(600);
            PBP3.setMaximum(1000);
            lblP3.setText("Nivel 4");
        } else if (valor == 1000) {
            PBP3.setValue(1000);
            PBP3.setMaximum(1500);
            lblP3.setText("Nivel 5");
        } else if (valor == 1500) {
            PBP3.setValue(1500);
            PBP3.setMaximum(1500);
            lblP3.setText("Nivel 6");
            JOptionPane.showMessageDialog(null, "Nivel maximo alcanzado");
        }
    }//GEN-LAST:event_JBE7ActionPerformed

    private void JBE12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBE12ActionPerformed
        int aux;
        aux = PBP3.getValue();
        PBP3.setValue(aux + 10);
        int valor;
        valor = PBP3.getValue();
        if (valor == 100) {
            PBP3.setValue(100);
            PBP3.setMaximum(300);
            lblP3.setText("Nivel 2");
        } else if (valor == 300) {
            PBP3.setValue(300);
            PBP3.setMaximum(600);
            lblP3.setText("Nivel 3");
        } else if (valor == 600) {
            PBP3.setValue(600);
            PBP3.setMaximum(1000);
            lblP3.setText("Nivel 4");
        } else if (valor == 1000) {
            PBP3.setValue(1000);
            PBP3.setMaximum(1500);
            lblP3.setText("Nivel 5");
        } else if (valor == 1500) {
            PBP3.setValue(1500);
            PBP3.setMaximum(1500);
            lblP3.setText("Nivel 6");
            JOptionPane.showMessageDialog(null, "Nivel maximo alcanzado");
        }
    }//GEN-LAST:event_JBE12ActionPerformed

    private void JBE22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBE22ActionPerformed
        int aux;
        aux = PBP3.getValue();
        PBP3.setValue(aux + 20);
        int valor;
        valor = PBP3.getValue();
        if (valor == 100) {
            PBP3.setValue(100);
            PBP3.setMaximum(300);
            lblP3.setText("Nivel 2");
        } else if (valor == 300) {
            PBP3.setValue(300);
            PBP3.setMaximum(600);
            lblP3.setText("Nivel 3");
        } else if (valor == 600) {
            PBP3.setValue(600);
            PBP3.setMaximum(1000);
            lblP3.setText("Nivel 4");
        } else if (valor == 1000) {
            PBP3.setValue(1000);
            PBP3.setMaximum(1500);
            lblP3.setText("Nivel 5");
        } else if (valor == 1500) {
            PBP3.setValue(1500);
            PBP3.setMaximum(1500);
            lblP3.setText("Nivel 6");
            JOptionPane.showMessageDialog(null, "Nivel maximo alcanzado");
        }
    }//GEN-LAST:event_JBE22ActionPerformed

    private void JBE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBE4ActionPerformed
        int aux;
        aux = PBP4.getValue();
        PBP4.setValue(aux + 1);
        int valor;
        valor = PBP4.getValue();
        if (valor == 100) {
            PBP4.setValue(100);
            PBP4.setMaximum(300);
            lblP4.setText("Nivel 2");
        } else if (valor == 300) {
            PBP4.setValue(300);
            PBP4.setMaximum(600);
            lblP4.setText("Nivel 3");
        } else if (valor == 600) {
            PBP4.setValue(600);
            PBP4.setMaximum(1000);
            lblP4.setText("Nivel 4");
        } else if (valor == 1000) {
            PBP4.setValue(1000);
            PBP4.setMaximum(1500);
            lblP4.setText("Nivel 5");
        } else if (valor == 1500) {
            PBP4.setValue(1500);
            PBP4.setMaximum(1500);
            lblP4.setText("Nivel 6");
            JOptionPane.showMessageDialog(null, "Nivel maximo alcanzado");
        }
    }//GEN-LAST:event_JBE4ActionPerformed

    private void JBE8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBE8ActionPerformed
        int aux;
        aux = PBP4.getValue();
        PBP4.setValue(aux + 5);
        int valor;
        valor = PBP4.getValue();
        if (valor == 100) {
            PBP4.setValue(100);
            PBP4.setMaximum(300);
            lblP4.setText("Nivel 2");
        } else if (valor == 300) {
            PBP4.setValue(300);
            PBP4.setMaximum(600);
            lblP4.setText("Nivel 3");
        } else if (valor == 600) {
            PBP4.setValue(600);
            PBP4.setMaximum(1000);
            lblP4.setText("Nivel 4");
        } else if (valor == 1000) {
            PBP4.setValue(1000);
            PBP4.setMaximum(1500);
            lblP4.setText("Nivel 5");
        } else if (valor == 1500) {
            PBP4.setValue(1500);
            PBP4.setMaximum(1500);
            lblP4.setText("Nivel 6");
            JOptionPane.showMessageDialog(null, "Nivel maximo alcanzado");
        }
    }//GEN-LAST:event_JBE8ActionPerformed

    private void JBE13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBE13ActionPerformed
        int aux;
        aux = PBP4.getValue();
        PBP4.setValue(aux + 10);
        int valor;
        valor = PBP4.getValue();
        if (valor == 100) {
            PBP4.setValue(100);
            PBP4.setMaximum(300);
            lblP4.setText("Nivel 2");
        } else if (valor == 300) {
            PBP4.setValue(300);
            PBP4.setMaximum(600);
            lblP4.setText("Nivel 3");
        } else if (valor == 600) {
            PBP4.setValue(600);
            PBP4.setMaximum(1000);
            lblP4.setText("Nivel 4");
        } else if (valor == 1000) {
            PBP4.setValue(1000);
            PBP4.setMaximum(1500);
            lblP4.setText("Nivel 5");
        } else if (valor == 1500) {
            PBP4.setValue(1500);
            PBP4.setMaximum(1500);
            lblP4.setText("Nivel 6");
            JOptionPane.showMessageDialog(null, "Nivel maximo alcanzado");
        }
    }//GEN-LAST:event_JBE13ActionPerformed

    private void JBE23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBE23ActionPerformed
        int aux;
        aux = PBP4.getValue();
        PBP4.setValue(aux + 20);
        int valor;
        valor = PBP4.getValue();
        if (valor == 100) {
            PBP4.setValue(100);
            PBP4.setMaximum(300);
            lblP4.setText("Nivel 2");
        } else if (valor == 300) {
            PBP4.setValue(300);
            PBP4.setMaximum(600);
            lblP4.setText("Nivel 3");
        } else if (valor == 600) {
            PBP4.setValue(600);
            PBP4.setMaximum(1000);
            lblP4.setText("Nivel 4");
        } else if (valor == 1000) {
            PBP4.setValue(1000);
            PBP4.setMaximum(1500);
            lblP4.setText("Nivel 5");
        } else if (valor == 1500) {
            PBP4.setValue(1500);
            PBP4.setMaximum(1500);
            lblP4.setText("Nivel 6");
            JOptionPane.showMessageDialog(null, "Nivel maximo alcanzado");
        }
    }//GEN-LAST:event_JBE23ActionPerformed

    private void JCBP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBP1ActionPerformed

    private void JCBP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBP2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBP2ActionPerformed

    private void JCBP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBP3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBP3ActionPerformed

    private void JCBP4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBP4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBP4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con = null;

        try {

            con = getConecction();

            ps = con.prepareStatement("Insert into Habilidad(id_personaje,Nivel,Experiencia,Habilidad) Values(?,?,?,?) ");

            ps.setInt(1, Integer.parseInt(TFP1.getText()));
            ps.setInt(2, Integer.parseInt(lblP1.getText()));
            ps.setInt(3, PBP1.getValue());
            /*     ps.setInt(4, PbA.getValue());
            */
            int Res = ps.executeUpdate();

            if (Res > 0) {
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardadar Personaje");
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        Connection con = null;

        try {

            con = getConecction();

            ps = con.prepareStatement("Insert into Habilidad(id_personaje,Nivel,Experiencia,Habilidad) Values(?,?,?,?) ");
            
            ps.setInt(1, Integer.parseInt(TFP1.getText()));
            ps.setInt(2, Integer.parseInt(lblP1.getText()));
            ps.setInt(3, PBP1.getValue());
            ps.setInt(4, Integer.parseInt(JCBP1.getSelectedItem().toString()));
            
            int Res = ps.executeUpdate();

            if (Res > 0) {
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardadar Personaje");
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_GuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Level().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton JBE1;
    private javax.swing.JButton JBE10;
    private javax.swing.JButton JBE11;
    private javax.swing.JButton JBE12;
    private javax.swing.JButton JBE13;
    private javax.swing.JButton JBE2;
    private javax.swing.JButton JBE20;
    private javax.swing.JButton JBE21;
    private javax.swing.JButton JBE22;
    private javax.swing.JButton JBE23;
    private javax.swing.JButton JBE3;
    private javax.swing.JButton JBE4;
    private javax.swing.JButton JBE5;
    private javax.swing.JButton JBE6;
    private javax.swing.JButton JBE7;
    private javax.swing.JButton JBE8;
    private javax.swing.JComboBox<String> JCBP1;
    private javax.swing.JComboBox<String> JCBP2;
    private javax.swing.JComboBox<String> JCBP3;
    private javax.swing.JComboBox<String> JCBP4;
    private javax.swing.JProgressBar PBP1;
    private javax.swing.JProgressBar PBP2;
    private javax.swing.JProgressBar PBP3;
    private javax.swing.JProgressBar PBP4;
    private javax.swing.JTextField TFP1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblP1;
    private javax.swing.JLabel lblP2;
    private javax.swing.JLabel lblP3;
    private javax.swing.JLabel lblP4;
    // End of variables declaration//GEN-END:variables
}
