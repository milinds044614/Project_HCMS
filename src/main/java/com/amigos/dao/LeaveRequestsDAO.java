package com.amigos.dao;

import java.util.List;

import com.amigos.entities.LeaveRequests;

public interface LeaveRequestsDAO {
	List<LeaveRequests> getAllLeaveRequests();

	void addLeaveRequest(LeaveRequests leaveRequest);

	void updateLeaveRequest(LeaveRequests leaveRequest);

	void deleteLeaveRequest(LeaveRequests obj);

	LeaveRequests getLeaveRequestById(int leaveRequestId);

}
