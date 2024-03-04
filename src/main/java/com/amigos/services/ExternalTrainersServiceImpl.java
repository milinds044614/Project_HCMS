package com.amigos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amigos.dao.ExternalTrainersDAO;
import com.amigos.entities.ExternalTrainers;
@Service
public class ExternalTrainersServiceImpl implements ExternalTrainersService {

	@Autowired
	private ExternalTrainersDAO externalTrainersDAO;
	@Override
	public List<ExternalTrainers> getAllExternalTrainers() {
		// TODO Auto-generated method stub
		return externalTrainersDAO.getAllExternalTrainersDAO();
	}

	@Override
	public void addExternalTrainers(ExternalTrainers ExternalTrainer) {
		// TODO Auto-generated method stub
		externalTrainersDAO.addExternalTrainers(externalTrainersDAO);
	}

	@Override
	public void updateExternalTrainers(ExternalTrainers ExternalTrainer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteExternalTrainers(int ExternalTrainerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ExternalTrainers getExternalTrainersById(int ExternalTrainerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
