import java.util.Scanner;


public class Ex07_MusicPlayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ex07_MusicController controller = new Ex07_MusicController();

		System.out.println("=====�����÷��̾�====");
		
		while(true) {
			System.out.print("1.��� 2.��� 3. ���� 4. ������ 5. ������ 6. ���� >> ");
			int num = sc.nextInt();
			if(num == 6) {
				System.out.println("���α׷� ����");
				break;
			}
			else if(num == 1) {
				System.out.println("====���====");
				System.out.print("���� : ");
				String title1 = sc.next();
				System.out.print("���� : ");
				String singer1 = sc.next();
				System.out.print("�ð� : ");
				int playTime1 = sc.nextInt();
			}
			else if(num ==2) {
				System.out.println("====�뷡���====");
				controller.show();
			}
			else if(num ==3) {
				System.out.println("====����====");
				controller.play();
			}
			else if(num ==4) {
				System.out.println("====������====");
				controller.prePlay();
			}
			else if(num ==5) {
				System.out.println("====������====");
				controller.nextPlay();
			}
			else {
				System.out.println("��Ȯ�� ���ڸ� �Է����ּ���");
			}
		}
		
	}

}
