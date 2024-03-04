package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.Certifications;
import com.amigos.entities.Employees;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional

public class CertificationDAOImpl implements CertificationsDAO{
	
	@Autowired
	private EntityManager entityManager;
	@Override
	public List<Certifications> getAllCertifications() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from Certifications", Certifications.class).getResultList();
	}

	@Override
	public void addCertifications(Certifications certificate) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).saveOrUpdate(certificate);
	}

	@Override
	public void updateCertifications(Certifications certificate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCertifications(int certificateId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Certifications getCertificationsById(int certificateId) {
		// TODO Auto-generated method stub
		return null;
	}

}
