import java.util.Scanner;

public class PiggyBankMain {

	public static void main(String[] args) {
		
		PiggyBank pig = new PiggyBank();
		
		//human1.money = 50000;
		//���� ����ڰ� �Է��� �ݾ׸�ŭ money�� ���� ��Ű�� �;��!
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ݾ��� �Է����ּ���>>");
		int inputMoney = sc.nextInt();
		//�Է��� �ݾ��� money�� ������Ű�� �;��!
		pig.deposit(inputMoney);
		
		pig.showMoney();
		
		//�Է��� �ݾ׸�ŭ money�� ���� ��Ű�� �;��!
		System.out.print("������ �ݾ��� �Է����ּ���>>");
		int outMoney = sc.nextInt();
		//�Է��� �ݾ��� money�� ���ҽ�Ű�� �;��!
		pig.withDraw(outMoney);
		
		pig.showMoney();
		

	}

}
