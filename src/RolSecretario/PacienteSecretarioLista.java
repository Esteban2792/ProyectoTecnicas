/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RolSecretario;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import login.Conexion;


public class PacienteSecretarioLista extends javax.swing.JFrame {
Conexion BaseDatos = new Conexion();
        Connection ingresa = Conexion.getConnection();
        CallableStatement SeleccionaTabla;
ResultSet resultado;
    /**
     * Creates new form ListaPacientes
     */
    public PacienteSecretarioLista() {
        initComponents();
    }
 public void CargarListaPaciente(){
            DefaultTableModel tabla= new DefaultTableModel();
       try{
       tabla.addColumn("idPaciente");
       tabla.addColumn("identificacion");
       tabla.addColumn("nombre");
       tabla.addColumn("apellidos");
       tabla.addColumn("estadoCivil");
       tabla.addColumn("patologia");
       tabla.addColumn("telefono");
       tabla.addColumn("email");
       tabla.addColumn("estadoPaciente");
       SeleccionaTabla=ingresa.prepareCall("Select * from pacientes");
       resultado=SeleccionaTabla.executeQuery();
       while (resultado.next()){
       Object datos[]=new  Object[9];
       for (int filas=0; filas<9; filas++){
           datos[filas]=resultado.getString(filas+1);
       }
       tabla.addRow(datos);
       }
       this.jtPacientes.setModel(tabla);//jTable---jdatos
       }catch (Exception e){}
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPacientes = new javax.swing.JTable();
        btnRegresarPacientes = new javax.swing.JButton();
        btnConsultarListaPaciente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Lista de Pacientes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jtPacientes.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtPacientes.setForeground(new java.awt.Color(0, 0, 0));
        jtPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtPacientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(jtPacientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 50, 530, 360));

        btnRegresarPacientes.setText("Regresar");
        btnRegresarPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarPacientesActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresarPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        btnConsultarListaPaciente.setText("Consultar");
        btnConsultarListaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarListaPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarListaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -1, 550, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarPacientesActionPerformed
        
        pacientes VentanaPaciente = new pacientes();
        VentanaPaciente.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnRegresarPacientesActionPerformed

    private void btnConsultarListaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarListaPacienteActionPerformed
        // TODO add your handling code here:
        CargarListaPaciente();
    }//GEN-LAST:event_btnConsultarListaPacienteActionPerformed

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
            java.util.logging.Logger.getLogger(PacienteSecretarioLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PacienteSecretarioLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PacienteSecretarioLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PacienteSecretarioLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PacienteSecretarioLista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarListaPaciente;
    private javax.swing.JButton btnRegresarPacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPacientes;
    // End of variables declaration//GEN-END:variables
}
