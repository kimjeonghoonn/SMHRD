
public class PhoneMain {

	public static void main(String[] args) {
		
		int num = 5;
//		System.out.println(num);
		//클래스란?? 자료 + 기능 사용자 임의의 자료형
		Phone lollipop = new Phone();// 객체 생성 -> 클래스에 있는 데이터와 기능을 사용 할 수 있다!
		
		System.out.println("브랜드 : " + lollipop.brand);
		//lollipop 으로 전화를 하고 싶어요!
		lollipop.Call();

		//lollipop 으로 전화를 받고 싶어요!
		lollipop.Send();
		
		System.out.println("전화번호1 : "+ lollipop.number);
		
		//번호 바꿈, 브랜드도 바꿈
		Phone magic = new Phone();
		magic.brand = "애니콜";
		magic.number = "010122885180";
		System.out.println("브랜드2 :" + magic.brand);
		System.out.println("전화번호2 : "+magic.number);
		
		//여러분의 휴대폰을 객체로 만들어서 출력 시켜주세요
		Phone galaxy = new Phone();
		galaxy.brand = "삼성";
		galaxy.number = "01087796241";
		System.out.println("브랜드3 : " + galaxy.brand);
		System.out.println("전화번호3 : "+galaxy.number);
	}

}
