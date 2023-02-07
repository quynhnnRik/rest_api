package com.demo.api.service;

import java.util.List;

import com.demo.api.model.Staff;

public interface StaffService{
    public int insertStaff(Staff staff);
    public int updateStaff(Staff staff);
    public int deleteStaffById(int id);
    public List<Staff> selectAllStaff();
    public Staff selectStaffById(int id);
}