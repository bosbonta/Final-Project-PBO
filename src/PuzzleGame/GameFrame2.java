package PuzzleGame;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


import javax.swing.JFrame;

public class GameFrame2 extends JFrame{
    GameFrame2(){
        this.setVisible(true);
        this.add(new EightPuzzle());
        this.pack();
        this.setTitle("Snake : Seduce and Swallow You");
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
}