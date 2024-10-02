package com.mapping.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		org.hibernate.Session session = factory.openSession();

		Question12m q1 = new Question12m();

		Question12m q2 = new Question12m();

		Answer12m a1 = new Answer12m();

		Answer12m a2 = new Answer12m();
		Answer12m a3 = new Answer12m();
		Answer12m a4 = new Answer12m();

		q1.setQue_id(1);
		q1.setQuestion("Names : ");

		q2.setQue_id(2);
		q2.setQuestion("Objects : ");

		a1.setAns_id(8);
		a1.setAnswer("Mixer Grinder");

		a2.setAns_id(9);
		a2.setAnswer("Suresh Raina Haina!");

		a3.setAns_id(10);
		a3.setAnswer("Heater");

		a4.setAns_id(11);
		a4.setAnswer("Maneesh Shrivastav");
		
		a1.setQuestion(q2);

		a2.setQuestion(q1);
		
		a3.setQuestion(q2);
		
		a4.setQuestion(q1);
		
		List<Answer12m> ans1 = new ArrayList<Answer12m>();
		ans1.add(a2);
		ans1.add(a4);
		
		List<Answer12m> ans2 = new ArrayList<Answer12m>();
		ans2.add(a1);
		ans2.add(a3);
		
		q1.setAnswer(ans1);
		q2.setAnswer(ans2);
		
		

		org.hibernate.Transaction tx = session.beginTransaction();
		session.save(q1);
		session.save(q2);
		session.save(a1);
		session.save(a2);
		session.save(a3);
		session.save(a4);
		
		tx.commit();

		session.close();

		factory.close();

	}

}
