package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import com.beans.TourInfo;

@Controller
public class LoneTrekController {

	private TourInfo tourInfo = new TourInfo(); 
	private Logger log=Logger.getLogger(LoneTrekController.class.getName());
	
	@ModelAttribute
	private TourInfo getTourInfo() {
		return tourInfo;
		
	}
	
	//render INITIATE TOUR 
	@RequestMapping(value="/initiateTour",method=RequestMethod.POST)
	public ModelAndView postHomePage(@ModelAttribute("tourInfo") TourInfo tourInfo,BindingResult result, HttpServletRequest request, HttpServletResponse response, ModelMap model){
	
		//checking if fields left blank 
	if(StringUtils.isBlank(tourInfo.getName())) {
		result.addError(new ObjectError("errorName", "initiate.tour.name.error.message"));
	}
	if(StringUtils.isBlank(tourInfo.getOrigin())) {
		result.addError(new ObjectError("errorOrigin", "initiate.tour.origin.error.message"));
	}
	
	if(StringUtils.isBlank(tourInfo.getDestination())) {
		result.addError(new ObjectError("errorDestination", "initiate.tour.destination.error.message"));
	}
	
	if(StringUtils.isBlank(tourInfo.getAllowedPeople())) {
		result.addError(new ObjectError("errorPeople", "initiate.tour.people.error.message"));
	}
	
	if(StringUtils.isBlank(tourInfo.getDate())) {
		result.addError(new ObjectError("errorDate", "initiate.tour.date.error.message"));
	}
	if(result.hasErrors()) {
		model.addAttribute("errors", result.getAllErrors());
		return new ModelAndView("initiateTour","model",model);
	}
		log.info("rendering initiateTour");
		return new ModelAndView("initiateTour","model",model);
	}
	@RequestMapping(value="/initiateTour",method=RequestMethod.GET)
	public ModelAndView getHomePage(ModelMap model){
		
		log.info("get rendering initiateTour");
		return new ModelAndView("enter","model",model);
	}
	
}
