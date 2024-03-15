package com.amigos.dao;

import java.util.List;

import com.amigos.entities.CandidateProfiles;

public interface CandidateProfilesDAO {

	List<CandidateProfiles> getAllCandidateProfiles();

	void addCandidateProfiles(CandidateProfiles candidate);

	void updateCandidateProfiles(CandidateProfiles candidate);

	void deleteCandidateProfiles(CandidateProfiles candidateId);

	CandidateProfiles getCandidateProfilesById(int candidateId);
}
