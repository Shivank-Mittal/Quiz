package fr.shiv.quiz.services;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.SessionFactory;

public class Answer {
	
	@Inject
	Option option1;
	
	@Inject SessionFactory factory;
	
	public void getAnswer() {
		System.out.println(option1.getText());
		
		System.out.println(factory);
	}

	

}
