package com.amigos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amigos.dao.DepartmentsDAO;
import com.amigos.entities.Departments;

@Service
public class DepartmentsServiceImpl implements DepartmentsService {

	@Autowired
	private DepartmentsDAO departmentsDAO;

	@Override
	public List<Departments> getAllDepartments() {
		return departmentsDAO.getAllDepartments();
	}

	@Override
	public void addDepartment(Departments role) {
		departmentsDAO.addDepartment(role);
	}

	@Override
	public void updateDepartment(Departments department) {
		departmentsDAO.updateDepartment(department);

	}

	@Override
	public void deleteDepartment(Departments departmentId) {
		// TODO Auto-generated method stub
		departmentsDAO.deleteDepartment(departmentId);
	}

	@Override
	public Departments getDepartmentById(int departmentId) {
		// TODO Auto-generated method stub
		return departmentsDAO.getDepartmentById(departmentId);
	}

}
