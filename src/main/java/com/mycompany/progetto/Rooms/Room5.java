/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progetto.Rooms;

import com.mycompany.progetto.ProjectObject;
import static com.mycompany.progetto.ProjectGameDescription.getInventory;

import static com.mycompany.progetto.ProjectGameDescription.getInventory;
import static com.mycompany.progetto.ProjectGameDescription.getRooms;
import static com.mycompany.progetto.Commands.*;
import java.awt.Image;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Timer;
import static com.mycompany.progetto.Inventory.*;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.SwingWorker;



/**
 *
 * @author MSIGaming
 */
public class Room5 extends javax.swing.JFrame {

    
    WindowListener l = new WindowListener() {
        @Override
        public void windowOpened(WindowEvent arg0) {
     
            text.setText("Una strana porta nella foresta , speriamo sia aperta");
           Timer timer=new Timer(5000,event ->{
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
   
    
    ProjectObject chiavetroll,door;
   
    public Room5() {
        initComponents();
        luogo.setText("Foresta Ovest");
          chiavetroll=new ProjectObject(4,"chiavetroll");
        door=new ProjectObject(5,"door","/images/forestadoor.png",porta,this,0,1);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        luogo = new javax.swing.JLabel();
        indietro = new javax.swing.JButton();
        porta = new javax.swing.JButton();
        inventario = new javax.swing.JButton();
        text = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        luogo.setBackground(new java.awt.Color(0, 0, 0));
        luogo.setFont(new java.awt.Font("Papyrus", 3, 24)); // NOI18N
        luogo.setForeground(new java.awt.Color(255, 255, 255));
        luogo.setOpaque(true);
        getContentPane().add(luogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 60));

        indietro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CHIUSO.png"))); // NOI18N
        indietro.setBorderPainted(false);
        indietro.setContentAreaFilled(false);
        indietro.setFocusPainted(false);
        indietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroActionPerformed(evt);
            }
        });
        getContentPane().add(indietro, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 546, 150, 130));

        porta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/forestadoor.png"))); // NOI18N
        porta.setToolTipText("door");
        porta.setBorderPainted(false);
        porta.setContentAreaFilled(false);
        porta.setFocusPainted(false);
        porta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portaActionPerformed(evt);
            }
        });
        getContentPane().add(porta, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 110, 310));

        inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventario.png"))); // NOI18N
        inventario.setBorderPainted(false);
        inventario.setContentAreaFilled(false);
        inventario.setFocusPainted(false);
        inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioActionPerformed(evt);
            }
        });
        getContentPane().add(inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, -1, -1));

        text.setBackground(new java.awt.Color(0, 0, 0));
        text.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setOpaque(true);
        text.setPreferredSize(new java.awt.Dimension(1080, 40));
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/forestdoor.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioActionPerformed
        openInventory(); 
    }//GEN-LAST:event_inventarioActionPerformed

    private void portaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portaActionPerformed

        if( findObject(chiavetroll)>=0 || door.isEnable()==1){ 
        
         
           if( findObject(chiavetroll)>=0){
             door.setEnable(1);
             removeObject(chiavetroll);
           }
            
           goWest(this);
         
           
       }else{
           text.setText("Non hai la chiave ");
           Timer timer=new Timer(3000,event ->{
               text.setText("");
           });
           timer.setRepeats(false);
           timer.start();
       }

        
    }//GEN-LAST:event_portaActionPerformed

    private void indietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietroActionPerformed
        goEast(this);
    }//GEN-LAST:event_indietroActionPerformed

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
            java.util.logging.Logger.getLogger(Room5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton indietro;
    private javax.swing.JButton inventario;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel luogo;
    private javax.swing.JButton porta;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
