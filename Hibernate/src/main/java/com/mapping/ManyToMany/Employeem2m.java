package com.mapping.ManyToMany;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ManyToMany_Employee")
public class Employeem2m {

    @Id
    private int emp_id;

    @Column(name = "emp_name")
    private String emp_Name;

    @ManyToMany(mappedBy = "emp_list")  // Refers to the field in Projectm2m
    private List<Projectm2m> proj_list;

    // Getters and setters
    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    public List<Projectm2m> getProj_list() {
        return proj_list;
    }

    public void setProj_list(List<Projectm2m> proj_list) {
        this.proj_list = proj_list;
    }

    // Constructors
    public Employeem2m(int emp_id, String emp_Name, List<Projectm2m> proj_list) {
        super();
        this.emp_id = emp_id;
        this.emp_Name = emp_Name;
        this.proj_list = proj_list;
    }

    public Employeem2m() {
        super();
    }
}
