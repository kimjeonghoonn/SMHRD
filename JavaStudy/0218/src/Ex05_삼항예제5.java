import java.util.Scanner;

public class Ex05_���׿���5 {

	public static void main(String[] args) {
		//1. ��ĳ�� ����Ʈ
		Scanner sc = new Scanner(System.in);
		//2. �뵿�ð��� �Է��϶�� ��¹�
		System.out.print("�뵿�ð��� �Է��ϼ��� : ");
		int num = sc.nextInt();
//		//3. �뵿�ð��� �Է�
//		int res = num>8? (int)(9000*8 + (num-8)*9000*1.5) : (num*9000);
//		//4. 8�ð������� 9000���� �⺻�ñ�, 8�ð����ʹ� 1�ð����� 1.5���� ����ޱ�!
//		System.out.println("�� �ӱ��� " + res +"�� �Դϴ�");
	
		//if ~else������ �̿��ؼ� Ǯ���ּ���!
		
		if(num>8) {System.out.println("�� �Ա���" +(int)(9000*8 + (num-8)*9000*1.5) + "�� �Դϴ�");
		}
		else {System.out.println("�� �ӱ���" + num*9000 + "�� �Դϴ�");
		}
		
}
	}


