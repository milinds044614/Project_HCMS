package com.amigos.dao;

import java.util.List;

import com.amigos.entities.LeaveApprovals;

public interface LeaveApprovalsDAO {
	List<LeaveApprovals> getAllLeaveApprovals();

	void addLeaveApproval(LeaveApprovals LeaveApproval);

	void updateLeaveApproval(LeaveApprovals LeaveApproval);

	void deleteLeaveApproval(LeaveApprovals LeaveApprovalId);

	LeaveApprovals getLeaveApprovalById(int LeaveApprovalId);
}
