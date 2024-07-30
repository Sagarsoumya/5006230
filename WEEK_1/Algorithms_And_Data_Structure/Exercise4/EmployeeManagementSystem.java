package WEEK_1.Algorithms_And_Data_Structure.Exercise4;

import java.util.Arrays;

public class EmployeeManagementSystem {
    private Employee[] employees;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public EmployeeManagementSystem() {
        employees = new Employee[INITIAL_CAPACITY];
        size = 0;
    }

    public void addEmployee(Employee employee) {
        if (size == employees.length) {
            // resize the array
            employees = Arrays.copyOf(employees, employees.length * 2);
        }
        employees[size++] = employee;
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public boolean deleteEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                employees[i] = employees[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        ems.addEmployee(new Employee(1, "John Doe", "Manager", 75000));
        ems.addEmployee(new Employee(2, "Jane Smith", "Developer", 65000));
        ems.addEmployee(new Employee(3, "Bob Johnson", "Designer", 60000));

        System.out.println("All Employees:");
        ems.traverseEmployees();

        System.out.println("\nSearching for Employee with ID 2:");
        Employee employee = ems.searchEmployee(2);
        System.out.println(employee != null ? employee : "Employee not found");

        System.out.println("\nDeleting Employee with ID 2:");
        boolean deleted = ems.deleteEmployee(2);
        System.out.println(deleted ? "Employee deleted" : "Employee not found");

        System.out.println("\nAll Employees after deletion:");
        ems.traverseEmployees();
    }
}
