package net.diamonddev.texgeon;

import net.diamonddev.texgeon.main.Game;

public class Texgeon {

    public static final String TEXGEON_ID = "texgeon";

    public static void main(String[] args) {
        new Game();
    }

    public static void DataLogger(String id, String data) {
        System.out.println("[" + id + "] " + data);
    }


}
