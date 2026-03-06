package essentiels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PostMaker {
	public static void makePost(JFrame root,String text , String author){
		// create post model
		JPanel container = new JPanel();
		container.setBackground(new Color(83,53,123));
		container.setPreferredSize(new Dimension(400,340));
		container.setLayout(new FlowLayout());
		// top side
		JPanel topContainer = new JPanel();
		topContainer.setBackground(Color.WHITE);
		topContainer.setPreferredSize(new Dimension(380,60));
		topContainer.setLayout(new FlowLayout());
		container.add(topContainer);
		// profile image of author
		JPanel profile = new JPanel();
		profile.setBackground(Color.blue);
		profile.setPreferredSize(new Dimension(50,50));
		topContainer.add(profile);
		// container of atuhor name + create Date 
		JPanel postInfos = new JPanel();
		postInfos.setBackground(Color.red);
		postInfos.setPreferredSize(new Dimension(320,50));
		postInfos.setLayout(new FlowLayout());
		topContainer.add(postInfos);
		// author name => who created the post
		JPanel authorName = new JPanel();
		authorName.setBackground(new Color(0x132467));
		authorName.setPreferredSize(new Dimension(330,20));
		postInfos.add(authorName);
		// author name text 
		JLabel authorNameLabel = new JLabel(author);
		authorNameLabel.setPreferredSize(new Dimension(270,16));
		authorNameLabel.setForeground(Color.white);
		authorNameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		authorName.add(authorNameLabel);
		
		// get the date of creation poste
		JPanel postDate = new JPanel();
		postDate.setBackground(Color.gray);
		postDate.setPreferredSize(new Dimension(280,15));
		postInfos.add(postDate);
		// create a slider that can contains text of post , if text is more than height, he scroled
		JPanel posteMain = new JPanel();// main side : slider vertical
		posteMain.setBackground(Color.white);
		posteMain.setPreferredSize(new Dimension(380,220));
		container.add(posteMain);
		
		JPanel textContent = new JPanel(); // text content of post 
		textContent.setPreferredSize(new Dimension(360,210));
		textContent.setBackground(new Color(0x435216));
		posteMain.add(textContent);
		// add bottom section : container of input comment + likes + comments 
		JPanel bottom = new JPanel();
		bottom.setBackground(Color.lightGray);
		bottom.setPreferredSize(new Dimension(380,35));
		//bottom.setLayout(new GridLayout(0,3)); // to make two things 
		container.add(bottom);
		
		// add input to make able to insert comments 
		JTextField commentInput = new JTextField();
		commentInput.setPreferredSize(new Dimension(200,25));
		commentInput.setBorder(null);
		
		bottom.add(commentInput);
		
		// add comment button 
		JButton comment = new JButton("Comment");
		comment.setBackground(new Color(13,13,112));
		//comment.setBorder(null);
		//comment.setPreferredSize(new Dimension(100,30));
		comment.setForeground(Color.white);
		bottom.add(comment);
		
		// add comment button 
		JButton like = new JButton("like");
		like.setBackground(new Color(18,91,11));
		like.setForeground(Color.white);
		bottom.add(like);
		
		root.add(container);

	}

}

