package com.existingproject.springcore2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Constructor argument example..." );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/existingproject/constructor/otherconfig.xml");
        Address adr = (Address)context.getBean("addr");
        System.out.println(adr);
    }
}