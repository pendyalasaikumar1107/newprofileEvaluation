package com.tcs.evaluation.profileEvaluation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.evaluation.profileEvaluation.Entity.Profile;
import com.tcs.evaluation.profileEvaluation.Repository.ProfileRepo;


@RestController
public class RmgProfileController {
	@Autowired
	ProfileRepo repo;
	
	@PostMapping("/post")
	public Profile addProfile(@RequestBody Profile profile) {
		repo.save(profile);
		return profile;
	}
	@GetMapping("/get")
	public List<Profile> getData() {
		return repo.findAll();
	}

}
