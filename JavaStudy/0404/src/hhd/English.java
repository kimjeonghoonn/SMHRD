package hhd;

public class English extends Language {

	public String getTitleMSG() {
		return "===Welcome VendingMachine===";
	}
	public String getInputMoneyMSG() {
		return "insert coin please >> ";
	}
	public String getChoiceMSG() {
		return "choose your drink";
	}

	public String getReturnCharge1() {
		return "not enough money.";
	}
	public String getReturnCharge2(int money) {
		return "you have " + money + "won left";
	}
}
