package joseph.vip.InjectDemo.controller;

import joseph.vip.InjectDemo.service.InjectServiceDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class InjectDemo {
	@Autowired
	private InjectServiceDemo injectServiceDemo;

	public void controllerMethod1(){
		injectServiceDemo.method1();
	}

}
