package simple_factory;

public class OperationDiv extends Operation{
	private double _numberA;
	private double _numberB;
	
	@Override
	public double getResult() {
		if (_numberB==0) {
			throw new IllegalArgumentException("除数不能为零");
		}
		return _numberA/_numberB;
	}
}
