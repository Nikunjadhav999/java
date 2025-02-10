package com.java.wipro.usecase2;
/*
 * @author Nikunj
 */
//StudentManagement
import java.time.LocalDate;
import java.util.*;

public class StudentManagement 
 {
    public static void main(String[] args) 
    {
    	StudentService service = new StudentService();
    	Scanner scanner = new Scanner(System.in);
       // Adding some students for testing
    	service.addStudent(new Student(1, "Alice", 3.8, LocalDate.of(2022, 9, 1)));
    	service.addStudent(new Student(2, "Bob", 3.5, LocalDate.of(2021, 8, 15)));
    	service.addStudent(new Student(3, "Charlie", 3.9, LocalDate.of(2023, 1, 20)));
    	while (true) 
    		
    	{
    		System.out.println("\n------ Student Management System ------");
    		System.out.println("1. Add Student");
    		System.out.println("2. Remove Student");
    		System.out.println("3. Search Student");
    		System.out.println("4. Update GPA");
    		System.out.println("5. Display All Students");
    		System.out.println("6. Sort by Name");
    		System.out.println("7. Exit");
    		System.out.print("Enter your choice: ");
    		int choice = scanner.nextInt();
    		scanner.nextLine(); // Consume newline
    		switch (choice) 
    		{

    		case 1:
    			System.out.print("Enter ID: ");
    			int id = scanner.nextInt();
    			scanner.nextLine(); // Consume newline
    			System.out.print("Enter Name: ");
    			String name = scanner.nextLine();
    			System.out.print("Enter GPA: ");
    			double gpa = scanner.nextDouble();
    			service.addStudent(new Student(id, name, gpa, LocalDate.now()));
    			break;

    		case 2:
    			System.out.print("Enter Student ID to Remove: ");
    			int removeId = scanner.nextInt();
    			service.removeStudent(removeId);
    			break;

    		case 3:
    			System.out.print("Enter Student ID to Search: ");
    			int searchId = scanner.nextInt();
    			Optional<Student> stu = service.searchStudent(searchId);
    			System.out.println(stu.orElse(null));
    			break;

    		case 4:
    			System.out.print("Enter Student ID to Update GPA: ");
    			int updateId = scanner.nextInt();
    			System.out.print("Enter New GPA: ");
    			double newGPA = scanner.nextDouble();
    			service.updateGPA(updateId, newGPA);
    			break;

    		case 5:
    			service.displayStudents();
    			break;

    		case 6:
    			List<Student> sorted = service.sortByName();
    			sorted.forEach(System.out::println);
    			break;
    			
    		case 7:
    			System.out.println("Exiting...");
    			scanner.close();
    			return;
    			
    		default:
    			System.out.println("Invalid choice! Try again.");
    		}
    	}
    }
 }

