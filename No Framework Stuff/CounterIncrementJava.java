
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;
public class CounterIncrementJava {
	public static void main(String[] args) {
		// make a counter 
		int a = 0;
		JFrame root = new JFrame("Title ");
		//root.setResizable(false);
		root.setSize(500, 500);
		root.getContentPane().setBackground(new Color(60,60,146));
		root.setLayout(new FlowLayout());
		// create a container
		JPanel container = new JPanel();
		container.setPreferredSize(new Dimension(300,450));
		container.setBackground(new Color(0x001657));
		// create a container of label 
		JPanel labelContainer  = null;
		labelContainer = new JPanel();
		labelContainer.setBackground(new Color(0x135246));
		labelContainer.setPreferredSize(new Dimension(300,70));
		// create a text label for this container 
		JLabel label;
		label = new JLabel("Counter : " + a);
		label.setForeground(Color.white);
		// create input 
		JTextField input = new JTextField();
		input.setPreferredSize(new Dimension(200,30));
		input.setBorder(null);
		input.setBackground(new Color(0x431652));
		input.setForeground(Color.white);
		
		
		// create a button 
		JButton btn = new JButton("Click");
		btn.setBackground(new Color(135,23,16));
		btn.setForeground(Color.red);
		btn.setPreferredSize(new Dimension(100,30));
		btn.setBorder(null);
		btn.addActionListener(e->{
			String b = input.getText();
			System.out.println("Input text : " + b);
			label.setText("Counter : " + a);
		});
		
		// add elements 
		
		labelContainer.add(label);
		container.add(labelContainer);
		container.add(input);
		container.add(btn);
		root.add(container);
		
		root.setVisible(true);
		
	}
}
