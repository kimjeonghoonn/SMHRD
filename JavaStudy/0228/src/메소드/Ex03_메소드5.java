package �޼ҵ�;

public class Ex03_�޼ҵ�5 {

	public static void main(String[] args) {
		int base = 2;
		int n = 3;
		powerN(base, n);
		}

	//������ �������� �������� ��ȯŸ�� ��ġ�� void��� Ű���带 ����Ѵ�!
	public static void powerN(int base, int n) {
		// ���� �� ���ϱ�
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * base;
			//result *= base;
			//(������) ���� ������ ���� ������
		}
		System.out.println("��� Ȯ�� : " + result);
		
	}
}
