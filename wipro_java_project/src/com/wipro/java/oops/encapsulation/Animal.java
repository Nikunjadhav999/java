package com.wipro.java.oops.encapsulation;
/**
 * @author Nikunj
 */
public class Animal 
{
    // Private variables
    private String name;
    private int age;

    // Constructor to initialize the object
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) 
    {
        if(age >= 0) // Validating the age
        { 
            this.age = age;
        } 
        else 
        {
            System.out.println("Age cannot be negative.");
        }
    }

    // Method to show details
    public void showDetails() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Age: " + age);
    }


    public static void main(String[] args) 
    {
        // Creating an object of Animal
        Animal animal = new Animal("Lion", 5);

        // print the values
        System.out.println("Name: " + animal.getName());
        System.out.println("Age: " + animal.getAge());

        // Changing the name and age using setter methods
        animal.setName("Tiger");
        animal.setAge(6);

        // show the updated details
        animal.showDetails();
    }
}
