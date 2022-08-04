import java.util.ArrayList;
import java.util.Random;

public class PocketMonMain {

	public static void main(String[] args) {
		
		
		// 객체 : 설계도를 통해서 실제로 만들어지는 것
		// 설계도 -> 객체화 => 인스턴스 화!
		
		// 객체를 생성하는 키워드 ?
		PocketMon mon1 = new PocketMon("피카츄","전기",50,100,10);
		
		//내가 만들고 싶은 포켓몬 내용 지정하기!
//		mon1.name = "피카츄";
//		mon1.type = "전기";
//		mon1.attack = 50;
//		mon1.hp = 100;
//		mon1.defence = 10;
		
		// 객체를 생성함과 동시에 원하는 속성값 지정하기 -> 생성자 메소드 사용
		PocketMon mon2 = new PocketMon("파이리", "불", 30, 55, 60);
		System.out.println("mon1의 이름 : " + mon1.getName());
		System.out.println("mon1의 타입 : "+ mon1.getType());
		System.out.println();
		System.out.println("mon2의 이름 : "+ mon2.getName());
		System.out.println("mon2의 타입 : "+mon2.getType());
		System.out.println();
		
	
		mon1.setAttack(60);

		
		// 객체배열 생성하기
		PocketMon[] ball = new PocketMon[2];
		ball[0] = mon1;
		ball[1] = mon2;
		
		System.out.println(ball[0].getName());
		
		// 크기가 지정되지 않은 배열 -> 가변 리스트 -> ArrayList
		// <E> -> 제네릭
		ArrayList<PocketMon> balls = new ArrayList<>();
		balls.add(mon1);
		balls.add(mon2); // 데이터 추가하기
		
		//데이터 값 출력하기
		//랜덤 시스템 활용
		System.out.println();
		
		Random rd = new Random();
		int num = rd.nextInt(balls.size());
		System.out.println(balls.get(num).getName());
		System.out.println(balls.get(num).getType());
		System.out.println(balls.get(num).getAttack());
		System.out.println(balls.get(num).getDefence());
		System.out.println(balls.get(num).getHp());
		System.out.println();
		
		
		
		for(int i=0; i < balls.size();i++) {
		System.out.println(balls.get(i).getName());
		System.out.println(balls.get(i).getType());
		System.out.println(balls.get(i).getAttack());
		System.out.println(balls.get(i).getDefence());
		System.out.println(balls.get(i).getHp());
		System.out.println();
		}
		
		
		
		
	}

}
