import java.util.Scanner;

public class Ex03_for������2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//num1<num2 �϶� num1�� �����ϴ°�/ num2�� �����°�
		//num1>num2 �϶� num2�� �����ϴ°�/ num1�� �����°�
		//���ǹ� �ӿ� �ݺ��� 2���� �ۼ��ؼ� Ǯ�̰���!
		if(num1<num2) {
		for(int i = num1; i<=num2; i++) {
			System.out.print(i + " ");
			}
		}else if(num2 > num1){
		for(int i = num2; i<=num1; i++) {
			System.out.print(i + " ");
		}
	}
	
		// �� Ǭ��� ���׿����� Ȱ���ؼ� �ݺ��� �ϳ��� ���� �� ����
		// ���ǹ� ? �� : ����
		int big = (num1 > num2) ? num1 : num2;
		int small = (num1 < num2) ? num1 : num2;
		for(int i = small ; i<=big; i++) {
			System.out.println(i +" ");
		}
		
	}

}
