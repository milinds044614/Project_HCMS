package com.amigos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amigos.dao.PayrollDAO;
import com.amigos.entities.Payroll;

@Service
public class PayrollServiceImpl implements PayrollService{
	@Autowired
	private PayrollDAO payrollDAO;

	@Override
	public List<Payroll> getAllPayroll() {
		// TODO Auto-generated method stub
		return payrollDAO.getAllPayroll();
	}

	@Override
	public void addPayroll(Payroll payroll) {
		// TODO Auto-generated method stub
		payrollDAO.addPayroll(payroll);
	}

	@Override
	public void updatePayroll(Payroll payroll) {
		// TODO Auto-generated method stub
		payrollDAO.updatePayroll(payroll);
	}

	@Override
	public void deletePayroll(Payroll payroll) {
		// TODO Auto-generated method stub
		payrollDAO.deletePayroll(payroll);
	}

	@Override
	public Payroll getPayrollById(int payrollId) {
		// TODO Auto-generated method stub
		return payrollDAO.getPayrollById(payrollId);
	}
	
	
	
}
