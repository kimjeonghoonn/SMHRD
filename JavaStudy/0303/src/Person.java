
public class Person {

	
	//�̸�
	private String name;
	//����
	private int age;
	//Ű
	private int tall;
	//������
	private int weight;
	
	

	//	public Person() {} ----> defalut ������!
//			Ŭ������ ���鶧 �ڵ����� ����� ���� �༮
//			���ο� �����ڸ� ����� �ִ� ���� ������
//			���ο� �����ڸ� ����ڿ� ����ϰ� �ʹٸ� ��������Ƿ� ����� ����Ѵ�!
	public Person() {
		
	}
	
	//�����͸� �޴� ���ο� ������ ����!
	//������(Ư���� �޼ҵ��!)������ü�� ���� ������ --> Ŭ���� ��ŭ�� ������ �Ҵ��Ѵ�!
	//1. �޼ҵ� �̸��� ������! Ŭ���� �̸��� ���ƾ��Ѵ�!(person �̶�� �ϴ� �޼ҵ带 ����)
	//2. ��ȯ Ÿ���� ����!! ���� ��ü�� ���� �ʴ´�!
	//������ �����ε�!!
	
	public Person(String name, int age, int tall, int weight) {
		this.name = name;
		this.age = age;
		this.tall = tall;
		this.weight = weight;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTall() {
		return tall;
	}

	public void setTall(int tall) {
		this.tall = tall;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void getData() {
		System.out.println(name+","+age+","+tall+","+weight);
	}
	
}
