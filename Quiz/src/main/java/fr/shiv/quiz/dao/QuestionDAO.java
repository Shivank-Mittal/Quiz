package fr.shiv.quiz.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.shiv.quiz.services.Question;

public class QuestionDAO {
	
	
	@Inject 
	SessionFactory factory;
	
	
	@Transactional
	public List<Question> getQuestions(){
		
		Session session = factory.getCurrentSession();
		
		 List<Question> questions= session.createQuery("from Question",Question.class).list();
		 
		 for (Question question : questions) {
			 System.out.println(question.getQuestion_ID() +": "+ question.getQuestion());
		}
		
		 return questions;
		
	}
	
	
	@Transactional
	public Question getQuestion(int qId) {
		
		Session session = factory.getCurrentSession();
		
		
		return session.get(Question.class, qId);
		
	}
	
	@Transactional
	public int addQuestion ( Question ques) {
		
		Session session = factory.getCurrentSession();
		
		
		return (Integer) session.save(ques);
	}
	
	@Transactional
	public void deleteQuestion(int id) {
		
		Session session = factory.getCurrentSession();
		Question findQ = session.find(Question.class,id);
		
		session.delete(findQ);
	}
	
	
	@Transactional
	public void updateQuestion(Question question) {
		
		Session session = factory.getCurrentSession();
		 session.update(question);
		
	}

}
