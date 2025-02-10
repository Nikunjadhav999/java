package com.java.wipro.usecase2;
/*
 * @author Nikunj
 */
//StudentService
import java.util.*;
import java.util.stream.Collectors;

public class StudentService 
{
	private List<Student> students = new ArrayList<>();

	// Add a Student
	public void addStudent(Student student) 
	{
		students.add(student);
		System.out.println("Student added: " + student);
	}

	// Remove a Student by ID
	public void removeStudent(int id) 
	{
		students.removeIf(stu -> stu.getId() == id);
		System.out.println("Student with ID " + id + " removed.");
	}

	// Search Student by ID
	public Optional<Student> searchStudent(int id) 
	{
		return students.stream()
				.filter(stu -> stu.getId() == id)
				.findFirst();
	}

	// Update Student GPA
	public void updateGPA(int id, double newGPA)
	{
		students.stream()
		.filter(stu -> stu.getId() == id)
		.findFirst()
		.ifPresent(stu -> stu.setGpa(newGPA));
	}
	
	// Display All Students
	public void displayStudents() 
	{
		students.forEach(System.out::println);
	}

	// Sort Students by Name
	public List<Student> sortByName() 
	{
		return students.stream()
				.sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
	}
}
