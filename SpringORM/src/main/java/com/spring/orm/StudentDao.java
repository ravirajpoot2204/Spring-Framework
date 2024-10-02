
package com.spring.orm;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

public class StudentDao {

	private Session session;
    private HibernateTemplate hibernateTemplate;

    // Getter and Setter for HibernateTemplate
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    // Insert a student record
    @Transactional
    public int insert(StudentEntity student) {
        Integer id = (Integer) this.hibernateTemplate.save(student);  // returns the generated primary key
        return id;
    }

    // Retrieve a single student by ID
    public StudentEntity getStudent(int studentId) {
    	
        return this.hibernateTemplate.get(StudentEntity.class, studentId);
    }

    // Retrieve all students
    public List<StudentEntity> getAllStudents() {
        return this.hibernateTemplate.loadAll(StudentEntity.class);
    }

    // Delete a student by ID
    @Transactional
    public void deleteStudent(int studentId) {
        StudentEntity student = this.hibernateTemplate.get(StudentEntity.class, studentId);
        if (student != null) {
            this.hibernateTemplate.delete(student);
        }
    }

    // Update a student
    @Transactional
    public void updateStudent(StudentEntity student) {
        this.hibernateTemplate.update(student);
    }
}
