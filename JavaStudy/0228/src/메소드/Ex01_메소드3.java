package �޼ҵ�;

public class Ex01_�޼ҵ�3 {

	public static void main(String[] args) {
		int num1 = 24;
		int num2 = 24;
		int result = LargerNumbers(num1, num2);
		System.out.println("ū �� Ȯ�� : " + result);

	}
	public static int LargerNumbers(int num1, int num2) {
		int result = 0;
		if(num1>num2) {
			result = num1;	
		}
		else if(num1<num2) {
			result = num2;
		}

		return result;
	}
}
