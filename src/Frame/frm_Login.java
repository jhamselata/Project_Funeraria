package Frame;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luz
 */
public class frm_Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public frm_Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpingreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jpMenu = new javax.swing.JLabel();
        jpMenu1 = new javax.swing.JLabel();
        jpMenu2 = new javax.swing.JLabel();
        jpMenu3 = new javax.swing.JLabel();
        jpMenu4 = new javax.swing.JLabel();
        jpMenu5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpingreso.setBackground(new java.awt.Color(255, 255, 255));
        jpingreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jpingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Contrase??a:");
        jpingreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 110, 20));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Usuario:");
        jpingreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 110, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-customer-96.png"))); // NOI18N
        jpingreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 100, 100));

        user.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        user.setForeground(new java.awt.Color(204, 204, 204));
        user.setToolTipText("");
        user.setBorder(null);
        user.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        user.setName("Ingrese usuario"); // NOI18N
        jpingreso.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 170, 30));
        jpingreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 210, 10));
        jpingreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 210, 10));

        pass.setForeground(new java.awt.Color(153, 153, 153));
        pass.setToolTipText("");
        pass.setBorder(null);
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jpingreso.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 170, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-user-32.png"))); // NOI18N
        jpingreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-access-32.png"))); // NOI18N
        jpingreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-top-menu-32.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpingreso.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/enter (3).png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/enter (4).png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/enter (4).png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/enter (4).png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpingreso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        getContentPane().add(jpingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        jLabel7.setText("Traslado a cementerio");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, -1, 40));

        jpMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jpMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 170, 150));

        jpMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-church-96.png"))); // NOI18N
        jpMenu1.setToolTipText("");
        jpMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpMenu1MouseClicked(evt);
            }
        });
        jPanel1.add(jpMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 170, 150));

        jpMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-presentation-96.png"))); // NOI18N
        jpMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpMenu2MouseClicked(evt);
            }
        });
        jPanel1.add(jpMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 170, 150));

        jpMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-headstone-96.png"))); // NOI18N
        jpMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpMenu3MouseClicked(evt);
            }
        });
        jPanel1.add(jpMenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 170, 150));

        jpMenu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jpMenu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 170, 150));

        jpMenu5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jpMenu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 170, 150));

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        jLabel8.setText("Traslado a Capilla");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, 40));

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        jLabel9.setText("Orden de  tr??mites");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, 40));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Buscar");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 150, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/buscar.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 30, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 760, 530));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/claro.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cuadricula.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked



        // TODO add your handling code here:
        
        this.setState(frm_Login.ICONIFIED);
        
     
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked

 int dialog = JOptionPane.YES_NO_OPTION;
 int result = JOptionPane.showConfirmDialog(null, "Desea salir del login?" , "Exit", dialog);
 if(result == 0) {  
     System.exit(0);

  }  
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jpMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu2MouseClicked
        // TODO add your handling code here:
        
               JOptionPane.showMessageDialog(null, "Primero tienes que Iniciar sesi??n");
    }//GEN-LAST:event_jpMenu2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           
        String Usuario, Clave;
        Usuario = user.getText();
       Clave = pass.getText();
       if  ("luz".equals(Usuario) && "123".equals(Clave)) {
       JOptionPane.showMessageDialog(null, "Bienvenida"+ Usuario);
       
     
       
            
       frm_pantalla mf = new frm_pantalla();
       mf.setVisible(true);
       mf.pack();
       this.dispose();
       
       
       }
       
       
       else{
        JOptionPane.showMessageDialog(null, "Acceso denegado, Usuario o clave incorrecto");
       }
        
            
       frm_Login mf = new frm_Login();
       mf.setVisible(true);
       mf.pack();
       this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void jpMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu1MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Primero tienes que Iniciar sesi??n");
    }//GEN-LAST:event_jpMenu1MouseClicked

    private void jpMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMenu3MouseClicked
        // TODO add your handling code here:
                JOptionPane.showMessageDialog(null, "Primero tienes que Iniciar sesi??n");
    }//GEN-LAST:event_jpMenu3MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel jpMenu;
    private javax.swing.JLabel jpMenu1;
    private javax.swing.JLabel jpMenu2;
    private javax.swing.JLabel jpMenu3;
    private javax.swing.JLabel jpMenu4;
    private javax.swing.JLabel jpMenu5;
    private javax.swing.JPanel jpingreso;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
