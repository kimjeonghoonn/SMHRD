import java.util.Scanner;

public class Ex05_�ú��� {

	public static void main(String[] args) {
		
		// 1. ��ĳ�� ����Ʈ
		Scanner sc = new Scanner(System.in);
		
		// 2. ��¹�
		System.out.print("�� �Է� : ");
		int num1 = sc.nextInt();
		
		
		int hour = num1/3600;
		int min = (num1/60) - (60*hour); //num%3600/60;
		int sec = num1%60;
		System.out.println((hour) +"�� " +(min) +"�� " +(sec) +"��");
		// 3. �����Է¹ޱ�!
		
		// 4. �Է¹��� ������ ��,��,�� ����ϸ� �˴ϴ�!
		// ex) 1�ð��� 3600��, 60��
		
		

	}

}
