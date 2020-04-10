package fr.shiv.quiz.services;

public class Option {

	private int id ;
	private String text;
	boolean isTrue;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean isTrue() {
		return isTrue;
	}
	public void setTrue(boolean isTrue) {
		this.isTrue = isTrue;
	}
	
}
