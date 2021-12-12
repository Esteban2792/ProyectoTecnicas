/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RolSecretario;

import login.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;

public class pacientes extends javax.swing.JFrame {

   
    Conexion BaseDatos = new Conexion();
        Connection ingresa = (Connection)Conexion.getConnection();
        PreparedStatement registra;
        
    public pacientes() {
        initComponents();
    }

  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIDPaciente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btnListaPacienteSecretario = new javax.swing.JButton();
        lblPacienteEstado = new javax.swing.JLabel();
        lblPacienteNombre = new javax.swing.JLabel();
        lblPacienteApellidos = new javax.swing.JLabel();
        lblPacienteCivil = new javax.swing.JLabel();
        lblPacienteTelefono = new javax.swing.JLabel();
        lblPacienteCorreo = new javax.swing.JLabel();
        lblPacientePatologia = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Identificación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        jPanel1.add(txtIDPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 220, 30));

        jButton1.setText("Consultar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Apellidos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Estado Civil");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Teléfono");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Correo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Estado");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Patología");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jButton3.setText("Menú");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, -1, -1));

        btnListaPacienteSecretario.setText("Lista de pacientes");
        btnListaPacienteSecretario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaPacienteSecretarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnListaPacienteSecretario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, -1));

        lblPacienteEstado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblPacienteEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 160, 30));

        lblPacienteNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblPacienteNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 180, 30));

        lblPacienteApellidos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblPacienteApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 200, 30));

        lblPacienteCivil.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblPacienteCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 160, 30));

        lblPacienteTelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblPacienteTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 160, 30));

        lblPacienteCorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblPacienteCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 190, 30));

        lblPacientePatologia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblPacientePatologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 190, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Pacientes");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        menuSecretario VentanaMenuSecretario = new menuSecretario();
        VentanaMenuSecretario.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnListaPacienteSecretarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaPacienteSecretarioActionPerformed
        
        PacienteSecretarioLista VentanaPacienteSecretarioLista = new PacienteSecretarioLista();
        VentanaPacienteSecretarioLista.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnListaPacienteSecretarioActionPerformed

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
            java.util.logging.Logger.getLogger(pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListaPacienteSecretario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPacienteApellidos;
    private javax.swing.JLabel lblPacienteCivil;
    private javax.swing.JLabel lblPacienteCorreo;
    private javax.swing.JLabel lblPacienteEstado;
    private javax.swing.JLabel lblPacienteNombre;
    private javax.swing.JLabel lblPacientePatologia;
    private javax.swing.JLabel lblPacienteTelefono;
    private javax.swing.JTextField txtIDPaciente;
    // End of variables declaration//GEN-END:variables
}
