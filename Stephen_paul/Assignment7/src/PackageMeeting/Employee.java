package PackageMeeting;
public class Employee {
		    // Nested Project class
		    static class Project {
		        int id;
		        String clientName;

		        public Project(int id, String clientName) {
		            this.id = id;
		            this.clientName = clientName;
		        }

		        public void printInfo() {
		            System.out.println("Project ID: " + id);
		            System.out.println("Client Name: " + clientName);
		        }
		    }

		    // Employee attributes
		    String name;
		    int id;
		    double salary;
		    Project project;

		    // Constructor for Employee
		    public Employee(String name, int id, double salary, Project project) {
		        this.name = name;
		        this.id = id;
		        this.salary = salary;
		        this.project = project;
		    }

		    // Method to print employee information
		    public void printEmployeeInfo() {
		        System.out.println("Employee Information:");
		        System.out.println("Name: " + name);
		        System.out.println("Employee ID: " + id);
		        System.out.println("Salary: $" + salary);
		        System.out.println("Project Information:");
		        project.printInfo();
		    }

		    public static void main(String[] args) {
		        // Create an instance of Project
		        Project project = new Project(101, "ABC Corp");

		        // Create an instance of Employee and pass the Project
		        Employee employee = new Employee("John Doe", 1001, 75000.0, project);

		        // Print employee information
		        employee.printEmployeeInfo();

		

	}

}
