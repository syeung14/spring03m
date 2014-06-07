package com.ssyeung.ibatis;


/**
 * http://howtodoinjava.com/2013/01/03/ibatis-hello-world-example-with-source-code/
 * CREATE TABLE `User` (
*    `id` BIGINT(10) NOT NULL AUTO_INCREMENT,
*    `firstname` VARCHAR(50) NULL DEFAULT NULL,
*    `lastname` VARCHAR(50) NULL DEFAULT NULL,
*    `birth_date` DATE NOT NULL,
*    `cell_phone` VARCHAR(15) NOT NULL,
*    PRIMARY KEY (`id`))
*    
*CREATE TABLE USERINFO
*(
*	ID INT,
*	NAME VARCHAR(100),
*	EMAIL VARCHAR(50),
*	PASSWORD VARCHAR(16),
*	STATUS INT
*);    
*
 * @author iampolo
 */
public class User {
	public User() {
	}

	private Integer id;
	private String name;
	private String email;
	private String password;
	private int status;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
