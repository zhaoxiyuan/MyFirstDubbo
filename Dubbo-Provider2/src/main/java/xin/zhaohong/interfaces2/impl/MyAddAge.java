package xin.zhaohong.interfaces2.impl;

import xin.zhaohong.interfaces.People;
import xin.zhaohong.interfaces2.AddAge;

public class MyAddAge implements AddAge {
	
	public MyAddAge(){
		
	}

	public People addAge(People people) {
		people.setAge(people.getAge()+6);
		System.out.println("-----------修改年龄了------------");
		return people;
	}
	public int addAge() {
		System.out.println("-----------修改年龄了------------");
		return 100000;
	}
	
	

}
