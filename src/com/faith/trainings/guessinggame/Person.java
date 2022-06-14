/**
 * 
 */
package com.faith.trainings.guessinggame;

/****************************************************************************
 * <b>Title:</b> Person.java <br>
 * <b>Project:</b> Trainings <br>
 * <b>Description:</b> CHANGE ME!! <br>
 * <b>Copyright:</b> Copyright (c) 2022 <br>
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Faith Johnson
 * @version 3.x
 * @since Jun 13, 2022
 * <b>updates:</b>
 *  
 ****************************************************************************/
/**
 * @author faith
 *
 */
public class Person implements java.io.Serializable {
	private String firstName;
	private String lastName;
	private int age;
	private int personId;

	public Person() {

	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public int getPersonId() {
		return personId;
	}
}
