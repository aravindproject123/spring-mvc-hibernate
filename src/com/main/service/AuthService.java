package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.AuthDAO;
import com.main.dto.LoginDTO;
import com.main.entity.Register;


@Service
public class AuthService 
{
	@Autowired
	private AuthDAO authDAO;
	
	public void saveRegisterDetails(Register register) {
		authDAO.saveRegisterDetails(register);
	}
	
	public Register getRegisterDataByEmailAndPwd(LoginDTO loginDTO) {
		return authDAO.getRegisterDataByEmailAndPwd(loginDTO);
	}

}
