
public interface Skill {

	
	//Ŭ���� : �Ϲ����� ���赵
	//�߻� Ŭ���� : �̿ϼ��� ���赵
	//�������̽� : �⺻(Ʋ) ���赵
	
	// ���������� �ο��� �ʵ� ����
	// ����� ������ �ʵ� ����! -> final
	
	final int attack = 100;
	int defence = 80;
	
	
	//�Ϲ� �޼ҵ带 �������̽� �ȿ��� ������ default Ű���� �ο��ϱ�!
	public default void move() {
		System.out.println("������ �����ϱ�!");
	}
	
	//ĳ���Ͷ�� �ʼ������� �ʿ��ϸ�
	//�� ĳ���� Ư����� ����� �ο��� �� �ִ� �߻� �޼ҵ� ����!
	
	public abstract void charAttack();
	
	
}
