import java.util.Scanner;

public class Ex02_���׿���1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. ������ �Է��϶�� ��¹��� ����
		System.out.print("������ �Է� : ");
		
		//2. ����ڿ��� ������ �Է¹ޱ�!
		int num = sc.nextInt();
		
		//3. �Է��Ѽ��ڰ� 2�� �������� �������� 0�̸� ¦��! �ƴϸ� Ȧ��!
		String res = num%2==0 ? "¦��" : "Ȧ��";
		
		//4. ���� �Է��� ���ڴ� +��(��) + (¦��,Ȧ��) + �ԴѴ�.
		System.out.println( num + "��(��)" +  res + "�Դϴ�." );
		
		

	}

}
