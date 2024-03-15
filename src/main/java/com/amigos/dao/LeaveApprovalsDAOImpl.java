package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.Employees;
import com.amigos.entities.LeaveApprovals;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class LeaveApprovalsDAOImpl implements LeaveApprovalsDAO {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<LeaveApprovals> getAllLeaveApprovals() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from LeaveApprovals", LeaveApprovals.class).getResultList();
	}

	@Override
	public void addLeaveApproval(LeaveApprovals leaveApproval) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).saveOrUpdate(leaveApproval);
	}

	@Override
	public void updateLeaveApproval(LeaveApprovals leaveApproval) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).merge(leaveApproval);
	}

	@Override
	public void deleteLeaveApproval(LeaveApprovals leaveApprovalId) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).remove(leaveApprovalId);
	}

	@Override
	public LeaveApprovals getLeaveApprovalById(int leaveApprovalId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(LeaveApprovals.class, leaveApprovalId);
	}

}
