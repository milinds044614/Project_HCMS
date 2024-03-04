package com.amigos.dao;

import java.util.List;

import com.amigos.entities.AppraisalForms;



public interface AppraisalFormsDAO {
	
	List<AppraisalForms> getAllAppraisalForms();

	void addAppraisalForms(AppraisalForms Appraisal);

	void updateAppraisalForms(AppraisalForms Appraisal);

	void deleteAppraisalForms(int AppraisalId);

	AppraisalForms getAppraisalFormsById(int AppraisalId);

}
