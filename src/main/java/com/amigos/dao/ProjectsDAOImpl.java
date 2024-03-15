package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.Employees;
import com.amigos.entities.Projects;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProjectsDAOImpl implements ProjectsDAO{
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Projects> getAllProjects() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from Projects", Projects.class).getResultList();
	}

	@Override
	public void addProject(Projects project) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).saveOrUpdate(project);
	}

	@Override
	public void updateProject(Projects project) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).merge(project);
	}

	@Override
	public void deleteProject(Projects obj) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).remove(obj);
	}

	@Override
	public Projects getProjectById(int projectId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(Projects.class,projectId);
	}
	
	

}
