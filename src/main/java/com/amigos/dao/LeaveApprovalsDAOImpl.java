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
	public void addLeaveApprovals(LeaveApprovals LeaveApproval) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateLeaveApprovals(LeaveApprovals LeaveApproval) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLeaveApprovals(int LeaveApprovalId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LeaveApprovals getLeaveApprovalsById(int LeaveApprovalId) {
		// TODO Auto-generated method stub
		return null;
	}

}
