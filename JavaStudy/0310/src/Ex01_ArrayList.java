import java.util.ArrayList;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		
		
		//�迭�� �Ѱ� : �̹� ũ�⸦ ������ ������ �����͸� �߰��ϰų� �迭�� ũ�⸦ �ٲܼ� ����!
		//�迭�� �Ѱ踦 �پ� �Ѵ� �迭 : ArrayList
		
		//���� ����ϰ��� �ϴ� �������� ������ ��Ȯ�� �𸦶� ����!
		int[] array = {10,20,30,40,50};
		//30�̶�� ���ڰ� �ʿ� �����!
		array[2]=0;
		System.out.println(array.length);

		//ArrayList ���� ���
		//ArrayList<�迭�� �� �������� Ÿ��> ��̸���Ʈ�� = new ArrayList<String>();
		//ArrayList�� ���� Ÿ���� ���۷��� Ÿ�Ը� �����ϴ�!(�⺻�ڷ��� Ÿ���� ���� ����!)
		//�⺻ ������ Ÿ������ ArrayList�� ������ֱ� ���ؼ���
		//�⺻������ Ÿ���� ǥ�� �� �� �ִ� Ŭ������ Ȱ�����ָ� �ȴ�!
		//int -> Interger
		ArrayList<String> nameArray = new ArrayList<String>();
		
		
		//������ �߰� .add("�ְ� ���� ������") ->������ �Է��� ������� �迭�� ����
		//�� �ǵڷ� �������� ���δ�
		nameArray.add("��ȯ��");
		nameArray.add("����");
		nameArray.add("������");
		nameArray.add("���ν�");
		nameArray.add("�ڿ���");
		
		
		//������ ��� -> get(�ε�����ȣ)
		//��ȯ�� ���
		System.out.println(nameArray.get(0));
		System.out.println(nameArray.get(1));
		System.out.println(nameArray.get(2));
		System.out.println(nameArray.get(3));
		System.out.println(nameArray.get(4));
		
		
		//ArrayList ũ�� -> size() == �Ϲ� �迭������ length�� ����!
		for(int i =0; i<nameArray.size(); i++) {
			System.out.println(nameArray.get(i));
		}
		
		//������ ���� .remove(�������� �ε�����ȣ)
		//� Ư�� ���ǿ��� �ش��ϴ� �����͸� ����������!
		nameArray.remove(2);
		
		System.out.println(nameArray.size());
		
		//������ ����! -> .add(�����Ͱ� �� �ε��� ��ġ, "�ְ����������")
		nameArray.add(1, "����");
		nameArray.add(4, "�ֶ�");
		for(int i =0; i<nameArray.size(); i++) {
			System.out.println(nameArray.get(i));
		}
		
	}

}
