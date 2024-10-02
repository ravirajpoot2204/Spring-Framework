package com.mapping.ManyToMany;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ManyToMany_Project")
public class Projectm2m {
    @Id
    private int proj_id;

    @Column(name = "proj_name")
    private String proj_name;

    @ManyToMany // Refers to the field in the Employeem2m class
    private List<Employeem2m> emp_list;

    // Getters and setters
    public int getProj_id() {
        return proj_id;
    }

    public void setProj_id(int proj_id) {
        this.proj_id = proj_id;
    }

    public String getProj_name() {
        return proj_name;
    }

    public void setProj_name(String proj_name) {
        this.proj_name = proj_name;
    }

    public List<Employeem2m> getEmp_list() {
        return emp_list;
    }

    public void setEmp_list(List<Employeem2m> emp_list) {
        this.emp_list = emp_list;
    }

    // Constructors
    public Projectm2m(int proj_id, String proj_name, List<Employeem2m> emp_list) {
        super();
        this.proj_id = proj_id;
        this.proj_name = proj_name;
        this.emp_list = emp_list;
    }

    public Projectm2m() {
        super();
    }
}
