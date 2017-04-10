package com.robin.pojo;

import com.robin.enums.Sex;

public class Student {
	private int std_id;
	private String name;
	private String birthday;
	private Sex Sex;

	public int getStd_id() {
		return std_id;
	}

	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Sex getSex() {
		return Sex;
	}

	public void setSex(Sex sex) {
		Sex = sex;
	}

	@Override
	public String toString() {
		return "Student [std_id=" + std_id + ", name=" + name + ", birthday="
				+ birthday + ", Sex=" + Sex + "]";
	}

}
