package _02_static_smiley_blues;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SmileyBlues {
	void start() {
		// 1. Make a new JFrame and set it to be visible
		JFrame frame;
		JPanel panel;
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		
		frame.add(panel);
		
		
		Smiley Yellow = new Smiley();
		panel.add(Yellow);
		Smiley Blue = new Smiley();
		panel.add(Blue);
		Smiley Green = new Smiley();
		panel.add(Green);
		
		
		
		frame.pack();
		// 2. Set your frame's default close operation to JFrame.EXIT_ON_CLOSE

		// 3. Make a new JPanel

		// 4. Add your panel to your frame

		// 5. Make three Smiley objects and add them to your panel

		// 6. Pack your frame

		// 7. RUN THE PROGRAM and make sure you see three blue Smileys!
		
		// 8. DO THIS LAST: 
				// Set the Smiley class's color variable to Smiley.YELLOW (NOT a specific smiley object's!)
				// Using a specific object for a static variable works, but is not usually recommended.
				// Run it again; are your Smileys all yellow now? Also try changing them to red or green!
	}
}
