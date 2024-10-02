package com.mapping.OneToMany;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OneToMany_Answer")
public class Answer12m {

	@Id

	private int ans_id;

	@Column(name = "answer")
	private String answer;

	@ManyToOne
	private Question12m question;

	public int getAns_id() {
		return ans_id;
	}

	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question12m getQuestion() {
		return question;
	}

	public void setQuestion(Question12m question) {
		this.question = question;
	}

	public Answer12m() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer12m(int ans_id, String answer, Question12m question) {
		super();
		this.ans_id = ans_id;
		this.answer = answer;
		this.question = question;
	}
	

}
