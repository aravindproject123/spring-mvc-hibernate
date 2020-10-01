package com.main.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.dto.LoginDTO;
import com.main.entity.Register;

@Repository
public class AuthDAO 
{
	@Autowired
	private SessionFactory sessionFactory;

	public void saveRegisterDetails(Register register) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(register);
			transaction.commit();
		} 
		catch (Exception e) 
		{
		} 
		finally 
		{
			session.close();
		}
	}
	public Register getRegisterDataByEmailAndPwd(LoginDTO loginDTO) 
	{
		Session session = sessionFactory.openSession();
		String hql="from Register where email=:e and password=:p";
		Query query=session.createQuery(hql);
		query.setParameter("e", loginDTO.getEmail());
		query.setParameter("p",loginDTO.getPassword());
		Register register = (Register) query.uniqueResult();
		return register;
	}

}
