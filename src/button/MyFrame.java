package button;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {
	JButton button;
	JLabel label;
	public MyFrame() {
		// TODO Auto-generated constructor stub
		
//		icon
		ImageIcon icon = new ImageIcon("src/icon.png");
		
//		label
		label = new JLabel();
		label.setIcon(icon);
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);
		
//		create button
		button = new JButton();
		button.setBounds(200, 100, 100, 50);
		
//		add actionlistener to the button with lamda expression
//		button.addActionListener(e -> System.out.println("booh1"));
		button.addActionListener(this);
		
//		set btn text
		button.setText("button");
		
//		focus
		button.setFocusable(false);
		
//		set btn icon
		button.setIcon(icon);
		
//		btn text position
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		
		button.setBackground(Color.DARK_GRAY);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
//			System.out.println("booh");
			label.setVisible(true);
		}
	}
}
