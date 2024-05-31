package com.demoproject3.springcore3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Teacher t = (Teacher)context.getBean("teacher");
        System.out.println(t);
    }
}
