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
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * @author Utente
 */
public class Game {

    private static Color c = new Color(0, 0, 0);
    private static Room room0, room1, room2, room3, room4, room5,
            room6, room7, room8, room9, room10, room11, room12, room13,
            room14, room15, room16, room17, room18, room19, room20, room21, room22, room23,
            room24, room25, room26, room27, room28, room29, room30,FINALROOM;
    private ProjectObject sword;
    private static JFrame inventory = new InventoryForm();

    public static void main(String[] args) {
        // TODO code application logic here
        //setThisGame(thisGame);
        getInventory().setInventoryform(inventory);
        room0 = new Room(0, new Room0(), "/images/11.jpg", "casa", new Room0().backscreen);
        
        room1 = new Room(1, new Room1(), "/images/scalinata.jpg", "scalinata", new Room1().background);
        
        room2 = new Room(2, new Room2(), "/images/seminterrato.jpg", "seminterrato", new Room2().jLabel1);

        room3 = new Room(3, new Room3(), "/images/hobbiton.jpg", "hobbiton", new Room3().jLabel1);

        room4 = new Room(4, new Room4(), "/images/forest.jpg", "foresta", new Room4().jLabel1);

        room5 = new Room(5, new Room5(), "/images/forestdoor.jpg", "forestadoor", new Room5().jLabel1);

        room6 = new Room(6, new Room6(), "/images/troll.jpg", "troll", new Room6().jLabel1);

        room7 = new Room(7, new Room7(), "/images/troll.jpg", "sam", new Room7().jLabel1);

        room8 = new Room(8, new Room8(), "/images/incrocio.jpg", "incrocio", new Room8().jLabel1);

        room9 = new Room(9, new Room9(), "/images/aragorn.jpg", "Gondor", new Room9().jLabel1);

        room10 = new Room(10, new Room10(), "/images/grotta.jpg", "Grotta", new Room10().jLabel1);

        room11 = new Room(11, new Room11(), "/images/rivendell.jpg", "rivendell", new Room11().jLabel1);

        room12 = new Room(12, new Room12(), "/images/elrond.jpg", "elrond", new Room12().jLabel1);

        room13 = new Room(13, new Room13(), "/images/moria.jpg", "moria", new Room13().jLabel1);

        room14 = new Room(14, new Room14(), "/images/golbin.jpg", "goblin", new Room14().jLabel1);

        room15 = new Room(15, new Room15(), "/images/gabbia.png", "gabbia", new Room15().jLabel1);

        room16 = new Room(16, new Room16(), "/images/entratagollum.jpg", "entratagrotta", new Room16().jLabel1);

        room17 = new Room(17, new Room17(), "/images/gollum.jpg", "gollum", new Room17().jLabel1);

        room18 = new Room(18, new Room18(), "/images/boscoatro.jpg", "bosco", new Room18().jLabel1);

        room19 = new Room(19, new Room19(), "/images/boscoatro.jpg", "mirkwood", new Room19().jLabel1);

        room20 = new Room(20, new Room20(), "/images/maggiordomo.jpg", "maggiordomo", new Room20().jLabel1);

        room21 = new Room(21, new Room21(), "/images/regnosotto.jpg", "regnosotto", new Room21().jLabel1);

        room22 = new Room(22, new Room22(), "/images/tesoro.jpg","smaug",new Room22().jLabel1);

        room23 = new Room(23, new Room23(), "/images/arken.jpg", "arkengemma", new Room23().jLabel1);

        room24 = new Room(24, new Room24(), "/images/falò.jpg", "falò", new Room24().jLabel1);

        room25 = new Room(25, new Room25(), "/images/caso.jpg", "caso", new Room25().jLabel1);

        room26 = new Room(26, new Room26(), "/images/3door.jpg", "3door", new Room26().jLabel1);

        room27 = new Room(27, new Room27(), "/images/balorg.jpg", "balrog", new Room27().jLabel1);

        room28 = new Room(28, new Room28(), "/images/baule.jpg", "baule", new Room28().jLabel1);

        room29 = new Room(29, new Room29(), "/images/filo.jpg", "filo", new Room29().jLabel1);

        room30 = new Room(30, new Room30(), "/images/fine.jpg", "sauron", new Room30().jLabel1);
        
        FINALROOM = new Room(31,new FINALROOM());
        getRooms().add(room0);
        getRooms().add(room1);
        getRooms().add(room2);
        getRooms().add(room3);
        getRooms().add(room4);
        getRooms().add(room5);
        getRooms().add(room6);
        getRooms().add(room7);
        getRooms().add(room8);
        getRooms().add(room9);
        getRooms().add(room10);
        getRooms().add(room11);
        getRooms().add(room12);
        getRooms().add(room13);
        getRooms().add(room14);
        getRooms().add(room15);
        getRooms().add(room16);
        getRooms().add(room17);
        getRooms().add(room18);
        getRooms().add(room19);
        getRooms().add(room20);
        getRooms().add(room21);
        getRooms().add(room22);
        getRooms().add(room23);
        getRooms().add(room24);
        getRooms().add(room25);
        getRooms().add(room26);
        getRooms().add(room27);
        getRooms().add(room28);
        getRooms().add(room29);
        getRooms().add(room30);
        getRooms().add(FINALROOM);
        room0.setWest(room2);
        //room0.setSouth(room2);
        room2.setSouth(room3);
        room3.setSouth(room1);
        //Mappa Leo
        room16.setWest(room17);
        room17.setEast(room16);
        room17.setWest(room18);
        room18.setEast(room17);
        room18.setNorth(room19);
        room19.setSouth(room18);
        room19.setEast(room20);
        room20.setWest(room19);
        room20.setNorth(room21);
        room21.setNorth(room22);
        room22.setSouth(room21);
        room22.setNorth(room24);
        room22.setEast(room23);
        room23.setWest(room22);//ADD
        room24.setNorth(room25);//NON POSSIBILE TORNARE INDIETRO
        room25.setNorth(room30);//BOSS
        room25.setEast(room26);
        room25.setSouth(room24);
        room26.setWest(room25);//ADD
        room26.setEast(room27);
        room26.setNorth(room28);
        room26.setSouth(room29);
        room27.setWest(room26);//ADD
        room28.setSouth(room26);
        room29.setNorth(room26);
        room30.setNorth(FINALROOM);
        room30.getThisRoom().setVisible(true);

    }
}
