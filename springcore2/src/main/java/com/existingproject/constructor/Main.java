package com.existingproject.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
        System.out.println( "Constructor argument example..." );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/existingproject/constructor/otherconfig.xml");
        Location adr = (Location)context.getBean("addr");
        System.out.println(adr);

	}

}

