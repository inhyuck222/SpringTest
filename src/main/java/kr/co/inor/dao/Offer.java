package kr.co.inor.dao;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Offer {
	int id;
	
	@Size(min=5, max=20, message="Name must be between 5 and 20 characters")
	String name;
	
	@Email(message="Please, check your email adress")
	@NotEmpty(message="The email adress cannot be empty")
	String email;
	
	@Size(min=5, max=80, message="text must be between 5 to 80 characters")
	String text;

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Offer [id=" + id + ", name=" + name + ", email=" + email + ", text=" + text + "]";
	}
	
	
}
