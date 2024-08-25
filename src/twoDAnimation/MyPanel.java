package twoDAnimation;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener{

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image icon;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        icon = new ImageIcon("src/icon.png").getImage();
        backgroundImage = new ImageIcon("src/background.png").getImage();
        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g){
        super.paint(g); // this will paint bg
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(icon, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x >= PANEL_WIDTH-icon.getWidth(null) || x <0){
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;
        
        if(y >= PANEL_HEIGHT-icon.getHeight(null) || y <0){
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        repaint();
    }
}
