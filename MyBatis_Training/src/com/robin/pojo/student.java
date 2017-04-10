package com.robin.pojo;

public class student {
	private int std_id;
	private String name;
	private String birthday;
	private Enum Sex;

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

	public Enum getSex() {
		return Sex;
	}

	public void setSex(Enum sex) {
		Sex = sex;
	}
}
