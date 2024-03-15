package com.amigos.dao;

import java.util.List;

import com.amigos.entities.LeaveTypes;

public interface LeaveTypesDAO {
	List<LeaveTypes> getAllLeaveTypes();

	void addLeaveType(LeaveTypes leaveType);

	void updateLeaveType(LeaveTypes leaveType);

	void deleteLeaveType(LeaveTypes obj);

	LeaveTypes getLeaveTypeById(int leaveTypeId);
}
