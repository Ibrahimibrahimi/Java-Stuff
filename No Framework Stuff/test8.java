
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.time.LocalDate;

import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class test8 {
	public static void main(String[] args) {
		JFrame root = new JFrame("My test login");
		root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		root.setLayout(new GridBagLayout());
		root.setResizable(false);
		root.setSize(500,700);
		
		// container 
		JPanel container = new JPanel();
		container.setBackground(Color.red);
		container.setPreferredSize(new Dimension(400,550));
		container.setLayout(new FlowLayout());
		root.add(container);
		
		// title of window
		JLabel title = new JLabel("Login");
		title.setFont(new Font("Agency fb",Font.BOLD,60));
		container.add(title);
		
		// add panel for forme
		JPanel form = new JPanel();
		form.setBackground(Color.green);
		form.setPreferredSize(new Dimension(350,450));
		container.add(form);
		
		// empty panel to make a top padding 
		JPanel space = new JPanel();
		space.setPreferredSize(new Dimension(350,60)); // 100px of padding 
		space.setBackground(null);
		form.add(space);
		
		// ------------------------- username field---------------------------
			// add container for : label + input 
			JPanel inputContainerN = new JPanel();
			inputContainerN.setPreferredSize(new Dimension(360,110));
			inputContainerN.setBackground(Color.yellow);
			form.add(inputContainerN);
			
			// add label under inputContainerN 
			JLabel uLabel = new JLabel("username");
			uLabel.setPreferredSize(new Dimension(350,20));
			inputContainerN.add(uLabel);
			
			// add input under inputContainerN 
			JTextField uInput = new JTextField();
			uInput.setPreferredSize(new Dimension(350,40));
			uInput.setBorder(null);
			uInput.setForeground(Color.white);
			uInput.setBackground(new Color(12,76,113));
			inputContainerN.add(uInput);
			
			// add label for username errors(empty field or username not found)
			JLabel errorN = new JLabel("Error username");
			errorN.setPreferredSize(new Dimension(350,20));
			errorN.setForeground(Color.red);
			errorN.setVisible(false);
			inputContainerN.add(errorN);
		//----------------------------- password field-----------------------------------
				// add container for : label + input 
				JPanel inputContainerP = new JPanel();
				inputContainerP.setPreferredSize(new Dimension(360,110));
				inputContainerP.setBackground(Color.yellow);
				form.add(inputContainerP);
				
				// add label under inputContainerN 
				JLabel pLabel = new JLabel("Password ");
				pLabel.setPreferredSize(new Dimension(350,20));
				inputContainerP.add(pLabel);
				
				// add input under inputContainerN 
				JTextField pInput = new JTextField();
				pInput.setPreferredSize(new Dimension(350,40));
				pInput.setBorder(null);
				pInput.setForeground(Color.white);
				pInput.setBackground(new Color(12,76,113));
				inputContainerP.add(pInput);
				
				// add label for username errors(empty field or username not found)
				JLabel errorP = new JLabel("Error password");
				errorP.setPreferredSize(new Dimension(350,20));
				errorP.setForeground(Color.red);
				errorP.setVisible(false);
				inputContainerP.add(errorP);
		// button
		JButton loginBtn = new JButton("Login");
		loginBtn.setPreferredSize(new Dimension(100,39));
		loginBtn.setBorder(null);
		loginBtn.setBackground(new Color(45,75,165));
		loginBtn.setForeground(Color.white);
		form.add(loginBtn);
		// add event click 
		loginBtn.addActionListener(e->{
			// get input values and check their availabity
			String username = uInput.getText();
			String password = pInput.getText();
			
			// clear labels 
			errorN.setText("");
			errorP.setText("");
			
			// check if empty 
			if (username.equals("")){
				errorN.setText("Empty field!");
				errorN.setVisible(true);
			}
			// check if correct 
			if (!username.equals("ibrahim")){ // if username not correct
				errorN.setText("incorrect!");
			}
			if (password.equals("")){
				errorP.setText("Empty field!");
				errorP.setVisible(true);
			}else {
				if (!password.equals("0000")){ // if password not correct
					errorP.setText("incorrect !");
				}
			}			
			
		});
		// --------------------------------- sign in window componements ----------------
		JFrame sign = new JFrame("Sign in test");
		sign.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sign.setLayout(new GridBagLayout());
		sign.setResizable(false);
		sign.setSize(500,700);
		
		// add title to sign 
		// container 
				JPanel containers = new JPanel();
				containers.setBackground(Color.red);
				containers.setPreferredSize(new Dimension(400,550));
				containers.setLayout(new FlowLayout());
				sign.add(containers);
		// title 
				// title of window
				JLabel titles = new JLabel("Sign in");
				titles.setFont(new Font("Agency fb",Font.BOLD,60));
				containers.add(titles);
		// form 
				// add panel for forme
				JPanel forms = new JPanel();
				forms.setBackground(Color.green);
				forms.setPreferredSize(new Dimension(350,450));
				containers.add(forms);
		// space 
				// empty panel to make a top padding 
				JPanel spaces = new JPanel();
				spaces.setPreferredSize(new Dimension(350,60)); // 100px of padding 
				spaces.setBackground(null);
				forms.add(space);
		// input username 
								
				// add container for : label + input 
				JPanel inputContainerNs = new JPanel();
				inputContainerNs.setPreferredSize(new Dimension(360,110));
				inputContainerNs.setBackground(Color.yellow);
				forms.add(inputContainerNs);
				
				// add label under inputContainerN 
				JLabel uLabels = new JLabel("Username ");
				uLabels.setPreferredSize(new Dimension(350,20));
				inputContainerNs.add(uLabels);
				
				// add input under inputContainerN 
				JTextField uInputs = new JTextField();
				uInputs.setPreferredSize(new Dimension(350,40));
				uInputs.setBorder(null);
				uInputs.setForeground(Color.white);
				uInputs.setBackground(new Color(12,76,113));
				inputContainerNs.add(uInputs);
				
				// add label for username errors(empty field or username not found)
				JLabel errorNs = new JLabel("Error username");
				errorNs.setPreferredSize(new Dimension(350,20));
				errorNs.setForeground(Color.red);
				errorNs.setVisible(false);
				inputContainerNs.add(errorNs);
		// number phone input container
				// add container for : label + input 
				JPanel inputContainerNs1 = new JPanel();
				inputContainerNs1.setPreferredSize(new Dimension(360,110));
				inputContainerNs1.setBackground(Color.yellow);
				forms.add(inputContainerNs1);
				
				// add label under inputContainerN 
				JLabel uLabels1 = new JLabel("Phone number ");
				uLabels1.setPreferredSize(new Dimension(350,20));
				inputContainerNs.add(uLabels1);
				
				// add input under inputContainerN 
				JTextField uInputs1 = new JTextField();
				uInputs1.setPreferredSize(new Dimension(350,40));
				uInputs1.setBorder(null);
				uInputs1.setForeground(Color.white);
				uInputs1.setBackground(new Color(12,76,113));
				inputContainerNs.add(uInputs1);
				
				// add label for username errors(empty field or username not found)
				JLabel errorNs1 = new JLabel("Error username");
				errorNs1.setPreferredSize(new Dimension(350,20));
				errorNs1.setForeground(Color.red);
				errorNs1.setVisible(false);
				inputContainerNs.add(errorNs1);
				
				
		// add sign in redirecting label 
				JButton a = new JButton("No account? sign in");
				a.setPreferredSize(new Dimension(350,50));
				a.setBackground(null);
				a.setBorder(null);
				a.addActionListener(e->{
					// show sign in window
					sign.setVisible(true);
					
					// hide login window
					root.setVisible(false);
				});
				form.add(a);
		root.setVisible(true);
	}
}
