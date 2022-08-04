import java.util.Scanner;

public class Ex05_삼항예제5 {

	public static void main(String[] args) {
		//1. 스캐너 임포트
		Scanner sc = new Scanner(System.in);
		//2. 노동시간을 입력하라는 출력문
		System.out.print("노동시간을 입력하세요 : ");
		int num = sc.nextInt();
//		//3. 노동시간을 입력
//		int res = num>8? (int)(9000*8 + (num-8)*9000*1.5) : (num*9000);
//		//4. 8시간까지는 9000원의 기본시급, 8시간부터는 1시간마다 1.5배의 수당받기!
//		System.out.println("총 임금은 " + res +"원 입니다");
	
		//if ~else문으로 이용해서 풀어주세요!
		
		if(num>8) {System.out.println("총 입금은" +(int)(9000*8 + (num-8)*9000*1.5) + "원 입니다");
		}
		else {System.out.println("총 임금은" + num*9000 + "원 입니다");
		}
		
}
	}


