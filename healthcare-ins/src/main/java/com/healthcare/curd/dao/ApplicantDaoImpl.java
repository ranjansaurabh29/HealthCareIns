package com.healthcare.curd.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.healthcare.curd.model.Applicant;

@Repository
public class ApplicantDaoImpl implements ApplicantDao {

	
	//getting session and performing database operation
	@Autowired
	private SessionFactory sessionfactory;
	public String requestForBenefit(Applicant appDetails) {
		// TODO Auto-generated method stub
		getSession().save(appDetails);
		return null;
	}
	private Session getSession() {
		Session session = null;
		try {
			session = sessionfactory.getCurrentSession();
		}catch(HibernateException ex) {
			session = sessionfactory.openSession();
		}
		return session;
	}
	public List<Applicant> getAssignedBenefitHist(String provider) {
		// TODO Auto-generated method stub
		getSession().createCriteria(Applicant.class).add(Restrictions.eq("provider",provider)).list();
		return null;
	}

}
