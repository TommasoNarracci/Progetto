/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progetto;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.Timer;
import static com.mycompany.progetto.Commands.*;
import static com.mycompany.progetto.Inventory.*;
/**
 *
 * @author MSIGaming
 */
public class Room20 extends javax.swing.JFrame {

    /**
     * Creates new form Room20
     */
    private ProjectObject barrell;
    public Room20() {
        initComponents();
        barrell = new ProjectObject(3,"barile","/images/inventario.png",barile,this);
        this.addWindowListener(l);
    }
WindowListener l = new WindowListener() {
        @Override
        public void windowOpened(WindowEvent arg0) {
            text.setText("Quanto vino!!!Verrebbe quasi voglia di restare...Aspetta,è una via d'uscita quella?");
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
        river = new javax.swing.JButton();
        barile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text.setBackground(new java.awt.Color(0, 0, 0));
        text.setFont(new java.awt.Font("Papyrus", 3, 14)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
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

        river.setBorderPainted(false);
        river.setContentAreaFilled(false);
        river.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riverActionPerformed(evt);
            }
        });
        getContentPane().add(river, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 320, 220));

        barile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barrel.png"))); // NOI18N
        barile.setBorderPainted(false);
        barile.setContentAreaFilled(false);
        barile.setFocusPainted(false);
        barile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barileActionPerformed(evt);
            }
        });
        getContentPane().add(barile, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 390, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/maggiordomo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barileActionPerformed
        // TODO add your handling code here:
        PickObject(barrell);
    }//GEN-LAST:event_barileActionPerformed

    private void inventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryActionPerformed
        // TODO add your handling code here:
        openInventory();
    }//GEN-LAST:event_inventoryActionPerformed

    private void riverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riverActionPerformed
        // TODO add your handling code here:
        if(findObject(barrell)>=0){
            goNorth(this);
            removeObject(barrell);
        }
        else{
            text.setText("Ah un bel bagno nel fiume...ma aspetta,tu non sai nuotare!");
            Timer timer = new Timer(3000, event -> {
                text.setText("");
            });
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_riverActionPerformed

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
            java.util.logging.Logger.getLogger(Room20.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room20.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room20.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room20.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room20().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton barile;
    private javax.swing.JButton inventory;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JButton river;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
