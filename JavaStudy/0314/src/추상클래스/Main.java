package �߻�Ŭ����;

public class Main {

	public static void main(String[] args) {
		
		RegularEmployee regular = new RegularEmployee("SMHRD001", "ȫ0��", 4000, 400);
		
		System.out.println(regular.print());
		System.out.println(regular.getMoneyPay() + "����");
		System.out.println();
		
		TempEmployee temp = new TempEmployee("SMHRD002", "��0��", 3000);
		System.out.println(temp.print());
		System.out.println(temp.getMoneyPay()+"����");
		System.out.println();
		
		PartTimeEmployee partTime = new PartTimeEmployee("SMHRD001", "��0��", 10, 10);
		System.out.println(partTime.print());
		System.out.println(partTime.getMoneyPay()+"����");
		
	}

}
