package com.amigos.dao;

import java.util.List;

import com.amigos.entities.TrainingSchedules;

public interface TrainingSchedulesDAO {
	List<TrainingSchedules> getAllTrainingSchedules();

	void addTrainingSchedule(TrainingSchedules trainingSchedule);

	void updateTrainingSchedule(TrainingSchedules trainingSchedule);

	void deleteTrainingSchedule(TrainingSchedules obj);

	TrainingSchedules getTrainingScheduleById(int trainingScheduleId);

}
