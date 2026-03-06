import java.awt.Color;
import java.awt.Font;

import javax.swing.*;


public class test10 {
	public static void main(String[] args) {
		JFrame root = new JFrame("My test window");
		root.setResizable(false);
		root.setSize(500,700);
		root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//root.setUndecorated(true); // no borders , buttons and cannot be draggable
		root.setLocationRelativeTo(null); // centered
		root.setLayout(null); // elements can change position using setBounds(x,y,w,h)
		root.getContentPane().setBackground(new Color(45,76,65)); // change bg of main window
		root.setBounds(0,0,500,700);
		
		// create icon image objet to make it as an icon for our window
		root.setIconImage(new ImageIcon("tank.png").getImage());
		
		
		// add label for test 
		JLabel text = new JLabel(); // créer un objet label initialisée d'un texte
		text.setText("Test Test Text 1 ");
		text.setFont(new Font("Agency fb",Font.BOLD,20)); // changer la font family 
		text.setBounds(50,350,300,30); // changer la position x , y et la taille : largeur longueur
		text.setForeground(Color.white); // changer m'arrière plan
		
		
		// add a button 
		JButton btn = new JButton();
		btn.setText("Click"); // modifier le text 
		btn.setBounds(50,280,70,30); // changer la position x , y et la taille : largeur longueur
		btn.setBackground(Color.blue); // change bakcground 
		btn.setForeground(Color.white);
		btn.setFocusPainted(false); // remove text borders under button
		btn.setBorder(null); // remove borders
		
		// input 
		JTextField input = new JTextField();
		input.setBounds(50,200,200,50);
		input.setBackground(new Color(45,66,122));
		input.setForeground(Color.white);
		input.setFont(new Font("Agency fb",Font.BOLD,20)); // changer la font family 
		input.setBorder(null);
		input.setText("rrrr");
		
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.red);
		panel1.setBounds(50,400,50,50);
		
		root.add(panel1);
		
		
		
		
		panel1.add(input);
		root.add(btn); // ajouter a la fenetre principale
		root.add(text);
		root.setVisible(true);
	}
}
