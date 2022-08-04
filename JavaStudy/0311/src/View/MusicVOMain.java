package View;
import java.util.ArrayList;
import java.util.Scanner;

import Controller.MP3Controller;
import Model.MusicVO;
import javazoom.jl.player.MP3Player;

public class MusicVOMain {

	public static void main(String[] args) {
		//View : 사용자가 사용하는 기능, 시각적으로 확인을 할 수 있는 용도로만 쓰인다
		// - Model이 가지고 있는 데이터를 저장하지 않는다!
		// - 단순히 표시만 하는 기능을 갖는다.
		
		Scanner sc = new Scanner(System.in);
		
		// Controller 객체 생성
		MP3Controller controller = new MP3Controller();
		
		int menu = 0;
		while(menu != 5){
		System.out.print("1.재생 2.정지 3.다음곡 4.이전곡 5.종료>>");
		menu = sc.nextInt();
		
		if(menu ==1) {
			controller.playing();
		}
		else if(menu ==2) {
			System.out.println("정지");
			controller.stoping();
		}
		else if(menu ==3) {
			controller.nextPlay();
		}
		else if(menu ==4) {
			controller.prePlay();
		}
		}controller.stoping();
		System.out.println("프로그램 종료");
	}

	

}
