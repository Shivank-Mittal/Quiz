package fr.shiv.quiz.launch;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.shiv.quiz.dao.QuestionDAO;
import fr.shiv.quiz.services.Question;

public class Launcher {

	
	private ApplicationContext appContext; 
	private QuestionDAO dao;
	{
		
		appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		dao =  (QuestionDAO)appContext.getBean("questionDAO");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Launcher launcher = new Launcher();
		launcher.getallQuestion();
//		launcher.getallQuestion();

	}
	
	public List<Question> getallQuestion() {
		for (Question ques : dao.getQuestions() ) {
			System.out.println(ques.getQuestion_ID() + "-: " + ques.getQuestion() );
		}
		
		return dao.getQuestions();
	}
//	
//	public void insertQuestion() {
//		
//		Question question = new Question();
//		question.setQuestion("What is JavaScript");
//		
//		int InsertedId =  dao.addQuestion(question);
//		Question insertedQuestion = dao.getQuestion(InsertedId);
//		
//		 System.out.println (   insertedQuestion.getQuestion_ID() + ": " + insertedQuestion.getQuestion());
//	}
	

}
