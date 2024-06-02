package com.demoproject.springcoreagain3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Teacher t = (Teacher)context.getBean("tech");
        System.out.println(t);
    }
}