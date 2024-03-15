package com.amigos.services;

import java.util.List;

import com.amigos.entities.Projects;

public interface ProjectsService {
	List<Projects> getAllProjects();

	void addProject(Projects Project);

	void updateProject(Projects Project);

	void deleteProject(Projects Project);

	Projects getProjectById(int ProjectId);
}
