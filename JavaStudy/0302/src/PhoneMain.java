
public class PhoneMain {

	public static void main(String[] args) {
		
		int num = 5;
//		System.out.println(num);
		//Ŭ������?? �ڷ� + ��� ����� ������ �ڷ���
		Phone lollipop = new Phone();// ��ü ���� -> Ŭ������ �ִ� �����Ϳ� ����� ��� �� �� �ִ�!
		
		System.out.println("�귣�� : " + lollipop.brand);
		//lollipop ���� ��ȭ�� �ϰ� �;��!
		lollipop.Call();

		//lollipop ���� ��ȭ�� �ް� �;��!
		lollipop.Send();
		
		System.out.println("��ȭ��ȣ1 : "+ lollipop.number);
		
		//��ȣ �ٲ�, �귣�嵵 �ٲ�
		Phone magic = new Phone();
		magic.brand = "�ִ���";
		magic.number = "010122885180";
		System.out.println("�귣��2 :" + magic.brand);
		System.out.println("��ȭ��ȣ2 : "+magic.number);
		
		//�������� �޴����� ��ü�� ���� ��� �����ּ���
		Phone galaxy = new Phone();
		galaxy.brand = "�Ｚ";
		galaxy.number = "01087796241";
		System.out.println("�귣��3 : " + galaxy.brand);
		System.out.println("��ȭ��ȣ3 : "+galaxy.number);
	}

}
