package hhd;

import java.util.Scanner;

public class Main {
	// ���α׷��� ���� �� : �����丵
	// �ٱ��� ����� ž��� ���Ǳ�� ���׷��̵�
	public static void main(String[] args) {
		
		VendingMachine vm = new VendingMachine(new English()); // ��ü����
		
		vm.inputMoney();
		
		vm.showMenu();
	
		
		vm.returnChange();

		
		
		

	}

}
