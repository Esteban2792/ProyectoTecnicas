/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RolDoctor;

import java.sql.Connection;
import javax.swing.JOptionPane;
import login.Conexion;

public class DoctorHospital extends javax.swing.JFrame {

    Conexion BaseDatos = new Conexion();
    Connection ingresa = Conexion.getConnection();

    /**
     * Creates new form Hospitales
     */
    public DoctorHospital() {
        initComponents();

    }

    void AgregaHospital() {

        //Conexion con = (Conexion) Conexion.getConnection();
        String tipoPropiedad = txtpropiedad.getText();
        String tipoCirugia = (String) cbocirugias.getSelectedItem();
        String consultorios = txtconsultorios.getText();
        String niveles = txtniveles.getText();
        String color = txtcolor.getText();
        String descripcion = txtdescripcion.getText();
        String query = "INSERT INTO hospitales (tipoPropiedad, consultorios, niveles, color, tipoCirugias, descripcion) "
                + "VALUES (?,?,?,?,?,?);";
        try {
            java.sql.PreparedStatement ps = ingresa.prepareStatement(query);
            ps.setString(1, tipoPropiedad);
            ps.setString(2, consultorios);
            ps.setString(3, niveles);
            ps.setString(4, color);
            ps.setString(5, tipoCirugia);
            ps.setString(6, descripcion);

            int agregar = ps.executeUpdate();
            ingresa.close();
            if (agregar > 0) {
                JOptionPane.showMessageDialog(this, "Hospital agregado exitosamente", "Bien", JOptionPane.QUESTION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Hospital NO agregado", "Atención", JOptionPane.ERROR_MESSAGE);

            }
        } catch (Exception e) {
        } finally {
            txtidhospital.setText("");
                txtpropiedad.setText("");
                txtconsultorios.setText("");
                txtniveles.setText("");
                txtcolor.setText("");
                cbocirugias.setSelectedItem("");
                txtdescripcion.setText("");
        }

    }

    public void consultarDatosHospital() {
        
String idHospital =  txtidhospital.getText().trim();

        String query = "SELECT * FROM hospitales where idHospital = '" + idHospital + "'";
        try {
            java.sql.Statement st = ingresa.createStatement();
            java.sql.ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                txtidhospital.setText(rs.getString("idHospital"));
                txtpropiedad.setText(rs.getString("tipoPropiedad"));
                txtconsultorios.setText(rs.getString("consultorios"));
                txtniveles.setText(rs.getString("niveles"));
                txtcolor.setText(rs.getString("color"));
                cbocirugias.setSelectedItem(rs.getString("tipoCirugias"));
                txtdescripcion.setText(rs.getString("descripcion"));
            }
        } catch (Exception e) {
            System.out.println(e);
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtpropiedad = new javax.swing.JTextField();
        txtconsultorios = new javax.swing.JTextField();
        txtniveles = new javax.swing.JTextField();
        txtcolor = new javax.swing.JTextField();
        cbocirugias = new javax.swing.JComboBox<>();
        txtdescripcion = new javax.swing.JTextField();
        btnAgrgarHospital = new javax.swing.JButton();
        btnConsultarHospital = new javax.swing.JButton();
        BtnListaHospital = new javax.swing.JButton();
        txtidhospital = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonMenu.setText("Menú");
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Id Hospital");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Tipo de propiedad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("consultorios");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Niveles");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Color");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Tipo de cirugias");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Descripción");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));
        jPanel1.add(txtpropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 230, 30));

        txtconsultorios.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtconsultorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 110, 30));
        jPanel1.add(txtniveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 110, 30));
        jPanel1.add(txtcolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 150, 40));

        cbocirugias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mayor", "Menor", "Electiva", "Urgencia" }));
        jPanel1.add(cbocirugias, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 150, 30));
        jPanel1.add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 240, 30));

        btnAgrgarHospital.setText("Agregar");
        btnAgrgarHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrgarHospitalActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgrgarHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        btnConsultarHospital.setText("Consultar");
        btnConsultarHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarHospitalActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, -1, -1));

        BtnListaHospital.setText("Consultar Lista");
        BtnListaHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListaHospitalActionPerformed(evt);
            }
        });
        jPanel1.add(BtnListaHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));
        jPanel1.add(txtidhospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 520, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed

        menuDoctor VentanaMenuDoctor = new menuDoctor();
        VentanaMenuDoctor.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void BtnListaHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListaHospitalActionPerformed

        ListaHospital VentanaListaHospital = new ListaHospital();
        VentanaListaHospital.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_BtnListaHospitalActionPerformed

    private void btnAgrgarHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrgarHospitalActionPerformed
        // TODO add your handling code here:
        AgregaHospital();
    }//GEN-LAST:event_btnAgrgarHospitalActionPerformed

    private void btnConsultarHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarHospitalActionPerformed
        // TODO add your handling code here:
        consultarDatosHospital();
    }//GEN-LAST:event_btnConsultarHospitalActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorHospital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnListaHospital;
    private javax.swing.JButton btnAgrgarHospital;
    private javax.swing.JButton btnConsultarHospital;
    private javax.swing.JComboBox<String> cbocirugias;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcolor;
    private javax.swing.JTextField txtconsultorios;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtidhospital;
    private javax.swing.JTextField txtniveles;
    private javax.swing.JTextField txtpropiedad;
    // End of variables declaration//GEN-END:variables
}
