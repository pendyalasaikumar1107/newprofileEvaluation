package com.tcs.evaluation.profileEvaluation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.evaluation.profileEvaluation.Entity.Profile;

public interface ProfileRepo extends JpaRepository<Profile, Long> {

}
