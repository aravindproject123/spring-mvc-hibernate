package com.main.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import com.main.entity.AppUserDetails;

@Repository
public class AppUserDAO 
{
	@Autowired
	private SessionFactory sessionFactory;
	public void saveUserData(AppUserDetails appUserDetails) 
	{
		Session session = sessionFactory.openSession();
		try
		{
			Transaction transaction = session.beginTransaction();
			session.save(appUserDetails);
			transaction.commit();
			System.out.println("The user data has been inserted");
		}
		catch (Exception e) 
		{
		}
		finally 
		{
			session.close();
		}

	}
	public List<AppUserDetails> getAppdetailsByUserId(Long id) 
	{
		Session session = sessionFactory.openSession();
		String hql="from AppUserDetails  where id=:id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		List<AppUserDetails> list=query.list();
		return list;

		
	}
	public List<AppUserDetails> getAllAppdetails() 
	{
		Session session = sessionFactory.openSession();
		String hql="from AppUserDetails";
		Query query = session.createQuery(hql);
		List<AppUserDetails> list=query.list();
		return list;

		
	}
	public void saveTheUpdate(Long id,AppUserDetails appUserDetails) 
	{
		System.out.println(id);
		System.out.println(appUserDetails.getAppName());
		System.out.println(appUserDetails.getUserName());
		System.out.println(appUserDetails.getEmail());
		System.out.println(appUserDetails.getPassword());
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		String hql="update AppUserDetails set appName=:a, userName=:b,email=:c,password=:d where id=:e";
		Query query=session.createQuery(hql);
		query.setParameter("a", appUserDetails.getAppName());
		query.setParameter("b", appUserDetails.getUserName());
		query.setParameter("c", appUserDetails.getEmail());
		query.setParameter("d", appUserDetails.getPassword());
		query.setParameter("e", id);
		int n=query.executeUpdate();
		transaction.commit();
		if(n==1) System.out.println("successfull update");
		else System.out.println("unsuccessfull update");
		
	}

}
