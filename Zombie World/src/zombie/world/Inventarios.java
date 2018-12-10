package zombie.world;

import Visualizacion.CargadoViaje;
import Visualizacion.Casa;
import Visualizacion.Casa2;
import Visualizacion.Casa3;
import Visualizacion.Casa4;
import Visualizacion.Casa5;
import Visualizacion.Viaje;
import java.awt.Image;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static zombie.world.CrearPersonaje2.PASSWORD;
import static zombie.world.CrearPersonaje2.URL;
import static zombie.world.CrearPersonaje2.USERNAME;

/**
 *
 * @author Garabato
 */
public class Inventarios extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();

    //conexion a mysql
    public static final String URL = "jdbc:mysql://localhost:3306/zombieworld?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";

    public Inventarios() {
        //Cambiar icono
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/mano.png")).getImage());
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/Bosque.jpg"));
        Icon Fondo = new ImageIcon(imagen.getImage().getScaledInstance(this.Fondo.getWidth(), this.Fondo.getHeight(), Image.SCALE_DEFAULT));
        this.Fondo.setIcon(Fondo);
        this.repaint();
        this.setLocationRelativeTo(null);//centrar ventanas
        Balas.setText("0");

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

        Reporte = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Balas = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        JT = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Balas1 = new javax.swing.JTextField();
        TF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TF1 = new javax.swing.JTextField();
        TF2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TF3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TF4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JT1 = new javax.swing.JTable();
        Cont = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Reporte.setText("Bitacora del Sobreviviente");
        Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteActionPerformed(evt);
            }
        });
        getContentPane().add(Reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        jButton2.setText("Cargar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        jLabel3.setText("Balas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 50, 20));

        jButton3.setText("Viajar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, -1, -1));

        Balas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalasActionPerformed(evt);
            }
        });
        getContentPane().add(Balas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 70, -1));

        JT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Personaje 1", "Personaje 2", "Personaje 3", "Personaje 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JT);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 22, 610, 580));

        jButton1.setText("Disparar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));
        getContentPane().add(Balas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 70, -1));
        getContentPane().add(TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 150, -1));

        jLabel2.setText("ID Base:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 80, -1));

        jLabel4.setText("Personaje 1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 80, -1));
        getContentPane().add(TF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 150, -1));
        getContentPane().add(TF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 150, -1));

        jLabel5.setText("Personaje 2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 80, -1));
        getContentPane().add(TF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 150, -1));

        jLabel6.setText("Personaje 3");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 80, -1));

        jLabel7.setText("Personaje 4");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 80, -1));
        getContentPane().add(TF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 150, -1));

        jButton4.setText("Guardar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        jButton5.setText("Modificar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Inventario.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        JT1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Bolsillos"},
                {"1"},
                {"2"},
                {"3"},
                {"4"},
                {"Mochila pequeña"},
                {"1"},
                {"2"},
                {"3"},
                {"4"},
                {"5"},
                {"Saco"},
                {"1"},
                {"2"},
                {"3"},
                {"4"},
                {"Mochila Grande"},
                {"1"},
                {"2"},
                {"3"},
                {"4"},
                {"5"},
                {"6"},
                {"7"},
                {"8"},
                {"9"},
                {"10"}
            },
            new String [] {
                "Inventarios"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(JT1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 22, 130, 580));

        Cont.setText("jLabel8");
        getContentPane().add(Cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int balas;
            int restar;
            balas = Integer.parseInt(Balas.getText());
            restar = Integer.parseInt(Balas1.getText());
            if (balas < restar) {
                JOptionPane.showMessageDialog(null, "No tienes Suficientes balas");
            } else if (balas == 0) {
                JOptionPane.showMessageDialog(null, "No tienes balas para disparar");
            } else if (balas > 0) {
                String Resul;
                Resul = Integer.toString(balas - restar);
                Balas.setText(Resul);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Deben ser solo numeros");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BalasActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CargadoViaje Cv = new CargadoViaje();
        Cv.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteActionPerformed
        Reporte R = new Reporte();
        R.setVisible(true);
    }//GEN-LAST:event_ReporteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String campo = TF.getText();
        String where = "";
        if ("".equals(campo)) {

            where = "WHERE id_Base = '" + campo + "'";
        }
        try {
            JT.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection con = getConecction();

            String sql = "SELECT Personaje1,Personaje2,Personaje3,Personaje4 from Inventarios " + where;

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumna = rsMd.getColumnCount();

            modelo.addColumn("Personaje 1");
            modelo.addColumn("Personaje 2");
            modelo.addColumn("Personaje 3");
            modelo.addColumn("Personaje 4");

            while (rs.next()) {

                Object[] filas = new Object[cantidadColumna];
                for (int i = 0; i < cantidadColumna; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);

            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTMouseClicked
        PreparedStatement ps = null;
        ResultSet rs = null;
        String codigo = "";

        Connection con = getConecction();

        try {
            int fila = JT.getSelectedRow();

            try {
                codigo = JT.getValueAt(fila, 0).toString();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Debes cargar datos antes de selecionar en la tabla");
            }

            ps = con.prepareStatement("SELECT Personaje1,Personaje2,Personaje3, Personaje4 FROM Inventarios WHERE Personaje1 = ?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();

            while (rs.next()) {
                TF1.setText(rs.getString("Personaje1"));
                TF2.setText(rs.getString("Personaje2"));
                TF3.setText(rs.getString("Personaje3"));
                TF4.setText(rs.getString("Personaje4"));

            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_JTMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        PreparedStatement ps = null;
        try {
            Connection con = getConecction();
            ps = con.prepareStatement("INSERT INTO inventarios (Personaje1,Personaje2,Personaje3,Personaje4) VALUES (?,?,?,?)");

            ps.setString(1, TF1.getText());
            ps.setString(2, TF2.getText());
            ps.setString(3, TF3.getText());
            ps.setString(4, TF4.getText());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Inventario Guardado");
            Object Fila[] = new Object[4];
            Fila[0] = TF1.getText();
            Fila[1] = TF2.getText();
            Fila[2] = TF3.getText();
            Fila[3] = TF4.getText();
            modelo.addRow(Fila);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar inventario");
            System.out.println(ex);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        PreparedStatement ps = null;
        try {
            Connection con = getConecction();

            int fila = JT.getSelectedRow();
            String Codigo = JT.getValueAt(fila, 0).toString();

            ps = con.prepareStatement("DELETE FROM inventarios WHERE Personaje1 = ?");
            ps.setString(1, Codigo);

            modelo.removeRow(fila);
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        PreparedStatement ps = null;
        int Fila = JT.getSelectedRow();
        try {
            Connection con = getConecction();
            ps = con.prepareStatement("UPDATE inventarios SET Personaje1 = ? ,Personaje2 = ? ,Personaje3 = ? ,Personaje4 = ? ");

            ps.setString(1, TF1.getText());
            ps.setString(2, TF2.getText());
            ps.setString(3, TF3.getText());
            ps.setString(4, TF4.getText());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Inventario Modificado");

            JT.setValueAt(TF1.getText(), Fila, 0);
            JT.setValueAt(TF2.getText(), Fila, 1);
            JT.setValueAt(TF3.getText(), Fila, 2);
            JT.setValueAt(TF4.getText(), Fila, 3);

            limpiar();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar inventario");
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void limpiar() {
        TF1.setText("");
        TF2.setText("");
        TF3.setText("");
        TF4.setText("");
    }

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
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Balas;
    private javax.swing.JTextField Balas1;
    private javax.swing.JLabel Cont;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTable JT;
    private javax.swing.JTable JT1;
    private javax.swing.JButton Reporte;
    private javax.swing.JTextField TF;
    private javax.swing.JTextField TF1;
    private javax.swing.JTextField TF2;
    private javax.swing.JTextField TF3;
    private javax.swing.JTextField TF4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
