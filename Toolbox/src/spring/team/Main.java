package spring.team;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args){
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/spring/team/conf/conf.xml");

		Team team=(Team) context.getBean("paris-rugby-team");
		team.spitDetails();
		context.close();
	}
}
