package com.tcs.evaluation.profileEvaluation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tcs.evaluation.profileEvaluation.Entity.Profile;

public interface ProfileRepo extends JpaRepository<Profile, Long> {
	@Query("SELECT id FROM Profile WHERE date=?1 ")
	List<Long> findByDate(String date);
	
	@Query("SELECT id FROM Profile WHERE SUBSTR(date,6,2)=?1" )
	List<Long> findByMonth(String date);
}
