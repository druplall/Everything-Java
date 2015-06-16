import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * It Keeps components Stackedm even if there's room to put them side by side.
 * 
 * Unlike FlowLayout, BoxLayout can force a "new Line" to make the components wrap to the next line, even if there's room for them
 * to fit horizontally
 */
public class BoxLayout {

public void go(){
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setSize(200, 200);
		frame.setVisible(true);
		
	}
}
