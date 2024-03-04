package com.amigos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amigos.dao.CandidateProfilesDAO;
import com.amigos.entities.CandidateProfiles;
@Service
public class CandidateProfilesServiceImpl implements CandidateProfilesService{
	
	@Autowired
	private CandidateProfilesDAO candidateProfilesDAO;

	@Override
	public List<CandidateProfiles> getAllCandidateProfiles() {
		// TODO Auto-generated method stub
		return candidateProfilesDAO.getAllCandidateProfiles();
	}

	@Override
	public void addCandidateProfiles(CandidateProfiles candidate) {
		// TODO Auto-generated method stub
		candidateProfilesDAO.addCandidateProfiles(candidate);
	}

	@Override
	public void updateCandidateProfiles(CandidateProfiles candidate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCandidateProfiles(int candidateId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CandidateProfiles getCandidateProfilesById(int candidateId) {
		// TODO Auto-generated method stub
		return null;
	}

}
