package joseph.vip.rmi;

import java.rmi.Remote;

public interface ISayService extends Remote {
	public String say(String name) throws Exception;
}
