
public class StudentMain {

	public static void main(String[] args) {
		//new --> ������ �Ҵ����ٰſ���
		//student() --> ������
		Student st1 = new Student();
		st1.name = "������";
		st1.number = "20220303";
		st1.age = 20;
		st1.scoreJava = 70;
		st1.scoreWeb = 80;
		st1.scoreAndroid = 90;
		st1.studentAvg(); //return�� �ƴ� �̸��� �޾ƿ����
		System.out.println("�̸� : " + st1.name);
		System.out.println("�й� : " + st1.number);
		System.out.println("���� : " + st1.age);
		System.out.println("Java ���� : " + st1.scoreJava);
		System.out.println("Web ���� : " + st1.scoreWeb);
		System.out.println("Android ���� : " + st1.scoreAndroid);
//		System.out.println("��� : " + st1.studentAvg());
		
		
		Student st2 = new Student();
		st2.name ="����";
		st2.number = "20210307";
		st2.age=21;
		st2.scoreJava =90;
		st2.scoreWeb = 100;
		st2.scoreAndroid = 80;
		
		
		//st1�� st2�� ���� ����� �˰� �;��!
		// --> ��� ���ϴ� ���!(�޼ҵ�� ����� �ָ��!!)

//		st1.studentAvg(); //return�� �ƴ� �̸��� �޾ƿ����
//		st2.studentAvg();
				
		System.out.println("��� : " + st2.studentAvg());
		
		
		
		
	}



}
