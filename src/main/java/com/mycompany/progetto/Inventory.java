/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progetto;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * <>
 * @author Utente
 */
/*
---------------------------------------------------------------------------------------------------------------
Se riesci a generare bottoni tramite for con contatore = a getSize di Inventory per ogni bottone nella lista
potresti mettere in ProjectObject una String che contiene il path dell'immagine e riprenderla poi per mettere
la medesima immagine sul bottone.
---------------------------------------------------------------------------------------------------------------
 */
public class Inventory {

    private List<ProjectObject> inventory = new ArrayList<>();
    private JFrame inventoryform;
    private JLabel background;
    //private ProjectObject objectToInsert;
    public Inventory() {
    }

    public int Size() {
        return inventory.size();
    }

    public void setInventoryform(JFrame inventoryform) {
        this.inventoryform = inventoryform;
    }

    public JFrame getInventoryform() {
        return inventoryform;
    }

    public List<ProjectObject> getInventory() {
        return inventory;
    }

    public void setInventory(List<ProjectObject> inventory) {
        this.inventory = inventory;
    }

    public JLabel getBackground() {
        return background;
    }

    public void setBackground(JLabel background) {
        this.background = background;
    }

    public void add(ProjectObject obj) {
        inventory.add(obj);
    }

    public void remove(ProjectObject obj) {
        inventory.remove(obj);
    }

    public void refreshInventory() {
        double rows = Math.ceil((double) Size() / (double) 8);
        if (rows > 1) {                             //Caso con più righe(Ogni riga è composta da 8 caselle)
            for (int i = 0; i < rows - 1; i++) {    //Riempimento prime righe "complete"
                for (int j = 0; j < 8; j++) {
                    SetButton(j, i);                // Invio colonna e riga corrente per inserire l'oggetto nella casella giusta 
                }
            }
            for (int i = 0; i < Size() - ((rows - 1) * 8); i++) {  //Riempimento ultima riga rimasta
                SetButton(i, (int) (rows - 1));
            }
        } else {
            for (int i = 0; i < Size(); i++) {                     //Caso con una sola riga
                SetButton(i, 0);
            }
        }

    }

    public void SetButton(int column, int row) {
        JButton jb = new JButton();
        ProjectObject obj = new ProjectObject();
        obj = getInventory().get(column + (8*row));
        jb.setBounds(20 + 48 * column, 20 + 47 * row, 30, 30); //Inserimento nella casella corretta dell'inventario
        SetImageButton(obj,jb);
        jb.setToolTipText(obj.getObjectName());
        getInventoryform().add(jb, column);
        jb.setVisible(true);
    }
    public void SetImageButton(ProjectObject o,JButton jb){
        ImageIcon image = new ImageIcon(o.getImagePath());
        Image img = image.getImage();
        Image newimg = img.getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
        image = new ImageIcon(newimg);
        jb.setIcon(image);
        jb.setBorderPainted(false);
        jb.setContentAreaFilled(false);
        jb.setFocusPainted(false);
    }
}
