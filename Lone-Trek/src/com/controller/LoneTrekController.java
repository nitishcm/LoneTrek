package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;









import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import com.beans.TourInfo;

@Controller
public class LoneTrekController {

	private TourInfo tourInfo=new TourInfo(); 
	
	@ModelAttribute
	private TourInfo getTourInfo() {
		return tourInfo;
		
	}
	
	//render INITIATE TOUR 
	@RequestMapping(value="/initiateTour",method=RequestMethod.POST)
	public ModelAndView postHomePage(HttpServletRequest request, HttpServletResponse response, ModelMap model){
		System.out.println("rendering initiateTour");
		return new ModelAndView("initiateTour","model",model);
	}
	@RequestMapping(value="/initiateTour",method=RequestMethod.GET)
	public ModelAndView getHomePage(ModelMap model){
		
		return new ModelAndView("enter","model",model);
	}
	
}
