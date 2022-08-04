package hhd;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {
// 자판기 클래스
	private Scanner sc = new Scanner(System.in);
	private int choice;
	private int money;
	private int itemMoney;
	private Language lang;
	private MenuDAO dao = new MenuDAO(); // DB접속용 DAO객체 생성
	private ArrayList<MenuDTO> menuList;
	
	
	// 생성자 : 객체를 생성할때 호출하는 메소드
	// 생성자의 특징 : 반환타입이 없다, 클래스이름과 생성자메소드 이름이 동일하다
	// 활용 용도 : 객체를 생성하기 위해서, 객체의 필드를 초기화하기 위해서
	public VendingMachine(Language lang) {
		this.lang = lang;
		menuList = dao.selectAll(); // 메뉴정보 select
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
