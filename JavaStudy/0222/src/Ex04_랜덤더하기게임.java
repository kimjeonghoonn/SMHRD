import java.util.Random;
import java.util.Scanner;

public class Ex04_�������ϱ���� {

	public static void main(String[] args) {
		//�������� �̴� ���
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int O = 0;
		int X = 0;
		
		while(true) {
			
			int num1 = rd.nextInt(10)+1;
			int num2 = rd.nextInt(10)+1;
//			System.out.println(); nextLine���� ������� ������ �־������
			System.out.print(num1 + "+" + num2 + "= ");
			int input = sc.nextInt();
			if(input == num1+num2) {
				O++;
			} else if(input !=(num1+num2)) {
				X++;
			}//ī��Ʈ�� �տ� �־�� ����� ���ư�
				
			if(input == (num1+num2)) {
				System.out.println("Success!");
				
			}else {
				System.out.println("Fail!");
				
			}
			System.out.print("��� �Ͻðڽ��ϱ�? ");
			String ans = sc.next();
			if(ans.equals("Y")) {
				continue;
			}else if(ans.equals("N")) {
				System.out.println("����");
				System.out.println("���ᰳ�� : " + O);
				System.out.println("Ʋ������ : " + X);
				break;
			} else {
				System.out.println("�ٽ��Է����ּ���");
				System.out.print("��� �Ͻðڽ��ϱ�? ");
				String ans1 = sc.next();
				if(ans1.equals("Y")) {
					continue;
				}else if(ans1.equals("N")) {
					System.out.println("����");
					System.out.println("���ᰳ�� : " + O);
					System.out.println("Ʋ������ : " + X);
					break;
				}else {
				System.out.println("�߸��� �����Դϴ�");
				System.out.println("�ý����� �����մϴ�");
				System.out.println("���ᰳ�� : " + O);
				System.out.println("Ʋ������ : " + X);
				break;
			}
			
			
		}
		
		
	}

	}
}
