package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		List<Department> list = new ArrayList<>();
		
		System.out.println("---Test 1: department findAll");	
		list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		//System.out.println("\n---Test 2: department insert");		
		//Department newDep = new Department(null, "Secretary");
		//departmentDao.insert(newDep);
		//System.out.println("Inserted! New id = " + newDep.getId());		
		
		System.out.println("\n---Test 3: department findById");	
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n---Test 4: seller update");	
		dep = departmentDao.findById(6);
		dep.setName("Hospital");
		departmentDao.update(dep);
		System.out.println("Update completed!");
		
		System.out.println("\n---Test 5: seller delete");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		
		sc.close();
	}

}
