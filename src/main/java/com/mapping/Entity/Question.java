package com.mapping.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String question;
	
	@ManyToMany
	private List<Answer> answerList;
	
	public Question(String question) {
		this.question=question;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * @return the answerList
	 */
	public List<Answer> getAnswerList() {
		return answerList;
	}

	/**
	 * @param answerList the answerList to set
	 */
	public void setAnswerList(List<Answer> answerList) {
		this.answerList = answerList;
	}
	
	
	
	
}
