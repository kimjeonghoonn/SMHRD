
public class Ex07_MusicVO {

	
	String title; //�뷡����
	String singer; //�����̸�
	int playTime; // play �ð�
	
	
	

	public Ex07_MusicVO(String title, String singer, int playTime) {
		super();
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getPlayTime() {
		return playTime;
	}
	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	
	

}
