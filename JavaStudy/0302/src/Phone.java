
public class Phone {
	//Ŭ������ ?! �繰�� ������ �ʵ�(�Ӽ�)�� �޼ҵ�(���)�� ����� ����� ������ �ڷ��� �̴�!
	//--> ���ǿ� �ִ� ��ü�� ǥ���� �� �ִ� ����� ������ �ڷ���(type)�̴�!!
	//Ŭ������ ����� ���ؼ��� �߻�ȭ, ĸ��ȭ ��� �۾��� ���� ����� ����!
	
	//��ü��? �ν��Ͻ������ �θ���, Ŭ����(�ڷ���)�� �������� ���� ��ǰ
	
	//��ü�������α׷����� Ư¡
	//1ĸ��ȭ - �ʵ�(�Ӽ�)�� �޼ҵ�(���)�� �ϳ��� ���� ���� ���������� �ܺη� ���ߴ� ���(��������)
	//2��� - ���� �ڵ带 �״�� �����ϰų� ������(�������̵�) ->����+Ȯ��
	//3�߻�ȭ - ��ü���� ����� �Ӽ��� ������ �����ϴ� ���, �ʿ��� �����鸸 ���߷��� ����
	//4������ - ���� �޼ҵ带 ȣ���ϴ��� ��ü�� ���� �ٸ��� �����ϴ� ��
//	 			�ٽ� �����Ͽ� ����ϴ� ��(�������̵�)
//	���� - ���������� �����ϴ�, ����Ʈ���� ���꼺�� ���ȴ�
//		�ŷڼ� �ִ� ����Ʈ��� ���� �ۼ�����,�ڵ带 �����ϱ� ����, �������� �ڵ� �м��� �����ϴ�
	
	//�޴��� �ϸ� ��� ����������??
	//1.��ȭ�� �ɴ�
	//2.��ȭ�� �޴�
	//3.�귣��
	//4.������ �ϴ�
	//5.��ȭ��ȣ
	//���� 5���� ������ �ϴ� ����� �ִٸ� �װ� �޴����̶�� Ī�� �� �ִ�!
	
	//data�� ����� ���� �и�!
	//data �귣��, ��ȭ��ȣ
	String brand;
	//���������� 'private' --> �ش� Ŭ���� �������� ������ �����ϰԲ�! ������ ����Ұſ���!
	String number;
	
	//����� �ڵ�� ǥ�� --> �޼ҵ�� ����� �ָ��!!
	//��ȭ �ɴ�,�޴� ����
	//�ٸ� Ŭ���� ������ �޼ҵ带 ���鶧 static �� �Ⱥٿ��� �ȴ�!
	public void Call() {
		System.out.println("��ȭ�� �ɴ�");
	}
	public void Send() {
		System.out.println("��ȭ�� �޴�");
	}
	public void Gmae() {
		System.out.println("����Ϲ�׸��ϴ�");
	}
	
	
}