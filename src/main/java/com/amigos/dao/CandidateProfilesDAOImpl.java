package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.CandidateProfiles;
import com.amigos.entities.Employees;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional

public class CandidateProfilesDAOImpl implements CandidateProfilesDAO {
	@Autowired
	private EntityManager entityManager;
	@Override
	public List<CandidateProfiles> getAllCandidateProfiles() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from CandidateProfiles", CandidateProfiles.class).getResultList();
	}

	@Override
	public void addCandidateProfiles(CandidateProfiles candidate) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).saveOrUpdate(candidate);
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
