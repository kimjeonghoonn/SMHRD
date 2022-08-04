import java.util.Scanner;

public class Ex01_for문기초 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// for문 = 반복의 횟수가 지정되어있을때 사용한 반복문
		for (int i = 21; i < 58; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
//		for(int i = 96; i>=53;i--) {
//			System.out.print(i + " ");
//		}

	}

}
