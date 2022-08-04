import java.util.Scanner;

public class Ex03_로그인프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = 1;
		
		
		while(true) {
			
			System.out.print("아이디 : ");
			String ID = sc.nextLine();
			
			System.out.print("비밀번호 : ");
			String pass = sc.nextLine();
			
			
			
			if(ID.equals("smhrd") && pass.equals("1234")) {
				System.out.println("로그인 성공");
				break;
			} else {
				
				System.out.println("로그인 실패");
				System.out.print("계속 하시겠습니까?");
				String answer = sc.nextLine();
				if(answer.equals("N")) {
					break;
				}else if(answer.equals("Y")) {
					if(cnt >=3) {
						break;
					}
					cnt++;
				}
			}
		}				
	}

}


