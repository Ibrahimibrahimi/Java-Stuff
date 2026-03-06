import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class LabelErrorStructureTexted {
	public static void error(String error,JLabel label){
		label.setText(error);
		label.setVisible(true);
	}
	public static void main(String[] args) {
		JFrame window = new JFrame("My window");
		window.setSize(500,700);
		window.setResizable(false);
		window.setLayout(new GridLayout(20,12));
		
		// add label 
		JLabel username = new JLabel("Username ");
		
		// add input
		JTextArea input = new JTextArea();
		input.setBackground(new Color(0x431245));
		input.setForeground(Color.white);
		input.setSize(200, 50);
		
		// add error label 
		JLabel errorLabel = new JLabel();
		errorLabel.setForeground(Color.red);
		errorLabel.setSize(errorLabel.getWidth(), 0);
		errorLabel.setVisible(false); // hide until we found error
		
		// add button 
		JButton btn = new JButton("Valider");
		btn.addActionListener(event->{
			String name = input.getText();
			if (name == "ibrahim"){
				System.out.println("Welcome"); // if correct
			}else if (name.length() >= 5){
				error("Username incorrect", errorLabel);
			}else {
				error("Username should be more than 5 letters",errorLabel);
			}
		});
		
		window.add(username);
		window.add(input);
		window.add(errorLabel);
		window.add(btn);
		window.setVisible(true);
	}
}
