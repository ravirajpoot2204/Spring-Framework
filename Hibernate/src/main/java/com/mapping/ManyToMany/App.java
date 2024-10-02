package com.mapping.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        org.hibernate.Session session = factory.openSession();

        // Creating Employee entities
        Employeem2m emp1 = new Employeem2m();
        Employeem2m emp2 = new Employeem2m();

        emp1.setEmp_id(1);
        emp1.setEmp_Name("Lakshay");
        emp2.setEmp_id(2);
        emp2.setEmp_Name("Oscar");

        // Creating Project entities
        Projectm2m pr1 = new Projectm2m();
        Projectm2m pr2 = new Projectm2m();
        Projectm2m pr3 = new Projectm2m();

        pr1.setProj_id(10);
        pr1.setProj_name("Road Construction Material Calculator");
        pr2.setProj_id(11);
        pr2.setProj_name("Library Management");
        pr3.setProj_id(12);
        pr3.setProj_name("ChatBot AI");

        // List of projects for emp1 and emp2
        List<Projectm2m> plist1 = new ArrayList<>();
        plist1.add(pr1);
        plist1.add(pr2);

        // Assigning projects to employees
        emp1.setProj_list(plist1);
        emp2.setProj_list(plist1);

        // Now we need to add employees to the projects as well
        List<Employeem2m> empList1 = new ArrayList<>();
        empList1.add(emp1);
        empList1.add(emp2);

        pr1.setEmp_list(empList1);
        pr2.setEmp_list(empList1);

        // Starting the transaction
        org.hibernate.Transaction tx = session.beginTransaction();

        // Saving projects and employees
        session.save(pr1);
        session.save(pr2);
        session.save(pr3);
        session.save(emp1);
        session.save(emp2);

        tx.commit();

        // Closing session and factory
        session.close();
        factory.close();
    }
}
