package fr.shiv.quiz.launch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.shiv.quiz.dao.QuestionDAO;
import fr.shiv.quiz.services.Question;

public class Launcher {

	private ApplicationContext appContext; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Launcher launcher = new Launcher();
		launcher.getData();

	}
	
	public void getData() {
		
		appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		String query1 = (String)appContext.getBean("firstQuery");
//		Answer answer = (Answer)appContext.getBean("answer");
//		answer.getAnswer();
//		
//		
//		Option option2 = (Option)appContext.getBean("option1");
//		
//		System.out.println(option2.isTrue());
//		
		QuestionDAO dao =  (QuestionDAO)appContext.getBean("questionDAO");
		
		for (Question ques : dao.getQuestions() ) {
			System.out.println(ques.getQuestion_ID() + "-: " + ques.getQuestion() );
		}
	}

}
