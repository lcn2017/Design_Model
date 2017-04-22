package Strategy_Pattern;
//正常收费策略
public class Cash_Normal extends CashSuper{
	@Override
	public double acceptCash(double money) {
		return money;
	}
	
}
