import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * FlowLayout cares about the flow of the components:
 * Left to right, top to bottom, in the order they were added.
 */


public class FlowLayout {
	
	public void go(){
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setSize(200, 200);
		frame.setVisible(true);
		
	}

}
