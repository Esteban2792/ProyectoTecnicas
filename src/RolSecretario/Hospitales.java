/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RolSecretario;

/**
 *
 * @author Pc
 */
public class Hospitales extends javax.swing.JFrame {

    /**
     * Creates new form Hospitales
     */
    public Hospitales() {
        initComponents();
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
        cboCirugias = new javax.swing.JComboBox<>();
        btnConsultarHospital = new javax.swing.JButton();
        BtnListaHospital = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblConsultorios = new javax.swing.JLabel();
        lblPropiedad1 = new javax.swing.JLabel();
        lblConsultorios1 = new javax.swing.JLabel();
        lblConsultorios2 = new javax.swing.JLabel();
        txtHospital = new javax.swing.JTextField();
        lblConsultorios3 = new javax.swing.JLabel();

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
        jPanel1.add(jButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Id Hospital");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Tipo de propiedad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("consultorios");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Niveles");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Color");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Tipo de cirugias");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Decsripción");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        cboCirugias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cboCirugias, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 150, 30));

        btnConsultarHospital.setText("Consultar");
        jPanel1.add(btnConsultarHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        BtnListaHospital.setText("Consultar Lista");
        BtnListaHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListaHospitalActionPerformed(evt);
            }
        });
        jPanel1.add(BtnListaHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Hospitales");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        lblConsultorios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblConsultorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 250, 30));

        lblPropiedad1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblPropiedad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 200, 30));

        lblConsultorios1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblConsultorios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 200, 30));

        lblConsultorios2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblConsultorios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 200, 30));

        txtHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalActionPerformed(evt);
            }
        });
        jPanel1.add(txtHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 120, 30));

        lblConsultorios3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblConsultorios3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 140, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 440, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        
         menuSecretario VentanaMenuSecretario = new menuSecretario();
        VentanaMenuSecretario.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void txtHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalActionPerformed

    private void BtnListaHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListaHospitalActionPerformed
        
        HospitalesSecretarioLista VentanaHospitalesSecretarioLista = new HospitalesSecretarioLista();
        VentanaHospitalesSecretarioLista.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BtnListaHospitalActionPerformed

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
            java.util.logging.Logger.getLogger(Hospitales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hospitales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hospitales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hospitales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hospitales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnListaHospital;
    private javax.swing.JButton btnConsultarHospital;
    private javax.swing.JComboBox<String> cboCirugias;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConsultorios;
    private javax.swing.JLabel lblConsultorios1;
    private javax.swing.JLabel lblConsultorios2;
    private javax.swing.JLabel lblConsultorios3;
    private javax.swing.JLabel lblPropiedad1;
    private javax.swing.JTextField txtHospital;
    // End of variables declaration//GEN-END:variables
}