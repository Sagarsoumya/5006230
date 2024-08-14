package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.entity.Department;
import com.example.EmployeeManagementSystem.entity.Employee;
import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PutMapping;

import java.awt.print.Pageable;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Page<Employee> findByName(String name,Pageable pageable);

    @Query("SELECT e FROM Employee e WHERE e.email =:email")
    Employee findByEmail(@Param("email") String email);
    @Query("SELECT e FROM Employee e WHERE e.department.name = :deptName")
    Page<Employee> findByDepartmentName(@Param("deptName") String deptName, Pageable pageable);
}
