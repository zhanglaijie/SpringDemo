package top.laijie.spring.el;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSpringcontext {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Spring-EL.xml");
		Customer customer = (Customer) context.getBean("customerBean");
		System.out.println(customer.toString());
	}
}
