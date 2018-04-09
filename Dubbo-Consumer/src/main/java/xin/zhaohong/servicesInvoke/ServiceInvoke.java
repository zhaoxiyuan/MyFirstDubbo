package xin.zhaohong.servicesInvoke;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import xin.zhaohong.interfaces.People;
import xin.zhaohong.interfaces.Student;

@RunWith(SpringJUnit4ClassRunner.class)
//applicationContext.xml必须写这个名字
@ContextConfiguration(locations= {"classpath*:META-INF/spring/applicationContext.xml",
		"classpath*:META-INF/spring/spring-dubbo-consumer.xml"	
})


public class ServiceInvoke {
	
	@Autowired
	private People myPeople;

	@Autowired
	private Student myStudent;
	@Test
	public void test(){
		myPeople.setAge(11);
		myPeople.setName("AAAAAAAAA");
		
		int age = myPeople.getAge();
		String name = myPeople.getName();
		int newAge = myPeople.getNewAge();
		String str = "姓名："+name+";\n年龄："+age+";\n新年龄："+newAge;
		System.out.println(str);
		myStudent.setAge(888);
		myStudent.setName("OOOOOOOOO");
		int stuAge = myStudent.getAge();
		String stuName = myStudent.getName();
		int newStuAge = myStudent.getNewAge();
		String str2 = "姓名："+stuName+";\n年龄："+stuAge+";\n新年龄："+newStuAge;
		System.out.println(str2);
		
		
	}
	
	
	
	

}
