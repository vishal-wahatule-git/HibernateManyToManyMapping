package com.mapping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mapping.Entity.Answer;
import com.mapping.Entity.Question;
import com.mapping.Utility.HibernateUtility;

public class AppGetDataById {
	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Question byId = session.find(Question.class, 2);
		System.out.println(byId.getQuestion());
		
		System.out.println("Question ID : " + byId.getId());
		System.out.println("Question: " + byId.getQuestion());
		
		List<Answer> ansList = byId.getAnswerList();
		System.out.println("Answers: ");
		ansList.forEach(a -> System.out.println(a.toString()));
		
		transaction.commit();
		session.close();
	}

}
