package 상속;

public class WheelMouse extends Mouse{
						//extends Mouse --> Mouse로부터 확장받음(상속)
//	public void right() {
//		System.out.println("우클릭");
//	}
//	
//	public void left() {
//		System.out.println("좌클릭");
//	}
//	
//	public void drag() {
//		System.out.println("드래그~~");
//	}
//	
	
	//WheelMouse만 가질수 있는 기능
	public void wheel() {
		System.out.println("휠 기능 사용~~");
		
	}
}
