import java.util.Scanner;

public class Ex02_���̾�Ʈ���α׷� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int week =1;
		//���� ������ ��¹�
		System.out.print("���� ������ : ");
		int now = sc.nextInt();
		// ���������� ��¹�
		System.out.print("��ǥ ������ : ");
		int future = sc.nextInt();
		
		//�ݺ��� n���� ���� ������ ��¹�
		while(true) {
			System.out.print(week +"���� ���� ������ : ");
			num = sc.nextInt();
			week++;
		//���� �����Ը� ����ϴ� ���� �ۼ�	
			now -= num;
//			System.out.println("���� ������ : " + now);
			if(now <= future) {
				System.out.println("���������� : " + now);
				System.out.println("�����մϴ�!!!");
				break;
			}
		
			
		}

	}

}
