import java.util.Scanner;

public class Ex10_����if������ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int grade = sc.nextInt();
		
		if(grade>=90) {
			System.out.println("A�����Դϴ�");
		}
		else if(80<=grade) {
			System.out.println("B�����Դϴ�");
		}
		else if(70<=grade) {
			System.out.println("C�����Դϴ�");
		}
		else {
			System.out.println("���Ф�");
		}

	}

}
