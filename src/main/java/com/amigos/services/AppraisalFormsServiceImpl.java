package com.amigos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amigos.dao.AppraisalFormsDAO;
import com.amigos.entities.AppraisalForms;
@Service
public class AppraisalFormsServiceImpl implements AppraisalFormsService{
	
	@Autowired
	private AppraisalFormsDAO appraisalFormDAO;
	@Override
	public List<AppraisalForms> getAllAppraisalForms() {
		// TODO Auto-generated method stub
		return appraisalFormDAO.getAllAppraisalForms();
	}

	@Override
	public void addAppraisalForms(AppraisalForms Appraisal) {
		// TODO Auto-generated method stub
		appraisalFormDAO.addAppraisalForms(Appraisal);
	}

	@Override
	public void updateAppraisalForms(AppraisalForms Appraisal) {
		appraisalFormDAO.updateAppraisalForms(Appraisal);
		
	}

	@Override
	public void deleteAppraisalForms(AppraisalForms AppraisalId) {
		appraisalFormDAO.deleteAppraisalForms(AppraisalId);
		
	}

	@Override
	public AppraisalForms getAppraisalFormsById(int AppraisalId) {
		// TODO Auto-generated method stub
		return appraisalFormDAO.getAppraisalFormsById(AppraisalId);
	}

}
