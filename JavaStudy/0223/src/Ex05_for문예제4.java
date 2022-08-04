import java.util.Scanner;

public class Ex05_for僥蕨薯4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
	
		
//		for(int i = num1; i<=num2; i++) {
//			if(i%10%3==0 && i%10!=0) {
//				System.out.println("夢熱 ");
//			}
//				
//		else if(i%10==5) {
//			System.out.print("戲學 ");
//		}
//		else {
//			System.out.print(i +" ");
//		}
//
//	}
		for(int i = num1; i<=num2; i++) {
			switch (i%10) {
			case 3,6,9:
				System.out.print("夢熱 ");
			break;
			case 5 :
				System.out.print("戲學 ");
				break;
			default:
				System.out.print(i + " ");
				
			}
		}
		
		
	}
}

