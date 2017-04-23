package Decorator_Pattern;

public class Shoe extends Finery{
	@Override
	public void setUp() {
		System.out.println("Nike鞋");
		this.component.show();
	}
}
