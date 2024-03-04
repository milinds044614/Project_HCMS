package com.amigos.services;

import java.util.List;

import com.amigos.entities.EducationDetails;

public interface EducationDetailsService {
	List<EducationDetails> getAllEducationDetails();

	void addEducationDetails(EducationDetails educationDetails);

	void updateEducationDetails(EducationDetails educationDetails);

	void deleteEducationDetails(int educationDetailsId);

	EducationDetails getEducationDetailsById(int educationDetailsId);
}
