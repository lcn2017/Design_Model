package Factory_Method;

public class Sub_Factory implements Operation_Factory{
	@Override
	public Operation CreateOperation() {
		return new OperationSub();
	}
}
