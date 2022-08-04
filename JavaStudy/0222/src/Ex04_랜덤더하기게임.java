import java.util.Random;
import java.util.Scanner;

public class Ex04_랜덤더하기게임 {

	public static void main(String[] args) {
		//랜덤숫자 뽑는 방법
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int O = 0;
		int X = 0;
		
		while(true) {
			
			int num1 = rd.nextInt(10)+1;
			int num2 = rd.nextInt(10)+1;
//			System.out.println(); nextLine으로 받을경우 공백을 넣어줘야함
			System.out.print(num1 + "+" + num2 + "= ");
			int input = sc.nextInt();
			if(input == num1+num2) {
				O++;
			} else if(input !=(num1+num2)) {
				X++;
			}//카운트는 앞에 넣어야 계산이 돌아감
				
			if(input == (num1+num2)) {
				System.out.println("Success!");
				
			}else {
				System.out.println("Fail!");
				
			}
			System.out.print("계속 하시겠습니까? ");
			String ans = sc.next();
			if(ans.equals("Y")) {
				continue;
			}else if(ans.equals("N")) {
				System.out.println("종료");
				System.out.println("맞춘개수 : " + O);
				System.out.println("틀린개수 : " + X);
				break;
			} else {
				System.out.println("다시입력해주세요");
				System.out.print("계속 하시겠습니까? ");
				String ans1 = sc.next();
				if(ans1.equals("Y")) {
					continue;
				}else if(ans1.equals("N")) {
					System.out.println("종료");
					System.out.println("맞춘개수 : " + O);
					System.out.println("틀린개수 : " + X);
					break;
				}else {
				System.out.println("잘못된 접근입니다");
				System.out.println("시스템을 종료합니다");
				System.out.println("맞춘개수 : " + O);
				System.out.println("틀린개수 : " + X);
				break;
			}
			
			
		}
		
		
	}

	}
}
