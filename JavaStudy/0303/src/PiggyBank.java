
public class PiggyBank {

	
	//�ݾ�
	private int money;
	//���� �ִ´�(deposit) +
	//���� �����Ѵ�(withdraw)-
	
	//�ܾ��� �����ش�(showMoney) 
	public void showMoney() {
		System.out.println("�ܾ� : " + money);
	}
	public void deposit(int inputMoney) {
		money+=inputMoney;
	}
	public void withDraw(int outMoney) {
		if(money<outMoney) {
			System.out.println("�ܾ��� �����մϴ�");
		}else {
			money-=outMoney;
		}
		
		
	}
}
