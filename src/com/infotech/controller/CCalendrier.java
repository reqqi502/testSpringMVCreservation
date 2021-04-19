package com.infotech.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.infotech.model.Calendrier;
import com.infotech.model.Student;
import com.infotech.model.reservation;
import com.infotech.service.CalendrierService;
import com.infotech.service.StudentService;

@Controller
public class CCalendrier {
	@Autowired
	private CalendrierService calendrierService;

	public void setCalendrierService(CalendrierService calendrierService) {
		this.calendrierService = calendrierService;
	}
	public CalendrierService getCalendrierService() {
		return calendrierService;
	}
	
	//affiche calendrier if session not empty 
	@RequestMapping(value ="/calendrier" ,method=RequestMethod.GET)
	public String CalendrierPage(HttpSession session){
		if(session.getAttribute("role")==null) {
			return "/login";	
			}
		return "calendrier";
	}
	
	//add 
	@RequestMapping(value ="ajouterCalendrier" ,method=RequestMethod.POST)
	public ModelAndView ajouterCalendrier(Calendrier calendrier ){
	int affectedRow = calendrierService.saveCalendrier(calendrier);
	return new ModelAndView("calendrier");
	}
	
	//send list calendrier 
	@RequestMapping(value ="/reserver",method=RequestMethod.GET)
	public ModelAndView listCalendrier(HttpServletRequest request)
	{
		List<Calendrier>calendrier= getCalendrierService().getListCalendrier();
		System.out.println("size: "+calendrier.size());
		if(calendrier.size() > 0) {
			request.setAttribute("Calendrier", calendrier);
		}
		return new ModelAndView("reserver");
   }
	
	//reservation_app
	@RequestMapping(value ="/reservation" ,method=RequestMethod.POST)
	public ModelAndView makeCalendrier(reservation resrv, HttpServletRequest request,@RequestParam String dateCalendrier,@RequestParam String heureCalendrier,@RequestParam int nombrePlace)
	{
		resrv.setDateCalendrier(dateCalendrier);
		resrv.setHeureCalendrier(heureCalendrier);
		resrv.setNombrePlace(nombrePlace);
		resrv.setValidation("noValid");
		System.out.println(resrv.getDateCalendrier());
		HttpSession session= request.getSession();
		int id=Integer.parseInt(session.getAttribute("id").toString());
		int affectedRow = getCalendrierService().makeCalendrier(resrv,id);
		List<Calendrier>calendrier= getCalendrierService().getListCalendrier();
		request.setAttribute("Calendrier", calendrier);
		 return new ModelAndView("reserver");
	}

               
	//affichage
	@RequestMapping(value ="/ListReservation" ,method=RequestMethod.GET)
	public ModelAndView listReservation(HttpServletRequest request)
	{
		List<reservation>listReservation= getCalendrierService().getListReservationValidation();
		request.setAttribute("listReservation", listReservation);
		return new ModelAndView("ListReservation");
   }
	
	//validation_reservation
	@RequestMapping(value ="/validerReservation/{id}" , method=RequestMethod.GET)
	public ModelAndView updateValidation(HttpServletRequest request,@PathVariable int id){
		System.out.println("le id est :"+id);
		getCalendrierService().updateReservation(id);
		getCalendrierService().nombrePlace(id);
		return new ModelAndView("listReservation");
	}
	
}
