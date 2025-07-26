package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mapping.Entity.Answer;
import com.mapping.Entity.Question;
import com.mapping.Utility.HibernateUtility;

public class AppUpdateData {
	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Question q = session.find(Question.class, 2);
		q.setQuestion("Which city do you live in?");
		
		
		Answer ans = session.find(Answer.class, 2);
		ans.setAnswer("I live in mumbai");
		
		q.getAnswerList().add(ans);
		ans.getQuestionList().add(q);
		
		
		transaction.commit();
		session.close();
	
		System.out.println("Updated ");
	}

	
}
