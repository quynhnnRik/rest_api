package com.demo.api.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.api.model.*;
import com.demo.api.repositories.*;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffRepository staffRepo;

    // test method
    @GetMapping(value = "/get")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("test");
    }

    // get all staffs
    @GetMapping(value = "/staffs")
    public List<Staff> getAllStaffs() {
        return staffRepo.findAll();
    }

    // get staff by id
    @GetMapping(value = "/staffs/{id}")
    public ResponseEntity<Staff> getStaffById(@PathVariable Integer id) {
        Staff staff = staffRepo.findById(id);
        if (staff == null) {
            throw new RuntimeException();
        }
        return ResponseEntity.ok(staff);
    }

    // delete staff by id
    @DeleteMapping("/staffs/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteStaffById(@PathVariable Integer id) {
        staffRepo.deleteStaffById(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    // update staff
    @PutMapping("/staffs/{id}")
    public ResponseEntity<Staff> updateStaff(@PathVariable Integer id, @RequestBody Staff staff) {
        if (staffRepo.updateStaff(
                new Staff(id, staff.getName(), staff.getAddress(), staff.getPhoneNum(), staff.getDateofBirth())) == 0) {
            throw new RuntimeException();
        }
        return ResponseEntity.ok(staffRepo.findById(id));
    }
}
