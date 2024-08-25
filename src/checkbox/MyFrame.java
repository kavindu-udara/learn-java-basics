package checkbox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	JButton button;
	JCheckBox checkbox;
	ImageIcon icon1;
	ImageIcon icon2;
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		icon1 = new ImageIcon("src/icon.png");
		icon2 = new ImageIcon("src/icon2.png");
		
		button = new JButton();
		button.setText("submit");
//		ad action listener
		button.addActionListener(this);
		
		checkbox = new JCheckBox();
		
//		add checkbox
		this.add(checkbox);
		this.add(button);
		checkbox.setText("I'm not a robot");
		checkbox.setFocusable(false);
//		add icons to checkbox
		checkbox.setIcon(icon1);
		checkbox.setSelectedIcon(icon2);
		
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
//			check is check box selected or not
//			checkbox.isSelected();
			System.out.println(checkbox.isSelected());
		}
	}
}
