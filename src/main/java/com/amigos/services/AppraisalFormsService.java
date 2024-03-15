package com.amigos.services;

import java.util.List;

import com.amigos.entities.AppraisalForms;

public interface AppraisalFormsService {
	List<AppraisalForms> getAllAppraisalForms();

	void addAppraisalForms(AppraisalForms Appraisal);

	void updateAppraisalForms(AppraisalForms Appraisal);

	void deleteAppraisalForms(AppraisalForms AppraisalId);

	AppraisalForms getAppraisalFormsById(int AppraisalId);
	

}
