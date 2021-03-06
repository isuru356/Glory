/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glory;

import javax.swing.ImageIcon;

/**
 *
 * @author I S Arandara
 */
public class CreateServer extends javax.swing.JFrame {

    /**
     * Creates new form CreateServer
     */
    public CreateServer() {
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
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        createserver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 370, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/servertextField.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, 60));

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancelA.png"))); // NOI18N
        cancel.setContentAreaFilled(false);
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cancelMouseReleased(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 150, 70));

        createserver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/createServer1.png"))); // NOI18N
        createserver.setContentAreaFilled(false);
        createserver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                createserverMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                createserverMouseReleased(evt);
            }
        });
        createserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createserverActionPerformed(evt);
            }
        });
        jPanel1.add(createserver, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 260, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/serverName.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/serversubBackground.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 530, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/serverblurBackground.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 770));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 770));

        setSize(new java.awt.Dimension(1396, 809));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        new SelectServer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void cancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMousePressed
        ImageIcon IC = new ImageIcon(getClass().getResource("/images/cancelB.png"));
        cancel.setIcon(IC);
    }//GEN-LAST:event_cancelMousePressed

    private void cancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseReleased
        ImageIcon IC = new ImageIcon(getClass().getResource("/images/cancelA.png"));
        cancel.setIcon(IC);
    }//GEN-LAST:event_cancelMouseReleased

    private void createserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createserverActionPerformed
       
    }//GEN-LAST:event_createserverActionPerformed

    private void createserverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createserverMousePressed
        ImageIcon IC = new ImageIcon(getClass().getResource("/images/createServer2.png"));
        createserver.setIcon(IC);
    }//GEN-LAST:event_createserverMousePressed

    private void createserverMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createserverMouseReleased
        ImageIcon IC = new ImageIcon(getClass().getResource("/images/createServer1.png"));
        createserver.setIcon(IC);
    }//GEN-LAST:event_createserverMouseReleased

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
            java.util.logging.Logger.getLogger(CreateServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateServer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton createserver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
