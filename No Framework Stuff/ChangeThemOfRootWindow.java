import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class ChangeThemOfRootWindow {
	
	public static void main(String[] args) {
		JFrame root = new JFrame("window root ");
		root.setSize(500, 500);
		root.setBackground(Color.black);
		root.setLayout(new FlowLayout());
		root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// create change btn 
		JButton changeBtn = new JButton("Change theme");
		changeBtn.addActionListener(pp->{	
			
		});
		root.add(changeBtn);
		
		root.setVisible(true);
	}
}
