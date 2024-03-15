package com.amigos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amigos.dao.TrainingModuleDAO;
import com.amigos.entities.TrainingModules;

@Service
public class TrainingModuleServiceImpl implements TrainingModuleService{
	@Autowired
	private TrainingModuleDAO trainingModuleDAO;

	@Override
	public List<TrainingModules> getAllTrainingModules() {
		// TODO Auto-generated method stub
		return trainingModuleDAO.getAllTrainingModules();
	}

	@Override
	public void addTrainingModule(TrainingModules trainingModule) {
		// TODO Auto-generated method stub
		trainingModuleDAO.addTrainingModule(trainingModule);
	}

	@Override
	public void updateTrainingModule(TrainingModules trainingModule) {
		// TODO Auto-generated method stub
		trainingModuleDAO.updateTrainingModule(trainingModule);
	}

	@Override
	public void deleteTrainingModule(TrainingModules trainingModule) {
		// TODO Auto-generated method stub
		trainingModuleDAO.deleteTrainingModule(trainingModule);
	}

	@Override
	public TrainingModules getTrainingModuleById(int trainingModuleId) {
		// TODO Auto-generated method stub
		return trainingModuleDAO.getTrainingModuleById(trainingModuleId);
	}
	
}
