import java.awt.GridLayout;

import javax.swing.*;


public class CreateDropDownList {
	public static void main(String[] args) {
		// root window
		JFrame frame = new JFrame("Root window");
		frame.setLayout(new GridLayout(8,0));
		
		String[] options = {"Item 1", "Item 2", "Item 3"};
		JComboBox<String> comboBox = new JComboBox<>(options);
		comboBox.addActionListener(p->{
			System.out.println(p);
		});
		frame.add(comboBox);
		// slider
		JSlider slider = new JSlider(0, 100, 50);
		frame.add(slider);
		
		frame.setVisible(true);
	}
}
