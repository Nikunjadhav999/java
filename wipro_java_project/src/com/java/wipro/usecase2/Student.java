package com.java.wipro.usecase2;
/*
 * @author Nikunj
 */
import java.time.LocalDate;

public class Student 
{
 private int id;
 private String name;
 private double gpa;
 private LocalDate enrollmentDate;

 public Student(int id, String name,  double gpa, LocalDate enrollmentDate)
 {
    this.id = id;
    this.name = name;
    this.gpa = gpa;
    this.enrollmentDate = enrollmentDate;
 }

 
 
  public int getId() 
  {
     return id;
  }

  public String getName() 
  {
     return name;
  }

  public double getGpa() 
  {
     return gpa;
  }

  public void setGpa(double gpa) 
  {
     this.gpa = gpa;
  }

    public LocalDate getEnrollmentDate() 
    {
       return enrollmentDate;
    }

 @Override
    public String toString() 
    {
      return "Student{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", gpa=" + gpa +
      ", enrollmentDate=" + enrollmentDate +
     '}';
    }
}

