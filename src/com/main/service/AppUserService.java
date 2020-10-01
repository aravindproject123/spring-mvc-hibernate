package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.main.dao.AppUserDAO;
import com.main.entity.AppUserDetails;

@Service
public class AppUserService 
{
	@Autowired
	private AppUserDAO appUserDAO;
	
	public AppUserService() {
		System.out.println(this.getClass().getSimpleName()  +" created");
	}
	public void saveUserData(AppUserDetails appUserDetails) 
	{
		appUserDAO.saveUserData(appUserDetails);
	}
	public List<AppUserDetails> getAppdetailsByUserId(Long id) {
		return appUserDAO.getAppdetailsByUserId(id);
	}
	public List<AppUserDetails> getAllAppdetails() 
	{
		return appUserDAO.getAllAppdetails();
	}
	public void saveTheUpdate(Long id,AppUserDetails appUserDetails) 
	{
		appUserDAO.saveTheUpdate(id,appUserDetails);

	}
}
