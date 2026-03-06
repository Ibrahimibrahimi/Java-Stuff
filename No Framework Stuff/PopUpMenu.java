import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class PopUpMenu {
	public static void main(String[] args) {
		JFrame frame = new JFrame("root window");
		// pop up
		JOptionPane.showMessageDialog(frame, "Hello, Swing!");
		frame.setVisible(true);
		
	}
}
