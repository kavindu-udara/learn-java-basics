package twoDGraphics;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyPanel panel;
    MyFrame(){
        panel = new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);

        this.add(panel);
        this.pack();

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    
}
