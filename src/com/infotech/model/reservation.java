package com.infotech.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idReservation")
	private int idresevation;
	
	@Column(name = "dateCalendrier")
	private String dateCalendrier;
	@Column(name = "heureCalendrier")
	private String heureCalendrier ;
	
	@Column(name = "nombrePlace")
	private int nombrePlace;
	
	@Column(name = "validation")
	private String validation;
	
	
	public reservation(String dateCalendrier, String heureCalendrier, int nombrePlace, String validation) {
		super();
		this.dateCalendrier = dateCalendrier;
		this.heureCalendrier = heureCalendrier;
		this.nombrePlace = nombrePlace;
		this.validation = validation;
	}
	public reservation(int idresevation, String dateCalendrier, String heureCalendrier, int nombrePlace,
			String validation, Student student_table) {
		super();
		this.idresevation = idresevation;
		this.dateCalendrier = dateCalendrier;
		this.heureCalendrier = heureCalendrier;
		this.nombrePlace = nombrePlace;
		this.validation = validation;
		this.student_table = student_table;
	}

	@ManyToOne
	private Student student_table;

	public reservation(String dateCalendrier, String heureCalendrier, int nombrePlace, Student student_table) {
		super();
		this.dateCalendrier = dateCalendrier;
		this.heureCalendrier = heureCalendrier;
		this.nombrePlace = nombrePlace;
		this.student_table = student_table;
	}
	public String getValidation() {
		return validation;
	}
	public void setValidation(String validation) {
		this.validation = validation;
	}

	public reservation() {
		// TODO Auto-generated constructor stub
	}

	public int getIdresevation() {
		return idresevation;
	}

	public void setIdresevation(int idresevation) {
		this.idresevation = idresevation;
	}

	public String getDateCalendrier() {
		return dateCalendrier;
	}

	public void setDateCalendrier(String dateCalendrier) {
		this.dateCalendrier = dateCalendrier;
	}

	public String getHeureCalendrier() {
		return heureCalendrier;
	}

	public void setHeureCalendrier(String heureCalendrier) {
		this.heureCalendrier = heureCalendrier;
	}

	public int getNombrePlace() {
		return nombrePlace;
	}

	public void setNombrePlace(int nombrePlace) {
		this.nombrePlace = nombrePlace;
	}

	public Student getStudent_table() {
		return student_table;
	}

	public void setStudent_table(Student student_table) {
		this.student_table = student_table;
	}



}
