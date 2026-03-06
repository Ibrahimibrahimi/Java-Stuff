import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class EditWindowContentUsingAnotherWindowInputs {
	public static void main(String[] args) {
		// main window
		JFrame Main = new JFrame();
		Main.setSize(500, 500);
		Main.setResizable(false);
		JLabel MainText = new JLabel("Main text (no changes)");
		MainText.setFont(new Font("Tahoma",Font.BOLD,30));
		Main.add(MainText);
		Main.setLayout(new FlowLayout());
		// create subMain 
		JFrame subMain = new JFrame("Sub main to edit text");
		subMain.setSize(500,500);
		subMain.setLayout(new GridLayout(5,0));
		// create input + button for main text editing 
		JTextField input = new JTextField();
		subMain.add(input);
		JButton editBtn = new JButton("Done");
		editBtn.addActionListener(op->{
			MainText.setText(input.getText());
			subMain.setVisible(false); // hide edit window
		});
		subMain.add(editBtn);

		subMain.setVisible(false);
		// button to show sub main window
		JButton btn = new JButton("Edit");
		btn.addActionListener(p->{
			input.setText(MainText.getText());
			subMain.setVisible(true); // show edit window
		});
		Main.add(btn);
		
		Main.setVisible(true);
	}
}
