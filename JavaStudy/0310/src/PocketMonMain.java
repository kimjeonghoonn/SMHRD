import java.util.ArrayList;
import java.util.Random;

public class PocketMonMain {

	public static void main(String[] args) {
		
		
		// ��ü : ���赵�� ���ؼ� ������ ��������� ��
		// ���赵 -> ��üȭ => �ν��Ͻ� ȭ!
		
		// ��ü�� �����ϴ� Ű���� ?
		PocketMon mon1 = new PocketMon("��ī��","����",50,100,10);
		
		//���� ����� ���� ���ϸ� ���� �����ϱ�!
//		mon1.name = "��ī��";
//		mon1.type = "����";
//		mon1.attack = 50;
//		mon1.hp = 100;
//		mon1.defence = 10;
		
		// ��ü�� �����԰� ���ÿ� ���ϴ� �Ӽ��� �����ϱ� -> ������ �޼ҵ� ���
		PocketMon mon2 = new PocketMon("���̸�", "��", 30, 55, 60);
		System.out.println("mon1�� �̸� : " + mon1.getName());
		System.out.println("mon1�� Ÿ�� : "+ mon1.getType());
		System.out.println();
		System.out.println("mon2�� �̸� : "+ mon2.getName());
		System.out.println("mon2�� Ÿ�� : "+mon2.getType());
		System.out.println();
		
	
		mon1.setAttack(60);

		
		// ��ü�迭 �����ϱ�
		PocketMon[] ball = new PocketMon[2];
		ball[0] = mon1;
		ball[1] = mon2;
		
		System.out.println(ball[0].getName());
		
		// ũ�Ⱑ �������� ���� �迭 -> ���� ����Ʈ -> ArrayList
		// <E> -> ���׸�
		ArrayList<PocketMon> balls = new ArrayList<>();
		balls.add(mon1);
		balls.add(mon2); // ������ �߰��ϱ�
		
		//������ �� ����ϱ�
		//���� �ý��� Ȱ��
		System.out.println();
		
		Random rd = new Random();
		int num = rd.nextInt(balls.size());
		System.out.println(balls.get(num).getName());
		System.out.println(balls.get(num).getType());
		System.out.println(balls.get(num).getAttack());
		System.out.println(balls.get(num).getDefence());
		System.out.println(balls.get(num).getHp());
		System.out.println();
		
		
		
		for(int i=0; i < balls.size();i++) {
		System.out.println(balls.get(i).getName());
		System.out.println(balls.get(i).getType());
		System.out.println(balls.get(i).getAttack());
		System.out.println(balls.get(i).getDefence());
		System.out.println(balls.get(i).getHp());
		System.out.println();
		}
		
		
		
		
	}

}
