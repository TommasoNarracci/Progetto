/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progetto;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Utente
 */
public class ProjectObject {

    //Classe oggetti
    private int id;
    private String objectName;
    private String imagePath;
    private JButton object;
    private JFrame thisRoom;

    public ProjectObject() {
    }

    public ProjectObject(int id, String objectName) {
        this.id = id;
        this.objectName = objectName;
    }

    public ProjectObject(int id, String objectName, String imagePath, JButton object,JFrame thisRoom) {
        this.id = id;
        this.objectName = objectName;
        this.imagePath = imagePath;
        this.object = object;
        this.thisRoom = thisRoom;
        SetObjectImage();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getObjectName() {
        return objectName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setObject(JButton object) {
        this.object = object;
    }

    public JButton getObject() {
        return object;
    }

    public JFrame getThisRoom() {
        return thisRoom;
    }

    public void SetObjectImage() {
        //this.object.setSize(30, 30);
        /*ImageIcon image = new ImageIcon(this.imagePath);
        Image img = image.getImage();
        Image newimg = img.getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
        image = new ImageIcon(newimg);
        this.object.setIcon(image);*/
        ImageIcon icon = new ImageIcon();
        icon = (ImageIcon) object.getIcon();
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(object.getWidth(), object.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        object.setIcon(scaledIcon);
        this.object.setToolTipText(objectName);

        //this.object.setBorderPainted(false);
        this.object.setContentAreaFilled(false);
        this.object.setFocusPainted(false); 
    }

}
