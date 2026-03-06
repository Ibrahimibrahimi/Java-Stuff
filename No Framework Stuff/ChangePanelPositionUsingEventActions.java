import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ChangePanelPositionUsingEventActions {

	public static void main(String[] args) {
		JFrame root = new JFrame("game stimulation");
		root.setSize(500, 500);
		root.getContentPane().setBackground(Color.white);
		root.setLayout(new FlowLayout());
		// add panel 
		JPanel p = new JPanel();
		p.setBackground(new Color(0x132656));
		p.setPreferredSize(new Dimension(50,50));
		// add a button 
		JButton btn = new JButton("Click x ");
		btn.setPreferredSize(new Dimension(200,50));
		btn.setAlignmentY(50);
		btn.setBackground(new Color(0x431265));
		btn.addActionListener(e->{
			p.setLocation(p.getX() + 5, p.getY()); 
			System.out.printf("X : %f Y:%f",p.getX(),p.getY());
			});
		
		JButton btn1 = new JButton("Click x ");
		btn1.setPreferredSize(new Dimension(200,50));
		btn1.setAlignmentY(50);
		btn1.setBackground(new Color(0x431265));
		btn1.addActionListener(e->{ 
			p.setLocation(p.getX(), p.getY()+5); 
			System.out.printf("X : %.2f Y:%.2f",p.getX(),p.getY());
		});
		
		
		root.add(p);
		root.add(btn);
		root.add(btn1);
		root.setVisible(true);
	}

}
