package Controller;

import java.util.ArrayList;

import Model.MusicVO;
import javazoom.jl.player.MP3Player;

public class MP3Controller {

	
	//Controller : �𵨰� �並 ������ �ִ� ����
	// - ���̳� �信 ���� ������ �˾ƾ� �Ѵ�.
	// - �� �Ǵ� ���� ������ �����Ͽ� ��ü�ؾ� �Ѵ�.
	
	//��� �뷡�� �����ϱ� ���� ���� ����Ʈ ����!
	ArrayList<MusicVO> musicList = new ArrayList<>();
	
	int index =0; // ������, ������ ��ȯ�� ���� ����
	
	//�������� MP3�÷��� ���
	MP3Player play = new MP3Player();
	
	//1. ��� �뷡������ ���� �� �ִ� ������ �޼ҵ� ����
	public MP3Controller() {
		MusicVO music1 = new MusicVO("��","Rain",100,"C://music/Rain - ��.mp3");
		MusicVO music2 = new MusicVO("Dalla Dalla","Itzy",120,"C://music/Itzy - Dalla Dalla.mp3");
		MusicVO music3 = new MusicVO("SOLO","JENNIE",200,"C://music/JENNIE - SOLO.mp3");
		musicList.add(music1);
		musicList.add(music2);
		musicList.add(music3);
		
	}
	//2. ����� ���� �Ϲ� �޼ҵ� ����
	public void playing() {
		show(musicList, index, play);
//		play.play(musicList.get(index).getPath());
	}
	
	//3. �� ���� ����� ���� �޼ҵ�
	public void show(ArrayList<MusicVO> musicList, int index, MP3Player play) {
		System.out.print("���� : " + musicList.get(index).getMusicName()+",");
		System.out.print(" ���� : " + musicList.get(index).getSinger()+",");
		int minit = (musicList.get(index).getPlayTime()/60);
		int secon = (musicList.get(index).getPlayTime()%60);
		System.out.println(" �ð� : " +minit+"��"+ secon+"��");
		play.play(musicList.get(index).getPath());
	}
	
	//4. �뷡������ ���� �޼ҵ� ����
	public void stoping() {
		play.stop();
	}
	//5. ������ ��� -> nextPlay()
	public void nextPlay() {
		if(index>=musicList.size()-1){
			System.out.println("���� ���� �����ϴ�.");
		}
		else{
			//�뷡�� ��� ������ �ƴ��� �Ǵ�!
			if(play.isPlaying()) {
				play.stop();
				// ���������� �ѱ�� �ִ� ���
				index ++;
				show(musicList, index, play);
			}else {
				index ++;
		show(musicList, index, play);}
		}
	}
	
	
	//6. ������ ��� -> prePlay()
	public void prePlay() {
		if(index>0){
			if(play.isPlaying()) {
				play.stop();
				index--;
				show(musicList, index, play);
			}else {
		index--;
		show(musicList, index, play);
			}
		}
		//���뷡 ����� �������� ���������� '�������� �����ϴ�'��� ��� �����ּ���
		else{
			System.out.println("���� ���� �����ϴ�.");
		}
	}
}
