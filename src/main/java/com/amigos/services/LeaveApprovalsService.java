package com.amigos.services;

import java.util.List;

import com.amigos.entities.LeaveApprovals;

public interface LeaveApprovalsService {
	
	List<LeaveApprovals> getAllLeaveApprovals();

	void addLeaveApproval(LeaveApprovals leaveApproval);

	void updateLeaveApproval(LeaveApprovals leaveApproval);

	void deleteLeaveApproval(LeaveApprovals leaveApprovalId);

	LeaveApprovals getLeaveApprovalById(int leaveApprovalId);
}
