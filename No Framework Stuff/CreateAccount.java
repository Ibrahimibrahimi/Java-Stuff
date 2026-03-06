import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class CreateAccount {
	public static JPanel Post(String username , String Date , Color profile,String text,int i , int j){
		// create post form 
				JPanel post = new JPanel();
				post.setPreferredSize(new Dimension(450,300));
				post.setBackground(new Color(43,111,123));
				post.setLayout(null);
				// create profile image 
				JPanel postAuthorProfile = new JPanel();
				postAuthorProfile.setBounds(5,5,60,60);
				postAuthorProfile.setBackground(profile);
				post.add(postAuthorProfile);
				// post name
				JLabel postAuthor = new JLabel(username);
				postAuthor.setBounds(75,10,200,30);
				postAuthor.setForeground(Color.white);
				postAuthor.setFont(new Font("Agency fb",Font.BOLD,30));
				post.add(postAuthor);
				// post date 
				JLabel date = new JLabel(Date);
				date.setBounds(75,40,200,20);
				date.setForeground(Color.gray);
				date.setFont(new Font("Agency fb",Font.BOLD,15));
				post.add(date);
				// post text 
				JTextArea postText = new JTextArea(8,80);
				postText.setText(text);
				postText.setBackground(post.getBackground()); // remove bg
				postText.setFont(new Font("Agency fb",postText.getFont().getStyle(),15));
				postText.setEditable(false);
				postText.setLineWrap(true);
				postText.setForeground(Color.white);
				postText.setBounds(5, 70, 440, 180);
				post.add(postText);
				// make like / comments buttons 
				JButton likeBtn = new JButton( i + "Likes");
				likeBtn.setBounds(420 - 80, 290 - 30, 100, 30);
				likeBtn.setBackground(Color.blue);
				likeBtn.setForeground(Color.white);
				likeBtn.setFocusable(false);
				likeBtn.setBorder(null);
				likeBtn.addActionListener(new ActionListener() {
					boolean postLiked = false;
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						int l = Integer.parseInt(likeBtn.getText().replace("Likes", ""));
						postLiked = (postLiked)?false:true;
						if (postLiked){
							likeBtn.setBackground(Color.BLACK);
						}else {
							likeBtn.setBackground(Color.blue);
						}
						l = (postLiked)?l+1:l-1;
						likeBtn.setText(l + "Likes");
					}
				});
				post.add(likeBtn);
				
				return post;
	}
	public static void main(String[] args) {
		// create an post form 
		JFrame root = new JFrame("post");
		root.setLayout(new FlowLayout());
		root.setSize(500,700);
		root.setResizable(false);
		root.setLocationRelativeTo(null);
		
		// add some posts 
		root.add(Post("ibrahim", "12/05/2006", Color.red, "This is a yexy\n\n\n\n\n\n\n\n\n\n",1000,102));
		
		
		
		
		
		root.setVisible(true);
	}
}
