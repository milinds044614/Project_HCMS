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
		return externalTrainersDAO.getAllExternalTrainers();
	}

	@Override
	public void addExternalTrainer(ExternalTrainers externalTrainer) {
		// TODO Auto-generated method stub
		externalTrainersDAO.addExternalTrainer(externalTrainer);
	}

	@Override
	public void updateExternalTrainer(ExternalTrainers externalTrainer) {
		// TODO Auto-generated method stub
		externalTrainersDAO.updateExternalTrainer(externalTrainer);
	}

	@Override
	public void deleteExternalTrainer(ExternalTrainers externalTrainerId) {
		// TODO Auto-generated method stub
		externalTrainersDAO.deleteExternalTrainer(externalTrainerId);
	}

	@Override
	public ExternalTrainers getExternalTrainerById(int externalTrainerId) {
		// TODO Auto-generated method stub
		return externalTrainersDAO.getExternalTrainerById(externalTrainerId);
	}

}
