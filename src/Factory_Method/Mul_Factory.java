package Factory_Method;

public class Mul_Factory implements Operation_Factory{
	@Override
	public Operation CreateOperation() {
		return new OperationMul();
	}
}
