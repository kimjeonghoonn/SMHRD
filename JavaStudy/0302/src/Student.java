
public class Student {

	String name;
	String number;
	int age;
	int scoreJava;
	int scoreWeb;
	int scoreAndroid;
	
	//�ٸ� Ŭ�������� �޼ҵ带 ���鶧 static�� ���� �������� �ʾƵ��ȴ�.
//	public void studentAvg() {//��¹��� �־��ְ�;��!
//		int result = (scoreJava + scoreWeb + scoreAndroid)/3;
//		System.out.println("��� :" +result);
//	}
	public int studentAvg() {
		int result = (scoreJava + scoreWeb + scoreAndroid)/3;
		return result;
	}
	
}