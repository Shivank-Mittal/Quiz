package fr.shiv.quiz.services;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Question {	
	
	@Id
	private int Question_ID;
	
	private String Question;
	
	
	public int getQuestion_ID() {
		return Question_ID;
	}
	public void setQuestion_ID(int question_ID) {
		Question_ID = question_ID;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	
	

}
