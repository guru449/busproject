package com.guru.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value= {"/","/home"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","home");
		mv.addObject("userclickhome",true);
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
