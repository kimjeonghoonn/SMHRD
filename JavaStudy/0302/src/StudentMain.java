
public class StudentMain {

	public static void main(String[] args) {
		//new --> 공간을 할당해줄거에요
		//student() --> 생성자
		Student st1 = new Student();
		st1.name = "김정훈";
		st1.number = "20220303";
		st1.age = 20;
		st1.scoreJava = 70;
		st1.scoreWeb = 80;
		st1.scoreAndroid = 90;
		st1.studentAvg(); //return이 아닌 이름을 받아오면됨
		System.out.println("이름 : " + st1.name);
		System.out.println("학번 : " + st1.number);
		System.out.println("나이 : " + st1.age);
		System.out.println("Java 점수 : " + st1.scoreJava);
		System.out.println("Web 점수 : " + st1.scoreWeb);
		System.out.println("Android 점수 : " + st1.scoreAndroid);
//		System.out.println("평균 : " + st1.studentAvg());
		
		
		Student st2 = new Student();
		st2.name ="형쌤";
		st2.number = "20210307";
		st2.age=21;
		st2.scoreJava =90;
		st2.scoreWeb = 100;
		st2.scoreAndroid = 80;
		
		
		//st1과 st2의 점수 평균을 알고 싶어요!
		// --> 평균 구하는 기능!(메소드로 만들어 주면됨!!)

//		st1.studentAvg(); //return이 아닌 이름을 받아오면됨
//		st2.studentAvg();
				
		System.out.println("평균 : " + st2.studentAvg());
		
		
		
		
	}



}
