package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.ApplicationStatus;
import com.amigos.entities.Employees;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional

public class ApplicationStatusDAOImpl implements ApplicationStatusDAO {
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<ApplicationStatus> getAllApplicationStatus() {

		return entityManager.unwrap(Session.class).createQuery("from ApplicationStatus", ApplicationStatus.class).getResultList();
	}

	@Override
	public void addApplicationStatus(ApplicationStatus applicationStatus) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).saveOrUpdate(applicationStatus);
	}

	@Override
	public void updateApplicationStatus(ApplicationStatus applicationStatus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteApplicationStatus(int applicationStatusId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ApplicationStatus getApplicationStatusById(int applicationStatusId) {
		// TODO Auto-generated method stub
		return null;
	}

}
