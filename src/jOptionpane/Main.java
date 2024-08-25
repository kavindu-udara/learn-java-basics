package jOptionpane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.ERROR_MESSAGE);
		
//		confirm dialog
//		int answer = JOptionPane.showConfirmDialog(null, "do yo code", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
//		String name = JOptionPane.showInputDialog("What is your name");
//		System.out.println(name);
		
		String[] responses = {"No, you're awesome!", "Thank you", "bluhk"};
		ImageIcon icon = new ImageIcon("src/icon.png");
		
		JOptionPane.showOptionDialog(
				null, 
				"You are awesome", 
				"secret message", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				icon, 
				responses, 
				0
			);
		
	}

}
