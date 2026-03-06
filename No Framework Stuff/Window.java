package essentiels;

import javax.swing.JFrame;

public class Window extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Window(String text,int width,int height,boolean canReseize){
		this.setTitle(text);
		this.setBounds(this.getX(), this.getY(), width, height);
		this.setResizable(canReseize);
	}
	public void show(){
		this.setVisible(true);
	}
	public void hide(){
		this.setVisible(false);
	}
}
