/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RolDoctor;

import login.Conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DoctorPaciente extends javax.swing.JFrame {

    Conexion BaseDatos = new Conexion();
    Connection ingresa = Conexion.getConnection();
    // PreparedStatement registra;

    public DoctorPaciente() {
        initComponents();
    }

    void AgregaPaciente() {

        //Conexion con = (Conexion) Conexion.getConnection();
        String nombre = txtNombre.getText();
        String civil = (String) cboCivil.getSelectedItem();
        String estado = (String) cboEstado.getSelectedItem();
        String query = "INSERT INTO pacientes (identificacion,nombre,apellidos,estadoCivil,patologia,telefono,email,estadoPaciente) "
                + " values(?,?,?,?,?,?,?,?)";
        try {
            java.sql.PreparedStatement ps = ingresa.prepareStatement(query);
            ps.setString(1, txtID.getText());
            ps.setString(2, nombre);
            ps.setString(3, txtApellidos.getText());
            ps.setString(4, civil);
            ps.setString(5, txtPatologia.getText());
            ps.setString(6, txtTelefono.getText());
            ps.setString(7, txtCorreo.getText());
            ps.setString(8, estado);
            int agregar = ps.executeUpdate();
            ingresa.close();
            if (agregar > 0) {
                JOptionPane.showMessageDialog(this, "Usuario agregado exitosamente", "Bien", JOptionPane.QUESTION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Usuario NO agregado", "Atención", JOptionPane.ERROR_MESSAGE);

            }
        } catch (Exception e) {
        } finally {
            txtID.setText("");
            txtNombre.setText("");
            txtApellidos.setText("");
            cboCivil.setSelectedItem("Soltero");
            txtTelefono.setText("");
            txtCorreo.setText("");
            txtPatologia.setText("");
            cboEstado.setSelectedItem("1");
        }

    }

    public void consultarDatosPaciente() {

        String query = "SELECT * FROM pacientes WHERE identificacion = '" + txtID.getText().trim() + "'";
        try {
            java.sql.Statement st = ingresa.createStatement();
            java.sql.ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                txtNombre.setText(rs.getString("nombre"));
                txtApellidos.setText(rs.getString("apellidos"));
                cboCivil.setSelectedItem(rs.getString("estadoCivil"));
                txtTelefono.setText(rs.getString("telefono"));
                txtCorreo.setText(rs.getString("email"));
                txtPatologia.setText(rs.getString("patologia"));
                cboEstado.setSelectedItem(rs.getString("estadoPaciente"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtPatologia = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        btnListaPacientes = new javax.swing.JButton();
        cboCivil = new javax.swing.JComboBox<>();
        cboEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Identificación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 220, 30));

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Apellidos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Estado Civil");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Teléfono");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Correo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Estado");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Patología");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 230, 30));
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 190, 30));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 210, 30));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 210, 30));

        txtPatologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatologiaActionPerformed(evt);
            }
        });
        jPanel1.add(txtPatologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 190, 30));

        jButton3.setText("Menú");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, -1, -1));

        btnListaPacientes.setText("Lista de pacientes");
        btnListaPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaPacientesActionPerformed(evt);
            }
        });
        jPanel1.add(btnListaPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, -1));

        cboCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Divorciado", "Viudo" }));
        cboCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCivilActionPerformed(evt);
            }
        });
        jPanel1.add(cboCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 130, -1));

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "0" }));
        jPanel1.add(cboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void txtPatologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatologiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatologiaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        menuDoctor VentanaMenuDoctor = new menuDoctor();
        VentanaMenuDoctor.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        AgregaPaciente();

    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void cboCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCivilActionPerformed

    private void btnListaPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaPacientesActionPerformed

        ListaPaciente VentanaListaPaciente = new ListaPaciente();
        VentanaListaPaciente.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnListaPacientesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        consultarDatosPaciente();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListaPacientes;
    private javax.swing.JComboBox<String> cboCivil;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPatologia;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
