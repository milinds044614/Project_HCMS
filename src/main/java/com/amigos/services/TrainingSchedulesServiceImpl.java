package com.amigos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amigos.dao.TrainingSchedulesDAO;
import com.amigos.entities.TrainingSchedules;

@Service
public class TrainingSchedulesServiceImpl implements TrainingSchedulesService{
	@Autowired
	private TrainingSchedulesDAO trainingSchedulesDAO;

	@Override
	public List<TrainingSchedules> getAllTrainingSchedules() {
		// TODO Auto-generated method stub
		return trainingSchedulesDAO.getAllTrainingSchedules();
	}

	@Override
	public void addTrainingSchedule(TrainingSchedules trainingSchedule) {
		// TODO Auto-generated method stub
		trainingSchedulesDAO.addTrainingSchedule(trainingSchedule);
	}

	@Override
	public void updateTrainingSchedule(TrainingSchedules trainingSchedule) {
		// TODO Auto-generated method stub
		trainingSchedulesDAO.updateTrainingSchedule(trainingSchedule);
	}

	@Override
	public void deleteTrainingSchedule(TrainingSchedules trainingSchedule) {
		// TODO Auto-generated method stub
		trainingSchedulesDAO.deleteTrainingSchedule(trainingSchedule);
	}

	@Override
	public TrainingSchedules getTrainingScheduleById(int trainingScheduleId) {
		// TODO Auto-generated method stub
		return trainingSchedulesDAO.getTrainingScheduleById(trainingScheduleId);
	}
	
	
}
