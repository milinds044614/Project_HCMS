package com.amigos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amigos.dao.CertificationsDAO;
import com.amigos.entities.Certifications;

@Service
public class CertificationsServiceImpl implements CertificationsService {
	@Autowired
	private CertificationsDAO certificationsDAO;
	@Override
	public List<Certifications> getAllCertifications() {
		return certificationsDAO.getAllCertifications();
	}

	@Override
	public void addCertifications(Certifications certificate) {
		// TODO Auto-generated method stub
		certificationsDAO.addCertifications(certificate);
	}

	@Override
	public void updateCertifications(Certifications certificate) {
		certificationsDAO.updateCertifications(certificate);
		
	}

	@Override
	public void deleteCertifications(Certifications certificateId) {
		// TODO Auto-generated method stub
		certificationsDAO.deleteCertifications(certificateId);
	}

	@Override
	public Certifications getCertificationsById(int certificateId) {
		// TODO Auto-generated method stub
		return certificationsDAO.getCertificationsById(certificateId);
	}

}
