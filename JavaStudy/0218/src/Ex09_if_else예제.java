import java.util.Scanner;

public class Ex09_if_else예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		int result = num/10*10;
		if(num%10>=5) {System.out.println("반올림 수 :" + (result+10));
			
		}else {System.out.println("반올림 수 :" + result);
		
		}

	}

}
