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
					System.out.println(id +"�� ȯ���մϴ�!");
					break;
				}else{
					System.out.println("�ٽ� Ȯ���ϼ���!");
				}
			}else {
				System.out.println("�ٽ� Ȯ���ϼ���!");
			}
		}

	}

}
