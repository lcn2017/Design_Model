package Strategy_Pattern;

//这是收费策略的家族
public class Cash_Context {
	private CashSuper cs;
	public Cash_Context(String type) {
		switch (type) {
		case "正常收费":
			cs=new Cash_Normal();
			break;
			//假设八折
		case "打折收费":
			cs=new Cash_Rebate(0.8);
			break;
			//假设满300减100
		case "满减":
			cs=new Cash_Return("300","100");
			break;
		default:
			cs=null;
			break;
		}
	}
	
	public double getReault(double money) {
		return cs.acceptCash(money);
	}
}
