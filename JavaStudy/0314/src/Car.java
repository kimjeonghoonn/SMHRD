
public abstract class Car {

	
	//�߻� Ŭ���� : �̿ϼ��� ���赵 -> ��ü������ ���� ���赵
	//�߻� Ŭ������ Ű���� : abstract
	//�߻� �޼ҵ�� �� �߻� Ŭ������ �����Ǿ���Ѵ�!
	//���赵 -> �ʵ� + �޼ҵ�
	
	//�ڵ��� -> ������, ����, BMW
	
	
	int tire = 4;
	String color = "���";
	
	
	//��ü {}�� �����Ǿ� ���� �ʴ� �߻� �޼ҵ�
	public abstract void runner();
	
	public void runner2() {
		System.out.println("�ü� 50���� �޸���");
	}
}
