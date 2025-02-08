package com.java.wipro.java8.usecase.test;
/*
 * @author Nikunj
 */
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class EmployeeManagement {

    private final EmployeeService service;
    private final Scanner scanner;

    public EmployeeManagement(EmployeeService service, Scanner scanner) {
        this.service = service;
        this.scanner = scanner;
    }

    public void run() {
        while (true) {
            System.out.println("\n------ Employee Management System ------");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Display All Employees");
            System.out.println("6. Filter by Department");
            System.out.println("7. Sort by Name");
            System.out.println("8. Get Average Salary");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    removeEmployee();
                    break;
                case 3:
                    searchEmployee();
                    break;
                case 4:
                    updateSalary();
                    break;
                case 5:
                    displayEmployees();
                    break;
                case 6:
                    filterByDepartment();
                    break;
                case 7:
                    sortByName();
                    break;
                case 8:
                    getAverageSalary();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private void addEmployee() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Department: ");
        String dept = scanner.nextLine();
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        service.addEmployee(new Employee(id, name, dept, salary, LocalDate.now()));
    }

    private void removeEmployee() {
        System.out.print("Enter Employee ID to Remove: ");
        int removeId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        service.removeEmployee(removeId);
    }

    private void searchEmployee() {
        System.out.print("Enter Employee ID to Search: ");
        int searchId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Optional<Employee> emp = service.searchEmployee(searchId);
        System.out.println(emp.orElse(null));
    }

    private void updateSalary() {
        System.out.print("Enter Employee ID to Update Salary: ");
        int updateId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter New Salary: ");
        double newSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        service.updateSalary(updateId, newSalary);
    }

    private void displayEmployees() {
        service.getAllEmployees().forEach(System.out::println);
    }

    private void filterByDepartment() {
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
        List<Employee> filtered = service.filterByDepartment(department);
        filtered.forEach(System.out::println);
    }

    private void sortByName() {
        List<Employee> sorted = service.sortByName();
        sorted.forEach(System.out::println);
    }

    private void getAverageSalary() {
        System.out.println("Average Salary: " + service.getAverageSalary());
    }


    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        // Adding some employees for testing
        service.addEmployee(new Employee(1, "Alice", "IT", 50000, LocalDate.of(2020, 5, 10)));
        service.addEmployee(new Employee(2, "Bob", "HR", 45000, LocalDate.of(2019, 3, 15)));
        service.addEmployee(new Employee(3, "Charlie", "Finance", 60000, LocalDate.of(2021, 8, 22)));

        Scanner scanner = new Scanner(System.in);
        EmployeeManagement management = new EmployeeManagement(service, scanner);
        management.run();
    }
}

