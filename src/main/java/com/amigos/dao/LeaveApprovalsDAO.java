package com.amigos.dao;

import java.util.List;

import com.amigos.entities.LeaveApprovals;

public interface LeaveApprovalsDAO {
	List<LeaveApprovals> getAllLeaveApprovals();

	void addLeaveApprovals(LeaveApprovals LeaveApproval);

	void updateLeaveApprovals(LeaveApprovals LeaveApproval);

	void deleteLeaveApprovals(int LeaveApprovalId);

	LeaveApprovals getLeaveApprovalsById(int LeaveApprovalId);
}
