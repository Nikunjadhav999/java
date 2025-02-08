package com.java.wipro.java8.usecase.test;

/**
 *@author Nikunj 
 */
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
    }

    public EmployeeService(List<Employee> initialEmployees) {
        this.employees = new ArrayList<>(initialEmployees); // Create a copy
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee added: " + emp);
    }

    public void removeEmployee(int id) {
        employees.removeIf(emp -> emp.getId() == id);
        System.out.println("Employee with ID " + id + " removed.");
    }

    public Optional<Employee> searchEmployee(int id) {
        return employees.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst();
    }

    public void updateSalary(int id, double newSalary) {
        employees.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .ifPresent(emp -> emp.setSalary(newSalary));
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees); // Return a copy
    }


    public List<Employee> filterByDepartment(String department) {
        return employees.stream()
                .filter(emp -> emp.getDepartment().equalsIgnoreCase(department))
                .collect(Collectors.toList());
    }

    public List<Employee> sortByName() {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
    }

    public double getAverageSalary() {
        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
    }
}
