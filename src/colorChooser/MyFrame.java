package colorChooser;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setText("This is some text :D");
        label.setFont(new Font("Sans Serif", Font.PLAIN, 100));

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button) {
            // create a color chooser
            JColorChooser colorChooser = new JColorChooser();
            // create a dialog box
            Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);

            // set selcted color to label
            // label.setForeground(color);
            label.setBackground(color);

        }
    }
}
