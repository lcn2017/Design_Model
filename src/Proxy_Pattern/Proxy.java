package Proxy_Pattern;

public class Proxy implements SubJect {
    protected RealSubject readable;
	@Override
	public void requrst() {
		readable.requrst();
	}
}
