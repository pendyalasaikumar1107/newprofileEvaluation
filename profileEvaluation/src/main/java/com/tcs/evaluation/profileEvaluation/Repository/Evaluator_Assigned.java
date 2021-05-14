package com.tcs.evaluation.profileEvaluation.Repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.evaluation.profileEvaluation.Entity.Evaluatorassigned;
@Repository
public interface Evaluator_Assigned extends JpaRepository<Evaluatorassigned, Long> {
	
     List<Evaluatorassigned> findByevalid(int id);
	
}
