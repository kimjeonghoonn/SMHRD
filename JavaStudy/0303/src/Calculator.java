
public class Calculator {

	//첫 번째 정수
	private int num1; 
	//두 번째 정수
	private int num2;
	
	
	//메소드1. calculator 리턴x 매개변수 int 변수이름1,2
	//2개의 매개변수를 가진 생성자로서 객체 생성 시 num1, num2를 초기화
	
	public Calculator() {
		
	}
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int sum() {
		return num1 + num2;
	}
	
	public int sub() {
		return num1 - num2;
	}
	public int mul() {
		return num1 * num2;
	}
	public double div() {
		return num1/num2;
	}
	
}
