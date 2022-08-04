package 캐스팅;

public class MyMain {

	public static void main(String[] args) {
		
		꼬북칩 kko = new 꼬북칩();
		eatOpen(kko);
		
		꿀꽈베기 ggul = new 꿀꽈베기();
		eatOpen(ggul);
		
		매운새우깡 sae = new 매운새우깡();
		eatOpen(sae);
		
		야채타임 ya = new 야채타임();
		eatOpen(ya);
		
		
		//각 과자를 전부 먹어주세요!
		//단!! 야채타임 과자를 먹을때는 꼭  케찹도 찍어 먹어주세요!
		//Upcasting과 Down캐스팅 활용!

	}

	
	public static void eatOpen(Eat eat) {
		eat.open();
		
		if(eat instanceof 야채타임) {
			//다운 캐스팅해서 run 사용!
			//doll 객체를 다운캐스팅해주세요!
			//하위클래스명 객체명 = (하위클래스타입)업캐스팅된 객체명;
			야채타임 ya = (야채타임)eat;
			ya.sauce();
		}
		
		
	}
}
