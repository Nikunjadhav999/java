/**
 * 
 */
package com.wipro.java.oops;

/**
 * @author Nikunj
 * 
 * NO constructor
* Getters have return value
* setters have no return value
* properties are determined using private fileds
* values or behaviors are determined through setters
* toString will convert the entire animal class with properties and behaviors
*/
 
public class Animal {
	//private properties=structure
	private String name;// Animal Name
	private int age;// Animal age
	private String species; //animal species


// getter for name
	public String getName() {
		return name;//example:fish
	}

	//setter for name
	public void setName(String name) {
		this.name = "fish";
	}
	// getter for age
	public int getAge() {
		return age;
	}
	//setter for age
	public void setAge(int age) {
		this.age = 2;
	}
	//getter for species
	public String getSpecies() {
		return species;
	}
//setter for species
	public void setSpecies(String species) {
		this.species = "aquatic";
	}

//toString method for easy printing
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", species=" + species + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getSpecies()=" + getSpecies() + "]";
	}
	

}
