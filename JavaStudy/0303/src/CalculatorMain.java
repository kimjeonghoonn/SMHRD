
public class CalculatorMain {

	public static void main(String[] args) {
		
		
		Calculator number = new Calculator(15, 30);
		
		
		System.out.println("더하기 : " + number.sum());

		number.setNum1(75);
		number.setNum2(5);
		System.out.println("수정후 더하기 : " + number.sum());
		System.out.println("빼기 : " + number.sub());
		System.out.println("곱하기 : "+number.mul());
		System.out.println("나누기 : "+number.div());
	}

}
