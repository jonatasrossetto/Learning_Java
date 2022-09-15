package application;

import java.time.LocalDateTime;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime date = LocalDateTime.now();
		
		Comment c1 = new Comment("Have a nice trip!!");
		Comment c2 = new Comment("Wow that is awesome!!");
		//Post p1 = new Post(title, content, moment, likes);
		Post p1 = new Post(
				"Travelling to New Zeland",
				"I am going to vist this wonderful country",
				date,
				12);	
		p1.addComment(c1);
		p1.addComment(c2);
		System.out.println(p1.toStringBuilder());
		
	}

}

