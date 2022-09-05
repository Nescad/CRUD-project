/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.util.Date;
import modelo.ActividadPorProyecto;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import control.ControlActividadPorProyecto;

public class FrmActividadPorProyecto extends javax.swing.JFrame {

    /**
     * Creates new form FrmActividadPorProyecto
     */
    public FrmActividadPorProyecto() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbnIngresar = new javax.swing.JButton();
        jbnModificar = new javax.swing.JButton();
        jbnConsultar = new javax.swing.JButton();
        jbnBorrar = new javax.swing.JButton();
        txtcodresp = new javax.swing.JTextField();
        txtcodactiv = new javax.swing.JTextField();
        txtcodproy = new javax.swing.JTextField();
        jdcfechaasig = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Formulario Actividad Por Proyecto");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Código responsable");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Código actividad");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Código proyecto");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Fecha asignada");

        jbnIngresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbnIngresar.setText("Ingresar");
        jbnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnIngresarActionPerformed(evt);
            }
        });

        jbnModificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbnModificar.setText("Modificar");
        jbnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnModificarActionPerformed(evt);
            }
        });

        jbnConsultar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbnConsultar.setText("Consultar");
        jbnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnConsultarActionPerformed(evt);
            }
        });

        jbnBorrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbnBorrar.setText("Borrar");
        jbnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jbnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcfechaasig, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtcodresp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                .addComponent(txtcodactiv, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtcodproy, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jbnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jbnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcodresp, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodactiv, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodproy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdcfechaasig, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jbnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnIngresarActionPerformed
        String codresp = txtcodresp.getText();
        Integer codactiv = Integer.valueOf(txtcodactiv.getText());
        Integer codproy = Integer.valueOf(txtcodproy.getText());
        Date fecha_asig = (Date) jdcfechaasig.getDate();
        ActividadPorProyecto objActividadPorProyecto = new ActividadPorProyecto (codresp,codactiv, codproy, fecha_asig);
        ControlActividadPorProyecto objControlActividadPorProyecto = new ControlActividadPorProyecto (objActividadPorProyecto);
        objControlActividadPorProyecto.guardar();
        JOptionPane.showConfirmDialog(null, "Registro Guardado");
        txtcodresp.setText("");
        txtcodactiv.setText("");
        txtcodproy.setText(null);
        jdcfechaasig.setDate(null);
    }//GEN-LAST:event_jbnIngresarActionPerformed

    private void jbnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnConsultarActionPerformed
        String codresp = txtcodresp.getText();
        Integer codactiv = 0;
        Integer codproy = 0;
        Date fecha_asig = null; 
        ActividadPorProyecto objActividadPorProyecto= new ActividadPorProyecto (codresp,codactiv, codproy, fecha_asig);
        ControlActividadPorProyecto objControlActividadPorProyecto= new ControlActividadPorProyecto (objActividadPorProyecto);
        objActividadPorProyecto = objControlActividadPorProyecto.consultar();
        codresp = objActividadPorProyecto.getCodresp();
        codactiv = objActividadPorProyecto.getCodactiv();
        codproy = objActividadPorProyecto.getCodproy();
        fecha_asig = objActividadPorProyecto.getFecha_asig();
        txtcodresp.setText(String.valueOf(codresp));
        txtcodactiv.setText(String.valueOf(codactiv));
        txtcodproy.setText(String.valueOf(codproy));
        jdcfechaasig.setDate(fecha_asig);
    }//GEN-LAST:event_jbnConsultarActionPerformed

    private void jbnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnModificarActionPerformed
        String codresp = txtcodresp.getText();
        Integer codactiv = Integer.valueOf(txtcodactiv.getText());
        Integer codproy = Integer.valueOf(txtcodproy.getText());
        Date fecha_asig =  (Date) jdcfechaasig.getDate();
        ActividadPorProyecto objActividadPorProyecto= new ActividadPorProyecto (codresp,codactiv, codproy, fecha_asig);
        ControlActividadPorProyecto objControlActividadPorProyecto= new ControlActividadPorProyecto (objActividadPorProyecto);
        objControlActividadPorProyecto.modificar();
        JOptionPane.showConfirmDialog(null, "Registro modificado");
        txtcodresp.setText("");
        txtcodactiv.setText("");
        txtcodproy.setText("");
        jdcfechaasig.setDate(null);
    }//GEN-LAST:event_jbnModificarActionPerformed

    private void jbnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnBorrarActionPerformed
        String codresp = txtcodresp.getText();
        ActividadPorProyecto objActividadPorProyecto= new ActividadPorProyecto (codresp,0, 0, null);
        ControlActividadPorProyecto objControlActividadPorProyecto= new ControlActividadPorProyecto (objActividadPorProyecto);
        objControlActividadPorProyecto.borrar();
        JOptionPane.showConfirmDialog(null, "Registro modificado");
        txtcodresp.setText("");
        txtcodactiv.setText("");
        txtcodproy.setText("");
        jdcfechaasig.setDate(null);
    }//GEN-LAST:event_jbnBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmActividadPorProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmActividadPorProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmActividadPorProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmActividadPorProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmActividadPorProyecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbnBorrar;
    private javax.swing.JButton jbnConsultar;
    private javax.swing.JButton jbnIngresar;
    private javax.swing.JButton jbnModificar;
    private com.toedter.calendar.JDateChooser jdcfechaasig;
    private javax.swing.JTextField txtcodactiv;
    private javax.swing.JTextField txtcodproy;
    private javax.swing.JTextField txtcodresp;
    // End of variables declaration//GEN-END:variables
}
