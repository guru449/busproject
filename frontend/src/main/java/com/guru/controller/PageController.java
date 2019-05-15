package com.guru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.guru.dao.BusDAO;

@Controller
public class PageController {
	@Autowired
	private BusDAO busDAO;
	@RequestMapping(value= {"/","/home"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","home");
		mv.addObject("userclickhome",true);
		mv.addObject("list",busDAO.list());
		return mv;
	}
	@RequestMapping(value= "/about")
	public ModelAndView about()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","about");
		mv.addObject("userclickabout",true);
		return mv;
	}
	@RequestMapping(value= "/services")
	public ModelAndView services()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","services");
		mv.addObject("userclickservices",true);
		return mv;
	}
	@RequestMapping(value= "/contact")
	public ModelAndView contact()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","contact");
		mv.addObject("userclickcontact",true);
		return mv;
	}

}
