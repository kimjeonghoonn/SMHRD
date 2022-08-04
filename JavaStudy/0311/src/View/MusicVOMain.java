package View;
import java.util.ArrayList;
import java.util.Scanner;

import Controller.MP3Controller;
import Model.MusicVO;
import javazoom.jl.player.MP3Player;

public class MusicVOMain {

	public static void main(String[] args) {
		//View : ����ڰ� ����ϴ� ���, �ð������� Ȯ���� �� �� �ִ� �뵵�θ� ���δ�
		// - Model�� ������ �ִ� �����͸� �������� �ʴ´�!
		// - �ܼ��� ǥ�ø� �ϴ� ����� ���´�.
		
		Scanner sc = new Scanner(System.in);
		
		// Controller ��ü ����
		MP3Controller controller = new MP3Controller();
		
		int menu = 0;
		while(menu != 5){
		System.out.print("1.��� 2.���� 3.������ 4.������ 5.����>>");
		menu = sc.nextInt();
		
		if(menu ==1) {
			controller.playing();
		}
		else if(menu ==2) {
			System.out.println("����");
			controller.stoping();
		}
		else if(menu ==3) {
			controller.nextPlay();
		}
		else if(menu ==4) {
			controller.prePlay();
		}
		}controller.stoping();
		System.out.println("���α׷� ����");
	}

	

}
