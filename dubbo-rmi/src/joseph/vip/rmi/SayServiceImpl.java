package joseph.vip.rmi;

public class SayServiceImpl implements ISayService {
	@Override
	public String say(String name) {
		return name+" say:hello";
	}
}
