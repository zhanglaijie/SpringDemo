package top.laijie.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CommonApp {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Common.xml");
		Customer customer = (Customer) context.getBean("CustomerBean");
		customer.setPerson(new Person("zhangsan", "xianggou", 18));
		System.out.println(customer.toString());;
		context = new ClassPathXmlApplicationContext("Customer2.xml");
		Customer2 customer2 = (Customer2) context.getBean("CustomerBean");
		System.out.println(customer2.toString());
	}
}
