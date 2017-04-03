/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafics;

import Entities.*;
import static Grafics.Login.userMet;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Register_Buyers extends javax.swing.JFrame {

    public Register_Buyers() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        txtNombreVend = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_Registrar_Vend_ = new javax.swing.JButton();
        txtContraVend = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtPaisVend = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEmailVen = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtIdVen = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Registrar_vendedor_como_sucursal = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtPaisVend1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEmailVen1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtIdVen1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNombreVend1 = new javax.swing.JTextField();
        txtContraVend1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btn_razon_ = new javax.swing.JTextField();
        btn_cell_ = new javax.swing.JTextField();
        btn_localization = new javax.swing.JTextField();
        tbn_nunmbre_inscription = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btn_regresar_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register as Buyers");

        jLabel7.setText("ID:");

        jLabel6.setText("Nombre:");

        btn_Registrar_Vend_.setText("Registrarse");
        btn_Registrar_Vend_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Registrar_Vend_ActionPerformed(evt);
            }
        });

        jLabel17.setText("Contraseña:");

        jLabel9.setText("Pais:");

        jLabel8.setText("Email:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 153, 153));
        jLabel27.setText("Registro Comprador como Persona ");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        Registrar_vendedor_como_sucursal.setText("Registrarse");
        Registrar_vendedor_como_sucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registrar_vendedor_como_sucursalActionPerformed(evt);
            }
        });

        jLabel18.setText("Contraseña:");

        jLabel12.setText("Pais:");

        jLabel11.setText("Email:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 153, 153));
        jLabel29.setText("Registro Vendedor como Establecimiento Comercial ");

        jLabel10.setText("ID:");

        jLabel24.setText("Razón comercia:l ");

        jLabel23.setText(" Teléfono:");

        jLabel22.setText("Ubicación:");

        jLabel21.setText("N de inscripción de la Empresa: ");

        jLabel13.setText("Nombre:");

        btn_regresar_.setText("Regresar");
        btn_regresar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresar_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Registrar_Vend_)
                    .addComponent(jLabel27)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(37, 37, 37)
                        .addComponent(txtNombreVend))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(txtContraVend))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmailVen)
                            .addComponent(txtIdVen)
                            .addComponent(txtPaisVend))))
                .addGap(40, 40, 40)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmailVen1)
                            .addComponent(txtIdVen1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(txtPaisVend1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Registrar_vendedor_como_sucursal)
                                .addComponent(jLabel24)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tbn_nunmbre_inscription, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(btn_localization)
                            .addComponent(btn_cell_)
                            .addComponent(btn_razon_)))
                    .addComponent(jLabel29)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addGap(18, 18, 18)
                            .addComponent(txtContraVend1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(37, 37, 37)
                            .addComponent(txtNombreVend1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_regresar_)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_regresar_)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombreVend1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(txtContraVend1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIdVen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtEmailVen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtPaisVend1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tbn_nunmbre_inscription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(btn_cell_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btn_localization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_razon_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel23)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel24)))
                                .addGap(51, 51, 51)
                                .addComponent(Registrar_vendedor_como_sucursal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombreVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(txtContraVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIdVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtEmailVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtPaisVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btn_Registrar_Vend_)))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Registrar_Vend_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Registrar_Vend_ActionPerformed
        try
        {
            String type="Buyer";
            String name = txtNombreVend.getText();
            int id = Integer.valueOf(txtIdVen.getText());
            String email=txtEmailVen.getText();
            String country = txtPaisVend.getText();
            String password = txtContraVend.getText();

            if(txtNombreVend.getText().equals("") || txtIdVen.getText().equals("")  || txtEmailVen.getText().equals("") || txtPaisVend.getText().equals("") || txtContraVend.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Verifique que todos los espacios este completos ");
            }
            else
            {
                User user = new User(name, id,email,country,"Persona",password,type);
                boolean verify=userMet.verifyUser(name,password);
                if(verify==false)
                {
                    boolean verifyName=userMet.verifyName(name);

                    if(verifyName==false)
                    {
                        userMet.registrar(user);
                        JOptionPane.showMessageDialog(null,"Registrado correctamente!");
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"El nombre Usuario no se encuantra disponible!");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Este Usuario ya se encuantra registrado");
                }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error en los datos");
        }
    }//GEN-LAST:event_btn_Registrar_Vend_ActionPerformed

    private void Registrar_vendedor_como_sucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registrar_vendedor_como_sucursalActionPerformed
        try
        {
            String type="Buyer";
            String name = txtNombreVend1.getText();
            int id = Integer.valueOf(txtIdVen1.getText());
            String email=txtEmailVen1.getText();
            String country = txtPaisVend1.getText();
            String password = txtContraVend1.getText();
            //
            int    numbreInscription=Integer.parseInt(tbn_nunmbre_inscription.getText());
            String ubication =btn_localization.getText();
            int    cel       =Integer.parseInt(btn_cell_.getText());
            String razon     =btn_razon_.getText();

            if(btn_razon_.getText().equals("")| btn_cell_.getText().equals("") || btn_localization.getText().equals("")  || tbn_nunmbre_inscription.getText().equals("") || txtNombreVend1.getText().equals("") || txtIdVen1.getText().equals("")  || txtEmailVen1.getText().equals("") || txtPaisVend1.getText().equals("") || txtContraVend1.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Verifique que todos los espacios este completos ");
            }
            else
            {
                BranchOffice user = new BranchOffice(name, id,email,country,"Sucursal",password,type,numbreInscription,ubication,cel,razon);
                boolean verify=userMet.verifyUser(name,password);
                if(verify==false)
                {
                    boolean verifyName=userMet.verifyName(name);

                    if(verifyName==false)
                    {
                        userMet.registrar(user);
                        JOptionPane.showMessageDialog(null,"Registrado correctamente!");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"El nombre Usuario no se encuantra disponible!");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Este Usuario ya se encuantra registrado");
                }
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error en los datos");
        }

    }//GEN-LAST:event_Registrar_vendedor_como_sucursalActionPerformed

    private void btn_regresar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresar_ActionPerformed
        Login.main.setVisible(true);
        dispose();

    }//GEN-LAST:event_btn_regresar_ActionPerformed

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
            java.util.logging.Logger.getLogger(Register_Buyers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Buyers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Buyers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Buyers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Buyers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrar_vendedor_como_sucursal;
    private javax.swing.JButton btn_Registrar_Vend_;
    private javax.swing.JTextField btn_cell_;
    private javax.swing.JTextField btn_localization;
    private javax.swing.JTextField btn_razon_;
    private javax.swing.JButton btn_regresar_;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tbn_nunmbre_inscription;
    private javax.swing.JTextField txtContraVend;
    private javax.swing.JTextField txtContraVend1;
    private javax.swing.JTextField txtEmailVen;
    private javax.swing.JTextField txtEmailVen1;
    private javax.swing.JTextField txtIdVen;
    private javax.swing.JTextField txtIdVen1;
    private javax.swing.JTextField txtNombreVend;
    private javax.swing.JTextField txtNombreVend1;
    private javax.swing.JTextField txtPaisVend;
    private javax.swing.JTextField txtPaisVend1;
    // End of variables declaration//GEN-END:variables
}
