package com.infotech.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "calendrier_table")
public class Calendrier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idCalendrier")
	private int idCalendrier;
	
	@Column(name = "dateCalendrier")
	private String dateCalendrier;
	
	@Column(name = "heureCalendrier")
	private String heureCalendrier ;
	
	@Column(name = "nombrePlace")
	private int nombrePlace;
	
	//@ManyToOne
	//private Student student_table;

	public int getIdCalendrier() {
		return idCalendrier;
	}

	public void setIdCalendrier(int idCalendrier) {
		this.idCalendrier = idCalendrier;
	}


	

	

	public String getDateCalendrier() {
		return dateCalendrier;
	}

	public void setDateCalendrier(String dateCalendrier) {
		this.dateCalendrier = dateCalendrier;
	}

	public int getNombrePlace() {
		return nombrePlace;
	}

	public void setNombrePlace(int nombrePlace) {
		this.nombrePlace = nombrePlace;
	}

	public String getHeureCalendrier() {
		return heureCalendrier;
	}

	public void setHeureCalendrier(String heureCalendrier) {
		this.heureCalendrier = heureCalendrier;
	}


	public Calendrier(String dateCalendrier, String heureCalendrier, int nombrePlace) {
		super();
		this.dateCalendrier = dateCalendrier;
		this.heureCalendrier = heureCalendrier;
		this.nombrePlace = nombrePlace;
	}

	
	public Calendrier(int idCalendrier, String dateCalendrier, String heureCalendrier, int nombrePlace) {
		super();
		this.idCalendrier = idCalendrier;
		this.dateCalendrier = dateCalendrier;
		this.heureCalendrier = heureCalendrier;
		this.nombrePlace = nombrePlace;
	}

	public Calendrier() {
		
	}

	
}
