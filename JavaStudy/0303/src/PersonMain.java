import java.util.ArrayList;

public class PersonMain {

	

	public static void main(String[] args) {
		
		
		//Person() : ������
		//Ŭ������ŭ�� ������ ���?? ��ü�� �Ҵ����ش�!!
		Person p1 = new Person("��ȯ",20,173,70);
		//p1�� ���� ��ȯ�� '��¥��'���� ���� �ϰ� �ͽ��ϴ�
		p1.setName("��¥��");
//		p1.name="��ȯ";
//		p1.age=20;
//		p1.tall=173;
//		p1.weight=70;
//		System.out.println("�̸� : " +p1.getName());

		//���� ��ü
		Person p2 = new Person();
		p2.setName("����");
		System.out.println("�̸�2 : "+p2.getName());
		//���ܿ� ���� ��ü�� �ϼ����ּ���!-->������ �ʵ尪�� �����͸� ���� �־��ּ���!
		//������ �� �־��ٸ� ���ܿ� ���� ������ ��� �����ּ���!
		p2.setAge(21);
		System.out.println("����2 : " +p2.getAge());
		p2.setTall(177);
		System.out.println("Ű2 : "+p2.getTall());
		p2.setWeight(77);
		System.out.println("������2 : "+p2.getWeight());
		
		p2.getData();
		
		
		Person p3 = new Person();
		p3.setName("����");
		p3.setAge(22);
		p3.setTall(173);
		p3.setWeight(70);
		
		Person p4 = new Person();
		p4.setName("����");
		p4.setAge(23);
		p4.setTall(170);
		p4.setWeight(50);
		
		
		
		
//		int[] numArray = {num1,20,30}
		//�����͸� �ѹ��� �ٷ�� �ִ� ���! -> �迭
		//(��ü) �迭 ����
		//������Ÿ��[] �迭�� = new ������Ÿ��[3];
		Person[] pArray = new Person[4];
		pArray[0] = p1;
		pArray[1] = p2;
		pArray[2] = p3;
		pArray[3] = p4;
		
		//pArray�� ����ؼ� ��ȯ����Ű�� ��� ��Ű�� �;��!
		//pArray[0] ==> p1
		p1.getTall();
		pArray[0].getTall();
		System.out.println("��ȯ�� Ű : " + pArray[0].getTall());
		//pArray�� ����ؼ� ������ ���̸� ������ּ���
		pArray[1].getAge();
		System.out.println("���� ���� : " + pArray[1].getAge());
		
		//pArray�� ����ؼ� �����Ե��� ��� ���̸� ��� �����ּ���!
		pArray[0].getAge();
		pArray[1].getAge();
		pArray[2].getAge();
		pArray[3].getAge();
		
		int sum = 0;
		for(int i=0;i<pArray.length;i++) {
			sum += pArray[i].getAge();
		}
		System.out.println("���� ��� : " + sum/pArray.length);
		
		//�����Ե��� �̸��� ���� ������ּ���!
		for(int i=0;i<pArray.length;i++) {
			System.out.println("�̸� : " + pArray[i].getName());
		}
		
		
		//��ȯ��, ����, ������, ���ν� --pArray
		//�ڿ��� --> pArray�� �߰� �ϰ� �ͽ��ϴ�!!
		
		//�迭�� �Ѱ� : �̹� ũ�⸦ ������ ������ �����͸� �߰��ϰų� �迭�� ũ�⸦ �ٲܼ� ����!
		//�迭�� �Ѱ踦 �پ� �Ѵ� �迭 : ArrayList
		//�����Ե��� ��ü�� ���� �� �ִ� ArrayList
		ArrayList<Person> pArrayList = new ArrayList<Person>();
		pArrayList.add(p1);
		pArrayList.add(p2);
		pArrayList.add(p3);
		pArrayList.add(p4);
		
		//pArrayList�� ����ؼ� ��ȯ�ܿ� ���� ������ ����ϰ� �;��!
		//�̸� : 
		//���� : 
		// Ű :
		//������ : 
		//��ü ��̸���Ʈ
		System.out.println("�̸� : " + pArrayList.get(0).getName()); //������ .getName()�� �־������!
		System.out.println("���� : " + pArrayList.get(0).getAge());
		System.out.println("Ű : " + pArrayList.get(0).getTall());
		System.out.println("������ : " + pArrayList.get(0).getWeight());
		
		//pArrayList�� ����ؼ� �����Ե鿡 ���� ������ ���� ��½����ּ���!
		for(int i =0; i<pArrayList.size();i++) {
			System.out.println("�̸� : " + pArrayList.get(i).getName()); 
			System.out.println("���� : " + pArrayList.get(i).getAge());
			System.out.println("Ű : " + pArrayList.get(i).getTall());
			System.out.println("������ : " + pArrayList.get(i).getWeight());
		}
		
		
		
		
	}

}
