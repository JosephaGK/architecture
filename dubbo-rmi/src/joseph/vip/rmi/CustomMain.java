package joseph.vip.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CustomMain {
	public static void main(String[] args) throws Exception {
		Registry registry = LocateRegistry.getRegistry(999);
		ISayService sayService = (ISayService) registry.lookup("sayService");
		String name = sayService.say("joseph");
		System.out.println(name);
	}
}
