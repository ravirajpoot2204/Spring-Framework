package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        // Load Spring context from configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Get the StudentDao bean
        StudentDao studentDao = (StudentDao) context.getBean("StudentDao");

        // Create a new student entity
        StudentEntity student = new StudentEntity();
        student.setId(911);
        student.setName("Loajvsxfc Rajpoot");
        student.setCity("Mumbai");

        // Insert the student into the database
        int result = studentDao.insert(student);
        System.out.println("Student inserted with ID: " + result);

        // Closing the context
        ((ClassPathXmlApplicationContext) context).close();
    }
}
