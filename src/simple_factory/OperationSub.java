package simple_factory;

public class OperationSub extends Operation{
	private double _numberA;
	private double _numberB;
	
	@Override
	public double getResult() {
		return _numberA-_numberB;
	}
}
