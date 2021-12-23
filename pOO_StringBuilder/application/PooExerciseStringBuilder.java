package application;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import entities.Comment;
import entities.Post;

public class PooExerciseStringBuilder {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("how many Posts: "));
		
		for(int i = 0; i < a; i++) {
			
			String title = JOptionPane.showInputDialog("Enter title of post: ");
			String content = JOptionPane.showInputDialog("Content: ");

			String now = sdf.format(timestamp);
			Date moment = sdf.parse(now);
			
			Post p = new Post(moment, title, content);
			
			int b = Integer.parseInt(JOptionPane.showInputDialog("how many Comment: "));
			
			for(int y = 0; y < b; y++) {
				String text = JOptionPane.showInputDialog("Enter with a comment: ");
				Comment comment = new Comment(text);
				p.addComment(comment);
			}
			
			System.out.println(p.toString());
		}
	}

}
