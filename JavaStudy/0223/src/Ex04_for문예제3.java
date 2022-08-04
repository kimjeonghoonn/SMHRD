import java.util.Scanner;

public class Ex04_for¹®¿¹Á¦3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int total = 0;

		for(int i = num1; i <=num2; i++) {
			total += i;
			}
		System.out.print(total);
	}

}
