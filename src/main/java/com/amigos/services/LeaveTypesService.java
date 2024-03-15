package com.amigos.services;

import java.util.List;

import com.amigos.entities.LeaveTypes;

public interface LeaveTypesService {
	List<LeaveTypes> getAllLeaveTypes();

	void addLeaveType(LeaveTypes leaveType);

	void updateLeaveType(LeaveTypes leaveType);

	void deleteLeaveType(LeaveTypes leaveType);

	LeaveTypes getLeaveTypeById(int leaveTypeId);

}
