package com.amigos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amigos.dao.SkillMatrixDAO;
import com.amigos.entities.SkillMatrix;

@Service
public class SkillMatrixServiceImpl implements SkillMatrixService{
	@Autowired
	private SkillMatrixDAO skillMatrixDAO;

	@Override
	public List<SkillMatrix> getAllSkillMatrix() {
		// TODO Auto-generated method stub
		return skillMatrixDAO.getAllSkillMatrix();
	}

	@Override
	public void addSkillMatrix(SkillMatrix skillMatrix) {
		// TODO Auto-generated method stub
		skillMatrixDAO.addSkillMatrix(skillMatrix);
	}

	@Override
	public void updateSkillMatrix(SkillMatrix skillMatrix) {
		// TODO Auto-generated method stub
		skillMatrixDAO.updateSkillMatrix(skillMatrix);
	}

	@Override
	public void deleteSkillMatrix(SkillMatrix skillMatrix) {
		// TODO Auto-generated method stub
		skillMatrixDAO.deleteSkillMatrix(skillMatrix);
	}

	@Override
	public SkillMatrix getSkillMatrixById(int skillMatrixId) {
		// TODO Auto-generated method stub
		return skillMatrixDAO.getSkillMatrixById(skillMatrixId);
	}
	
	
}
