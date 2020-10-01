package com.main.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.main.dto.DummyDto;
import com.main.entity.AppUserDetails;
import com.main.entity.Register;
import com.main.service.AppUserService;


@Controller
@RequestMapping(value="/")
public class AppUserController 
{
	@Autowired
	private AppUserService appUserService;

	@RequestMapping(value = "/saveUserData")
	public ModelAndView saveUserData(AppUserDetails appUserDetails,HttpServletRequest request) 
	{
		System.out.println(appUserDetails);
		Register register=(Register) request.getSession().getAttribute("register");
		appUserDetails.setRegister(register);
		System.out.println(appUserDetails);
		appUserService.saveUserData(appUserDetails);
		List<AppUserDetails> list = appUserService.getAppdetailsByUserId(register.getId());
		return new ModelAndView("home.jsp","list",list);
	}
	
	
	}
	

