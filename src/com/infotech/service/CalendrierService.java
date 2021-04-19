package com.infotech.service;

import java.util.List;

import com.infotech.model.Calendrier;
import com.infotech.model.Student;
import com.infotech.model.reservation;

public interface CalendrierService {
	int saveCalendrier(Calendrier calendrier);

	List<Calendrier> getListCalendrier();
	List<reservation> getListReservation();
	int makeCalendrier(reservation resv, int id);
	void updateReservation(int id);
	void nombrePlace(int id);
	List<reservation> getListReservationValidation();
	
}
