import java.util.Scanner;

public class Ex04_while����2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("���� �Է� : ");
//		int num = sc.nextInt();
		// num������ �����ؼ� ��������ִ� ����
		int total = 0;
		int num = 0;
		while(num != -1) {
			total += num;
			System.out.print("���� �Է� : ");
			num = sc.nextInt();

		}
		
//		while(true) {
//			total += num;
//			System.out.print("���� �Է� : ");
//			num = sc.nextInt();
//			if(num == -1){
//				break;
//			}
//			
//		}
		System.out.println("������ ����� : " + total);
	}

}
