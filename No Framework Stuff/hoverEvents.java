package editFramesInfos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class hoverEvents{
	public static void main(String[] args) {
		JFrame root = new JFrame("test");
		root.setSize(500, 500);
		root.setLayout(null);
		
		JButton btn = new JButton("Button");
		btn.setBounds(20,20,100,40);
		
		root.add(btn);
		
		
		// add label to test 
		JLabel label = new JLabel("Label for test");
		label.setForeground(Color.blue);
		label.setBounds(20, 100, 200, 30);
		root.add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 300, 120, 120);
		panel.setBackground(Color.red);
		panel.setVisible(false);
		root.add(panel);
		
		// add events for mouse 
		btn.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				panel.setBounds(20, 300, 120, 140);
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
				panel.setBounds(20, 310, 120, 150);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label.setForeground(Color.blue);
				panel.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				label.setForeground(Color.red);
				panel.setVisible(true);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {				
			}
		});
	// add events for keyboard
		// make a label 
		JLabel letter = new JLabel("Key pressed : ");
		letter.setBounds(50,320, 200, 70);
		root.add(letter);
		root.setVisible(true);
		// add event of mouse in window
		btn.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent arg0) {
				// TODO Auto-generated method stub
				label.setText("Mouse position : (" + arg0.getX() + "," + arg0.getY() + ") "
						+ "\n ");
				JLabel e = new JLabel("ee");
				e.setFont(new Font("impact",Font.BOLD,50));
				e.setBounds(arg0.getX() , arg0.getY(), 20, 20);
				root.add(e);
			}
			
			@Override
			public void mouseDragged(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		// add events for key press 
		root.addKeyListener(new KeyListener() {
			String text = "";
			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				letter.setText("Typed : " + arg0.getKeyChar() + " ");
				if (!(arg0.getKeyChar() == 'v')){
					letter.setText(text);
					text += arg0.getKeyChar();
				}
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				letter.setText("Released : " + arg0.getKeyChar() + " ");
				
			}
			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				letter.setText("Pressed : " + arg0.getKeyChar() + " ttt");
				
			}
		});
		// add events of window
		root.addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Opened");
			}
			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Iconified");
			}
			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("window Deiconified");
			}
			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Disactivated");
			}
			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Closing...");
			}
			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Closed !");
			}
			@Override
			public void windowActivated(WindowEvent arg0) {
				System.out.println("Activated");
			}
		});
	}
}