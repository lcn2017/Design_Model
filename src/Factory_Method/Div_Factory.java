package Factory_Method;

public class Div_Factory implements Operation_Factory{
	@Override
	public Operation CreateOperation() {
		return new OperationDiv();
	}
}