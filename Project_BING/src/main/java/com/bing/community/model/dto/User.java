package com.bing.community.model.dto;

public class User {
	private int id;
	private String email;
	private String pw;
	private int height;
	private int weight;
	private String name;
	private int age;
	private String gender;

	public User(int id, String email, String pw, int height, int weight, String name, int age, String gender) {
		super();
		this.id = id;
		this.email = email;
		this.pw = pw;
		this.height = height;
		this.weight = weight;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return pw;
	}

	public void setPassword(String pw) {
		this.pw = pw;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
