import java.util.Scanner;

public class Ex06_조건문예제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력>> ");
		int age = sc.nextInt();
		
		//삼항 연산자 이용해서 age값이 20보다 크면 성인입니다!
		// age 값이 20보다 작다면 미성년자입니다!
//		String result = (age>20? "성인입니다!" : "미성년자입니다!");
//		System.out.println(result);
		
		if(10<=age && age<20) {
			System.out.println("10대입니다!");
		}
		//20대 입니다! 출력시키고 싶어요!
		else if(20<=age && age<30) {
			System.out.println("20대입니다!");
		}
		//30대 입니다! 출력시키고 싶어요!
		else if(30<=age && age<40) {
			System.out.println("30대입니다!");
		}
		//40대 입니다!
		else if(40<=age && age<50) {
			System.out.println("40대입니다!");
		}
		//else -> if문의 조건에서 false가 나왔다면 이 문장을 실행 시켜주세요!
		//다중 if문에서 else 구문은 >> 위의 모든 조건이 false라면 실행 시켜주세요!
		else {
			System.out.println("미성년자입니다!");
			
		}
		//다중 if문에서 한번 True가 나온다면 전체를 빠져 나온다!
	
		System.out.println("프로그램 종료!");
		//syso 입력한 상태에서 Ctrl+Space바
	
		
		
		
	}

}
