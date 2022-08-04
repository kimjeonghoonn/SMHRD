package 메소드;

public class Ex02_메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 50;
		int num2 = 15;
		char op = '-';

		int result = cal(num1, num2, op);
		// op에 담긴 값에 따라 계산이 다르게 나오면 됨

		System.out.println("결과 : " + result);
	}

	public static int cal(int num1, int num2, char op) {
		int result = 0;
		if (op == '+') {
			result = num1 + num2;
		} else if (op == '-') {
			result = num1 - num2;
		} else if (op == '*') {
			result = num1 * num2;
		} else if (op == '/') {
			result = num1 / num2;
		}
		return result;
	}
}