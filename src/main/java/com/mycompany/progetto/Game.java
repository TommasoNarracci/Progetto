/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progetto;

import static com.mycompany.progetto.Room.setThisGame;

/**
 *
 * @author Utente
 */
public class Game {

    private static Room rooms[] = new Room[10];
    private static Game thisGame = new Game();
    public static void main(String[] args) {
        // TODO code application logic here
        setThisGame(thisGame);
        rooms[0] = new Room(0, new Room0(), "C:\\Users\\Utente\\Downloads\\imgproject\\CAVE22.jpg", "Caverna", new Room0().backscreen);
        rooms[1] = new Room(1, new Room1(), "C:\\Users\\Utente\\Downloads\\imgproject\\cave_.jpg", "Boh", new Room1().background);
        //Room room2 = new Room(2, new Room2(), "C:\\Users\\Utente\\Downloads\\imgproject\\CAVE22.jpg", "Caverna", new Room2().background);
        rooms[0].setNorth(rooms[1]);
        rooms[0].getThisRoom().setVisible(true);
        
    }


    public Room getmyRoom(int pos){
        return rooms[pos];
    }
}


