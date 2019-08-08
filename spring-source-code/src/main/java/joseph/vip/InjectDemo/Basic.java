package joseph.vip.InjectDemo;

import joseph.vip.InjectDemo.controller.InjectDemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Basic {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring/spring.xml");
		InjectDemo injectDemo = (InjectDemo) context.getBean("injectDemo");
		injectDemo.controllerMethod1();
	}
}
