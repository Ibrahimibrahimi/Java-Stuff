import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class ScrollPanel {
	public static void main(String[] args) {
		JFrame root = new JFrame("scroll panel test");
		root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		root.setSize(500,700);
		root.setLayout(new FlowLayout());
		root.setResizable(true);
		
		// create a scroll text area non editable = false (choice 1 )
		JTextArea text = new JTextArea(20,12);
		text.setEditable(true);
		// create a scrolled panel for the text area (container)
		JScrollPane scrollPanel = new JScrollPane(text); // took as params text area onject 
		scrollPanel.scrollRectToVisible(new Rectangle(50,0));
		root.getContentPane().add(scrollPanel);
		
		root.setVisible(true);
	}
}
