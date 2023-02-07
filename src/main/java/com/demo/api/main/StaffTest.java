// package com.demo.api.main;

// import java.util.List;

// import
// org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import org.springframework.context.support.AbstractApplicationContext;

// import com.demo.api.service.StaffService;
// import com.demo.api.model.Staff;

// public class StaffTest {
// public static void main(String[] args) {
// AbstractApplicationContext context = new
// AnnotationConfigApplicationContext();
// StaffService staffService = (StaffService) context.getBean("staffService");

// // create new staff
// Staff staff = new Staff(1, "Quynh", "Cantho", "0123456789", "10/10/2002");

// // insert
// staffService.insertStaff(staff);
// System.out.println("Insert: " + staff);

// // select all Staff
// List<Staff> listStaffs = staffService.selectAllStaff();
// System.out.println("select all : ");
// for (Staff Staff : listStaffs) {
// System.out.println(Staff);
// }

// // select Staff by id
// Staff Staff2 = staffService.selectStaffById(1);

// // update Staff
// Staff2.setName("99");
// staffService.updateStaff(Staff2);
// System.out.println("update : " + Staff2);

// // delete Staff by id
// staffService.deleteStaffById(Staff2.getId());
// System.out.println("delete : " + Staff2);
// context.close();
// }
// }