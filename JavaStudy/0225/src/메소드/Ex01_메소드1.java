package �޼ҵ�;

public class Ex01_�޼ҵ�1 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		int result = add(num1, num2);
		System.out.println("���ϱ� : " + result);
		
		//minus ��� ����ϰ�;��
		//�޼ҵ� �̸����� ȣ�� : �޼ҵ带 ����Ұſ���
		int result2 = minus(num1, num2); 
		System.out.println("���� : " + result2);
		int result3 = mul(num1, num2);
		System.out.println("���ϱ� : " + result3);
		int result4 = div(num1, num2);
		System.out.println("������ : " + result4);
	}
	//�޼ҵ� : ���� ����ϴ� ����� ���� �����°�!!!! �ǹ�
	//�ʿ� �� ������ �ҷ��ͼ� �������!!
	//public : ���� ������ --> �� �޼ҵ带 ������ �������� ����� ���ΰ�?
	//static : �����ϴ�
	//int : ���� Ÿ��(��ȯŸ��)
	//add(int num1, int num2) : �޼ҵ� �̸�(�ʿ� ���){
	//		�޼ҵ� �������
	// return result; --> �����͸� ��ȯ�Ҳ�����! 
	//	�ڡڡڡ��߿�!!! ������ ����� ���� Ÿ�Կ� �°� �����͸� ��ȯ����� �Ѵ�!
	//	}
	
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	//���� ����� �ϴ� minus ��� �޼ҵ� �����
	public static int minus(int num1, int num2) {
		int result = num1-num2;
		return result;
	}
	
	//���ϱ� ����� �ϴ� mul �̶�� �޼ҵ�
	public static int mul(int num1, int num2) {
		int result = num1*num2;
		return result;
	}
	
	//���� ���� �����ִ� div��� �޼ҵ�
	public static int div(int num1, int num2) {
		int result = num1/num2;
		return result;
	}
	
}
