import java.util.Scanner;

public class Ex05_시분초 {

	public static void main(String[] args) {
		
		// 1. 스캐너 임포트
		Scanner sc = new Scanner(System.in);
		
		// 2. 출력문
		System.out.print("초 입력 : ");
		int num1 = sc.nextInt();
		
		
		int hour = num1/3600;
		int min = (num1/60) - (60*hour); //num%3600/60;
		int sec = num1%60;
		System.out.println((hour) +"시 " +(min) +"분 " +(sec) +"초");
		// 3. 정수입력받기!
		
		// 4. 입력받은 정수를 시,분,초 출력하면 됩니다!
		// ex) 1시간은 3600초, 60분
		
		

	}

}
