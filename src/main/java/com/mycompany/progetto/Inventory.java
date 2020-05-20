/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progetto;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *<>
 * @author Utente
 */
public class Inventory {
    private static List<ProjectObject> inventory = new ArrayList<>();
    private static JPanel inventoryform = new InventoryForm();
    public Inventory() {
    }
    
    
    public static List<ProjectObject> getInventory() {
        return inventory;
    }

    public static void setInventory(List<ProjectObject> inventory) {
        Inventory.inventory = inventory;
    }
    public void add(ProjectObject obj){
        inventory.add(obj);
    }
    public void remove(ProjectObject obj){
        inventory.remove(obj);
    }

    public static JPanel getInventoryform() {
        return inventoryform;
    }
    
}
