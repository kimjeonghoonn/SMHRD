
public class PocketMon {

	// ���� Ÿ�� �̸� ������ȣ ���ݷ� Ű ü�� ������
	// -> �̸�, Ÿ��, ���ݷ�, ü��(hp), ����
	private String name;
	private String type;
	private int attack;
	private int hp;
	private int defence;
	
	//������ �޼ҵ��� Ư¡
	// 1. ���� Ÿ���� ����. -> void Ÿ�Ե� ������ �ʴ´�.
	// 2. Ŭ������ �̸��� �޼ҵ��� �̸��� ���� �ϴ�.
	// 3. 
	
	public PocketMon() {
		
	}
	
	public PocketMon(String name, String type, int attack, int defence, int hp) {
		this.name = name;
		this.type = type;
		this.attack = attack;
		this.defence = defence;
		this.hp = hp;
		
	}
	
	// ������ ���� getter/setter �޼ҵ� ����
	
	// ���ϸ� �̸��� Ȯ���� �� �ִ� �޼ҵ� ����
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	public int getAttack() {
		return attack;
	}
	public int getHp() {
		return hp;
	}
	public int getDefence() {
		return defence;
	}
	
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	
	
}
