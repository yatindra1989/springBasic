package com.dhavisoft.autowiringbyname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HouseByNameTest {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/dhavisoft/autowiringbyname/HouseByNameConfig.xml");
		HouseByName hb = (HouseByName) con.getBean("Name");
		hb.show();
	}

}
