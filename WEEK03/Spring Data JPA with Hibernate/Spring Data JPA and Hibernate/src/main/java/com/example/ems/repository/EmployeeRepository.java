package com.example.ems.repository;

import com.example.ems.model.Employee;
import com.example.ems.projection.EmployeeNameAndDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByDepartmentName(String departmentName);

    @Query("SELECT e.name as name, e.email as email, d.name as departmentName FROM Employee e JOIN e.department d")
    List<EmployeeNameAndDepartment> fetchNameAndDepartment();
}
