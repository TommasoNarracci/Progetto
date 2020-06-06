/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progetto;

import static com.mycompany.progetto.Commands.*;
import static com.mycompany.progetto.Inventory.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author MSIGaming
 */
public class Room17 extends javax.swing.JFrame {

    /**
     * Creates new form Room17
     */
    ProjectObject anello, sword, ovest;

    public Room17() {
        initComponents();
        sword = new ProjectObject(1, "sword");
        anello = new ProjectObject(2, "anello", "/images/paglia.jpg", ring, this);
        ovest = new ProjectObject(3, "nord", "/images/Ovest.png", west, this, 0, 1);
        this.addWindowListener(l);
    }
    WindowListener l = new WindowListener() {
        @Override
        public void windowOpened(WindowEvent arg0) {
            text.setText("SMEAGLE:'Gollum!GOLLUM!...Abbiamo un visitatore,e ora lo mangeremo a pezzettini!'");
            Timer timer = new Timer(3000, event -> {
                text.setText("");
            });
            timer.setRepeats(false);
            timer.start();
        }

        @Override
        public void windowClosing(WindowEvent arg0) {

        }

        @Override
        public void windowClosed(WindowEvent arg0) {
        }

        @Override
        public void windowIconified(WindowEvent arg0) {

        }

        @Override
        public void windowDeiconified(WindowEvent arg0) {
        }

        @Override
        public void windowActivated(WindowEvent arg0) {
        }

        @Override
        public void windowDeactivated(WindowEvent arg0) {
        }
    };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text = new javax.swing.JLabel();
        inventory = new javax.swing.JButton();
        west = new javax.swing.JButton();
        gollum = new javax.swing.JButton();
        ring = new javax.swing.JButton();
        goback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text.setBackground(new java.awt.Color(0, 0, 0));
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setToolTipText("");
        text.setOpaque(true);
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 1080, 40));

        inventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventario.png"))); // NOI18N
        inventory.setBorderPainted(false);
        inventory.setContentAreaFilled(false);
        inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryActionPerformed(evt);
            }
        });
        getContentPane().add(inventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, -1, -1));

        west.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OVEST.png"))); // NOI18N
        west.setBorderPainted(false);
        west.setContentAreaFilled(false);
        west.setFocusPainted(false);
        west.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                westActionPerformed(evt);
            }
        });
        getContentPane().add(west, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        gollum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/realgollum.png"))); // NOI18N
        gollum.setToolTipText("kill");
        gollum.setBorderPainted(false);
        gollum.setContentAreaFilled(false);
        gollum.setFocusPainted(false);
        gollum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gollumActionPerformed(evt);
            }
        });
        getContentPane().add(gollum, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 670, 370));

        ring.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ring.png"))); // NOI18N
        ring.setText("jButton3");
        ring.setBorderPainted(false);
        ring.setContentAreaFilled(false);
        ring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ringActionPerformed(evt);
            }
        });
        getContentPane().add(ring, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 50, 50));

        goback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CHIUSO.png"))); // NOI18N
        goback.setBorderPainted(false);
        goback.setContentAreaFilled(false);
        goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobackActionPerformed(evt);
            }
        });
        getContentPane().add(goback, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, -1, -1));

        jLabel1.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gollum.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gollumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gollumActionPerformed
        // TODO add your handling code here:
        if (findObject(sword) >= 0) {
            gollum.setVisible(false);
            text.setText("Hai ucciso gollum!");
            Timer timer = new Timer(2000, event -> {
                text.setText("");
            });
            timer.setRepeats(false);
            timer.start();
            ovest.setEnable(1);
        } else {
            //try {
            text.setText("Non hai la spada");
            Timer timer = new Timer(2000, event -> {
                text.setText("");
            });
            timer.setRepeats(false);
            timer.start();
            //       } catch (InterruptedException ex) {
            // Logger.getLogger(Room17.class.getName()).log(Level.SEVERE, null, ex);
            //}
        }
    }//GEN-LAST:event_gollumActionPerformed

    private void ringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ringActionPerformed
        // TODO add your handling code here:
        PickObject(anello);
        text.setText("Questo anello emana un'aura molto opprimente,ma nonostante ciò sei attratto da esso...");
            Timer timer = new Timer(3000, event -> {
                text.setText("");
            });
            timer.setRepeats(false);
            timer.start();
    }//GEN-LAST:event_ringActionPerformed

    private void westActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_westActionPerformed
        // TODO add your handling code here:
        if (ovest.isEnable() == 1) {
            goWest(this);
        } else {

            text.setText("Gollum ti sbarra la strada");
            Timer timer = new Timer(2000, event -> {
                text.setText("");
            });
            timer.setRepeats(false);
            timer.start();

        }
    }//GEN-LAST:event_westActionPerformed

    private void gobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobackActionPerformed
        // TODO add your handling code here:
        goEast(this);
    }//GEN-LAST:event_gobackActionPerformed

    private void inventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryActionPerformed
        // TODO add your handling code here:
        openInventory();
    }//GEN-LAST:event_inventoryActionPerformed

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
            java.util.logging.Logger.getLogger(Room17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room17().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goback;
    private javax.swing.JButton gollum;
    private javax.swing.JButton inventory;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JButton ring;
    public javax.swing.JLabel text;
    private javax.swing.JButton west;
    // End of variables declaration//GEN-END:variables
}
