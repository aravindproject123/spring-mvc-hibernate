package com.main.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.main.dto.LoginDTO;
import com.main.entity.AppUserDetails;
import com.main.entity.Register;
import com.main.service.AppUserService;
import com.main.service.AuthService;

@Controller
@RequestMapping("/")
public class AuthController 
{
	@Autowired
	private AuthService authService;
	
	@Autowired
	private AppUserService appUserService;
	
	
	@RequestMapping("/saveRegisterDetails")
	public ModelAndView saveRegisterDetails(Register  register) 
	{
		authService.saveRegisterDetails(register);
		return new ModelAndView("login.jsp","msg","Registraion successfull please login!");
	}
	@RequestMapping("/login")
	public ModelAndView login(LoginDTO loginDTO,HttpServletRequest request) 
	{
		Register register=authService.getRegisterDataByEmailAndPwd(loginDTO);
		if(register != null) 
		{
			HttpSession session = request.getSession();
			session.setAttribute("register", register);
			List<AppUserDetails> list = appUserService.getAllAppdetails();
			list.forEach(a->{
				System.out.println(a);
			});
			return new ModelAndView("home.jsp","list",list);
			
		}
		return new ModelAndView("login.jsp","msg","Invalid credentials!!");
		
	}
	@RequestMapping("/view")
	public ModelAndView View(@RequestParam Long id) 
	{
		List<AppUserDetails> list = appUserService.getAppdetailsByUserId(id);
		return new ModelAndView("views.jsp","list",list);
		
	}
	@RequestMapping("/update")
	public ModelAndView update(@RequestParam Long id) 
	{
		AppUserDetails details=appUserService.getAppdetailsByUserId(id).get(0);
		return new ModelAndView("update.jsp","details",details);
		
	}
	
	@RequestMapping("/saveTheUpdate/{id}") //redirect to home page not working please login again to see updated value.I will fix the redirecting part soon.
	public ModelAndView saveTheUpdate(@PathVariable(value="id") Long id,AppUserDetails appUserDetails,HttpServletRequest request) 
	{
		Register register=(Register) request.getSession().getAttribute("register");
		appUserService.saveTheUpdate(id,appUserDetails);
		appUserDetails.setRegister(register);
		List<AppUserDetails> list = appUserService.getAppdetailsByUserId(register.getId());

		return new ModelAndView("home.jsp","list",list); 

	}


}
