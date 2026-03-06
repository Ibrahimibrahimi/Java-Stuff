import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class ShowAndHideWindowChildUsingWindowRootAndButtons {
	public static void main(String[] args) {
		// first window
		JFrame root = new JFrame("root test");
		root.setSize(500, 500);
		root.setBackground(new Color(0x439576));
		root.setLayout(new FlowLayout());
		root.setVisible(true);
		// second window
		JFrame child = new JFrame("child test");
		child.setSize(500, 500);
		child.setBackground(new Color(0x731645));
		child.setVisible(false); // hidden until button pressed
		
		// add button in root 
		JButton showBtn = new JButton("Show child window");
		showBtn.setBackground(Color.red);
		showBtn.setVisible(true);
		JButton hideBtn = new JButton("Hide child window");
		hideBtn.setBackground(Color.red);
		hideBtn.setVisible(true);
		// remove borders 
		hideBtn.setBorder(null);
		showBtn.setBorder(null);
		// adjust button size
		hideBtn.setPreferredSize(new Dimension(150,30));
		showBtn.setPreferredSize(new Dimension(150,30));
		root.add(showBtn);
		root.add(hideBtn);
		
		showBtn.addActionListener(event->{
			child.setVisible(true);
		});
		hideBtn.addActionListener(event->{
			child.setVisible(false);
		});
		
		root.add(hideBtn);
		root.add(showBtn);
		
	}
}
