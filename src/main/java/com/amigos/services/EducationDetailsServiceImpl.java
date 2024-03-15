package com.amigos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amigos.dao.EducationDetailsDAO;
import com.amigos.entities.EducationDetails;
@Service
public class EducationDetailsServiceImpl implements EducationDetailsService {
	@Autowired
	private EducationDetailsDAO educationDetialsDAO;
	@Override
	public List<EducationDetails> getAllEducationDetails() {
		// TODO Auto-generated method stub
		return educationDetialsDAO.getAllEducationDetails();
	}

	@Override
	public void addEducationDetail(EducationDetails educationDetails) {
		// TODO Auto-generated method stub
		educationDetialsDAO.addEducationDetail(educationDetails);
	}

	@Override
	public void updateEducationDetail(EducationDetails educationDetails) {
		educationDetialsDAO.updateEducationDetail(educationDetails);
		
	}

	@Override
	public void deleteEducationDetail(EducationDetails educationDetailsId) {
		educationDetialsDAO.deleteEducationDetail(educationDetailsId);
		
	}

	@Override
	public EducationDetails getEducationDetailById(int educationDetailsId) {
		// TODO Auto-generated method stub
		return educationDetialsDAO.getEducationDetailById(educationDetailsId);
	}

}
