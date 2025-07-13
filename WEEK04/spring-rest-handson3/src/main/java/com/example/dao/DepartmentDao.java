
package com.example.dao;

import com.example.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

@Repository
public class DepartmentDao {
    private static List<Department> DEPARTMENT_LIST;

    @Autowired
    public DepartmentDao(ApplicationContext context) {
        Department dept1 = (Department) context.getBean("dept1");
        Department dept2 = (Department) context.getBean("dept2");
        DEPARTMENT_LIST = Arrays.asList(dept1, dept2);
    }

    public List<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}
