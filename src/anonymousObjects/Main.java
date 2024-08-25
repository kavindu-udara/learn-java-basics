package anonymousObjects;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        // create array of jlables
        ArrayList<JLabel> deck = new ArrayList<JLabel>();

        // create nameless object
        deck.add(new JLabel(new ImageIcon("src/icon.png")));

        deck.add(new JLabel(new ImageIcon("src/icon2.png")));

        frame.add(deck.get(0));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

    }
}
