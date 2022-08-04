package 추상클래스;

public class Main {

	public static void main(String[] args) {
		
		RegularEmployee regular = new RegularEmployee("SMHRD001", "홍0동", 4000, 400);
		
		System.out.println(regular.print());
		System.out.println(regular.getMoneyPay() + "만원");
		System.out.println();
		
		TempEmployee temp = new TempEmployee("SMHRD002", "박0수", 3000);
		System.out.println(temp.print());
		System.out.println(temp.getMoneyPay()+"만원");
		System.out.println();
		
		PartTimeEmployee partTime = new PartTimeEmployee("SMHRD001", "김0독", 10, 10);
		System.out.println(partTime.print());
		System.out.println(partTime.getMoneyPay()+"만원");
		
	}

}
