package radioButtons;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {
	
	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotDogButton;
	ImageIcon pizzaIcon;
	ImageIcon hamburgerIcon;
	
	public MyFrame() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaIcon = new ImageIcon("src/icon.png");
		hamburgerIcon = new ImageIcon("src/icon2.png");
		
//		create radio button
		pizzaButton = new JRadioButton("pizza");
		hamburgerButton = new JRadioButton("hamburger");
		hotDogButton = new JRadioButton("hotdog");
		
		
//		add btn to the frame
		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotDogButton);
		

//		create a button group
		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotDogButton);
		
//		add action listener
		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotDogButton.addActionListener(this);
		
//		add icon to a button
		pizzaButton.setIcon(pizzaIcon);
		hamburgerButton.setIcon(hamburgerIcon);
		
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pizzaButton) {
			System.out.println("you ordered pizza!");
		}else if(e.getSource() == hamburgerButton) {
			System.out.println("hamburger");
		}else if(e.getSource() == hotDogButton) {
			System.out.println("you ordered a hotdog");
		}
	}
}
