package com.codeclan.example.EmployeeTracker;

import com.codeclan.example.EmployeeTracker.models.Department;
import com.codeclan.example.EmployeeTracker.models.Employee;
import com.codeclan.example.EmployeeTracker.repositories.DepartmentRepository;
import com.codeclan.example.EmployeeTracker.repositories.EmployeeRepository;
import com.codeclan.example.EmployeeTracker.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}


	@Test
	public void createEmployeeAndDepartment(){

		Department department = new Department("Food");
		departmentRepository.save(department);

		Employee elliot = new Employee("Elliot", 21, 123, "e@e.com", department);
		employeeRepository.save(elliot);
	}

}
