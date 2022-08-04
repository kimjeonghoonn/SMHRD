import java.util.Scanner;

public class Ex02_다이어트프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int week =1;
		//현재 몸무게 출력문
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		// 목포몸무게 출력문
		System.out.print("목표 몸무게 : ");
		int future = sc.nextInt();
		
		//반복문 n주차 감량 몸무게 출력문
		while(true) {
			System.out.print(week +"주차 감량 몸무게 : ");
			num = sc.nextInt();
			week++;
		//현재 몸무게를 출력하는 문장 작성	
			now -= num;
//			System.out.println("현재 몸무게 : " + now);
			if(now <= future) {
				System.out.println("최종몸무게 : " + now);
				System.out.println("축하합니다!!!");
				break;
			}
		
			
		}

	}

}
