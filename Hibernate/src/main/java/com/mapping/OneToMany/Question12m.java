package com.mapping.OneToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OneToMany_Question")
public class Question12m {
	@Id
	private int que_id;

	@Column(name = "que")
	private String question;

	@OneToMany(mappedBy = "question")
	
	private List<Answer12m> answer;

	public int getQue_id() {
		return que_id;
	}

	public void setQue_id(int que_id) {
		this.que_id = que_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer12m> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer12m> answer) {
		this.answer = answer;
	}

	public Question12m(int que_id, String question, List<Answer12m> answer) {
		super();
		this.que_id = que_id;
		this.question = question;
		this.answer = answer;
	}

	public Question12m() {
		super();
		// TODO Auto-generated constructor stub
	}



}
