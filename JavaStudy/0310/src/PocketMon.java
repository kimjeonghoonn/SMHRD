
public class PocketMon {

	// 성별 타입 이름 도감번호 공격력 키 체력 몸무게
	// -> 이름, 타입, 공격력, 체력(hp), 방어력
	private String name;
	private String type;
	private int attack;
	private int hp;
	private int defence;
	
	//생성자 메소드의 특징
	// 1. 리턴 타입이 없다. -> void 타입도 사용되지 않는다.
	// 2. 클래스의 이름과 메소드의 이름이 동일 하다.
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
	
	// 접근을 위한 getter/setter 메소드 생성
	
	// 포켓몬 이름을 확인할 수 있는 메소드 생성
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
