package com.telusko.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.classic.Logger;

@Controller
public class HomeController
{
	@RequestMapping(value= {"/","/test"})
	public String test(Model model)
	{
		System.out.println("main controller test");
		System.out.println("you are in controler");
		return "test";
	}
	   @Deprecated
	    @RequestMapping(value = { "/admin/oldLogin" })
	    public String oldLogin(Model model) {
	 
	        // Code here never run.
	        return "oldLogin";
	    }
	 
	    @RequestMapping(value = { "/admin/login" })
	    public String login(Model model) {
	 
	        System.out.println("\n-------- MainController.login --- ");
	 
	        System.out.println(" ** You are in Controller ** ");
	 
	        return "login";
	    }
	 
}
