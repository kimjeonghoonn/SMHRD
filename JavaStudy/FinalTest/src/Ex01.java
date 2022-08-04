import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = "dldmsql";
		int pw = 1214;
		
		while(true){
			System.out.print("id : " );
			String id1 = sc.next();
			System.out.print("pw : ");
			int pw1 = sc.nextInt();
			if(id1.equals(id)){
				if(pw1 == pw) {
					System.out.println(id +"님 환영합니다!");
					break;
				}else{
					System.out.println("다시 확인하세요!");
				}
			}else {
				System.out.println("다시 확인하세요!");
			}
		}

	}

}
