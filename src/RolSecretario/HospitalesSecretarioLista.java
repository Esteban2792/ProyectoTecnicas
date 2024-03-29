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


public class HospitalesSecretarioLista extends javax.swing.JFrame {
Conexion BaseDatos = new Conexion();
        Connection ingresa = Conexion.getConnection();
        CallableStatement SeleccionaTabla;
ResultSet resultado;
    /**
    /**
     * Creates new form ListaHospital
     */
    public HospitalesSecretarioLista() {
        initComponents();
    }
 public void CargarListaHospitales(){
            DefaultTableModel tabla= new DefaultTableModel();
       try{
       tabla.addColumn("idHospital");
       tabla.addColumn("tipoPropiedad");
       tabla.addColumn("consultorios");
       tabla.addColumn("niveles");
       tabla.addColumn("color");
       tabla.addColumn("tipoCirugias");
       tabla.addColumn("descripcion");
       
       SeleccionaTabla=ingresa.prepareCall("Select * from hospitales");
       resultado=SeleccionaTabla.executeQuery();
       while (resultado.next()){
       Object datos[]=new  Object[7];
       for (int filas=0; filas<7; filas++){
           datos[filas]=resultado.getString(filas+1);
       }
       tabla.addRow(datos);
       }
       this.jthospitales.setModel(tabla);//jTable---jdatos
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
        jthospitales = new javax.swing.JTable();
        btnRegresarHospital = new javax.swing.JButton();
        btnConsultarListaHospitales = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Lista de Hospitales");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jthospitales.setAutoCreateRowSorter(true);
        jthospitales.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jthospitales.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jthospitales);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 540, 340));

        btnRegresarHospital.setText("Regresar");
        btnRegresarHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarHospitalActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresarHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, -1, -1));

        btnConsultarListaHospitales.setText("Consultar");
        btnConsultarListaHospitales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarListaHospitalesActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarListaHospitales, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarHospitalActionPerformed
        
      Hospitales VentanaHospitales = new Hospitales();
        VentanaHospitales.setVisible(true);
        this.setVisible(false);  
        
    }//GEN-LAST:event_btnRegresarHospitalActionPerformed

    private void btnConsultarListaHospitalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarListaHospitalesActionPerformed
        // TODO add your handling code here:
        CargarListaHospitales();
    }//GEN-LAST:event_btnConsultarListaHospitalesActionPerformed

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
            java.util.logging.Logger.getLogger(HospitalesSecretarioLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalesSecretarioLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalesSecretarioLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalesSecretarioLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalesSecretarioLista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarListaHospitales;
    private javax.swing.JButton btnRegresarHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jthospitales;
    // End of variables declaration//GEN-END:variables
}
