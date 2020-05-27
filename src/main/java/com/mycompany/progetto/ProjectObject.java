/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progetto;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

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

    public ProjectObject() {
    }

    
    public ProjectObject(int id, String objectName) {
        this.id = id;
        this.objectName = objectName;
    }

    public ProjectObject(int id, String objectName, String imagePath, JButton object) {
        this.id = id;
        this.objectName = objectName;
        this.imagePath = imagePath;
        this.object = object;
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

    public void SetObjectImage() {
        this.object.setSize(30,30);
        ImageIcon image = new ImageIcon(this.imagePath);
        Image img = image.getImage();
        Image newimg = img.getScaledInstance(50,50, java.awt.Image.SCALE_SMOOTH);
        image = new ImageIcon(newimg);
        this.object.setToolTipText(objectName);
        this.object.setIcon(image);
        this.object.setBorderPainted(false);
        this.object.setContentAreaFilled(false);
        this.object.setFocusPainted(false);
    }

}
