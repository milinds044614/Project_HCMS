package com.amigos.services;

import java.util.List;

import com.amigos.entities.LeaveApprovals;

public interface LeaveApprovalsService {
	
	List<LeaveApprovals> getAllLeaveApprovals();

	void addLeaveApprovals(LeaveApprovals LeaveApproval);

	void updateLeaveApprovals(LeaveApprovals LeaveApproval);

	void deleteLeaveApprovals(int LeaveApprovalId);

	LeaveApprovals getLeaveApprovalsById(int LeaveApprovalId);
}
