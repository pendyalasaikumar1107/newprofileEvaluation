package com.tcs.evaluation.profileEvaluation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.evaluation.profileEvaluation.Entity.Profile;
//import com.tcs.evaluation.profileEvaluation.Repository.ProfileRepo;
import com.tcs.evaluation.profileEvaluation.Services.ProfileService;

@CrossOrigin
@RestController
public class RmgProfileController {
	@Autowired
	ProfileService service;
	
	@PostMapping("/post")
	public String addProfile(@RequestBody Profile profile) {
		return service.postProfile(profile);
	}
	@GetMapping("/getProfiles")
	public List<Profile> getData() {
		return service.getAllProfile();
	}
	@PostMapping("/postStr")
	public void poststr(@RequestBody String value) {
		System.out.println(value);
	}
	

}
