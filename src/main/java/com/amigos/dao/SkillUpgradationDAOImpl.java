package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.Employees;
import com.amigos.entities.SkillUpgradation;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class SkillUpgradationDAOImpl implements SkillUpgradationDAO {
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<SkillUpgradation> getAllSkillUpgradation() {
		return entityManager.unwrap(Session.class).createQuery("from SkillUpgradation",SkillUpgradation.class).getResultList();
	}

	@Override
	public void addSkillUpgradation(SkillUpgradation skillUpgradation) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).saveOrUpdate(skillUpgradation);
	}

	@Override
	public void updateSkillUpgradation(SkillUpgradation skillUpgradation) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).merge(skillUpgradation);
	}

	@Override
	public void deleteSkillUpgradation(SkillUpgradation obj) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).remove(obj);
	}

	@Override
	public SkillUpgradation getSkillUpgradationById(int skillUpgradationId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(SkillUpgradation.class, skillUpgradationId);
	}
	
}
