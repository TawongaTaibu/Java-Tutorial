package com.ttaibu.intro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testPerson() {
		// Updated constructor with separate first and last name (7 arguments total)
		Person p = new Person("Joe", "Author", 42, 173, 82, "Brown", "MALE");
		
		Logger l = Logger.getLogger(Person.class.getName());
		l.info("Created Person object with full name: " + p.getFullName());
		
		// Assertions for individual names and the concatenated full name
		assertEquals("Joe", p.getFirstName());
		assertEquals("Author", p.getLastName());
		assertEquals("Joe Author", p.getFullName());
		
		// Assertions for other attributes
		assertEquals(42, p.getAge());
		assertEquals(173, p.getHeight());
		assertEquals(82, p.getWeight());
		assertEquals("Brown", p.getEyeColor());
		assertEquals("MALE", p.getGender());
	}

}