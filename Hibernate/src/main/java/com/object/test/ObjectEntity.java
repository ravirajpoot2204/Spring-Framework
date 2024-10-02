package com.object.test;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="ObjectEntity")/*Use to change Table name, if we dont use this then table will be created with the name "studentEntity" */
public class ObjectEntity {

	@Id
	@Column(name="Student_ID")/*Column Annotation can be use to manipulate column's attributes*/
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="Student_Name")
	private String name;
	@Column(length = 60,name="Student_Address")
	private String address;
	@Column(length = 50,name="Student_State")
	private String state;
	private boolean isOpen;
	@Transient/*field does not get created in db*/
	private double x;
	@Temporal(TemporalType.DATE)/**/
	private Date date;
	@Lob /*For big Object not a simple project*/
	private byte[] image;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public ObjectEntity(int id, String name, String address, String state, boolean isOpen, double x,
			Date date, byte[] image) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.state = state;
		this.isOpen = isOpen;
		this.x = x;
		this.date = date;
		this.image = image;
	}
	public ObjectEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	}
