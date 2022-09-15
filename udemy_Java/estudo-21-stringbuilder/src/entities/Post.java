package entities;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
	
	private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
	public String title;
	public String content;
	public LocalDateTime moment;
	private Integer likes;
	private List<Comment> comments = new ArrayList<>();
	
	public Post() {
		
	}

	public Post(String title, String content, LocalDateTime moment, Integer likes) {
		this.title = title;
		this.content = content;
		this.moment = moment;
		this.likes = likes;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public void addComment(Comment c) {
		this.comments.add(c);
	}
	
	public void removeComment(Comment c) {
		this.comments.remove(c);
	}
	
	public String toString() {
		String msg1 = this.title + "\n" + this.likes + " likes - " + this.moment.toString() + "\n" + this.content + "\n" + "Comments: \n";
		String msg2 = "";
		for (Comment c : this.comments) {
			msg2 = msg2+c.getComment()+"\n";
		}
		return msg1+msg2;
	}
	
	public String toStringBuilder() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(title+"\n");
		sb.append(this.likes+" likes - ");
		sb.append(fmt.format(this.moment)+"\n");
		sb.append(this.content+"\n");
		sb.append("Comments:\n");
		for (Comment c : this.comments) {
			sb.append(c.getComment()+"\n");
		}
		return sb.toString();
	}
}
