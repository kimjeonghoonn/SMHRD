import java.util.Scanner;

public class Ex04_���׿���3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�󱸰��� ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		
		int res = num%5==0? (num/5) : (num/5+1);
		
		System.out.println("�ʿ��� ������ �� : " + res);

	}

}
