import java.util.Scanner;


public class Ex07_MusicPlayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ex07_MusicController controller = new Ex07_MusicController();

		System.out.println("=====뮤직플레이어====");
		
		while(true) {
			System.out.print("1.등록 2.목록 3. 실행 4. 이전곡 5. 다음곡 6. 종료 >> ");
			int num = sc.nextInt();
			if(num == 6) {
				System.out.println("프로그램 종료");
				break;
			}
			else if(num == 1) {
				System.out.println("====등록====");
				System.out.print("제목 : ");
				String title1 = sc.next();
				System.out.print("가수 : ");
				String singer1 = sc.next();
				System.out.print("시간 : ");
				int playTime1 = sc.nextInt();
			}
			else if(num ==2) {
				System.out.println("====노래목록====");
				controller.show();
			}
			else if(num ==3) {
				System.out.println("====실행====");
				controller.play();
			}
			else if(num ==4) {
				System.out.println("====이전곡====");
				controller.prePlay();
			}
			else if(num ==5) {
				System.out.println("====다음곡====");
				controller.nextPlay();
			}
			else {
				System.out.println("정확한 숫자를 입력해주세요");
			}
		}
		
	}

}
