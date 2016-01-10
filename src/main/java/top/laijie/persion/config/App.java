package top.laijie.persion.config;

import java.security.acl.Permission;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import top.laijie.persion.Persion;

public class App {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("Application.xml");
		Persion persion = (Persion) context.getBean("persion");
		persion.watch();
	}
}
