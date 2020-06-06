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
import javax.swing.Timer;

/**
 *
 * @author MSIGaming
 */
public class Room29 extends javax.swing.JFrame {

    /**
     * Creates new form Room29
     */
    ProjectObject thiskey1, thiskey2,upperkey2, bow;
    int fallen = 0;

    public Room29() {
        initComponents();
        bow = new ProjectObject(0, "arco");
        upperkey2 = new ProjectObject(8, "chiaveDX", "/images/mordorkey.jpg", key2, this, 1);
        thiskey2 = new ProjectObject(8, "chiaveDX", "/images/mordorkey.jpg", fallenkey2, this, 1);
        thiskey1 = new ProjectObject(7, "chiaveSX");
        fallenkey2.setVisible(false);
        this.addWindowListener(l);
    }
    WindowListener l = new WindowListener() {
        @Override
        public void windowOpened(WindowEvent arg0) {
            text.setText("Ecco una chiave!Ma è troppo in alto per essere presa da un hobbit come te...");
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
        lock = new javax.swing.JButton();
        fallenkey2 = new javax.swing.JButton();
        key2 = new javax.swing.JButton();
        north = new javax.swing.JButton();
        inventory = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text.setBackground(new java.awt.Color(0, 0, 0));
        text.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setOpaque(true);
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 1080, 40));

        lock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lucchetto.png"))); // NOI18N
        lock.setBorderPainted(false);
        lock.setContentAreaFilled(false);
        lock.setFocusPainted(false);
        lock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lockActionPerformed(evt);
            }
        });
        getContentPane().add(lock, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 130, 90));

        fallenkey2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/morodor.png"))); // NOI18N
        fallenkey2.setBorderPainted(false);
        fallenkey2.setContentAreaFilled(false);
        fallenkey2.setFocusPainted(false);
        fallenkey2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fallenkey2ActionPerformed(evt);
            }
        });
        getContentPane().add(fallenkey2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, 60, 70));

        key2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/morodor.png"))); // NOI18N
        key2.setBorderPainted(false);
        key2.setContentAreaFilled(false);
        key2.setFocusPainted(false);
        key2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key2ActionPerformed(evt);
            }
        });
        getContentPane().add(key2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 60, 70));

        north.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CHIUSO.png"))); // NOI18N
        north.setBorderPainted(false);
        north.setContentAreaFilled(false);
        north.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                northActionPerformed(evt);
            }
        });
        getContentPane().add(north, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 540, -1, -1));

        inventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventario.png"))); // NOI18N
        inventory.setBorderPainted(false);
        inventory.setContentAreaFilled(false);
        inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryActionPerformed(evt);
            }
        });
        getContentPane().add(inventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chaive.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lockActionPerformed
        // TODO add your handling code here:
        if (findObject(bow) >= 0) {
            lock.setVisible(false);
            removeObject(bow);
            fallen = 1;
            key2.setLocation(580, 500);
            key2.repaint();
            text.setText("Il lucchetto è stato rotto ma hai dovuto usare l'unica tua freccia a disposizione,cosi' l'arco non serve più...");
            key2.setVisible(false);
            fallenkey2.setVisible(true);
            Timer timer = new Timer(3000, event -> {
                text.setText("");
            });
            timer.setRepeats(false);
            timer.start();
        } else {
            text.setText("Non arrivi a toccarlo!Ti serve qualcosa per colpirlo da distanza...");
            Timer timer = new Timer(3000, event -> {
                text.setText("");
            });
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_lockActionPerformed

    private void inventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryActionPerformed
        // TODO add your handling code here:
        openInventory();
    }//GEN-LAST:event_inventoryActionPerformed

    private void northActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_northActionPerformed
        // TODO add your handling code here:
        goNorth(this);
    }//GEN-LAST:event_northActionPerformed

    private void key2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key2ActionPerformed
        // TODO add your handling code here:
        if (fallen == 0) {
            text.setText("Non arrivi,devi cercare di farla cadere!");
            Timer timer = new Timer(3000, event -> {
                text.setText("");
            });
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_key2ActionPerformed

    private void fallenkey2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fallenkey2ActionPerformed
        // TODO add your handling code here:
        PickObject(thiskey2);
        fallenkey2.setVisible(false);
        if (findObject(thiskey1) >= 0) {
            text.setText("Ecco la seconda chiave!!!");
        } else {
            text.setText("Una chiave!Ne mancano 2...");
        }

        Timer timer = new Timer(3000, event -> {
            text.setText("");
        });
        timer.setRepeats(false);
        timer.start();
    }//GEN-LAST:event_fallenkey2ActionPerformed

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
            java.util.logging.Logger.getLogger(Room29.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room29.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room29.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room29.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room29().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fallenkey2;
    private javax.swing.JButton inventory;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JButton key2;
    private javax.swing.JButton lock;
    private javax.swing.JButton north;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
