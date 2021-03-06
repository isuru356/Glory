/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glory;

import com.sun.javafx.scene.traversal.ContainerTabOrder;
import java.awt.Container;
import java.awt.Window;
import javax.swing.ImageIcon;

/**
 *
 * @author I S Arandara
 */
public class PauseMenu extends javax.swing.JFrame {

    /**
     * Creates new form PauseMenu
     */
    public PauseMenu() {
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
        jLabel3 = new javax.swing.JLabel();
        resume = new javax.swing.JButton();
        mainmenu = new javax.swing.JButton();
        quitegame = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gamepaused.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 360, 60));

        resume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/resume1.png"))); // NOI18N
        resume.setContentAreaFilled(false);
        resume.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                resumeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                resumeMouseReleased(evt);
            }
        });
        resume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumeActionPerformed(evt);
            }
        });
        jPanel1.add(resume, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 360, 100));

        mainmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mainMenu1.png"))); // NOI18N
        mainmenu.setContentAreaFilled(false);
        mainmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mainmenuMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mainmenuMouseReleased(evt);
            }
        });
        mainmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenuActionPerformed(evt);
            }
        });
        jPanel1.add(mainmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 380, 100));

        quitegame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/quite1.png"))); // NOI18N
        quitegame.setContentAreaFilled(false);
        quitegame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                quitegameMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                quitegameMouseReleased(evt);
            }
        });
        quitegame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitegameActionPerformed(evt);
            }
        });
        jPanel1.add(quitegame, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 380, 90));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clock.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 100, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backgroundBox.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 530, 630));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blurBackground.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 770));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 770));

        setSize(new java.awt.Dimension(1396, 809));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resumeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resumeMousePressed
        ImageIcon IC = new ImageIcon(getClass().getResource("/images/resume2.png"));
       resume.setIcon(IC);
    }//GEN-LAST:event_resumeMousePressed

    private void resumeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resumeMouseReleased
        ImageIcon IC = new ImageIcon(getClass().getResource("/images/resume1.png"));
       resume.setIcon(IC);
    }//GEN-LAST:event_resumeMouseReleased

    private void mainmenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainmenuMousePressed
        ImageIcon IC = new ImageIcon(getClass().getResource("/images/mainmenu2.png"));
       mainmenu.setIcon(IC);
    }//GEN-LAST:event_mainmenuMousePressed

    private void mainmenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainmenuMouseReleased
        ImageIcon IC = new ImageIcon(getClass().getResource("/images/mainmenu1.png"));
       mainmenu.setIcon(IC);
    }//GEN-LAST:event_mainmenuMouseReleased

    private void quitegameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitegameMousePressed
        ImageIcon IC = new ImageIcon(getClass().getResource("/images/quite2.png"));
       quitegame.setIcon(IC);
    }//GEN-LAST:event_quitegameMousePressed

    private void quitegameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitegameMouseReleased
       ImageIcon IC = new ImageIcon(getClass().getResource("/images/quite1.png"));
       quitegame.setIcon(IC);
    }//GEN-LAST:event_quitegameMouseReleased

    private void mainmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenuActionPerformed
       java.awt.Window win[] = java.awt.Window.getWindows(); 
        for (Window win1 : win) {
            win1.dispose();
        }   
       new Menu().setVisible(true);
      
    }//GEN-LAST:event_mainmenuActionPerformed

    private void quitegameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitegameActionPerformed
       System.exit(0);
    }//GEN-LAST:event_quitegameActionPerformed

    private void resumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumeActionPerformed

        this.dispose();
    }//GEN-LAST:event_resumeActionPerformed

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
            java.util.logging.Logger.getLogger(PauseMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PauseMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PauseMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PauseMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PauseMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mainmenu;
    private javax.swing.JButton quitegame;
    private javax.swing.JButton resume;
    // End of variables declaration//GEN-END:variables
}
