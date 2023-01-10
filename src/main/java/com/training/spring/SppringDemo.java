package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SppringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
    ApplicationContext context =new AnnotationConfigApplicationContext(com.training.spring.ApplicationConfig.class);
	Person person1=(Person)context.getBean("person");
//	Car car1=(Car)context.getBean("mycar");
	System.out.println("Name is "+person1.getFirstName()+" "+person1.getLastName());
	System.out.println("the age is "+person1.getAge());
	System.out.println("the car detail "+person1.personDetail());
	
//	Person person2=(Person)context.getBean("person");
//	System.out.println("Name is "+person1.getFirstName()+" "+person1.getLastName());

	Employee emp1=(Employee)context.getBean("employee");

	System.out.println("the employee detail:- Employee Id-"+emp1.getEmpId()+" Employee name-"+emp1.getEmpName()+" Employee Salaray-"+emp1.getSalary()+" "+emp1.ManagerDetail());

	}
	

}
