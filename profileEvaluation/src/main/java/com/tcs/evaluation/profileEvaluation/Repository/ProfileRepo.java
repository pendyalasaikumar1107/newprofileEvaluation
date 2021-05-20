package com.tcs.evaluation.profileEvaluation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tcs.evaluation.profileEvaluation.entity.Profile;
import com.tcs.evaluation.profileEvaluation.entity.updatedProfileDetails;

public interface ProfileRepo extends JpaRepository<Profile, Integer> {
	@Query("SELECT id FROM Profile WHERE date=?1 ")
	List<Integer> findByDate(String date);
	
	@Query("SELECT id FROM Profile WHERE SUBSTR(date,6,2)=?1" )
	List<Integer> findByMonth(String date);
	
}
