/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progetto;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.*;
/**
 *
 * @author Utente
 */
public class Room  {

    private static Game thisGame;
    private final int id;
    private JFrame thisRoom;
    private String background;
    private String name;
    private JLabel label;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    
    public Room(int id, JFrame thisRoom) {
        this.id = id;
        this.thisRoom = thisRoom;

    }

    public Room(int id, JFrame thisRoom, String name) {
        this.id = id;
        this.thisRoom = thisRoom;
        this.name = name;

    }

    public Room(int id, JFrame thisRoom, String background, String name, JLabel label) {
        this.id = id;
        this.thisRoom = thisRoom;
        this.background = background;
        this.name = name;
        this.label = label;

        setWindow(background, label);
        
    }

    public static Game getThisGame() {
        return thisGame;
    }

    public static void setThisGame(Game thisGame) {
        Room.thisGame = thisGame;
    }
    
    public int getId() {
        return id;
    }
    
    public JFrame getThisRoom() {
        return thisRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public Room getNorth() {
        return north;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public Room getSouth() {
        return south;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public Room getEast() {
        return east;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public Room getWest() {
        return west;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public final void setWindow(String backg, JLabel label) {
        Dimension window = new Dimension(1080, 720);
        thisRoom.setSize(window);
        thisRoom.setResizable(false);
        ImageIcon icon = new ImageIcon(backg);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(window.width, window.height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
        thisRoom.pack();
    }

    public Room equals(int id) {
        if (this.id == id) {
            return this;
        } else {
            return null;
        }
    }
}


