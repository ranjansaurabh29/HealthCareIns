package com.healthcare.curd.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.curd.dao.ApplicantDao;
import com.healthcare.curd.dto.ApplicantDetResponse;
import com.healthcare.curd.model.Applicant;

@Service
public class ApplicantInsDetailService {
  @Autowired	
  private ApplicantDao dao;
  public ApplicantDetResponse assignBenefit(Applicant applicant) {
	  applicant.setJoinedDate(new Date());
	  String message = dao.requestForBenefit(applicant);
	  ApplicantDetResponse res = new ApplicantDetResponse();
	  res.setStatus("success");
	  res.setMessage(message);
	return res;
	  
  }
  
}
 