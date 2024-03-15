package com.amigos.services;

import java.util.List;

import com.amigos.entities.Certifications;

public interface CertificationsService {
	List<Certifications> getAllCertifications();

	void addCertifications(Certifications certificate);

	void updateCertifications(Certifications certificate);

	void deleteCertifications(Certifications certificateId);

	Certifications getCertificationsById(int certificateId);

}
