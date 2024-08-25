package gui;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
MyFrame(){
	
//	title
	this.setTitle("Jthis title");
	
	// if click the x in this it not close the program it will hide the jthis to close the program;
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
//	do nothing when close
//	this.setDefaultCloseOperation(Jthis.DO_NOTHING_ON_CLOSE);
	
//	resizable
	this.setResizable(false);
	
	// change the logo icon
	ImageIcon image = new ImageIcon("src/icon.png");
//	set image icon to this
	this.setIconImage(image.getImage());
	
//	change background color
//	this.getContentPane().setBackground(Color.green);
	//	custom color
//	this.getContentPane().setBackground(new Color(153, 10, 97));
	this.getContentPane().setBackground(new Color(123, 50, 250));
	
//	size
	this.setSize(420, 420); // x, y
	
//	set visible
	this.setVisible(true);
}
}
