package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.amigos.entities.LeaveTypes;

import jakarta.persistence.EntityManager;

@Repository
@Transactional
public class LeaveTypesDAOImpl implements LeaveTypesDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<LeaveTypes> getAllLeaveTypes() {
        return entityManager.unwrap(Session.class)
                .createQuery("FROM LeaveTypes", LeaveTypes.class)
                .getResultList();
    }

    @Override
    public void addLeaveType(LeaveTypes leaveType) {
        entityManager.unwrap(Session.class).saveOrUpdate(leaveType);
    }

    @Override
    public void updateLeaveType(LeaveTypes leaveType) {
        entityManager.unwrap(Session.class).merge(leaveType);
    }

    @Override
    public void deleteLeaveType(LeaveTypes obj) {
        entityManager.unwrap(Session.class).remove(obj);
    }

    @Override
    public LeaveTypes getLeaveTypeById(int leaveTypeId) {
        return entityManager.unwrap(Session.class).get(LeaveTypes.class, leaveTypeId);
    }
}
