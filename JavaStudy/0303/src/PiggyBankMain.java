import java.util.Scanner;

public class PiggyBankMain {

	public static void main(String[] args) {
		
		PiggyBank pig = new PiggyBank();
		
		//human1.money = 50000;
		//돈을 사용자가 입력한 금액만큼 money를 증가 시키고 싶어요!
		Scanner sc = new Scanner(System.in);
		System.out.print("저금할 금액을 입력해주세요>>");
		int inputMoney = sc.nextInt();
		//입력한 금액을 money에 증가시키고 싶어요!
		pig.deposit(inputMoney);
		
		pig.showMoney();
		
		//입력한 금액만큼 money를 감소 시키고 싶어요!
		System.out.print("인출할 금액을 입력해주세요>>");
		int outMoney = sc.nextInt();
		//입력한 금액을 money에 감소시키고 싶어요!
		pig.withDraw(outMoney);
		
		pig.showMoney();
		

	}

}
