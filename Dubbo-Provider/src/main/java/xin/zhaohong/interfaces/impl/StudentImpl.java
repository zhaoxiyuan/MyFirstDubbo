package xin.zhaohong.interfaces.impl;


import org.springframework.beans.factory.annotation.Autowired;

import xin.zhaohong.interfaces.Student;
import xin.zhaohong.interfaces2.AddAge;

public class StudentImpl implements Student  {
	
	private int age;
	private String name;
	@Autowired
	private AddAge addAge;

	public StudentImpl(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public StudentImpl(){
		System.out.println("构造方法Student");
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getSchoolName(String schoolName) {
		return schoolName;
	}

	public void setAge(int age) {
		this.age = age;
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNewAge() {
		return addAge.addAge();
	}

}
