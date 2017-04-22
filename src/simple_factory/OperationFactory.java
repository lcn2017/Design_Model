package simple_factory;

public class OperationFactory {
	private static Operation O;
	private static Operation getOperation(String Operation_String){
		switch (Operation_String) {
		case "+":
			O=new OperationAdd();
			break;
		case "-":
			O=new OperationSub();
			break;
		case "*":
			O=new OperationMul();
			break;
		case "/":
			O=new OperationDiv();
			break;
			default:
				O=null;
				break;
		}
		return O;
	}
}
