package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.AppraisalForms;
import com.amigos.entities.Employees;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class AppraisalFormsDAOImpl implements AppraisalFormsDAO {
	@Autowired
	private EntityManager entityManager;


	@Override
	public List<AppraisalForms> getAllAppraisalForms() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from AppraisalForms", AppraisalForms.class).getResultList();
	}

	@Override
	public void addAppraisalForms(AppraisalForms Appraisal) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).saveOrUpdate(Appraisal);
	}

	@Override
	public void updateAppraisalForms(AppraisalForms Appraisal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAppraisalForms(int AppraisalId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AppraisalForms getAppraisalFormsById(int AppraisalId) {
		// TODO Auto-generated method stub
		return null;
	}

}
