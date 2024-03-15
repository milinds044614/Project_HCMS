package com.amigos.services;

import java.util.List;

import com.amigos.entities.CandidateProfiles;

public interface CandidateProfilesService {
	
	List<CandidateProfiles> getAllCandidateProfiles();

	void addCandidateProfiles(CandidateProfiles candidate);

	void updateCandidateProfiles(CandidateProfiles candidate);

	void deleteCandidateProfiles(CandidateProfiles candidateId);

	CandidateProfiles getCandidateProfilesById(int candidateId);
}
