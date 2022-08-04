package hhd;

public class Japanese extends Language {

	@Override
	public String getTitleMSG() {
		return "===이럇사이마세===";
	}

	@Override
	public String getInputMoneyMSG() {
		return "1234";
	}

	@Override
	public String getChoiceMSG() {
		return "1234";
	}


	@Override
	public String getReturnCharge1() {
		return "1234";
	}

	@Override
	public String getReturnCharge2(int money) {
		return "1234" + money + "1234";
	}
 
	
	
}
