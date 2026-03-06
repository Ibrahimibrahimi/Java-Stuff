import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class LikeDislike {
	public static void main(String[] args) {
		JFrame root = new JFrame();
		root.setLayout(new FlowLayout());
		root.setSize(500,500);
		root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int likes = 0; // nombre actuel des likes
		boolean active = false; // l'etat du boutton
		
		
		// text affichant le nombre des likes 
		JLabel text = new JLabel(likes + "");
		
		// boutton pour incrémenter les likes
		JButton btn = new JButton("Like");
		
		// event click 
		btn.addActionListener(e->{
			int i = Integer.parseInt(text.getText());
			btn.setText(btn.getText() == "dislike"?"like":"dislike");
			i = btn.getText() == "like"?i-1:i+1; // changer les likes
			text.setText(i +"");
		});
		
		
		root.add(text);
		root.add(btn);
		root.setVisible(true);
	}
}
