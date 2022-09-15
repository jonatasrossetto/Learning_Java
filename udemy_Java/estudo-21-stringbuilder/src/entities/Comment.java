package entities;

public class Comment {
	private String text;

	public Comment(){
	}
	
	public Comment(String comment) {
		this.text = comment;
	}
	
	public String getComment() {
		return this.text;
	}
	
	public void setComment(String text) {
		this.text = text;
	}
	
	
}
