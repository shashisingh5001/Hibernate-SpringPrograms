package com.shashi.Application;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        ApplicationContext context=new ClassPathXmlApplicationContext("com/shashi/Application/bean.xml");
        
       Car obj=(Car)context.getBean("car");
        obj.drive();
        //Tyre t=(Tyre) context.getBean("tyre");
        //System.out.println(t);
    }
}
