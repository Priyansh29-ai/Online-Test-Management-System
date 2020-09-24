package com.capgemini.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "UserTest")
/**
 * 
 * user pojo class
 *
 */
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	
	private String userName;
	private int testId = 0;
	private String isAdmin = "False";
	private String email;
	
	private String userPassword;

	/**
	 * 
	 * @return
	 */

	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * @param email
	 */

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @return
	 */

	public long getUserId() {
		return userId;
	}

	/**
	 * 
	 * @param userId
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}

	/**
	 * 
	 * @return
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 
	 * @return
	 */

	public int getTestId() {
		return testId;
	}

	/**
	 * 
	 * @param testId
	 */

	public void setTestId(int testId) {
		this.testId = testId;
	}

	/**
	 * 
	 * @return
	 */

	public String getIsAdmin() {
		return isAdmin;
	}

	/**
	 * 
	 * @param isAdmin
	 */

	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}

	/**
	 * 
	 * @return
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * 
	 * @param userPassword
	 */

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	/**
	 * 
	 * @param userName
	 * @param testId
	 * @param isAdmin
	 * @param email
	 * @param userPassword
	 */

	public User(String userName, int testId, String isAdmin, String email, String userPassword) {

		this.userName = userName;
		this.testId = testId;
		this.isAdmin = isAdmin;
		this.email = email;
		this.userPassword = userPassword;
	}

	public User() {
	}
}
