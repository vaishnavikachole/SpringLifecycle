package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
        Student students = (Student)context.getBean("student");
        System.out.println(students);
        
        context.registerShutdownHook();
        // registering shutdown hook 
    }
}
