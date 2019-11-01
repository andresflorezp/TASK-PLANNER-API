package ieti.api.secure.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Comment{
    private int idUser;
    private String comment;
    private int id;
    
    
    
    public Comment(int idUser, String comment, int id) {
		super();
		this.idUser = idUser;
		this.comment = comment;
		this.id = id;
	}
	public Comment() {
		// TODO Auto-generated constructor stub
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Comment [idUser=" + idUser + ", comment=" + comment + ", id=" + id + "]";
	}
	
    
    
}