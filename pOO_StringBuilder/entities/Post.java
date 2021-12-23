package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private Date moment;
	private String title;
	private String content;
	private Integer like;
	
	private List<Comment> comment = new ArrayList<>();
	
	public Post() {
	}
	
	public Post(Date moment, String title, String content) {
		setMoment(moment);
		setTitle(title);
		setContent(content);
		setLike(0);
	}
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setLike(Integer like) {
		this.like = like;
	}
	
	public void addike() {
		this.like += 1;
	}
	
	public void removeLike() {
		this.like -= 1;
	}
	
	public Date getMoment() {
		return this.moment;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public Integer getLike() {
		return this.like;
	}
	
	
	public List<Comment> getComment(){
		return this.comment;
	}
	
	public void addComment(Comment comment) {
		this.comment.add(comment);
	}
	
	public void removeComment(Comment comment) {
		this.comment.remove(comment);
	}
	
	public String toString() {
		
		Integer size = comment.size();
		StringBuilder sb = new StringBuilder();
		sb.append(getTitle());
		sb.append(" ");
		sb.append(getMoment());
		sb.append("\n");
		sb.append(getContent());
		sb.append("\n");
		sb.append("Likes: ");
		sb.append(getLike());
		sb.append("\n");
		sb.append("Comments (" + size + ") :\n");
		sb.append(getComment());
		
		return sb.toString();
	}
	
	public String getCommentSb() {
		
		StringBuilder sb = new StringBuilder();
		for (Comment c : comment)
		{
			sb.append(c.getText() + "\n");
		}
		
		return sb.toString();
	}
	
	
	
}
