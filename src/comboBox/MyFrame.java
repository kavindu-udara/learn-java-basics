package comboBox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	JComboBox comboBox;
public MyFrame() {
	// TODO Auto-generated constructor stub
	this.setLayout(new FlowLayout());
	
//	create combobox content
	String[] animals = {"dog", "cat", "bird"};
	
//	create combo box
	comboBox = new JComboBox(animals);
	comboBox.addActionListener(this);
	comboBox.addItem("horse");
	comboBox.setEditable(true);
	
//	add selected item index
	comboBox.setSelectedIndex(2);
	
	comboBox.removeItem("cat");
//	remove using index
	comboBox.removeItemAt(1);
//	clear combo box
	comboBox.removeAll();
	
	this.add(comboBox);
	this.pack();
	this.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == comboBox) {
		System.out.println(comboBox.getSelectedItem());;
	}
}


}
