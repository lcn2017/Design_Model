package Decorator_Pattern;

public class TShirts extends Finery{
    
	@Override
	public void setUp() {
		System.out.println("大T恤");
		this.component.show();
	}
}
