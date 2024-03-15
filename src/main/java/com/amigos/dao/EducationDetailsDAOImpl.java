package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.EducationDetails;
import com.amigos.entities.Employees;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EducationDetailsDAOImpl implements EducationDetailsDAO{
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<EducationDetails> getAllEducationDetails() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from EducationDetails", EducationDetails.class).getResultList();
	}

	@Override
	public void addEducationDetail(EducationDetails educationDetails) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).saveOrUpdate(educationDetails);
	}

	@Override
	public void updateEducationDetail(EducationDetails educationDetails) {
		entityManager.unwrap(Session.class).merge(educationDetails);
		
	}

	@Override
	public void deleteEducationDetail(EducationDetails educationDetailsId) {
		entityManager.unwrap(Session.class).remove(educationDetailsId);
		
	}

	@Override
	public EducationDetails getEducationDetailById(int educationDetailsId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(EducationDetails.class, educationDetailsId);
	}

}
