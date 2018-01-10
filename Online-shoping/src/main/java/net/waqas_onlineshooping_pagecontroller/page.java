package net.waqas_onlineshooping_pagecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class page {

	
	
	@RequestMapping(value = {"/","/home","/index"})
	
	public ModelAndView index()
	{
		ModelAndView waqas=new ModelAndView("page");
		waqas.addObject("greeting","Welcome to the Spring MVC");
		return waqas;
	}
	
	
}
