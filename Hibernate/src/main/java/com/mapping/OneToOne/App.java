package com.mapping.OneToOne;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		org.hibernate.Session session = factory.openSession();

		Question q1 = new Question();

		Question q2 = new Question();

		Answer a1 = new Answer();

		Answer a2 = new Answer();

		q1.setQue_id(3);

		q1.setQuestion("AI : ");

		q2.setQue_id(4);

		q2.setQuestion("State : ");

		a1.setAns_id(10);

		a1.setAnswer("UP");

		a2.setAns_id(11);

		a2.setAnswer("BlackBox AI");

		q1.setAnswer(a2);

		q2.setAnswer(a1);

		org.hibernate.Transaction tx = session.beginTransaction();
		session.save(q1);
		session.save(q2);
		session.save(a1);
		session.save(a2);
		tx.commit();

		session.close();

		factory.close();

	}

}
