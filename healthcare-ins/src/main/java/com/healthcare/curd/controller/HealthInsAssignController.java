package com.healthcare.curd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.curd.dto.ApplicantDetResponse;
import com.healthcare.curd.model.Applicant;
import com.healthcare.curd.service.ApplicantInsDetailService;

//no content negotiation is required 
@RestController
@RequestMapping("/benefitresource")
public class HealthInsAssignController {
	@Autowired 
	private ApplicantInsDetailService service;
	@PostMapping("/newbenreq")
  public ApplicantDetResponse requestForBenefit(@RequestBody Applicant applicant) {
	  return service.assignBenefit(applicant);
		
  }
}
