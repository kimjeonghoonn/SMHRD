package �޼ҵ�;

public class Ex02_�޼ҵ�4 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 25;
		int result = close10(num1, num2);
		System.out.println("10�� ����� �� : " + result);

	}
	public static int close10(int num1, int num2) {
		//���� 10���� �Ÿ��� �˾ƾ���..
		int result = 0; //10�� �� ����� ���� ����� ����
		
		int resultNum1 = 10- num1;
		int resultNum2 = 10- num2;
		
		if(resultNum1<0) {
			resultNum1 = -1*resultNum1;
		}
		if(resultNum2<0) {
			resultNum2 = -1*resultNum2;
		}
		//***(��������) �̸� ������ ���� ������ ������ �񱳰� ������***
		
		if(resultNum1 > resultNum2) {
			result = num2;
		} else if(resultNum1 < resultNum2) {
			result = num1;
		}
//		if((10-num1)*(10-num1) < (10-num2)*(10-num2)) {
//			result = num1;
//		}
//		else if((10-num1)*(10-num1)>(10-num2)*(10-num2)) {
//			result = num2;
//		}else
//			result = 0;
		return result;
	}
}
