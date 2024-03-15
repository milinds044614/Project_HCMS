package com.amigos.services;

import java.util.List;

import com.amigos.entities.TrainingSchedules;

public interface TrainingSchedulesService {
	List<TrainingSchedules> getAllTrainingSchedules();

	void addTrainingSchedule(TrainingSchedules trainingSchedule);

	void updateTrainingSchedule(TrainingSchedules trainingSchedule);

	void deleteTrainingSchedule(TrainingSchedules trainingSchedule);

	TrainingSchedules getTrainingScheduleById(int trainingScheduleId);
}
