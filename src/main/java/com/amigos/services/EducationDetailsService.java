package com.amigos.services;

import java.util.List;

import com.amigos.entities.EducationDetails;

public interface EducationDetailsService {
	List<EducationDetails> getAllEducationDetails();

	void addEducationDetail(EducationDetails educationDetails);

	void updateEducationDetail(EducationDetails educationDetails);

	void deleteEducationDetail(EducationDetails educationDetailsId);

	EducationDetails getEducationDetailById(int educationDetailsId);
}
