package Factory_Method;

public class Add_Factory implements Operation_Factory{
	@Override
	public Operation CreateOperation() {
		return new OperationAdd();
	}
}
