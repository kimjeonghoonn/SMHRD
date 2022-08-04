import java.util.ArrayList;

public class Ex07_MusicController {

//	Ex07_MusicPlayer player = new Ex07_MusicPlayer();
	
	ArrayList<Ex07_MusicVO> musicList = new ArrayList<>();
	int index = 0;
	
	public Ex07_MusicController() {
		Ex07_MusicVO music1 = new Ex07_MusicVO("��������","����ģ��",320);
		Ex07_MusicVO music2 = new Ex07_MusicVO("����","���",201);
		Ex07_MusicVO music3 = new Ex07_MusicVO("���ΰ�","����",220);
		musicList.add(music1);
		musicList.add(music2);
		musicList.add(music3);
		
	}
	public void show() {
		for(int i =0; i<musicList.size(); i++) {
			System.out.print("���� : " + musicList.get(i).getTitle()+"	");
			System.out.print("���� : " + musicList.get(i).getSinger()+"	");
			System.out.println("�ð� : " + musicList.get(i).getPlayTime());
		}
	}public void play() {
		System.out.print("���� : " + musicList.get(index).getTitle()+"	");
		System.out.print("���� : " + musicList.get(index).getSinger()+"	");
		System.out.println("�ð� : " + musicList.get(index).getPlayTime());
	}
	public void nextPlay() {
		if(index>=musicList.size()-1){
			System.out.print("���� : " + musicList.get(index).getTitle()+"	");
			System.out.print("���� : " + musicList.get(index).getSinger()+"	");
			System.out.println("�ð� : " + musicList.get(index).getPlayTime());
		}
		else{
				index ++;
				System.out.print("���� : " + musicList.get(index).getTitle()+"	");
				System.out.print("���� : " + musicList.get(index).getSinger()+"	");
				System.out.println("�ð� : " + musicList.get(index).getPlayTime());
			}
		}
	public void prePlay() {
		if(index>0) {
			index--;
			System.out.print("���� : " + musicList.get(index).getTitle()+"	");
			System.out.print("���� : " + musicList.get(index).getSinger()+"	");
			System.out.println("�ð� : " + musicList.get(index).getPlayTime());
		}
		else {
			System.out.print("���� : " + musicList.get(index).getTitle()+"	");
			System.out.print("���� : " + musicList.get(index).getSinger()+"	");
			System.out.println("�ð� : " + musicList.get(index).getPlayTime());
		}
	}

}
