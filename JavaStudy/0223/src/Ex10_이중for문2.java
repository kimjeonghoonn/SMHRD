import java.util.Scanner;

public class Ex10_����for��2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �Է� : ");
		int num = sc.nextInt();
		System.out.println("��� ������ ��� : ");
		int num2 = sc.nextInt();
		
		for(int i=1;i<=num2;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}	
		}
}