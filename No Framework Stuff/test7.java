import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


class test7{

	public static JPanel post(String text){
		
		JPanel poste = new JPanel();
		poste.setBackground(Color.red);
		poste.setPreferredSize(new Dimension(500,50));
		
		JButton btn = new JButton("Click " + text);
		poste.add(btn);
		
		btn.addActionListener(a->{
			System.out.println(btn.getText());
			JOptionPane popUp = new JOptionPane();
			int i =  popUp.showConfirmDialog(btn, "delete this panel ?");
			if (i == 0) System.out.println("Hide it");
			else if (i == 1) System.out.println("Cancel => no hidding");
			else System.out.println("Non");
		});
		return poste;
	}
	public static void main(String[] args) {
		JFrame root = new JFrame();
		root.setSize(500, 500);
		//root.setResizable(false);
		root.setLayout(new FlowLayout());
		root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		root.add(post("0"));
		root.add(post("1"));

		
		root.setVisible(true);
	}
}