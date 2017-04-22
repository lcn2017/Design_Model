package Strategy_Pattern;
//打折收费策略
public class Cash_Rebate extends CashSuper{
	private double rate;
	public Cash_Rebate(double d) {
		this.rate=d;
	}
	@Override
	public double acceptCash(double money) {
		return money*rate;
	}
}
