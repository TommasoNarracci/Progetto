/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progetto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Utente
 */
public class ProjectGameDescription {

    private static final List<Room> rooms = new ArrayList<>();
    private static final Inventory inventory = new Inventory();
    //private final List<AdvObject> inventory = new ArrayList<>();

    private Room currentRoom;

    public static List<Room> getRooms() {
        return rooms;
    }
    

    /*public List<AdvObject> getInventory() {
        return inventory;
    }*/

    public static Inventory getInventory() {
        return inventory;
    }

}
