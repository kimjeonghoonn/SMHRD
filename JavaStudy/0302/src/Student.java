
public class Student {

	String name;
	String number;
	int age;
	int scoreJava;
	int scoreWeb;
	int scoreAndroid;
	
	//다른 클래스에서 메소드를 만들때 static을 굳이 적어주지 않아도된다.
//	public void studentAvg() {//출력문을 넣어주고싶어요!
//		int result = (scoreJava + scoreWeb + scoreAndroid)/3;
//		System.out.println("평균 :" +result);
//	}
	public int studentAvg() {
		int result = (scoreJava + scoreWeb + scoreAndroid)/3;
		return result;
	}
	
}