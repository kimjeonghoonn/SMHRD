import java.util.Scanner;

public class Ex02_스위치계절 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월(1~12) 입력 : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 1,2,12: 
			System.out.println(month +"월은 겨울입니다");
			break;
		case 3,4,5:
			System.out.println(month +"월은 봄입니다");
			break;
		case 6,7,8:
			System.out.println(month + "월은 여름입니다");
			break;
			
	
		default:
			System.out.println(month + "월은 가을입니다");
		}

	}

}
