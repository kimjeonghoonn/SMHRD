package jh;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ���õ� ���Ǳ� �ڵ带 ���Ǳ� ��ü�� Ȱ���ϴ�
		// �ڵ�� �����غ���!!
		// main�޼ҵ忡���� �� ����� 1���� ȣ���ϵ��� �غ���
		VendingMachine vend = new VendingMachine();
		Scanner sc = new Scanner(System.in);
		
		vend.showTitle();
		
		
		vend.process();
	      

	}

}