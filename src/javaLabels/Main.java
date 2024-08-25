package javaLabels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		
//		image icon
		ImageIcon image = new ImageIcon("src/icon.png");
		
//		border
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		JLabel label = new JLabel();
//		set text
		label.setText("Helloow this is a label text !");
//		set image icon
		label.setIcon(image);
		
//		text positions
		label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, RIGHT
		label.setVerticalTextPosition(JLabel.TOP); // set text top center or bottom
		
//		font color
		label.setForeground(Color.white);
		
//		change font
		label.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		
//		gap of text to image
		label.setIconTextGap(20);
		
//		bg color
		label.setBackground(Color.black); // this want work until set opaque to true
		label.setOpaque(true);
		
//		set created border
		label.setBorder(border);
		
//		set positions icon+text
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		
//		top, teft, width, height - size and position
//		label.setBounds(100, 100, 250, 250);
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);

//		remove label getting full frame size error
//		frame.setLayout(null);
		
		frame.setVisible(true);
		
//		add label to frame
		frame.add(label);
		
//		ajust the frame for of the components you have , need to typed this after adding all of the components
		frame.pack();
		
	}

}
