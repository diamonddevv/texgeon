package net.diamonddev.texgeon.main;

import net.diamonddev.texgeon.Texgeon;

public class Game {
    private GamePanel gamePanel;
    private GameWindow gameWindow;


    public Game() {
        // Data Logging
        Texgeon.DataLogger(Texgeon.TEXGEON_ID, "Texgeon has Loaded. Have Fun!");

        // Window
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);



    }
}
