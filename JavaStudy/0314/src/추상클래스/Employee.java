package �߻�Ŭ����;

public abstract class Employee {
	//��� ���޿� ���Ͽ� �θ� �ɼ� �ִ� ���� Ŭ����
	// -> ���޿� ���Ͽ� ������ ����� �� �ִ� �ʵ� �� �޼ҵ尡 �����ؾ� �Ѵ�!
	
	// abstract
	
	//����Ǵ� �ʵ� ����
	//���������� - public(����/�ܺ� ��� ���), private(���ο����� ���), 
	//			protected(������Ű��,����� ���迡���� ���), default
	
	protected String empno;
	protected String name;
	protected int pay;

	public abstract int getMoneyPay();
	
	public String print() {
		return empno + " : " + name + " : " + pay;
	}
	
	
}

