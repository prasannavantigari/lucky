package com.mycompany.springdemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.springdemo2.Coach.*;
public class App {

	
	    public static void main( String[] args )
	    {
	        try {
	        	ApplicationContext context=
	        			new ClassPathXmlApplicationContext("applicationContext.xml");
	        	TennisCoach theCoach=context.getBean("theCoach",TennisCoach.class);
	        	System.out.println(theCoach.getDailyWorkout()+
	        			"\n"+theCoach.getDailyFortune()+"\nAge: "+theCoach.getAge()+"\nEmail: "+theCoach.getEmail());

			} catch (Exception e) {
				e.printStackTrace();
			}
	    }
}
