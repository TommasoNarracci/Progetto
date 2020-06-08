/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progetto;

import static com.mycompany.progetto.ProjectGameDescription.*;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Utente
 */
public class Commands {

    private static Room currentRoom = new Room();
    private static ProjectObject object = new ProjectObject();

    //Implementare comandi usati tipo Nord,Sud,Raccogli,Usa ecc.
    public static void goNorth(JFrame currentFrame) {

        currentRoom = findCurrentRoom(currentFrame);
        currentRoom.getNorth().getThisRoom().setVisible(true);
        currentRoom.getThisRoom().dispose();
    }

    public static void goSouth(JFrame currentFrame) {

        currentRoom = findCurrentRoom(currentFrame);
        currentRoom.getSouth().getThisRoom().setVisible(true);
        currentRoom.getThisRoom().dispose();
    }

    public static void goEast(JFrame currentFrame) {

        currentRoom = findCurrentRoom(currentFrame);
        currentRoom.getEast().getThisRoom().setVisible(true);
        currentRoom.getThisRoom().dispose();
    }

    public static void goWest(JFrame currentFrame) {

        currentRoom = findCurrentRoom(currentFrame);
        currentRoom.getWest().getThisRoom().setVisible(true);
        currentRoom.getThisRoom().dispose();
    }

    public static Room findCurrentRoom(JFrame currentFrame) {
        List<Room> rooms = getRooms();
        Room thisRoom = new Room();
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).equals(currentFrame)) {
                thisRoom = rooms.get(i);
                break;
            }

        }
        return thisRoom;
    }

    public static void openInventory() {
        getInventory().refreshInventory();
        getInventory().getInventoryform().setVisible(true);
    }

    public static void PickObject(ProjectObject obj) {
        getInventory().add(obj);
    }

    public static void removeObject(ProjectObject obj) {
        getInventory().remove(obj);
    }
}
