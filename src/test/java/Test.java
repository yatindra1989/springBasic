

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dhavisoft.AutowireByName.PersonName;

import groovy.transform.ToString;

public class Test {

	public static void main(String[] args) {
ApplicationContext con=new  ClassPathXmlApplicationContext("com/dhavisoft/AutowireByName/mydata.xml");
PersonName pn =(PersonName) con.getBean("pn");
System.out.println(pn.toString());
	}

}
