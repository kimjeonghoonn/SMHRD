package �޼ҵ�;

public class Ex02_�޼ҵ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 50;
		int num2 = 15;
		char op = '-';

		int result = cal(num1, num2, op);
		// op�� ��� ���� ���� ����� �ٸ��� ������ ��

		System.out.println("��� : " + result);
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