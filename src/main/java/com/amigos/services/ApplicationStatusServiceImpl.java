package com.amigos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amigos.dao.ApplicationStatusDAO;
import com.amigos.entities.ApplicationStatus;
@Service
public class ApplicationStatusServiceImpl implements ApplicationStatusService{
	@Autowired
	private ApplicationStatusDAO applicationStatusDAO;

	@Override
	public List<ApplicationStatus> getAllApplicationStatus() {
		// TODO Auto-generated method stub
		return applicationStatusDAO.getAllApplicationStatus();
	}

	@Override
	public void addApplicationStatus(ApplicationStatus applicationStatus) {
		// TODO Auto-generated method stub
		applicationStatusDAO.addApplicationStatus(applicationStatus);
	}

	@Override
	public void updateApplicationStatus(ApplicationStatus applicationStatus) {
		applicationStatusDAO.updateApplicationStatus(applicationStatus);
		
	}

	@Override
	public void deleteApplicationStatus(ApplicationStatus applicationStatus) {
		applicationStatusDAO.deleteApplicationStatus(applicationStatus);
		
	}

	@Override
	public ApplicationStatus getApplicationStatusById(int applicationStatusId) {
	
		return applicationStatusDAO.getApplicationStatusById(applicationStatusId);
	}

}
