import java.util.Scanner;

public class Ex03_for문예제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//num1<num2 일때 num1가 시작하는값/ num2이 끝나는값
		//num1>num2 일때 num2가 시작하는값/ num1이 끝나는값
		//조건문 속에 반복문 2개를 작성해서 풀이가능!
		if(num1<num2) {
		for(int i = num1; i<=num2; i++) {
			System.out.print(i + " ");
			}
		}else if(num2 > num1){
		for(int i = num2; i<=num1; i++) {
			System.out.print(i + " ");
		}
	}
	
		// 다 푼경우 삼항연산자 활용해서 반복문 하나로 줄일 수 있음
		// 조건문 ? 참 : 거짓
		int big = (num1 > num2) ? num1 : num2;
		int small = (num1 < num2) ? num1 : num2;
		for(int i = small ; i<=big; i++) {
			System.out.println(i +" ");
		}
		
	}

}
