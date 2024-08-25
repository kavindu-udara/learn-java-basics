package panels;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImageIcon icon = new ImageIcon("src/icon.png");
		
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(icon);
		
//		set label alignment
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.RIGHT);
		
//		create a panel
		JPanel redPanel = new JPanel();
//		change bg color
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		

		JPanel bluePanel = new JPanel();
//		change bg color
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);

		JPanel greenPanel = new JPanel();
//		change bg color
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(new BorderLayout());
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750, 750);
		frame.setVisible(true);
		
//		add label to green panel
		greenPanel.add(label);
		
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		
	}

}
