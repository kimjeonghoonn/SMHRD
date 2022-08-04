package 메소드;

public class Ex01_메소드3 {

	public static void main(String[] args) {
		int num1 = 24;
		int num2 = 24;
		int result = LargerNumbers(num1, num2);
		System.out.println("큰 수 확인 : " + result);

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
