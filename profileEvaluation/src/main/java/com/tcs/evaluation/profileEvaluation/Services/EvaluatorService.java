package com.tcs.evaluation.profileEvaluation.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.evaluation.profileEvaluation.Entity.Evaluator;
import com.tcs.evaluation.profileEvaluation.Repository.EvaluatorRepo;

@Service
public class EvaluatorService {
	
	@Autowired
	EvaluatorRepo erepo;
	public List<Evaluator> getAllEvaluators(){
		return erepo.findAll();
	}
}
