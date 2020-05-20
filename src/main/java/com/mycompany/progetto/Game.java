/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progetto;

import static com.mycompany.progetto.ProjectGameDescription.getRooms;

/*
 * @author Utente
 */
public class Game {

    private static Room room0,room1;
    public static void main(String[] args) {
        // TODO code application logic here
        //setThisGame(thisGame);
        room0 = new Room(0, new Room0(), "C:\\Users\\Utente\\Downloads\\imgproject\\CAVE22.jpg", "Caverna", new Room0().backscreen);
        room1 = new Room(1, new Room1(), "C:\\Users\\Utente\\Downloads\\imgproject\\cave_.jpg", "Boh", new Room1().background);
        getRooms().add(room0);
        getRooms().add(room1);
        //Room room2 = new Room(2, new Room2(), "C:\\Users\\Utente\\Downloads\\imgproject\\CAVE22.jpg", "Caverna", new Room2().background);
        room0.setNorth(room1);
        room0.getThisRoom().setVisible(true);
        
    }



}


