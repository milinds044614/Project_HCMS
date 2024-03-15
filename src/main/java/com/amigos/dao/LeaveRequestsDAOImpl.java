package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.amigos.entities.LeaveRequests;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class LeaveRequestsDAOImpl implements LeaveRequestsDAO{
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<LeaveRequests> getAllLeaveRequests() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from LeaveRequests", LeaveRequests.class).getResultList();
	}

	@Override
	public void addLeaveRequest(LeaveRequests leaveRequest) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).saveOrUpdate(leaveRequest);
	}

	@Override
	public void updateLeaveRequest(LeaveRequests leaveRequest) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).merge(leaveRequest);
	}

	@Override
	public void deleteLeaveRequest(LeaveRequests obj) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).remove(obj);
	}

	@Override
	public LeaveRequests getLeaveRequestById(int leaveRequestId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(LeaveRequests.class, leaveRequestId);
	}

}
