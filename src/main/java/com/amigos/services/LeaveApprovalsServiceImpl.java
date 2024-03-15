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
	public void addLeaveApproval(LeaveApprovals leaveApproval) {
		// TODO Auto-generated method stub
		leaveApprovalsDAO.addLeaveApproval(leaveApproval);
	}

	@Override
	public void updateLeaveApproval(LeaveApprovals leaveApproval) {
		// TODO Auto-generated method stub
		leaveApprovalsDAO.updateLeaveApproval(leaveApproval);
	}

	@Override
	public void deleteLeaveApproval(LeaveApprovals leaveApprovalId) {
		// TODO Auto-generated method stub
		leaveApprovalsDAO.deleteLeaveApproval(leaveApprovalId);
	}

	@Override
	public LeaveApprovals getLeaveApprovalById(int leaveApprovalId) {
		// TODO Auto-generated method stub
		return leaveApprovalsDAO.getLeaveApprovalById(leaveApprovalId);
	}

}
