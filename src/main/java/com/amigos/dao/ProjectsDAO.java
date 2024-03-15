package com.amigos.dao;

import java.util.List;

import com.amigos.entities.Projects;

public interface ProjectsDAO {
	List<Projects> getAllProjects();

	void addProject(Projects project);

	void updateProject(Projects project);

	void deleteProject(Projects obj);

	Projects getProjectById(int projectId);
}
