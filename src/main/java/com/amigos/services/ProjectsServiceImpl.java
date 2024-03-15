package com.amigos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.amigos.dao.ProjectsDAO;
import com.amigos.entities.Projects;

@Service
public class ProjectsServiceImpl implements ProjectsService {
	@Autowired
	private ProjectsDAO projectsDAO;

	@Override
	public List<Projects> getAllProjects() {
		// TODO Auto-generated method stub
		return projectsDAO.getAllProjects();
	}

	@Override
	public void addProject(Projects Project) {
		// TODO Auto-generated method stub
		projectsDAO.addProject(Project);
	}

	@Override
	public void updateProject(Projects Project) {
		// TODO Auto-generated method stub
		projectsDAO.updateProject(Project);
	}

	@Override
	public void deleteProject(Projects Project) {
		// TODO Auto-generated method stub
		projectsDAO.deleteProject(Project);
	}

	@Override
	public Projects getProjectById(int ProjectId) {
		// TODO Auto-generated method stub
		return projectsDAO.getProjectById(ProjectId);
	}
	
	
}
