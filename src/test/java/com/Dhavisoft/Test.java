package com.Dhavisoft;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
ApplicationContext con=new ClassPathXmlApplicationContext("com/dhavisoft/AutowireByType/MyData.xml");
com.dhavisoft.AutowireByType.PatnerName pn=(com.dhavisoft.AutowireByType.PatnerName) con.getBean("patner");
System.out.println(pn.toString());


	}

}
