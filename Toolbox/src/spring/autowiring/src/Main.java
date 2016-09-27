package spring.autowiring.src;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main( String[] args )
	{
		ApplicationContext context =
				new ClassPathXmlApplicationContext(new String[] {"/spring/autowiring/conf/SpringBeans.xml"});

		Outer outer = (Outer)context.getBean("outer");
		System.out.println(outer.getInner());

	}
}
