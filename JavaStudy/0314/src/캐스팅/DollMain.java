package ĳ����;

public class DollMain {

	public static void main(String[] args) {
		
		
		//���������� ������ ���� Ŭ����!!
		Pika pika = new Pika();
		getDoll(pika);
		
		//���̸� ����
		Piri piri = new Piri();
		getDoll(piri);
		
		//������ ����
		Kkobuck kko = new Kkobuck();
		getDoll(kko);
		
		//��Ÿ��, �̺���, ġ�ڸ�Ÿ ������ �̾� �ּ���!
		MetaMong meta = new MetaMong();
		getDoll(meta);
		
		Eve eve = new Eve();
		getDoll(eve);
		
		Chico chico = new Chico();
		getDoll(chico);
		
		
		
		
		
		
	}

	//�����̱�
	public static void getDoll(Doll doll) {
		//��ĳ���� : ���� Ŭ���� Ÿ������ ����ȯ�ϴ°�
		//1. ����Ŭ������ �ִ� �ʵ�� �޼ҵ常 ����� �� �ִ�
		//2. �������̵��� �޼ҵ�� �ڽĿ��� �������� �޼ҵ带 ���� ��Ų��!
		//---> ���� Ŭ������ ����Ŭ������ �ѹ��� ��Ʈ�� �� �� �ִ�!!
		
		//��ī�� ������ �̾������� �鸸��Ʈ�� ������ȭ�� ����ϰ�;��!
		//��ĳ���õ� ��ü instanceof ���� Ŭ������
		//��ĳ���õ� ��ü�� ��� ����Ŭ�����κ��� ��ĳ���� �Ǿ������� �Ǻ�����!
		if(doll instanceof Pika) {
			//�ٿ� ĳ�����ؼ� run ���!
			//doll ��ü�� �ٿ�ĳ�������ּ���!
			//����Ŭ������ ��ü�� = (����Ŭ����Ÿ��)��ĳ���õ� ��ü��;
			Pika pi = (Pika)doll;
			pi.run();
		}
		
		doll.get();
		//���� ��ü �̸����� �������� ����� ���� ��Ű�� �ִ�---> ������!!
	}
	
	
	
//	public static void getDoll(Pika pika) {
//		pika.get();
//	}
//	public static void getDoll(Piri piri) {
//		piri.get();
//	}
//	public static void getDoll(Kkobuck kko) {
//		kko.get();
//	}
//	public static void getDoll(MetaMong meta) {
//		meta.get();
//	}
//	public static void getDoll(Eve eve) {
//		eve.get();
//	}
//	public static void getDoll(Chico chico) {
//		chico.get();
//	}
}
