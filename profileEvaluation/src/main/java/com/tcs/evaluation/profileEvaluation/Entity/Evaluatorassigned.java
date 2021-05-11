package com.tcs.evaluation.profileEvaluation.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Evaluatorassigned {
	@Id
  private long id;
  private String evalname;
  private int evalid;
  
  
  
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getEvalname() {
	return evalname;
}
public void setEval_name(String evalname) {
	this.evalname = evalname;
}
public int getEvalid() {
	return evalid;
}
public void setEvalid(int evalid) {
	this.evalid = evalid;
}
}
