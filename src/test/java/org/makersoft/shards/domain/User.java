/*
 * @(#)User.java 2012-9-4 下午23:59:06
 *
 * Copyright (c) 2011-2012 Makersoft.org all rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 */
package org.makersoft.shards.domain;

/**
 * User domain for test.
 */
public class User extends AbstractShardEntity {

	private static final long serialVersionUID = -2426776467504642746L;

	public static final int SEX_MALE = 0;
	public static final int SEX_FEMALE = 1;

	private String username;

	private String password;
	
	private int age;

	private int gender;

	public User() {
	}

	/**
	 * 有参构造，方便测试用例初始化
	 */
	public User(String username, String password, int gender) {
		this.username = username;
		this.password = password;
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

}
