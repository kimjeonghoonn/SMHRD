
public class CalculatorMain {

	public static void main(String[] args) {
		
		
		Calculator number = new Calculator(15, 30);
		
		
		System.out.println("���ϱ� : " + number.sum());

		number.setNum1(75);
		number.setNum2(5);
		System.out.println("������ ���ϱ� : " + number.sum());
		System.out.println("���� : " + number.sub());
		System.out.println("���ϱ� : "+number.mul());
		System.out.println("������ : "+number.div());
	}

}
