package Model;

public class MusicVO {
	//노래 라는 데이터를 표현 할 수 있는 클래스
		//사용자 임의로 만든 클래스 -> VO클래스(Value Object)
		// -> MVC패턴 중 Model에 해당하는 클래스!
		// Model : 데이터를 관리하는 곳
		// - 뷰나 컨트롤러에 대한 어떠한 정보도 알 수 없다.
		// - 데이터 변경이 일어나면 처리할 수 있는 방법을 구현해야한다.-> getter/setter
	
	
	
	
		private String musicName; //노래제목
		private String singer; //가수이름
		private int playTime; // play 시간
		private String path;//노래파일 경로

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
