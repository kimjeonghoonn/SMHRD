import java.util.Scanner;

public class Ex10_이중for문2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단 입력 : ");
		int num = sc.nextInt();
		System.out.println("어느 수까지 출력 : ");
		int num2 = sc.nextInt();
		
		for(int i=1;i<=num2;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}	
		}
}