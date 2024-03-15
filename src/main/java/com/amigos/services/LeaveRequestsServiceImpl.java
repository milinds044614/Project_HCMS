package com.amigos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.amigos.dao.LeaveRequestsDAO;
import com.amigos.entities.LeaveRequests;
@Service
public class LeaveRequestsServiceImpl implements LeaveRequestsService {
	@Autowired
	private LeaveRequestsDAO leaveRequestsDAO;
	@Override
	public List<LeaveRequests> getAllLeaveRequests() {
		// TODO Auto-generated method stub
		return leaveRequestsDAO.getAllLeaveRequests();
	}

	@Override
	public void addLeaveRequest(LeaveRequests leaveRequest) {
		// TODO Auto-generated method stub
		leaveRequestsDAO.addLeaveRequest(leaveRequest);
	}

	@Override
	public void updateLeaveRequest(LeaveRequests leaveRequest) {
		// TODO Auto-generated method stub
		leaveRequestsDAO.updateLeaveRequest(leaveRequest);
	}

	@Override
	public void deleteLeaveRequest(LeaveRequests leaveRequest) {
		// TODO Auto-generated method stub
		leaveRequestsDAO.deleteLeaveRequest(leaveRequest);
	}

	@Override
	public LeaveRequests getLeaveRequestById(int leaveRequestId) {
		// TODO Auto-generated method stub
		return leaveRequestsDAO.getLeaveRequestById(leaveRequestId);
	}

}
