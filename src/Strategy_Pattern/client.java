package Strategy_Pattern;
//工厂类应该根据输入模式选择满多少减多少或者折扣是多少。这里的客户端也只是简单地计算出金额。
public class client {
	public double getResule(String type,double money,int count) {
		Cash_Context cc = new Cash_Context(type);
		return cc.getReault(money*count);
	}
}
