
public class Calculator {

	//ù ��° ����
	private int num1; 
	//�� ��° ����
	private int num2;
	
	
	//�޼ҵ�1. calculator ����x �Ű����� int �����̸�1,2
	//2���� �Ű������� ���� �����ڷμ� ��ü ���� �� num1, num2�� �ʱ�ȭ
	
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
