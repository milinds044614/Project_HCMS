package com.amigos.dao;

import java.util.List;

import com.amigos.entities.Certifications;

public interface CertificationsDAO {
	List<Certifications> getAllCertifications();

	void addCertifications(Certifications certificate);

	void updateCertifications(Certifications certificate);

	void deleteCertifications(Certifications certificateId);

	Certifications getCertificationsById(int certificateId);

}
