package Strategy_Pattern;
//返利满减收费策略
public class Cash_Return extends CashSuper{
    private double moneyCondition;
    private double moneyReturn;
    public Cash_Return(String moneyCondition,String moneyReturn) {
    	this.moneyCondition=Double.parseDouble(moneyCondition);
    	this.moneyReturn=Double.parseDouble(moneyReturn);
	}
	@Override
	public double acceptCash(double money) {
		if (money<moneyCondition) {
			return money;
		}
		return (money-Math.floor(money/moneyCondition)*moneyReturn);
	}
}
