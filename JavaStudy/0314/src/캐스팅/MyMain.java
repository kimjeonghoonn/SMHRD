package ĳ����;

public class MyMain {

	public static void main(String[] args) {
		
		����Ĩ kko = new ����Ĩ();
		eatOpen(kko);
		
		�ܲʺ��� ggul = new �ܲʺ���();
		eatOpen(ggul);
		
		�ſ����� sae = new �ſ�����();
		eatOpen(sae);
		
		��äŸ�� ya = new ��äŸ��();
		eatOpen(ya);
		
		
		//�� ���ڸ� ���� �Ծ��ּ���!
		//��!! ��äŸ�� ���ڸ� �������� ��  ������ ��� �Ծ��ּ���!
		//Upcasting�� Downĳ���� Ȱ��!

	}

	
	public static void eatOpen(Eat eat) {
		eat.open();
		
		if(eat instanceof ��äŸ��) {
			//�ٿ� ĳ�����ؼ� run ���!
			//doll ��ü�� �ٿ�ĳ�������ּ���!
			//����Ŭ������ ��ü�� = (����Ŭ����Ÿ��)��ĳ���õ� ��ü��;
			��äŸ�� ya = (��äŸ��)eat;
			ya.sauce();
		}
		
		
	}
}
