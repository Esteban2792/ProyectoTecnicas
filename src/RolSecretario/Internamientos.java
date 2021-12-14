/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RolSecretario;

import java.sql.Connection;
import login.Conexion;

/**
 *
 * @author Pc
 */
public class Internamientos extends javax.swing.JFrame {
Conexion BaseDatos = new Conexion();
    Connection ingresa = Conexion.getConnection();
    /**
     * Creates new form Internamientos
     */
    public Internamientos() {
        initComponents();
    }
 void consultarDatosInternamiento(){
     String idInternamiento = (String) cboIdInternamiento.getSelectedItem();
            String query = "SELECT * FROM internamientos WHERE idInternamiento = '"+idInternamiento+"'";
            try {
                java.sql.Statement st = ingresa.createStatement();
                java.sql.ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                   lblInternamientoHospital.setText(rs.getString("idHospital"));
                    lblInternamientoPaciente.setText(rs.getString("idPaciente"));
                    lblInternamientoMotivo.setText(rs.getString("motivo"));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }   
 
 private void cargarIdInternamientol() {
        // TODO Auto-generated method stub

        String query = "SELECT idInternamiento FROM internamientos";

        try {
            java.sql.Statement st = ingresa.createStatement();
            java.sql.ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String tmpStrObtenido = rs.getString("idInternamiento");

                cboIdInternamiento.addItem(tmpStrObtenido);
            }
// ingresa.close();

        } catch (Exception e) {
            System.out.println("ERROR: Al cargar de la base de datos.");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        btnConsultarInternamiento = new javax.swing.JButton();
        btnListaInternamientos = new javax.swing.JButton();
        lblInternamientoMotivo = new javax.swing.JLabel();
        lblInternamientoHospital = new javax.swing.JLabel();
        lblInternamientoPaciente = new javax.swing.JLabel();
        cboIdInternamiento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ID Internamiento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ID Hospital");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("ID paciente");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Motivo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Internamientos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        btnMenu.setText("Menú");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        btnConsultarInternamiento.setText("Consultar");
        btnConsultarInternamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarInternamientoActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarInternamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        btnListaInternamientos.setText("Consultar lista");
        btnListaInternamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaInternamientosActionPerformed(evt);
            }
        });
        jPanel1.add(btnListaInternamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        lblInternamientoMotivo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblInternamientoMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 300, 30));

        lblInternamientoHospital.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblInternamientoHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 160, 30));

        lblInternamientoPaciente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblInternamientoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 160, 30));

        cboIdInternamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona" }));
        cboIdInternamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboIdInternamientoActionPerformed(evt);
            }
        });
        jPanel1.add(cboIdInternamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 7, 430, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        
        menuSecretario VentanaMenuSecretario = new menuSecretario();
        VentanaMenuSecretario.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnListaInternamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaInternamientosActionPerformed
        
        InternamientoSecretarioLista VentanaInternamientoSecretarioLista = new InternamientoSecretarioLista();
        VentanaInternamientoSecretarioLista.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnListaInternamientosActionPerformed

    private void btnConsultarInternamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarInternamientoActionPerformed
        // TODO add your handling code here:
        consultarDatosInternamiento();
    }//GEN-LAST:event_btnConsultarInternamientoActionPerformed

    private void cboIdInternamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboIdInternamientoActionPerformed
        // TODO add your handling code here:
        cargarIdInternamientol();
    }//GEN-LAST:event_cboIdInternamientoActionPerformed

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
            java.util.logging.Logger.getLogger(Internamientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Internamientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Internamientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Internamientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Internamientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarInternamiento;
    private javax.swing.JButton btnListaInternamientos;
    private javax.swing.JButton btnMenu;
    private javax.swing.JComboBox<String> cboIdInternamiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblInternamientoHospital;
    private javax.swing.JLabel lblInternamientoMotivo;
    private javax.swing.JLabel lblInternamientoPaciente;
    // End of variables declaration//GEN-END:variables
}
