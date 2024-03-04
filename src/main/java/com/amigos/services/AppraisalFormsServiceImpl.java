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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAppraisalForms(int AppraisalId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AppraisalForms getAppraisalFormsById(int AppraisalId) {
		// TODO Auto-generated method stub
		return null;
	}

}
