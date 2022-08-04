package Model;

public class MusicVO {
	//�뷡 ��� �����͸� ǥ�� �� �� �ִ� Ŭ����
		//����� ���Ƿ� ���� Ŭ���� -> VOŬ����(Value Object)
		// -> MVC���� �� Model�� �ش��ϴ� Ŭ����!
		// Model : �����͸� �����ϴ� ��
		// - �䳪 ��Ʈ�ѷ��� ���� ��� ������ �� �� ����.
		// - ������ ������ �Ͼ�� ó���� �� �ִ� ����� �����ؾ��Ѵ�.-> getter/setter
	
	
	
	
		private String musicName; //�뷡����
		private String singer; //�����̸�
		private int playTime; // play �ð�
		private String path;//�뷡���� ���

		public MusicVO(String musicName, String singer, int playTime, String path) {
			super();
			this.musicName = musicName;
			this.singer = singer;
			this.playTime = playTime;
			this.path = path;
		}
		public String getMusicName() {
			return musicName;
		}
		public String getSinger() {
			return singer;
		}
		public int getPlayTime() {
			return playTime;
		}
		public void setMusicName(String musicName) {
			this.musicName = musicName;
		}
		public void setSinger(String singer) {
			this.singer = singer;
		}
		public void setPlayTime(int playTime) {
			this.playTime = playTime;
		}
		public String getPath() {
		      return path;
		   }
		
		
		
		
}
