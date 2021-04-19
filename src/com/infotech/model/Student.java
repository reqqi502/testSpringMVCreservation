package com.infotech.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "student_table")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@NotEmpty
	
	@Column(name = "email")
	private String email;
	
	@NotEmpty
	@Column(name = "password")
	private String password;
	
	@NotEmpty
	@Column(name = "first_name")
	private String firstName;
	
	@NotEmpty

	@Column(name = "last_name")
	private String LastName;
	
	@NotNull

	@Column(name = "phone")
	private Long phone;
	
	@NotEmpty
	@Column(name = "role")
	private String role;
	
	public Student() {
	}
	
	

	public String getFirstName() {
		return firstName;
	}
	@NotEmpty
	@Column(name = "validation")
	private String validation;
	
	@OneToMany(mappedBy = "student_table")
	private List<reservation> reservation;
	
	public List<reservation> getReservation() {
		return reservation;
	}
	public void setReservation(List<reservation> reservation) {
		this.reservation = reservation;
	}
	public String getValidation() {
		return validation;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setValidation(String validation) {
		this.validation = validation;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Long getPhone() {
		return phone;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public Student(int id, String validation) {
		this.id=id;
		this.validation=validation;
	}

	
	public Student(int id, String email, String password, String firstName, String lastName, Long phone, String role,
			String validation) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		LastName = lastName;
		this.phone = phone;
		this.role = role;
		this.validation = validation;
	}
	public Student(String email, String password, String firstName, String lastName, Long phone, String role,
			String validation) {
		super();
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		LastName = lastName;
		this.phone = phone;
		this.role = role;
		this.validation = validation;

	}
	
	
}
