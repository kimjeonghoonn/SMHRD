package hhd;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {
// ���Ǳ� Ŭ����
	private Scanner sc = new Scanner(System.in);
	private int choice;
	private int money;
	private int itemMoney;
	private Language lang;
	private MenuDAO dao = new MenuDAO(); // DB���ӿ� DAO��ü ����
	private ArrayList<MenuDTO> menuList;
	
	
	// ������ : ��ü�� �����Ҷ� ȣ���ϴ� �޼ҵ�
	// �������� Ư¡ : ��ȯŸ���� ����, Ŭ�����̸��� �����ڸ޼ҵ� �̸��� �����ϴ�
	// Ȱ�� �뵵 : ��ü�� �����ϱ� ���ؼ�, ��ü�� �ʵ带 �ʱ�ȭ�ϱ� ���ؼ�
	public VendingMachine(Language lang) {
		this.lang = lang;
		menuList = dao.selectAll(); // �޴����� select
//		System.out.println(menuList.size());
	}
	
	public void showTitle() {
		System.out.println(lang.getTitleMSG());
	}
	public void inputMoney() {
		showTitle();
		System.out.print(lang.getInputMoneyMSG());
		money = sc.nextInt();
	}
	public void showMenu() {
		System.out.println(lang.getChoiceMSG());
		System.out.print(lang.getItemMSG(menuList));
		choice = sc.nextInt();

	}
	public void calculateChange() {
		itemMoney = menuList.get(choice-1).getMenu_price();
	}
	public void returnChange() {
		calculateChange();
		if (money - itemMoney < 0) {
			System.out.println(lang.getReturnCharge1());
		} else {
			money -= itemMoney;
			System.out.println(lang.getReturnCharge2(money));
		}
	}
}
