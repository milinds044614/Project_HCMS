package com.amigos.services;

import java.util.List;

import com.amigos.entities.LeaveRequests;

public interface LeaveRequestsService {
	List<LeaveRequests> getAllLeaveRequests();

	void addLeaveRequest(LeaveRequests leaveRequest);

	void updateLeaveRequest(LeaveRequests leaveRequest);

	void deleteLeaveRequest(LeaveRequests leaveRequest);

	LeaveRequests getLeaveRequestById(int leaveRequestId);
}
