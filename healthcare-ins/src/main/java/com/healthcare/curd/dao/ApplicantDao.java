package com.healthcare.curd.dao;

import java.util.List;

import com.healthcare.curd.model.Applicant;

public interface ApplicantDao {
	public String requestForBenefit(Applicant applicant) ;
		
	public List<Applicant> getAssignedBenefitHist(String provider);

}
