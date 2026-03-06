

import java.awt.Color;

import javax.swing.*;


public class test9 {
	public static JFrame window(String title , int width , int height){
		JFrame root = new JFrame(title);
		root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		root.setSize(width,height);
		root.setResizable(true);
		root.setLayout(null);
		root.setUndecorated(true);// remove borders
		root.setLocationRelativeTo(null); 
		return root;
	}
	public static void setBg(JPanel d ,Color color){
		d.setBackground(color);
	}
	public static void setBg(JFrame d ,Color color){
		d.getContentPane().setBackground(color);
	}
	public static void main(String[] args) {
		JFrame r = window("my window", 500, 500);
		setBg(r, new Color(12,44,65));
		
		// close btn
		JButton close = new JButton("X");
		close.setBounds(r.getWidth() - 50,0,50,50);
		close.setBorder(null);
		close.setBackground(Color.red);
		close.addActionListener(e->{
			r.setVisible(false);
		});
		
		r.add(close);
		
		r.setVisible(true);
	}
}
