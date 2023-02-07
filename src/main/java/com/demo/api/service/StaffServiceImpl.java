//     package com.demo.api.service;

//     import java.util.List;

//     import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// // import com.demo.api.mapper.StaffMapper;
//     import com.demo.api.model.Staff;
//     import com.demo.api.repositories.*;


//     @Service
//     public class StaffServiceImpl implements StaffService{

//         @Autowired
//         private StaffRepository staffRepo;

//         @Override
//         public List<Staff> selectAllStaff(){
//             return staffRepo.findAll();
//         }

//     public int insertStaff(Staff staff) {
//     return staffRepo.insertStaff(staff);
//     }

//     public int updateStaff(Staff staff){
//     return staffRepo.updateStaff(staff);
//     }

//     public int deleteStaffById(int id){
//     return staffRepo.deleteStaffById(id);
//     }

//     public List<Staff> selectAllStaff(){
//     return staffRepo.selectAllStaff();
//     }

//     public Staff selectStaffById(int id){
//     return staffRepo.selectStaffById(id);
//     }
//     }
