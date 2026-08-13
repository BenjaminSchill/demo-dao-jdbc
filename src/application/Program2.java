package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDeparmentDao();
		
		System.out.println("=== TEST 1: Department findById  ===");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: department findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department dep : list) { 
			System.out.println(dep);
		}
		
		System.out.println("\n=== TEST 3: department insert ===");
		Department dep = new Department(null, "HR");
		departmentDao.insert(dep);
		System.out.println("Inserted! New id = " + dep.getId());
		
		
		System.out.println("\n=== TEST 4: department update ===");
		Department dep2 = departmentDao.findById(11);
		dep2.setName("Human Resources");
		departmentDao.update(dep2);
		System.out.println("Updated!");
		
		
		
		sc.close();
	}

}
