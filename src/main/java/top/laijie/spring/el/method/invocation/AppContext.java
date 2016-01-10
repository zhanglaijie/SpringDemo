package top.laijie.spring.el.method.invocation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContext {
	private static ApplicationContext context;
	
	public static void main(String[] args) {
			context = new ClassPathXmlApplicationContext("Spring-EL_method_invocation.xml");
		 Customer customer= (Customer) context.getBean("customerBean");
		 System.out.println(customer.toString());
		 System.out.println("lll");
	}
}
