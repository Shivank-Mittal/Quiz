package fr.shiv.quiz.dao;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.shiv.quiz.services.Question;

public class QuestionDAO {
	
//	@Autowired
//	private SessionFactory sessionFactory;
	
	@Inject SessionFactory factory;
	
	@Transactional
	public List<Question> getQuestions(){
		
		Session session = factory.getCurrentSession();
		
		 List<Question> questions= session.createQuery("from Question",Question.class).list();
		
		 return questions;
		
	}
//	
//	public void addQuestion() {
//		
//		System.out.println(factory);
//
//		Session session = factory.openSession();
//		
//		if(factory != null) {
//			Question question = new Question();
//			question.setQuestion("what is Angular");
//			session.save(question);
//		}
//		else {
//			System.out.println("sessionFactory is null");
//		}
//	}

}
