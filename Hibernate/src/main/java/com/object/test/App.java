package com.object.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.object.test.ObjectEntity;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) throws IOException {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		org.hibernate.Session session = factory.openSession();

		ObjectEntity s1 = new ObjectEntity();
		s1.setId(25);
		s1.setName("Vishnu");
		s1.setAddress("ADD 1");
		s1.setState("Uttar Pradesh");
		Date date = new Date();
		date.getDate();
		s1.setDate(date);
		s1.setOpen(true);
		s1.setX(5.6);
		FileInputStream fls = new FileInputStream("D://download/IMG.webp");
					byte[] data = new byte[fls.available()];
		fls.read(data);

		s1.setImage(data);
		fls.close();
		org.hibernate.Transaction tx = session.beginTransaction();
		session.save(s1);
		
		tx.commit();

		session.close();

		factory.close();
	}
}
