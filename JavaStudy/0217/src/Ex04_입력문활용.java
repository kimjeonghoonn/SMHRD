import java.util.Scanner;

public class Ex04_입력문활용 {

	public static void main(String[] args) {
		
//		입력할 수 있는 기능을 호출
//		Scanner기능
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int minus = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		
		System.out.println("두수의 더하기 : " + sum);
		System.out.println("두수의 빼기 : " + minus);
		System.out.println("두수의 곱하기 : " + mul);
		System.out.println("두수의 나누기(몫) : " + div);
		
		
		

	}

}
