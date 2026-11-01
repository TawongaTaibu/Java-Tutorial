package com.ttaibu.intro;

import java.util.logging.Logger;

public class Person {
    
    // Declaring variables
    private String firstName;
    private String lastName;
    private int age;
    private int height;
    private int weight;
    private String eyeColor;
    private String gender;
    
    public Person() {
    }
    
    //Constructor for Employee Class
    public Person(String firstName) {
    	this.firstName = firstName;
    
    }
    
    // Constructor for Person class
    public Person(String firstName, String lastName, int age, int height, int weight, String eyeColor, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.gender = gender;
    }
    
    /*Suppose a Person class needs a couple of methods to print an audit of its current state.
     *I call both of those methods printAudit()*/
    public void printAudit(StringBuilder buffer) {
		buffer.append("First Name = ");
		buffer.append(getFirstName());
		buffer.append(",");
		buffer.append("Last Name = ");
		buffer.append(getLastName());
		buffer.append(",");
		buffer.append("Age = ");
		buffer.append(getAge());
		buffer.append(",");
		buffer.append("Height = ");
		buffer.append(getHeight());
		buffer.append(",");
		buffer.append("Weight = ");
		buffer.append(getWeight());
		buffer.append(",");
		buffer.append("EyeColor = ");
		buffer.append(getEyeColor());
		buffer.append(",");
		buffer.append("Gender = ");
		buffer.append(getGender());
	}
    
    /*NB: YOU CANT OVERLOAD A METHOD JUST BY CHANGING IT'S RETURN TYPE.
     *    YOU CAN'T HAVE TWO SAME-NAMED METHODS WITH THE SAME PARAMETER LIST.
     *    IF YOU VIOLATE THESE RULES THE COMPILER GIVES YOU AN ERROR*/
    
    public void printAudit(Logger l) {
		StringBuilder sb = new StringBuilder();
		printAudit(sb);
		l.info(sb.toString());
	}
     
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
        
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public String getEyeColor() {
        return eyeColor;
    }
    
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    // NEW METHOD: Concatenates first and last name
    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
	public String toString() {
		return super.toString() + "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", height=" + height
				+ ", weight=" + weight + ", eyeColor=" + eyeColor + ", gender=" + gender + "]";
	}
    
    // MAIN METHOD: This is where execution is allowed!
    public static void main(String[] args) {
        // Create the initial person object (Split name into First and Last)
        Person p = new Person("Joe", "Author", // First and Last Name
                42, // Age (In years)
                173, // Height (In cm)
                82, // Weight (In kg)
                "Brown", // Eye color
                "MALE"); // Gender
        
        // Print the full name using our new method
        System.out.println("Original Full Name: " + p.getFullName());
        System.out.println(p.toString());
        
        // Update first and last name using the setters
        p.setFirstName("Jane");
        p.setLastName("Doe");
        
        // Print the updated full name and details
        System.out.println("Updated Full Name: " + p.getFullName());
        System.out.println(p.toString());
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((eyeColor == null) ? 0 : eyeColor.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + height;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + weight;
		return result;
	}
	/* This method is complicated but what it does is simple.
	 * If the object passed in is the same object as the one in code, equals() returns true.
	 * If the object passed in is null(missing), it returns false
	 * 
	 * The method then checks to see if the Class objects are the same.If they are the same, each attribute value of the object passed
	 * in is checked to see if it matches value-for-value with the state of the given Person instance. If the attribute values are null, the equals() checks
	 * as many as it can, and if those match, the objects are considered equal.*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (eyeColor == null) {
			if (other.eyeColor != null)
				return false;
		} else if (!eyeColor.equals(other.eyeColor))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (height != other.height)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
}