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
	public void addEducationDetails(EducationDetails educationDetails) {
		// TODO Auto-generated method stub
		educationDetialsDAO.addEducationDetails(educationDetails);
	}

	@Override
	public void updateEducationDetails(EducationDetails educationDetails) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEducationDetails(int educationDetailsId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EducationDetails getEducationDetailsById(int educationDetailsId) {
		// TODO Auto-generated method stub
		return null;
	}

}
