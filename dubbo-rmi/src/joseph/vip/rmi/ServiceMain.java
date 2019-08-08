package joseph.vip.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServiceMain {
	public static void main(String[] args) throws Exception {
		//实例化要暴露的给远程调用的对象
		SayServiceImpl sayServiceImpl = new SayServiceImpl();
		//开启本地服务
		ISayService iSayService = (ISayService) UnicastRemoteObject.exportObject(sayServiceImpl, 666);
		//注册中心
		Registry registry = LocateRegistry.createRegistry(999);
		//注册服务
		registry.rebind("sayService",iSayService);
	}
}
