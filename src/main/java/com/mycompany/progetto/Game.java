/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progetto;

import static com.mycompany.progetto.ProjectGameDescription.*;
import javax.swing.JFrame;

/*
 * @author Utente
 */
public class Game {

    private static Room room0,room1;
    private static ProjectObject bow;
    private static JFrame inventory = new InventoryForm();
    public static void main(String[] args) {
        // TODO code application logic here
        //setThisGame(thisGame);
        getInventory().setInventoryform(inventory);
        room0 = new Room(0, new Room0(), "C:\\Users\\Utente\\Downloads\\imgproject\\CAVE22.jpg", "Caverna", new Room0().backscreen);
        room1 = new Room(1, new Room1(), "C:\\Users\\Utente\\Downloads\\imgproject\\cave_.jpg", "Boh", new Room1().background);
        getRooms().add(room0);
        getRooms().add(room1);
        //Room room2 = new Room(2, new Room2(), "C:\\Users\\Utente\\Downloads\\imgproject\\CAVE22.jpg", "Caverna", new Room2().background);
        room0.setNorth(room1);
        //bow = new ProjectObject(0,"arco","C:\\Users\\Utente\\Downloads\\imgproject\\bow.jpg",new Room0().Object);
        room0.getThisRoom().setVisible(true);
        
    }



}


