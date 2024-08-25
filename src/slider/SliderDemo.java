package slider;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo implements ChangeListener{

	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	public SliderDemo() {
		// TODO Auto-generated constructor stub
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
//		create slider start, end, middle value
		slider = new JSlider(0,100);
		
		slider.setPreferredSize(new Dimension(400, 200));
		
//		add slider texts
		slider.setPaintTicks(true);
//		ranges
		slider.setMinorTickSpacing(10);
		

//		add slider texts
		slider.setPaintTrack(true);
//		add larger text
		slider.setMajorTickSpacing(25);
		
//		add numbers
		slider.setPaintLabels(true);
		
//		make slider vertical
		slider.setOrientation(SwingConstants.VERTICAL);
		
		label.setText("C = "+slider.getValue());
		
//		add change listener to slider
		slider.addChangeListener(this);
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420, 420);
		frame.setVisible(true);
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		label.setText("C = "+slider.getValue());
	}
	
}
