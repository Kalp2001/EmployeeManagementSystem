package employeemanagement;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {

	HashSet<Employee> empset = new HashSet<Employee>();
	Employee emp1 = new Employee(101, "shital", 24, "Tester", "QA", 25000);
	Employee emp2 = new Employee(102, "Mann", 22, "Developer", "IT", 15000);
	Employee emp3 = new Employee(103, "Kalp", 22, "Backend-Dev", "Devloper", 15000);
	Employee emp4 = new Employee(104, "Pranav", 24, "UI/UX", "Design", 10000);
	Scanner sc = new Scanner(System.in);
	boolean found = false;
	int id;
	String name;
	int age;
	String department;
	String designation;
	double sal;

	public EmployeeService() {
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
	}

	// view all employees
	public void viewAllEmps() {
		for (Employee emp : empset) {
			System.out.println(emp);
		}
	}

	// view emp bassed on their id
	public void viewEmp() {
//		boolean found = false;
		System.out.println("Enter id: ");
		id = sc.nextInt();
		// iterating the loop
		for (Employee emp : empset) {
			// check id which enter by user == id which present in emp.get id
			if (emp.getId() == id) {
				System.out.println(emp);
				found = true;
			}

		}
		if (!found) {
			System.out.println("Employee with this " + id + " is not present");
		}
	}

	// update the employees
	public void updateEmployee() {
		System.out.println("Enter id: ");
		id = sc.nextInt();
		boolean found = false;
		for (Employee emp : empset) {
			if (emp.getId() == id) {
				System.out.println("Enter name: ");
				name = sc.next();
				System.out.println("Enter age: ");
				age = sc.nextInt();
				System.out.println("Enter new Salary: ");
				sal = sc.nextDouble();
				emp.setName(name);
				emp.setAge(age);
				emp.setSalary(sal);
				System.out.println("Updated Detaisl of employee are: ");
				System.out.println(emp);
				found = true;
			}

		}
		if (!found) {
			System.out.println("Employee with " + id + " is not found");
		} else {
			System.out.println("Employee details updated succesfully");
		}
	}

	// Delete Employee
	public void deleteEmployee() {
		System.out.println("Enter id: ");
		boolean found = false;
		id = sc.nextInt();
		Employee empdel = null;
		for (Employee emp : empset) {
			if (emp.getId() == id) {
				empdel = emp;
				found = true;
			}
		}
		if (!found) {
			System.out.println("Employee with " + id + " is not found");
		} else {
			empset.remove(empdel);
			System.out.println("Employee deleted Successfully!!");
		}
	}

	// Add employee
	public void addEmp() {
		System.out.println("Enter id: ");
		id = sc.nextInt();
		System.out.println("Enter name: ");
		name = sc.next();
		System.out.println("Emter age");
		age = sc.nextInt();
		System.out.println("Enter designation");
		designation = sc.next();
		System.out.println("Enter department");
		department = sc.next();
		System.out.println("Enter sal");
		sc.nextDouble();

		Employee emp = new Employee(id, name, age, designation, department, sal);
		empset.add(emp);
		System.out.println(emp);
		System.out.println("Employee added Successfully!!");
	}
}
