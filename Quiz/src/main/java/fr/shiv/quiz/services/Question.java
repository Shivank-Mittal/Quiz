package fr.shiv.quiz.services;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Primary;



@Entity
public class Question {	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
