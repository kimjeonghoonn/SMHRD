import java.util.Scanner;

public class Ex01_����ġ�����Է� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//.next() : ��Ʈ�������� �����͸� �Է��ϴ� �޼ҵ�.
		System.out.print("�Է� : ");
		String data = sc.next();
		
		// String�����ʹ� ������������Ÿ�� == �񱳰� �Ұ���.
		// ���� ���¸� ���Ҷ��� .equals() ���
//		if(data.equals("�ѱ���")) {
//			System.out.println("�ȳ��ϼ���!");
//		} else if(data.equals("����")) {
//			System.out.println("���!");
//		}
		
		// ����ġ������ �ۼ�
		switch (data) {
		case "�ѱ���": 
			System.out.println("�ȳ��ϼ���");
			break;
		case "����":
			System.out.println("���");
			break;
		case "�߱���":
			System.out.println("���Ͽ�");
			break;
		case "�Ϻ���":
			System.out.println("������");
			break;
		
		default :
			System.out.println("�𸣴� ����");
		}

	}

}
