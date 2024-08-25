package textField;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	
	JButton button;
	JTextField textField;
	
	MyFrame() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("submit");
		button.addActionListener(this);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250, 40));

		this.add(textField);
		this.add(button);
		
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println("Welcome "+ textField.getText());
			textField.setEditable(false);
			button.setEnabled(false);
		}
	}
	
}
