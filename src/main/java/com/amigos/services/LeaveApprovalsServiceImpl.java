package com.amigos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amigos.dao.LeaveApprovalsDAO;
import com.amigos.entities.LeaveApprovals;
@Service
public class LeaveApprovalsServiceImpl implements LeaveApprovalsService{
	@Autowired
	private LeaveApprovalsDAO leaveApprovalsDAO;
	@Override
	public List<LeaveApprovals> getAllLeaveApprovals() {
		// TODO Auto-generated method stub
		return leaveApprovalsDAO.getAllLeaveApprovals();
	}

	@Override
	public void addLeaveApprovals(LeaveApprovals LeaveApproval) {
		// TODO Auto-generated method stub
		leaveApprovalsDAO.addLeaveApprovals(LeaveApproval);
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
