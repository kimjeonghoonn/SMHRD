import java.util.Scanner;

public class Ex03_�α������α׷� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = 1;
		
		
		while(true) {
			
			System.out.print("���̵� : ");
			String ID = sc.nextLine();
			
			System.out.print("��й�ȣ : ");
			String pass = sc.nextLine();
			
			
			
			if(ID.equals("smhrd") && pass.equals("1234")) {
				System.out.println("�α��� ����");
				break;
			} else {
				
				System.out.println("�α��� ����");
				System.out.print("��� �Ͻðڽ��ϱ�?");
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


