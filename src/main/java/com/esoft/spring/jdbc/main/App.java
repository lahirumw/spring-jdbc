package com.esoft.spring.jdbc.main;

import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.esoft.spring.jdbc.bean.Actor;
import com.esoft.spring.jdbc.service.ActorService;

public class App {
	
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		ActorService act = (ActorService) context.getBean("actorServiceImpl");
		
		Actor actor = new Actor();
		actor.setFirstName("Sanjaya");
		actor.setLastName("Gamage");
		actor.setLastUpdate(new Date(System.currentTimeMillis()));
		act.inserActor(actor);
		System.out.println("DONE");
		
	}
}
