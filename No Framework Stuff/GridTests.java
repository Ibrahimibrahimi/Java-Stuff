import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class GridTests {
	public static void main(String[] args) {
		JFrame root = new JFrame("Testing grids !");
		root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		root.setSize(500,500);
		// create grid bag 
		GridBagLayout gbl = new GridBagLayout();
		root.setLayout(gbl);
		// create grid constrainct
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.weightx = 3;gbc.weighty = 1;
		gbc.fill = GridBagConstraints.BOTH;
		
		// add buttons 
		JButton btn1 = new JButton("Btn1");
		JButton btn2 = new JButton("Btn2");
		JButton btn3 = new JButton("Btn3");
		JButton btn4 = new JButton("Btn4");
		// edit grid of each button 
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 3;
		gbc.gridheight = 2;
		gbl.setConstraints(btn1, gbc);
		
		
		
		root.add(btn1);
		root.add(btn2);
		root.add(btn3);
		root.add(btn4);
		
		
		
		root.setVisible(true);
	}
}
