import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Root extends JFrame {
    public Root(){
    	//JFrame = new JFrame();
    	this.setSize(500,600);
    	this.setResizable(false);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setLayout(new GridLayout(20,0));
    	// add items 
    	
    	JLabel usernameL = new JLabel("Username");
    	this.add(usernameL);
    	JTextField username = new JTextField();
    	this.add(username);
    	JLabel usernameR = new JLabel("llll");
    	usernameR.setForeground(Color.red);
    	usernameR.setVisible(false);
    	this.add(usernameR);
    	
    	JLabel passwordL = new JLabel("Password");
    	this.add(passwordL);
    	JTextField password = new JTextField();
    	this.add(password);
    	JLabel passwordR = new JLabel();
    	passwordR.setVisible(false);
    	this.add(passwordR);
    	JButton btn = new JButton("Login");
    	this.add(btn);
    	
	}
    public void show() {
    	this.setVisible(true);    	
    }
	
	
	
}


public class PasswordChangeTest   {
	public static void main(String[] args) {
		
	}
}
