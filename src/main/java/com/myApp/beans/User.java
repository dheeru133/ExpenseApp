/**
 * @Author MY
 * @version: 1.0
 * @project: springBootDefaultTemplate
 * @description : Spring Template project.
 *
 * @file: User.java
 * @Date : Jul 12, 2018:2018:3:47:08 PM
 * @Updates : Jul 12, 2018:2018:3:47:08 PM
 **/
package com.myApp.beans;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

	private long	id;

	@NotNull(message = "{validation.name.notEmpty}")
	@Size(min = 3, max = 5, message = "{validation.name.notEmpty}")
	private String	name;

	// @NotNull
	// @Email(message = "{invalid.email.notEmpty}")
	private String	email;

	/** The password. */
	// @NotNull(message = "{validation.password.notEmpty}")
	// @Size(min = 3, max = 5)
	private String	password;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *        the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *        the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *        the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password
	 *        the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
