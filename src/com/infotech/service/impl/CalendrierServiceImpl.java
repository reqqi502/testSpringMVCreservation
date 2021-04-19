package com.infotech.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.infotech.dao.CalendrierDao;
import com.infotech.model.Calendrier;
import com.infotech.model.reservation;
import com.infotech.service.CalendrierService;

@Service("calendrierDao")
@Component
public class CalendrierServiceImpl implements CalendrierService {

	@Autowired
	private CalendrierDao calendrierDao;

	public void setCalendrierDAO(CalendrierDao calendrierDao) {
		this.calendrierDao = calendrierDao;
	}

	public CalendrierDao getCalendrierDAO() {
		return calendrierDao;
	}

	@Override
	public int saveCalendrier(Calendrier calendrier) {
		int affectedRow = calendrierDao.createReservation(calendrier);
		return affectedRow;
	}

	@Override
	public List<Calendrier> getListCalendrier() {
		List<Calendrier> calendrier = getCalendrierDAO().getListCalendrier();
		return calendrier;
	}

	@Override
	public int makeCalendrier(reservation resrv, int id) {
		String reservationDate;
		String reservationTime;
		int seatsNumber;
		String valid;
		reservationDate = resrv.getDateCalendrier();
		reservationTime = resrv.getHeureCalendrier();
		seatsNumber = resrv.getNombrePlace();
		valid = resrv.getValidation();
		System.out.println(reservationDate + "/" + reservationTime + "/" + id);
		int affectedRow = getCalendrierDAO().makeCalendrier(reservationDate, reservationTime, seatsNumber, valid, id);
		return affectedRow;
	}

	@Override
	public List<reservation> getListReservation() {
		List<reservation> reservation = getCalendrierDAO().getListReservation();
		return reservation;
	}

	@Override
	public List<reservation> getListReservationValidation() {
		List<reservation> reservation = getCalendrierDAO().getListReservationValidation();
		return reservation;
	}

	@Override
	public void updateReservation(int id) {
		getCalendrierDAO().updateReservation(id);
	}

	@Override
	public void nombrePlace(int id) {
		getCalendrierDAO().nombrePlace(id);
	}
}
