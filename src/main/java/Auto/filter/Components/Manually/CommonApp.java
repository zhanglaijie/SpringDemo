package Auto.filter.Components.Manually;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CommonApp {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Spring-filter-Customer.xml");
		CustomerService customer = (CustomerService) context.getBean("customerService");
		System.out.println(customer.toString());
	}
}
