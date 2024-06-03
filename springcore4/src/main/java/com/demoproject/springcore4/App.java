package com.demoproject.springcore4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Details are:" );
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Laptop lap = (Laptop)context.getBean("lappy");
        System.out.println(lap);
        
        ((AbstractApplicationContext) context).registerShutdownHook();
    }
}