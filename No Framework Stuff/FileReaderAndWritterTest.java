import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class FileReaderAndWritterTest {

	public static void main(String[] args) {
		
		JFrame root = new JFrame("File editor");
		root.setSize(500,500);
		root.setResizable(false);
		root.setLayout(new GridLayout(20,0));

		// create label
		JLabel l1 = new JLabel("File name");
		root.add(l1);
		// create input for filename 
		JTextArea fileName = new JTextArea();
		fileName.setPreferredSize(new Dimension(200,300));
		root.add(fileName);
		// create label error if fileName contains non specified letters %,/,*,....etc
		JLabel error = new JLabel("FileName can contains only letters and numbers !");
		error.setForeground(Color.red);
		error.setVisible(false);
		root.add(error);
		// create label
		JLabel l2 = new JLabel("File content");
		root.add(l2);
		// create content input 
		JTextField fileContent = new JTextField();
		root.add(fileContent);
		// create button
		JButton createBtn = new JButton();
		String nonAcceptedChars[] = new String[]{"/","*","(",")","{","}","%","µ","^","£"}; 
		createBtn.addActionListener(p->{
			String FileName = fileName.getText();
			String FileText = fileContent.getText();
			for(String l : nonAcceptedChars){
				if (fileName.equals(l)){
					error.setVisible(true);
					break;
				}
			}
		});
		createBtn.setText("Create");
		root.add(createBtn);
		
		
		root.setVisible(true);
	}

}
