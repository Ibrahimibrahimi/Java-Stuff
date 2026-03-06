
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class test2 {
	public static void main(String[] args) {
		JFrame root = new JFrame();
		root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		root.setSize(500,500);
		root.setLayout(new GridLayout(10,50));
		//root.setResizable(false);
		
		// create label
		JLabel label[] = new JLabel[2];
		JTextField inputTxt = new JTextField();
		JPasswordField inputPass = new JPasswordField();
		// create username label
		label[0] = new JLabel("Username ");
		label[0].setForeground(Color.black);
		label[0].setFont(new Font("Consolas",Font.BOLD,20));
		// create username text field input 
		inputTxt.setFont(new Font("Consolas",Font.BOLD,20));
		inputTxt.setBackground(Color.gray);
		inputTxt.setForeground(Color.white);
		
		// create password label
		label[1] = new JLabel("Password");
		label[1].setForeground(Color.black);
		label[1].setFont(new Font("Consolas",Font.BOLD,20));
		// create password input 
		inputPass.setBackground(Color.gray);
		inputPass.setForeground(Color.white);
		
		// create a button
		JButton loginBtn = new JButton("Login");
		loginBtn.setBackground(new Color(12,44,45));
		loginBtn.setForeground(Color.white);
		loginBtn.setFont(new Font("Arial",Font.BOLD,20));
		loginBtn.addActionListener(p->{
			String nom = inputTxt.getText();
			String password = inputPass.getText();
			System.out.printf("Nom : %s ; Password : %s ",nom,password);
			
		});
		
		// append all to root window
		root.add(label[0]);
		root.add(inputTxt);
		root.add(label[1]);
		root.add(inputPass);
		root.add(loginBtn);
		
		// make window visible
		root.setVisible(true);
	}
}
