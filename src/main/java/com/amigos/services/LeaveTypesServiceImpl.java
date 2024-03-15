package com.amigos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amigos.dao.LeaveTypesDAO;
import com.amigos.entities.LeaveTypes;

@Service
public class LeaveTypesServiceImpl implements LeaveTypesService {
	@Autowired
	private LeaveTypesDAO leaveTypesDAO;

	@Override
	public List<LeaveTypes> getAllLeaveTypes() {
		// TODO Auto-generated method stub
		return leaveTypesDAO.getAllLeaveTypes();
	}

	@Override
	public void addLeaveType(LeaveTypes leaveType) {
		// TODO Auto-generated method stub
		leaveTypesDAO.addLeaveType(leaveType);
	}

	@Override
	public void updateLeaveType(LeaveTypes leaveType) {
		// TODO Auto-generated method stub
		leaveTypesDAO.updateLeaveType(leaveType);
	}

	@Override
	public void deleteLeaveType(LeaveTypes leaveType) {
		// TODO Auto-generated method stub
		leaveTypesDAO.deleteLeaveType(leaveType);
	}

	@Override
	public LeaveTypes getLeaveTypeById(int leaveTypeId) {
		// TODO Auto-generated method stub
		return leaveTypesDAO.getLeaveTypeById(leaveTypeId);
	}
	
	
}
