/**
 * 
 */
package com.faith.trainings.guessinggame;

/****************************************************************************
 * <b>Title:</b> Person.java <br>
 * <b>Project:</b> Trainings <br>
 * <b>Description:</b> Person Class <br>
 * <b>Copyright:</b> Copyright (c) 2022 <br>
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Faith Johnson
 * @version 3.x
 * @since Jun 13, 2022 <b>updates:</b>
 * 
 ****************************************************************************/

public class Person {
	private String firstName;
	private String lastName;
	private int personId;

	public Person() {
		
	}
	
	public Person(String firstName) {
		this.firstName = firstName;
	}

	
//	@Override
//	public String toString() {
//		return firstName + " " + lastName;
//	}

	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	/**
	 * 
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param personId
	 */
	public void setPersonId(int personId) {
		this.personId = personId;
	}

	/**
	 * @return personId
	 */
	public int getPersonId() {
		return personId;
	}
}
