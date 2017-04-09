/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafics;

import Entities.Seler;
import Abstract.Vehicule;
import Entities.Agency;
import Entities.Buyer;
import Entities.ComercialEstablishment;
import Entities.CreditCard;
import Entities.User;
import Entities.newVehicules;
import Methods.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
/**
 *
 * @author Usuario
 */
public class Login extends javax.swing.JFrame {
    public static User currentUser;  
    public  User currentUser2;  
    
    public  User getCurrentUser2() {
        return currentUser2;
    }
    
    public  static User getCurrentUser() {
        return currentUser;
    }
   
    
    public static Seler selerMet = new Seler();
    public static UserMethods userMet = new UserMethods();
    public static vehiculesMethods vehiculesMet = new vehiculesMethods();   
    

    public static SeeCars SC = new SeeCars();
    //
    public static  buyerNewOrUsed BNU = new buyerNewOrUsed();
    public static buyerNew BN = new buyerNew();
    public static buyerUsed BU = new buyerUsed();
    public static buyerDiscountVehicules BDV = new buyerDiscountVehicules();
    //sellers
    public static SellerAsPerson SAP = new SellerAsPerson();
    public static SellerAsAgency SAA = new SellerAsAgency();
    public static SellerAsCommercial SAE = new SellerAsCommercial();
    public static SellerCommercialAddCar SCAC = new SellerCommercialAddCar();
    public static Register_Sellers  RS = new Register_Sellers ();
    public static SellerAgencyAddCar  SAAC = new SellerAgencyAddCar();
    public static SellerPersonAddCar  SPAC = new SellerPersonAddCar();
    public static SellerAgencyDiscount  SAD = new SellerAgencyDiscount();
    public static SellerPersonDiscount SPD = new SellerPersonDiscount();
    public static SellerCommercialDiscount SCD = new SellerCommercialDiscount();
    
    //buyers
    public static Register_Buyers  RB = new Register_Buyers();
    public static MyStatusCard     CR = new MyStatusCard ();
 
    //
    public static Login main = new Login();
    /**
     * Creates new form Principal
     */
    public Login() {
        initComponents();
        //for center the JForm
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    
  
    
        Login.vehiculesMet.addVehicule(carro1);
    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btm_registrar_Vendedores_ = new javax.swing.JButton();
        btnSee = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtContra = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btm_registrar_Compradores_ = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        btm_registrar_Vendedores_.setText("Registrar Vendedores");
        btm_registrar_Vendedores_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_registrar_Vendedores_ActionPerformed(evt);
            }
        });

        btnSee.setText("Ver");
        btnSee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Contraseña:");

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Login");

        btm_registrar_Compradores_.setText("Registrar Compradores");
        btm_registrar_Compradores_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_registrar_Compradores_ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Opciones");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIngresar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombre)
                                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btm_registrar_Vendedores_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btm_registrar_Compradores_))
                    .addComponent(btnSee, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addComponent(btnIngresar)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 29, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(btm_registrar_Vendedores_)
                        .addGap(18, 18, 18)
                        .addComponent(btm_registrar_Compradores_)
                        .addGap(18, 18, 18)
                        .addComponent(btnSee)
                        .addGap(33, 33, 33))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //quema de datos
    //User user = new User("Angelo",2016125360,"angelomg@gmail.com","Costa Rica","Persona","1","Buyer");
    
    
    CreditCard card = new CreditCard(111,222,"06/04/18","Angelo",333,100000);
    Buyer      nuevo = new Buyer("Angelo",333,"angelogm@gmail.com","Costa Rica","Persona","abc","Buyer",card);
    Agency primeroAgencia = new Agency("Vinicio",333,"viniciorodriguez@gmail.com","CR","Agencia","123","Seller",12233,"Muelle",60074888,"Hala","Nissan");
    ComercialEstablishment primeroComercio = new ComercialEstablishment("Vinicio",333,"viniciorodriguez@gmail.com","CR","Sucursal","123","Seller",12233,"Muelle",60074888,"Hala");
    Seler primeroPersona = new Seler("Favier",333,"viniciorodriguez@gmail.com","CR","Persona","123","Seller");
    Vehicule carro1 = new newVehicules("PickUp","Nissan","Juan",12334,2007,"Blanco","332",7000000);
    
    //User user = new User(name, id,email,country,"Persona",password,type);
    
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
       
        Login.userMet.registrar(nuevo);//quema de 
        Login.userMet.registrar(primeroAgencia);
        Login.userMet.registrar(primeroComercio);
        Login.userMet.registrar(primeroPersona);
          
          
          
        String name = txtNombre.getText();
        String password = txtContra.getText();

        User user=userMet.ReturnObjet(name, password);
        currentUser = user;

        
        
        if(user != null)
        {
            Login.BNU.jMenuItem1.setText("Nombre: "+user.getName());
            Login.BNU.jMenuItem2.setText("Id: "+user.getId());
            Login.BNU.jMenuItem3.setText("Correo: "+user.getEmail());
            Login.BNU.jMenuItem4.setText("Rol: "+user.getRol());
            Login.BNU.jMenuItem5.setText("Tipo: "+user.getType());
            //Login.BNU.jMenuItem7.setText("Dinero: "+nuevo.getCard().getMoney());
            
            if(user.getRol().equals("Persona") && user.getType().equals("Seller"))
            {
                Login.SAP.setVisible(true);
                this.dispose();
            }
            if(user.getRol().equals("Agencia") && user.getType().equals("Seller"))
            {
                Login.SAA.print();
                Login.SAA.setVisible(true);
                this.dispose();
              
            }
            if(user.getRol().equals("Sucursal") && user.getType().equals("Seller"))
            {
                Login.SAE.print();
                Login.SAE.setVisible(true);
                this.dispose();
            }
            // Buyers
            if(user.getRol().equals("Persona") && user.getType().equals("Buyer"))
            {
                Login.SAP.print();
                Login.BNU.setVisible(true);
                this.dispose();
            }
            if(user.getRol().equals("Sucursal") && user.getType().equals("Buyer"))
            {
                Login.BNU.setVisible(true);
                this.dispose();
            }
            
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Lo sentimos no se ha registrado ese usuario.");
        }

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btm_registrar_Vendedores_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_registrar_Vendedores_ActionPerformed
        Login.RS.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btm_registrar_Vendedores_ActionPerformed

    private void btm_registrar_Compradores_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_registrar_Compradores_ActionPerformed
        Login.RB.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btm_registrar_Compradores_ActionPerformed

    private void btnSeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeActionPerformed
        Login.SC.print();
        Login.SC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSeeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*Cambiar apariencia a tipo windows*/
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        /*Fin cambiar apariencia*/

 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                main.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btm_registrar_Compradores_;
    private javax.swing.JButton btm_registrar_Vendedores_;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtContra;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
