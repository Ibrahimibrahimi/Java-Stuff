import java.awt.Color;
import java.awt.GridLayout;
import java.security.spec.PSSParameterSpec;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class editPassword {
	public static void main(String[] args) {
		JFrame root = new JFrame("Edit password");
		root.setSize(500, 600);
		root.setResizable(false);
		root.setLayout(null);
		root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// current password 
		String psw = "0000";
		
		// make label 
		JLabel password = new JLabel("Password");
		password.setBounds(50,100,200,30);
		root.add(password);
		
		// input (non modifiable)
		JTextField passwordI = new JTextField();
		passwordI.setText(psw);
		passwordI.setBounds(50,130,200,30);
		passwordI.setEditable(false);
		root.add(passwordI);		
		
		// add a button to modify => show modification window 
		JButton modifyBtn = new JButton("Modify");
		modifyBtn.setBounds(50, 200, 120, 40);
		root.add(modifyBtn);
		
		// make another window for modification 
		JFrame modifyR = new JFrame("Modify the password");
		modifyR.setResizable(false);
		modifyR.setLocationRelativeTo(null);
		modifyR.setSize(300, 400);
		modifyR.setLayout(null);
		// add inputs 
		   // for old password
				JLabel oldPL = new JLabel("Old Password");
				oldPL.setBounds(50,50,200,30);
				modifyR.add(oldPL);
				
				// input (non modifiable)
				JTextField oldPI = new JTextField();
				oldPI.setBounds(50,80,200,30);
				modifyR.add(oldPI);	
				// error label if not the same 
				JLabel OldErr = new JLabel("Not the old one!");
				OldErr.setVisible(false);
				OldErr.setBounds(50,100,200,30);
				OldErr.setForeground(Color.red);
				modifyR.add(OldErr);
		  // for new password 
				JLabel newL = new JLabel("new Password");
				newL.setBounds(50,130,200,30);
				modifyR.add(newL);
				JTextField newI = new JTextField();
				newI.setBounds(50,160,200,30);
				modifyR.add(newI);	
				// error label if not the same 
				JLabel newErr = new JLabel("cannot use");
				newErr.setVisible(false);
				newErr.setBounds(50,180,200,30);
				newErr.setForeground(Color.red);
				modifyR.add(newErr);
		// for verify new password 
				JLabel RenewL = new JLabel("verify password");
				RenewL.setBounds(50,210,200,30);
				modifyR.add(RenewL);
				JTextField RenewI = new JTextField();
				RenewI.setBounds(50,240,200,30);
				modifyR.add(RenewI);	
				// error label if not the same 
				JLabel RenewErr = new JLabel("not the same password");
				RenewErr.setVisible(false);
				RenewErr.setBounds(50,260,200,30);
				RenewErr.setForeground(Color.red);
				modifyR.add(RenewErr);
		// for button Done
				JButton done = new JButton("Done");
				//done.setEnabled(false); // disable until we have no errors
				done.setBounds(50,300,120,39);
				modifyR.add(done);
				
				// add events 
				done.addActionListener(z->{
					// if empty 
					if(oldPI.getText().equals("")){
						OldErr.setText("Empty !");
						OldErr.setVisible(true);
					}
					// check if not the correct old password 
					if (!oldPI.getText().equals(psw)){
						OldErr.setVisible(true);
						OldErr.setText("Not the same old one");
						return ;
					}else {
						OldErr.setVisible(false);
						OldErr.setText("");
					}
					// verify new password length 
					if (!(newI.getText().length() >= 8)){
						newErr.setText("Password is too short");
						newErr.setVisible(true);
						return;
					}else {
						newErr.setVisible(false);
					}
					
					// verify if they are the same 
					if (!newI.getText().equals(RenewI.getText())){
						RenewErr.setText("Passwords should be the same");
						RenewErr.setVisible(true);
						return ;
					}else {
						RenewErr.setVisible(true);
						RenewErr.setText("");
					}
					passwordI.setText(newI.getText()); // update
				});
				
		modifyBtn.addActionListener(e->{
			modifyR.setVisible(true);
		});
		root.setVisible(true);
	}
}