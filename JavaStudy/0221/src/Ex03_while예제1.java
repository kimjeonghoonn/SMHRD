import java.util.Scanner;

public class Ex03_while예제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
//		1번째방식
//		while(num<10) {
//			System.out.print("숫자 입력 : ");
//		 num = sc.nextInt();
//			
//		}
		//2번째방식
//		while(true) {
//			System.out.println("숫자 입력 : ");
//			num = sc.nextInt();
//			if(num>=10) {
//				//반복문을 멈추겠다! break;
//				break;
//			}
//		}
		
		//do-while 반드시 한번 어떤 로직을 실행한 후, 반복의 조건을 비교
		do {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			
		}while(num<10);
		System.out.println("종료되었습니다!");
		

	}

}
