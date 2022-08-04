package hhd;

import java.util.ArrayList;

// 추상클래스 : 미구현된 클래스
// 1. 추상클래스는 객체생성이 불가능 // Language lang = new Language(); x
// 2. 추상클래스를 상속받은 하위클래스는 상위클래스 내부의 추상메소드를 구현할 강제성을 가진다

public abstract class Language {
	
	// 추상메소드 : 미구현된 메소드
	public abstract String getTitleMSG();
	public abstract String getInputMoneyMSG();
	public abstract String getChoiceMSG();
	public String getItemMSG(ArrayList<MenuDTO> menuList) {
		String msg = "";
		for (int i = 0; i< menuList.size(); i++) {
			msg += (i+1)+"."+menuList.get(i).getMenu_name();
			msg += "("+menuList.get(i).getMenu_price()+") ";
		}
		msg += ">>";
		return msg;
	};
	public abstract String getReturnCharge1();
	public abstract String getReturnCharge2(int money);

}
