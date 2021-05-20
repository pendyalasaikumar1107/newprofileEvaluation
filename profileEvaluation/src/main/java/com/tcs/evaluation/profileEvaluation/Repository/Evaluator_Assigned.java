package com.tcs.evaluation.profileEvaluation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.evaluation.profileEvaluation.entity.Evaluatorassigned;
@Repository
public interface Evaluator_Assigned extends JpaRepository<Evaluatorassigned, Integer> {
	
     List<Evaluatorassigned> findByevalid(int id);
	
}
