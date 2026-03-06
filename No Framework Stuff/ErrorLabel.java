
package essentiels;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ErrorLabel extends JLabel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ErrorLabel(String text) {
		this.setText(text);
		this.setForeground(Color.red);
	}
	public void show(){
		this.setVisible(true);
	}
	public void hide(){
		this.setVisible(false);
	}
	public void setText(String text){
		this.setText(text);
	}
	public void addTo(JFrame container){
		container.add(this);
	}
	public void addTo(JPanel container){
		container.add(this);
	}
}
