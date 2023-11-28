package com.training.example.backend;

import java.io.Serializable;
import java.sql.Date;

import org.eclipse.persistence.jpa.jpql.parser.DateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name ="EMPLOYEES")
@NamedQueries({
	@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
})
public class Employee implements Serializable {
	private static final  long serialVersionUID = 1L;


	@Id
	@Column(name="EMPLOYEE_ID")
	private int employee_id;
	
	@Column(name="LAST_NAME")
	private String name;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PHONE_NUMBER")
	private String phone;
	@Temporal(TemporalType.DATE)
	@Column(name="HIRE_DATE")
	private Date hire;
	
	
	
	@Column(name="MANAGER_ID")
	private int managerId;

	
	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	@Column(name="JOB_ID")
	private String job;
	
	private int salary;

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getHire() {
		return hire;
	}

	public void setHire(Date hire) {
		this.hire = hire;
	}

	

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
