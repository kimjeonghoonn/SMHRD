import java.util.Scanner;

public class Ex06_���ǹ�����1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�>> ");
		int age = sc.nextInt();
		
		//���� ������ �̿��ؼ� age���� 20���� ũ�� �����Դϴ�!
		// age ���� 20���� �۴ٸ� �̼������Դϴ�!
//		String result = (age>20? "�����Դϴ�!" : "�̼������Դϴ�!");
//		System.out.println(result);
		
		if(10<=age && age<20) {
			System.out.println("10���Դϴ�!");
		}
		//20�� �Դϴ�! ��½�Ű�� �;��!
		else if(20<=age && age<30) {
			System.out.println("20���Դϴ�!");
		}
		//30�� �Դϴ�! ��½�Ű�� �;��!
		else if(30<=age && age<40) {
			System.out.println("30���Դϴ�!");
		}
		//40�� �Դϴ�!
		else if(40<=age && age<50) {
			System.out.println("40���Դϴ�!");
		}
		//else -> if���� ���ǿ��� false�� ���Դٸ� �� ������ ���� �����ּ���!
		//���� if������ else ������ >> ���� ��� ������ false��� ���� �����ּ���!
		else {
			System.out.println("�̼������Դϴ�!");
			
		}
		//���� if������ �ѹ� True�� ���´ٸ� ��ü�� ���� ���´�!
	
		System.out.println("���α׷� ����!");
		//syso �Է��� ���¿��� Ctrl+Space��
	
		
		
		
	}

}
