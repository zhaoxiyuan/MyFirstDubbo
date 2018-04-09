package xin.zhaohong.interfaces.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;




import xin.zhaohong.interfaces.People;
import xin.zhaohong.interfaces2.AddAge;


public class PeopleImpl implements People  {
	/**
	 * 
	 */
	private int age;
	private String name;
	@Autowired
	private AddAge addAge;
	
	public PeopleImpl(){
		System.out.println("构造方法People");
	}
	
	public PeopleImpl(int age, String name) {
		this.age = age;
		this.name = name;
	}



	public String getName() {
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public int getNewAge(){
		return addAge.addAge();
	}


}
