package com.newproject.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "Spring Core Project Running..." );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("configtemp.xml");
        Employee emp=(Employee)context.getBean("employee");
        Employee emp1=(Employee)context.getBean("employee1");
        System.out.println(emp);
        System.out.println(emp1);
    }
}
