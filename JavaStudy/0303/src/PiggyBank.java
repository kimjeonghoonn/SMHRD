
public class PiggyBank {

	
	//금액
	private int money;
	//돈을 넣는다(deposit) +
	//돈을 인출한다(withdraw)-
	
	//잔액을 보여준다(showMoney) 
	public void showMoney() {
		System.out.println("잔액 : " + money);
	}
	public void deposit(int inputMoney) {
		money+=inputMoney;
	}
	public void withDraw(int outMoney) {
		if(money<outMoney) {
			System.out.println("잔액이 부족합니다");
		}else {
			money-=outMoney;
		}
		
		
	}
}
