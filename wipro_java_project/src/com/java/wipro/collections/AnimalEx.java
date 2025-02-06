package com.java.wipro.collections;
/*
 * @author Nikunj
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Animal implements Comparable<Animal> {
    private String name;//Animal name 
    private String species;//animal species
    private int age;//Animal age

    //constructor for Animal
    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }
  //getter for name
    public String getName() {
        return name;
    }
    //getter for Species
    public String getSpecies() {
        return species;
    }
    //getter for age
    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Animal other) {
        // Natural ordering based on age
        return Integer.compare(this.age, other.age);
    }

    @Override
    //toString method for easy printing
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                '}';
    }

    // Comparator for sorting by name
    public static class NameComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal animal1, Animal animal2) {
            return animal1.getName().compareTo(animal2.getName());
        }
    }

    // Comparator for sorting by species
    public static class SpeciesComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal animal1, Animal animal2) {
            return animal1.getSpecies().compareTo(animal2.getSpecies());
        }
    }
}

public class AnimalEx {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        //Add animal data in list
        animalList.add(new Animal("Tommy", "Dog", 3));
        animalList.add(new Animal("Jerry", "Mouse", 1));
        animalList.add(new Animal("Charlie", "Dog", 5));
        animalList.add(new Animal("Butch", "Cat", 4));

        // Natural ordering (by age)
        System.out.println("Natural Ordering (by age):");
        Collections.sort(animalList);
        animalList.forEach(System.out::println);

        // Sorting by name using Comparator
        System.out.println("\nSorting by Name:");
        Collections.sort(animalList, new Animal.NameComparator());
        animalList.forEach(System.out::println);

        // Sorting by species using Comparator
        System.out.println("\nSorting by Species:");
        Collections.sort(animalList, new Animal.SpeciesComparator());
        animalList.forEach(System.out::println);
    }
}
