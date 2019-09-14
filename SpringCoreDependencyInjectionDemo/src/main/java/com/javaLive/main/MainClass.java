package com.javaLive.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaLive.beans.RoomConstructor;
import com.javaLive.beans.RoomSetter;

/**
 * Hello world!
 *
 */
public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		RoomConstructor roomConstructor = (RoomConstructor) context.getBean("roomConstructor");
		System.out.println(roomConstructor);
		
		RoomSetter roomSetter = (RoomSetter) context.getBean("roomSetter");
		System.out.println(roomSetter);
		context.registerShutdownHook();

	}
}
