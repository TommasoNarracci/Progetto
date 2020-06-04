/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progetto;

import static com.mycompany.progetto.ProjectGameDescription.*;
import static com.mycompany.progetto.Commands.*;
import static com.mycompany.progetto.Inventory.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/*
 * @author Utente
 */
public class Game {
    private static Color c = new Color(0,0,0);
    private static Room room0,room1,room2;

    private static ProjectObject bow;
    private static JFrame inventory = new InventoryForm();
    public static void main(String[] args) {
        // TODO code application logic here
        //setThisGame(thisGame);
        getInventory().setInventoryform(inventory);
        room0 = new Room(0,new Room0(),"/images/CAVE22.jpg","Caverna",new Room0().backscreen);
        room1 = new Room(1,new Room1(), "/images/cave_.jpg", "Boh", new Room1().background);
        System.out.println(room1);
        getRooms().add(room0);
        getRooms().add(room1);
        room2 = new Room(2, new Room2(), "/images/lotr.jpg", "Caverna", new Room2().jLabel1);
        room0.setNorth(room1);
        room0.setSouth(room2);
        room1.setSouth(room0);
        System.out.println("Ciao");
        //bow = new ProjectObject(0,"arco","C:\\Users\\Utente\\Downloads\\imgproject\\bow.jpg",new Room0().Object);
        room0.getThisRoom().setVisible(true);
    }

}


