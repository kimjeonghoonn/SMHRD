import java.util.Scanner;

public class Ex05_for������4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
	
		
//		for(int i = num1; i<=num2; i++) {
//			if(i%10%3==0 && i%10!=0) {
//				System.out.println("�ڼ� ");
//			}
//				
//		else if(i%10==5) {
//			System.out.print("���� ");
//		}
//		else {
//			System.out.print(i +" ");
//		}
//
//	}
		for(int i = num1; i<=num2; i++) {
			switch (i%10) {
			case 3,6,9:
				System.out.print("�ڼ� ");
			break;
			case 5 :
				System.out.print("���� ");
				break;
			default:
				System.out.print(i + " ");
				
			}
		}
		
		
	}
}

