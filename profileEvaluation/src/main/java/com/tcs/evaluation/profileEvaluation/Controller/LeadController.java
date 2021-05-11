package com.tcs.evaluation.profileEvaluation.Controller;

import com.tcs.evaluation.profileEvaluation.Entity.Evaluatorassigned;
import com.tcs.evaluation.profileEvaluation.Entity.Profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.evaluation.profileEvaluation.Repository.Evaluator_Assigned;
import com.tcs.evaluation.profileEvaluation.Repository.ProfileRepo;
import com.tcs.evaluation.profileEvaluation.Services.ProfileService;

@RestController
@CrossOrigin
public class LeadController {
	
	@Autowired
	ProfileRepo repo;
	@Autowired
	ProfileService service;
	@Autowired
	Evaluator_Assigned evalRepo;
	
	@GetMapping("/getProfiles")
	public List<Profile> getData() {
		return service.getAllProfile();
	}
	
	@PutMapping("/updateProfile")
	public String putEvaluator(@RequestBody Evaluatorassigned eval) {
		evalRepo.save(eval);
		return "Evaluator Assigned";
		
	}
	
	
	
}
	
	
	
