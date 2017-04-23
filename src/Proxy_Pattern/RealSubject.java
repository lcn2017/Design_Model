package Proxy_Pattern;

public class RealSubject implements SubJect{
	@Override
	public void requrst() {
		System.out.println("这是真实的请求");
	}
}
