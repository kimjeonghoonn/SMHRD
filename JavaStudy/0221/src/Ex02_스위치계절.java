import java.util.Scanner;

public class Ex02_����ġ���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��(1~12) �Է� : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 1,2,12: 
			System.out.println(month +"���� �ܿ��Դϴ�");
			break;
		case 3,4,5:
			System.out.println(month +"���� ���Դϴ�");
			break;
		case 6,7,8:
			System.out.println(month + "���� �����Դϴ�");
			break;
			
	
		default:
			System.out.println(month + "���� �����Դϴ�");
		}

	}

}
