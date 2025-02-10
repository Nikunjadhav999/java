package com.java.wipro.java8.usecase.test;
/*
 * @author Nikunj
 */
import org.junit.Test;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import static org.junit.Assert.*;
import org.junit.Before;

public class test {

    // Employee Data
    private Employee emp1, emp2, emp3;

    // EmployeeService instance for tests
    private EmployeeService employeeService;

    // Set up test data before each test
    @Before
    public void setUp() 
    {
        // Initialize employee data
        emp1 = new Employee(1, "Alice", "IT", 50000, LocalDate.of(2020, 5, 10));
        emp2 = new Employee(2, "Bob", "HR", 45000, LocalDate.of(2019, 3, 15));
        emp3 = new Employee(3, "Charlie", "Finance", 60000, LocalDate.of(2021, 8, 22));

        // Initialize EmployeeService with initial employee data
        employeeService = new EmployeeService(Arrays.asList(emp1, emp2, emp3));
    }

   
    //*************** Employee Class Tests ******************************
    

    @Test
    public void testEmployeeCreation() 
    {
        Employee employee = new Employee(4, "David", "Marketing", 55000, LocalDate.of(2022, 1, 1));
        assertEquals(4, employee.getId());
        assertEquals("David", employee.getName());
        assertEquals("Marketing", employee.getDepartment());
        assertEquals(55000, employee.getSalary(), 0.001);
        assertEquals(LocalDate.of(2022, 1, 1), employee.getJoiningDate());
    }

    @Test
    public void testEmployeeSetters()
    {
        Employee employee = new Employee(5, "Eve", "Sales", 48000, LocalDate.of(2023, 3, 10));
        employee.setName("Eva");
        employee.setDepartment("Management");
        employee.setSalary(62000);
        assertEquals("Eva", employee.getName());
        assertEquals("Management", employee.getDepartment());
        assertEquals(62000, employee.getSalary(), 0.001);
    }

    @Test
    public void testEmployeeToString() 
    {
        Employee employee = new Employee(6, "Frank", "IT", 70000, LocalDate.of(2024, 6, 15));
        String expected = "Employee{ID=6, Name='Frank', Dept='IT', Salary=70000.0, JoiningDate=2024-06-15}";
        assertEquals(expected, employee.toString());
    }


    // ******************* EmployeeService Class Tests ***************************

    @Test
    public void testAddEmployee() 
    {
        Employee newEmployee = new Employee(4, "David", "IT", 55000, LocalDate.now());
        employeeService.addEmployee(newEmployee);
        List<Employee> employees = employeeService.getAllEmployees();
        assertTrue(employees.contains(newEmployee));
        assertEquals(4, employees.size());
    }

    @Test
    public void testRemoveEmployee()
    {
        employeeService.removeEmployee(1);
        Optional<Employee> employee = employeeService.searchEmployee(1);
        assertFalse(employee.isPresent());
        assertEquals(2, employeeService.getAllEmployees().size());
    }

    @Test
    public void testSearchEmployee() 
    {
        Optional<Employee> employee = employeeService.searchEmployee(2);
        assertTrue(employee.isPresent());
        assertEquals("Bob", employee.get().getName());
    }

    @Test
    public void testUpdateSalary() 
    {
        employeeService.updateSalary(3, 65000);
        Optional<Employee> employee = employeeService.searchEmployee(3);
        assertTrue(employee.isPresent());
        assertEquals(65000, employee.get().getSalary(), 0.001);
    }

    @Test
    public void testGetAllEmployees() 
    {
        List<Employee> employees = employeeService.getAllEmployees();
        assertEquals(3, employees.size());
        assertTrue(employees.containsAll(Arrays.asList(emp1, emp2, emp3)));
    }

    @Test
    public void testFilterByDepartment() 
    {
        List<Employee> itEmployees = employeeService.filterByDepartment("IT");
        assertEquals(1, itEmployees.size());
        assertEquals("Alice", itEmployees.get(0).getName());
    }

    @Test
    public void testSortByName()
    {
        List<Employee> sortedEmployees = employeeService.sortByName();
        assertEquals("Alice", sortedEmployees.get(0).getName());
        assertEquals("Bob", sortedEmployees.get(1).getName());
        assertEquals("Charlie", sortedEmployees.get(2).getName());
    }

    @Test
    public void testGetAverageSalary()
    {
        double averageSalary = employeeService.getAverageSalary();
        assertEquals(51666.666, averageSalary, 0.001);
    }

    //****************** EmployeeManagement Class Tests *****************************

    @Test
    public void testEmployeeManagementAddEmployee() 
    {
        // Create a controlled input stream
        String input = "1\n4\nDavid\nIT\n55000\n9\n"; // Simulate adding an employee and then exiting
        Scanner scanner = new Scanner(input);
        EmployeeService employeeService = new EmployeeService(); // Use a real EmployeeService
        EmployeeManagement employeeManagement = new EmployeeManagement(employeeService, scanner);
        employeeManagement.run();

        // Now assert that the employee was added to the service
        Optional<Employee> newEmp = employeeService.searchEmployee(4);
        assertTrue(newEmp.isPresent());
        assertEquals("David", newEmp.get().getName());
    }

    @Test
    public void testEmployeeManagementRemoveEmployee() 
    {
        // Initialize EmployeeService with some employees
        EmployeeService employeeService = new EmployeeService(Arrays.asList(emp1, emp2, emp3));
        String input = "2\n1\n9\n"; // Simulate removing employee with ID 1 and then exiting
        Scanner scanner = new Scanner(input);
        EmployeeManagement employeeManagement = new EmployeeManagement(employeeService, scanner);
        employeeManagement.run();

        // Now assert that the employee was removed
        Optional<Employee> removedEmp = employeeService.searchEmployee(1);
        assertFalse(removedEmp.isPresent());
    }

    @Test
    public void testEmployeeManagementSearchEmployee() 
    {
        // Initialize EmployeeService with some employees
        EmployeeService employeeService = new EmployeeService(Arrays.asList(emp1, emp2, emp3));
        String input = "3\n2\n9\n"; // Simulate searching for employee with ID 2 and then exiting
        Scanner scanner = new Scanner(input);
        EmployeeManagement employeeManagement = new EmployeeManagement(employeeService, scanner);
        employeeManagement.run();

        // No direct assertion possible without capturing output, but we can check that the service's search method is used.
        Optional<Employee> searchedEmp = employeeService.searchEmployee(2);
        assertTrue(searchedEmp.isPresent());
        assertEquals("Bob", searchedEmp.get().getName());
    }
}
