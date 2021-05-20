package com.tcs.evaluation.profileEvaluation.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tcs.evaluation.profileEvaluation.entity.Evaluator;
import com.tcs.evaluation.profileEvaluation.repository.EvaluatorRepo;
import com.tcs.evaluation.profileEvaluation.repository.Evaluator_Assigned;
import com.tcs.evaluation.profileEvaluation.repository.ProfileRepo;

@Service
public class EvaluatorService {
	
	@Autowired
	EvaluatorRepo erepo;
	public List<Evaluator> getAllEvaluators(){
		return erepo.findAll();
	}
	
	Evaluator_Assigned evalAssigned;
	@Autowired
	ProfileRepo repo1;
//	public List<Profile> assignedProfilesByEvaluatorId( int id) {
//			List<Long> myList1 = new ArrayList<Long>();
//			List<Evaluatorassigned> myList = new ArrayList<Evaluatorassigned>();
//			myList = evalAssigned.findByevalid(id);
//			for (int i = 0; i < myList.size(); i++) {
//				// if(myList.get(i).getId()==id)
//				myList1.add(myList.get(i).getId());
//			}
//			return repo1.findAllById(myList1);
//
//		}
//		List<Long> myList1 = new ArrayList<Long>();
//		List<Evaluatorassigned> myList = new ArrayList<Evaluatorassigned>();
//		myList = evalAssigned.findByevalid(id);
//		for (int i = 0; i < myList.size(); i++) {
//			// if(myList.get(i).getId()==id)
//			myList1.add(myList.get(i).getId());
//		}
//		return repo1.findAllById(myList1);
//
//	}
}
